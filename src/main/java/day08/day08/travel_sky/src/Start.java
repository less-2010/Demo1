package day08.day08.travel_sky.src;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;



public class Start extends JPanel {
	public static final int WIDTH=1200;
	public static final int HEIGHT=700;
	Sky sky = new Sky();
	Hero hero = new Hero();
	BigPlane bp = new BigPlane();
	
	ArrayList<BigPlane> bps = new ArrayList();
	ArrayList<SmallPlane> smp = new ArrayList();
	ArrayList <Specialplane> spps = new ArrayList();
	public static void main(String[] args) {
	
		JFrame frame= new JFrame();
		Start start = new Start();
		frame.add(start);
		frame.setSize(WIDTH, HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setTitle("打飞机");
		start.action();
		
	}
	
	public void action() {
		
		MouseAdapter mouse = new MouseAdapter() {
			public void  mouseMoved(MouseEvent e) {
				int x = e.getX();
				int y= e.getY();
				System.out.println(x);
				System.out.println(y);
				hero.move(x-50,y-70);
			}
			
		};
		
		this.addMouseListener(mouse);
		this.addMouseMotionListener(mouse);

		int speed=1;
		int index = 0;
		while(true) {
			sky.y++;
			sky.y2++;
			if(sky.y>=sky.height)sky.y=-sky.height;
			if(sky.y2>=sky.height)sky.y2=-sky.height;
			index++;
			if(index%80==0){
				bps.add(new BigPlane());
				smp.add(new SmallPlane());
				spps.add(new Specialplane());
			}
			for (int i = 0; i <smp.size() ; i++) {
				smp.get(i).y+=2;
			}
			for (int i = 0; i < bps.size(); i++) {
				bps.get(i).y+=2;

			}

			for (int i = 0; i < spps.size(); i++) {
				SmallPlane sp = new SmallPlane();
				spps.get(i).y+=2;
				spps.get(i).x+=speed;
				if (sp.x>=(WIDTH-sp.width)|sp.x<=0){
					speed=-speed;

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
	
	@Override
	public void paint(Graphics g) {
		sky.paint(g);
		hero.paint(g);

		for(int i = 0;i<bps.size();i++){
			bps.get(i).paint(g);

		}

		for (int i = 0; i <smp.size() ; i++) {
			smp.get(i).paint(g);
		}


		for (int i = 0; i <spps.size() ; i++) {
			spps.get(i).paint(g);
		}

	}
	

}
