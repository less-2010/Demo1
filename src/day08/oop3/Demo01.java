package day08.oop3;

public class Demo01{
	public static void main(String[] args) {
		
	
//	�����������
//	3��final��instanceof �ؼ���
//	3-1��final ���α�����ʾֵ���ɸı�
	int a=10;
	a=20;
	final int b=10;
	final int c;
	c = 10;
//	c=20;//����
//	3-1-2�����γ�Ա��������������ʱ��ʼ����Ҳ���Թ����г�ʼ����

	Car car = new  Car();
//	car.price=10;//����
	
//	3-2�� final ���η�����ʾ���ɱ���д
	
	Trnk tank = new Trnk();
	tank.bombard();
	tank.fire();
	
//	3-3��final�������ʾ���ܱ��̳�
//	����:�����಻���̳��޸ģ��������ü̳ж�ϵͳ���Σ����
	Math . random( );
//	���˻��п۳�һ��Ǯ
	int account=100;
	int money=10;
	MyMath mm=new MyMath( );
	account=mm. reduce(account, money);
	System. out.println( account);
	MyMath mmm=new MyMath2();
	account=mmm. reduce (account,80);
	System.out.println(account);

// 3-4�� static fianl ���εĳ�Ա������Ϊ��̬����,��������ͬʱ��ʼ��,��ֵ�����Ըı�.
	// ��̬�����ڱ���ʱ��ת����ʵ������ ����ȫ����д
	// ��̬�����ڱ���ʱ��ת����ʵ�ʵĳ���ֵ������:���廯
	System. out. println(Car.TYRES);
//	3-5��instanceof �ؼ���:�ж�ĳ������ָ��Ķ����Ƿ�Ϊָ����������:��ǿ��ת��ʱ�����������ת���쳣��|
	Car ca = new Trnk();
//	ca.bombar();����
//	3-5-1
	Trnk t=(Trnk) ca;
	t.bombard();
//	3-5-2
	((Trnk)ca).bombard();
	MyMath ma = new MyMath();
//	((Trnk)ma).bombard();
	System.out.println(ca instanceof Car);
//	System.out.println(ma instanceof Car);
	

	}

	
}