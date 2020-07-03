package travel_sky;
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
 * ★、小项目改编API补充： 1、AudioClip接口： 1）简介： 是用于播放音频剪辑的简单抽象。 多个 AudioClip
 * 项能够同时播放，得到的声音混合在一起 可产生合成声音。 2）new对象： AudioClip music = Applet.newAudioClip(
 * Start.class.getResource("xxx.wav")); 3）常用方法： void loop() 以循环方式开始播放此音频剪辑。 void
 * play() 开始播放此音频剪辑。 void stop() 停止播放此音频剪辑。
 * 
 * 2、KeyListener接口： 1）简介：用于接收键盘事件（击键）的侦听器接口。 2）new 对象和安插方式：KeyListener kl = new
 * KeyListener() {}; JFrame jframe.addKeyListenner(kl); 3）常用方法： void
 * keyPressed(KeyEvent e) 按下某个键时调用此方法。 void keyReleased(KeyEvent e) 释放某个键时调用此方法。
 * void keyTyped(KeyEvent e) 键入某个键时调用此方法。 附录：KeyEvent 常用方法： char getKeyChar()
 * 返回与此事件中的键关联的字符。 int getKeyCode() 返回与此事件中的键关联的整数 keyCode。
 * 
 * @author user
 *
 */

public class Start extends JPanel {

	public static final int WIDTH = 1200;
	public static final int HEIGHT = 700;
	String s;
	int GameEnd=0;
	int Count = 0;
	int newScore = 0;
	int MaxScore =  0;
	boolean Reset = true;
	Sky sky = new Sky();
	Hero hero = new Hero();
	/**
	 * 	艾力
	 */
	Bullet b = new Bullet(0,0);
	String str1=b.toString();
	String bulletUrl = str1.substring(0,str1.indexOf("@")); //Bullet包地址取出@前面字符
	
	ArrayList<MoveObject> mos = new ArrayList();
	int score = 0;
//	@SuppressWarnings("deprecation")
//	AudioClip music = Applet.newAudioClip(Start.class.getResource("jizhongh.wav"));
	KeyListener kl = new KeyListener() {
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
		}

		@Override
		public void keyReleased(KeyEvent e) {
		}
		@Override
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyChar());
			s = new String(new char[] { (e.getKeyChar()) });
			if (s.equals("b")) {
				System.out.println("BOOM!");
				hero.boomboomFire = 1;
			}
			if (s.equals("r")) {
				System.out.println("开始");
				GameEnd = 0;
				System.out.println(GameEnd);
			}
			if (s.equals("w")||s.equals(" ")) {
				if(Count==0) {
					Reset = false;
					Count=1;
				}
				else {
					Reset = true;
					Count=0;
				}
				System.out.println("暂停");
				System.out.println(Reset);
			}
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();
		Start start = new Start();
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

	@SuppressWarnings("deprecation")
	public void action() {

//		music2.loop();
//		music3.loop();
//		music3.play();

		MouseAdapter ma = new MouseAdapter() {// 鼠标监听器
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();// 监听鼠标x坐标
				int y = e.getY();
//				System.out.println(x);
//				System.out.println(y);
				hero.move(x, y);
			}

		};// 内部类：鼠标监听类的子类

		this.addMouseListener(ma);// 鼠标监听器安插进画布
		this.addMouseMotionListener(ma);

		int index = 0;// 计数器
		Bullet bulletCompare = new Bullet(0, 0);
		
		while (true) {
			if(Reset!=false) {
				while(Reset) {
					System.out.println("暂停中");
					try {
						Thread.sleep(900);
					} catch (InterruptedException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
				}
			}
			
				while(GameEnd==1) {
					System.out.println("游戏结束");
					hero.life=3;
					score= 0;
					hero.Booooom=0;
					try {
						Thread.sleep(900);
					} catch (InterruptedException e1) {
						// TODO 自动生成的 catch 块
						e1.printStackTrace();
					}
				}
			
			index++;
			if (index % 80 == 0) {
				mos.add(new BigPlane());
				mos.add(new SmallPlane());
			}
			if (index % 300 == 0) {
				mos.add(new SpecialPlane());
				mos.add(new Heart()); // 添加心
			}
			if (index % 200 == 0) {
				mos.add(new Ammunition()); // 弹药
			}

			if (index % 20 == 0) {
				Bullet[] bs = hero.biu();
				for (int i = 0; i < bs.length; i++) {
					mos.add(bs[i]);
				}
			}
			move(mos);
			bang(bulletCompare);
			bang(hero);
			if (hero.life < 0) {
				GameEnd=1;
				newScore = score;
//				break;
				if(newScore>=MaxScore) {
					MaxScore = newScore;
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
			MoveObject mo = mos.get(i);
			String moStr = mo.getClass().getName();
			String mStr = m.getClass().getName();
			if (moStr.equals(mStr)) {
				for (int j = 0; j < mos.size(); j++) {
					MoveObject mo2 = mos.get(j);
					if (mo2 instanceof Enemy) {
						if (!(mo.x > mo2.x + mo2.width | mo.x < mo2.x - mo.width | mo.y > mo2.y + mo2.height
								| mo.y < mo2.y - mo.height)) {
							mos.remove(mo2);
							if (mStr.equals(bulletUrl)) { //包地址
								m.music();   //MoveObject music()播放音乐
								mos.remove(mo);
								score++;
								if (mo2 instanceof BigPlane)
									score++;
								if (mo2 instanceof SpecialPlane) {
									hero.doubleFire += 10;
								}
								if (mo2 instanceof Heart) {
									hero.life++;
								}
								if (mo2 instanceof Ammunition) {
									hero.Booooom++;
								}
								if (mo2 instanceof SmallPlane) {
									int count = (int) (Math.random() * 3);
									if (count == 1) {
										hero.life++;
									}
								}
							} else if (mo2 instanceof Heart) { // 可以撞上去
								hero.life++;
							} else if (mo2 instanceof Ammunition) {// 可以撞上去
								hero.Booooom++;
							} else {
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
//			if(!(mo.get(i) instanceof Hero))mo.get(i).move();
			MoveObject m = mo.get(i);
			m.move();
			if (!(m instanceof Sky | m instanceof Hero)) {
				if (m.y > HEIGHT | m.y < -HEIGHT) {
					mos.remove(m);
				}
			}
		}
	}

	public void paint(Graphics g) {
		paints(g, mos);
		if(Reset!=false) {
			g.setColor(Color.red);
			g.setFont(new Font("微软雅黑", 120,120));
			g.drawString("按空格开始游戏！", 200, 350);
		}
		g.setColor(Color.YELLOW);
		g.setFont(new Font("楷体", 48, 48));
		g.drawString("SCORE=" + score, 50, 50);
		g.drawString("LIFE=" + hero.life, 1000, 50);
		g.drawString("导弹=" + hero.Booooom, 500, 50);
		g.setColor(Color.white);
		g.setFont(new Font("微软雅黑", 18, 18));
		g.drawString("（空格键暂停游戏）", 50, 70);
		if(GameEnd==1) {
			g.setColor(Color.red);
			g.setFont(new Font("微软雅黑", 160,160));
			g.drawString("GAME OVER", 100, 350);
			g.setColor(Color.blue);
			g.setFont(new Font("微软雅黑", 80,80));
			g.drawString("最终的得分："+newScore, 330, 550);
			g.setColor(Color.white);
			g.setFont(new Font("微软雅黑", 25,25));
			g.drawString("(历史最高分："+MaxScore+")", 480, 600);
			g.drawString("请按R键重新开始！!", 480, 640);
		}
		
	}

	private void paints(Graphics g, ArrayList<MoveObject> mo) {
		for (int i = 0; i < mo.size(); i++) {
			mo.get(i).paint(g);
		}
	}

}
