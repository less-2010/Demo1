package day06;
    /*
    	课后练习：
		创建一个账户Account类，该类有id:账户号码(长整数),password:
		账户密码,name:真实姓名,personId:身份证号码 字符串类型,
		email:客户的电子邮箱,balance:账户余额.方法:deposit: 
		存款方法,参数是double型的金额;withdraw:取款方法,
		参数是double型的金额.构造方法:有参和无参,
		有参构造方法用于设置必要的属性
        测试类测试之
        */  

public class Account {
    static long id;
    static int passWord;
    static String name;
    static String personId;
    static String email;
    static double balance;
    //无参构造
    public void Account() {
        id = (long)(Math.random()*(999999999-100000000)+100000000);
        balance =0;
     }
    //有参构造
    public void Account(int password,String name,String personId,String email) {
        
        this.passWord = password;
        this.name = name;
        this.personId = personId;
        this.email = email;
        
        }
    // 存款方法
    public  void deposit(double meney) {
        balance = balance + meney;
        System.out.println("存款:"+meney+"余额为: "+balance);return;
    }
    //取款方法
    public void withdraw(double meney) {
        balance = balance - meney;
        System.out.println("取款:"+meney+"余额为: "+balance);return;
        
    }
    // 获取个人信息
    public void info() {
        System.out.println("用户id:"+id+"  密码:"+passWord+"  用户姓名:"+name+"  身份证:"+"  邮箱"+email+"  余额"+balance);
        return;
    }

    public static void main(String[] args) {
        Account test1 = new Account();
        
        test1.Account( 654321, "小明", "45012116923123", "123456789@qq.com");
        //收入500
        test1.deposit(500);
        //消费100
        test1.withdraw(100);
        //获取总信息
        test1.info();

    }

  
}
