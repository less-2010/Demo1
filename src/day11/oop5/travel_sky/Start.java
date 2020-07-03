package day11.oop5.travel_sky;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *
 * @author hyb
 *
 */

public class Start extends JPanel{

	public static final int WIDTH=1200;
	public static final int HEIGHT=700;
	public static final int START = 0;
	public static final int PAUSE = 1;
	public static final int GAME_OVER = 2;
	public static final int RESTART = 3;

	int score=0;
	int  maxScore;
	int newScore;
	private int state = START;

	Sky sky=new Sky();
	Hero hero=new Hero();
	Bullet bullet = new Bullet(0,0);


	AudioClip music1 = Applet.newAudioClip(
			Start.class.getResource("/day11/oop5/travel_sky/sound/boom.wav"));
	AudioClip music3 = Applet.newAudioClip(
			Start.class.getResource("/day11/oop5/travel_sky/sound/flyAway.wav"));
	AudioClip music2 = Applet.newAudioClip(
			Start.class.getResource("/day11/oop5/travel_sky/sound/begin.wav"));

	ArrayList<MoveObject>mos=new ArrayList();


	KeyListener kl=new KeyListener() {
		@Override
		public void keyTyped(KeyEvent e){}
		@Override
		public void keyReleased(KeyEvent e) { }

		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyChar());
			String s = new String(new char[]{(e.getKeyChar())});
			if (s.equals(" ")){
				state = PAUSE;
				System.out.println("游戏暂停");
			}
			if (s.equals("r")) {
				state = START;
				System.out.println("游戏开始");
			}

		}
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame();
		Start start=new Start();
		frame.add(start);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.addKeyListener(start.kl);
		frame.setVisible(true);
		start.mos.add(start.sky);
		start.mos.add(start.hero);
		start.action();

	}

	public void action() {


		music2.loop();//背景音乐循环播放

		MouseAdapter ma = new MouseAdapter() {//鼠标监听器
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();//监听鼠标x坐标
				int y = e.getY();
//				System.out.println(x);
//				System.out.println(y);
				hero.move(x, y);
			}

		};//内部类：鼠标监听类的子类

		this.addMouseListener(ma);//鼠标监听器安插进画布
		this.addMouseMotionListener(ma);

		int index = 0;//计数器


		while (true) {
			if(state==PAUSE) {
				while(state==PAUSE) {

					try {
						Thread.sleep(10);
					} catch (InterruptedException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
				}
			}

			if(state==GAME_OVER){
				while(state==GAME_OVER) {

					try {
						Thread.sleep(999);
					} catch (InterruptedException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
				}
			}



			index++;
			if (index % 80 == 0) {
				mos.add(new BigPlane());
				mos.add(new SmallPlane());
			}
			if (index % 300 == 0) {
				mos.add(new SpecialPlane());

			}

			if (index % 20 == 0) {
				Bullet[] bs = hero.biu();
				for (int i = 0; i < bs.length; i++) {
					mos.add(bs[i]);
				}
			}
			move(mos);
			bang(bullet);
			bang(hero);

			if (hero.life < 0) {
				state = GAME_OVER;
				maxScore = score;
				if(newScore>=maxScore) {
					maxScore = newScore;
				}
			}

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
		}
	}

	private void bang(MoveObject m) {
		for (int i = 0; i < mos.size(); i++) {
			MoveObject mo=mos.get(i);
			String moStr=mo.getClass().getName();
			String mStr=m.getClass().getName();
			if(moStr.equals(mStr)) {
				for (int j = 0; j < mos.size(); j++) {
					MoveObject mo2=mos.get(j);
					if(mo2 instanceof Enemy) {
						music3.play();
						if(!(mo.x>mo2.x+mo2.width|mo.x<mo2.x-mo.width|
								mo.y>mo2.y+mo2.height|mo.y<mo2.y-mo.height)) {
							mos.remove(mo2);
							if(mStr.equals("travel_sky.Bullet")) {
								music1.play();
								mos.remove(mo);
								score++;
								if(mo2 instanceof BigPlane)score++;
								if(mo2 instanceof SpecialPlane) {
									hero.doubleFire+=20;
								}
							}else {
								hero.life--;
							}
						}

					}
				}
			}
		}
	}

	private void move(ArrayList<MoveObject> mo) {
		for (int i = 0; i < mo.size(); i++) {

			mo.get(i).move();
		}
	}


	public void paint(Graphics g) {
		paints(g,mos);
		g.setColor(Color.YELLOW);
		g.setFont(new Font("楷体",30,30));
		g.drawString("SCORE="+score, 50, 50);
		g.drawString("LIFE="+hero.life, 1000, 50);

		if (state ==PAUSE){
			g.setColor(Color.RED);
			g.setFont(new Font("楷体",80,80));
			g.drawString("游戏暂停", 400, 400);
		}
		if (state ==GAME_OVER){
			g.setColor(Color.RED);
			g.setFont(new Font("楷体",80,80));
			g.drawString("游戏结束", 400, 500);
			g.drawString("最终得分："+maxScore, 400, 350);
		}
	}

	private void paints(Graphics g,ArrayList<MoveObject>mo) {
		for (int i = 0; i < mo.size(); i++) {
			mo.get(i).paint(g);
		}
	}

}
