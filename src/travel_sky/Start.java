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
 * �С��Ŀ�ı�API���䣺 1��AudioClip�ӿڣ� 1����飺 �����ڲ�����Ƶ�����ļ򵥳��� ��� AudioClip
 * ���ܹ�ͬʱ���ţ��õ������������һ�� �ɲ����ϳ������� 2��new���� AudioClip music = Applet.newAudioClip(
 * Start.class.getResource("xxx.wav")); 3�����÷����� void loop() ��ѭ����ʽ��ʼ���Ŵ���Ƶ������ void
 * play() ��ʼ���Ŵ���Ƶ������ void stop() ֹͣ���Ŵ���Ƶ������
 * 
 * 2��KeyListener�ӿڣ� 1����飺���ڽ��ռ����¼������������������ӿڡ� 2��new ����Ͱ��巽ʽ��KeyListener kl = new
 * KeyListener() {}; JFrame jframe.addKeyListenner(kl); 3�����÷����� void
 * keyPressed(KeyEvent e) ����ĳ����ʱ���ô˷����� void keyReleased(KeyEvent e) �ͷ�ĳ����ʱ���ô˷�����
 * void keyTyped(KeyEvent e) ����ĳ����ʱ���ô˷����� ��¼��KeyEvent ���÷����� char getKeyChar()
 * ��������¼��еļ��������ַ��� int getKeyCode() ��������¼��еļ����������� keyCode��
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
	 * 	����
	 */
	Bullet b = new Bullet(0,0);
	String str1=b.toString();
	String bulletUrl = str1.substring(0,str1.indexOf("@")); //Bullet����ַȡ��@ǰ���ַ�
	
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
				System.out.println("��ʼ");
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
				System.out.println("��ͣ");
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

		MouseAdapter ma = new MouseAdapter() {// ��������
			public void mouseMoved(MouseEvent e) {
				int x = e.getX();// �������x����
				int y = e.getY();
//				System.out.println(x);
//				System.out.println(y);
				hero.move(x, y);
			}

		};// �ڲ��ࣺ�������������

		this.addMouseListener(ma);// �����������������
		this.addMouseMotionListener(ma);

		int index = 0;// ������
		Bullet bulletCompare = new Bullet(0, 0);
		
		while (true) {
			if(Reset!=false) {
				while(Reset) {
					System.out.println("��ͣ��");
					try {
						Thread.sleep(900);
					} catch (InterruptedException e1) {
						// TODO �Զ����ɵ� catch ��
						e1.printStackTrace();
					}
				}
			}
			
				while(GameEnd==1) {
					System.out.println("��Ϸ����");
					hero.life=3;
					score= 0;
					hero.Booooom=0;
					try {
						Thread.sleep(900);
					} catch (InterruptedException e1) {
						// TODO �Զ����ɵ� catch ��
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
				mos.add(new Heart()); // �����
			}
			if (index % 200 == 0) {
				mos.add(new Ammunition()); // ��ҩ
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
							if (mStr.equals(bulletUrl)) { //����ַ
								m.music();   //MoveObject music()��������
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
							} else if (mo2 instanceof Heart) { // ����ײ��ȥ
								hero.life++;
							} else if (mo2 instanceof Ammunition) {// ����ײ��ȥ
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
			g.setFont(new Font("΢���ź�", 120,120));
			g.drawString("���ո�ʼ��Ϸ��", 200, 350);
		}
		g.setColor(Color.YELLOW);
		g.setFont(new Font("����", 48, 48));
		g.drawString("SCORE=" + score, 50, 50);
		g.drawString("LIFE=" + hero.life, 1000, 50);
		g.drawString("����=" + hero.Booooom, 500, 50);
		g.setColor(Color.white);
		g.setFont(new Font("΢���ź�", 18, 18));
		g.drawString("���ո����ͣ��Ϸ��", 50, 70);
		if(GameEnd==1) {
			g.setColor(Color.red);
			g.setFont(new Font("΢���ź�", 160,160));
			g.drawString("GAME OVER", 100, 350);
			g.setColor(Color.blue);
			g.setFont(new Font("΢���ź�", 80,80));
			g.drawString("���յĵ÷֣�"+newScore, 330, 550);
			g.setColor(Color.white);
			g.setFont(new Font("΢���ź�", 25,25));
			g.drawString("(��ʷ��߷֣�"+MaxScore+")", 480, 600);
			g.drawString("�밴R�����¿�ʼ��!", 480, 640);
		}
		
	}

	private void paints(Graphics g, ArrayList<MoveObject> mo) {
		for (int i = 0; i < mo.size(); i++) {
			mo.get(i).paint(g);
		}
	}

}
