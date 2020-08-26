# 一、javaSE基础

### 1、变量和常量

#### 1-1、定义

```java
变量本质上是在计算机内存中代表一个“可操作的存储空间”,空间位置是确定的，但是里面存放的值是不确定的，可以通过
变量名来访问“对应的空间”,从而操作这个“存储空间”存储的值。   
```

【字节】：

```java
字节是内存中最小的存储单位，一个字节byte由8位组成，8个bit
```

==java是一个强类型语言，每个变量都必须声明其数据类型，变量的数据类型决定了变量占据存储空间的大小。==

==比如：int a=10;表示表a的空间大小4个字节。==

【数据类型】：

```java
int是一个数据类型，依据int就能够开辟4个字节的内存空间，用以用于存放整数
```

#### 1-2、变量类型：

```java
变量类型分为基本类型和引用类型
```

#### 1-3、变量种类：

##### 1-3-1、局部变量:

在方法或语句块内部定义的变量，叫局部变量。生命周期是从声明位置开始到方法或语句块执行完毕为止。局部变量必须先声明再赋值后使用。

##### 1-3-2、成员变量：

也叫实例变量，方法外部、类内部定义的变量，叫做全局变量，作用域是整个类中，从属于对象，生命周期伴随对象始终。如果不自行初始化，他会自动初始化成该类型的默初始值。

##### 1-3-3、静态变量：

也叫类变量，使用static修饰，从属于类，生命周期伴随类始终，从类加载到卸载。

#### 1-4、常量

常量通常指的是一个固定的值，例如：1、2、3、'a'、‘b’、‘c’、true、false、'zhangsan'等。在java语言中，主要是利用关键字final来定义一个常量。常量一旦初始化后不能再更改其值。

**定义常量的格式：**

```java
final type varName=value;
```

```java
	int age=18;
	final String name="zhangsan";
//	name="lisi";//定义成常量就不能再被修改
```

常量的定义规则：一般定义成大写，比如NAME, 或者YOUR_NAME。

#### 1-5、变量三步骤：

1.声明

2.赋值

3.使用

```java
//1.声明变量  根据数据的大小依据数据类型int在内存中开辟一个能存放整数的空间	（4个字节）
	int a;
	//2.赋值  把整数10通过=号把右边的值赋值给左边的变量名（因为需要通过变量名就是内存地址找到内置中存放的10）
	a=10;
	//3.使用  使用变量里面的值进行计算
	a=a+5;
    System.out.println(a);
```

==还可以声明并且赋值：==

```java
	//声明并且赋值
//	int a=10;
//	int a,b,c=10;//不建议使用
	int a=10,b=5,c=8;//不建议使用	
	//3.使用  使用变量里面的值进行计算
	a=a+5;
    System.out.println("a的值是:"+a+",b的值是:"+b);
```



#### 1-6、程序调试：

##### 1-6-1、调试的作用：

```java
当程序的流程越来越复杂，我们想要看到代码如何一行一行的去执行的，那么我们就需要学会如何去进行调试
调试目的有两个：
    1.让自动执行的代码变成手动模式一步一步的去执行，看到程序运行的步骤
    2.可以监视内存中变量的值如何发生改变
```

##### 1-6-2、调试步骤：

> 1.打断点，自动执行的代码遇到断点就会停住，开始手动执行
>
> 2.debug as 调试模式启动
>
> 3.F6，手动执行代码，观察变量里面的值如何发生改变
>
> 4.如果需要将手动执行的代码变成自动执行，可以按F8变成自动执行

### 2、数据类型
#### 2-1、基本数据类型
<!-- 基础数据类型（四类八种） -->
##### 2-1-1、 整数类型: 

        - byte 字节型：8bit=1byte:-128~127 
        - short 短整型 16bit=2byte
        - int 整型: 32bit: =4byte
        - 1ong 长整型: 64bit=8byte

##### 2-1-2、小数类型: 
        - float 单精度浮点型: 32bit=4byte
        - double 双精度浮点型: 64bit=8byte

##### 2-1-3、布尔类型:

        - boolean 布尔型: 8bit=1byte, 占1bit

##### 2-1-4、 字符类型:

        - char 字符类： 16bit=2byte

#### 2-2、引用数据类型

        - String 32 bit = 4 byte  特殊的引用数据类型
        - 接口   interface     32 bit = 4 byte
        - 类    class 32 bit =4 byte

#### 2-3、数据类型转换

##### 2-3-1、自动类型转换

```java
小的空间里面的数据放到大的空间里面去，能放下，叫自动类型转换
```

##### 2-3-2、强制类型转换

```java
大的空间的数据放到小的空间里面，放不下，需要强制类型转换，但是会丢失精度，把整数后不要了!
```



```java
           int a=10;
			//小的空间里面的数据放到大的空间里面去，能放下，叫自动类型转换
			double b=a;//自动类型转换
			double c=9.8;
			// cannot convert from double to int
			//大的空间的数据放到小的空间里面，放不下，需要强制类型转换，但是会丢失精度，把整数后不要了!
			int d=(int) c;
			System.out.println("a："+a+" b:"+b+" d:"+d);
			//怎么把123变成String最简单
//			String str=123+"";
```

### 3、运算

####    3-1、赋值运算
```text
赋值运算以”=“表示 把右边的值赋给"="左边的值
int a = 100;//把100赋给a变量
```
####    3-2、算术运算
##### 3-2-1、i++与++i

```java
int a = 5;
int b = a+++5;//先运算后自增 先拿5+5再去自增1结果b=10；
int c = ++a+5;//先自增后运算先拿5+1再去拿6+5结果c=11;
System.out.println("a:"+a+"b:"+b);
System.out.println("a:"+a+"c:"+c);
```
##### 3-2-2、 + - * / %

####    3-3、比较运算

```
a>b
a<b
a>=b
a<=b
a==b
a!=b    
条件运算符也可以比较运算符，得到结果是bolean类型，也就true或者false 
```



####    3-4、逻辑运算

```
并且  && 
或者  || 
非    ！  取反的意思   

条件1&&条件2 都同时满足为true，返回结果true

false&&true   -->返回false

false&&false -->返回false

条件1||条件2 只要有一个满足true，返回结果true

true||false --》true

false||false -->false
```



[面试题]

```java
&和&&的区别？|和||的区别？
答：&&具有短路功能，比如  条件A&&条件B，条件A和条件B同时满足true返回结果为true，当条件A已经得到结果是false了那么条件B就没有必要去比了，这就是短路功能，因此效率更高。&就必须将条件A和条件B都去比较效率低 
```



####    3-5、位运算

```java
	System.out.println(12<<3);
	System.out.println(2>>3);
```



####    3-6、三目运算

```java
  //类似于if结构，？前面的做比较，如果比较结果是true就把:前面的1赋值给a,否则把:后面的5赋给a	
	int a=7>8?1:5;
	System.out.println("a:"+a);
		
	String str=9>8?"帅哥":"妹子";
	System.out.println(str);
```



####    3-7、运算符优先级

![image-20200826204534852](C:\Users\BING\AppData\Roaming\Typora\typora-user-images\image-20200826204534852.png)


### 4、数组 
    1）定义：数组是存放一种相同类型数据的集合，一种数据结构；
    2） 声明数组 int[] a; //在栈内存开辟空间，用于存放堆内存地址
    3) 分配空间 a[] = new int[5];//在堆内存开辟空间，将堆内存的地址赋给a，a保存在栈在栈内存
    4) 赋值 a[0]= 1;a[1]=2; 常用通过循环获取下标赋值 
    5）遍历 foreach
    6）增删改查 
    7）copy 复制
```java

        // System.arraycopy()
        //  System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        /*
         *src,原数组
         *srcPos,原数组的起始位置
         *dest,目标数组
         *destPos,目标数组的起始位置
         *需要复制的元素个数
         */
        //  例
         int []a = {10,23,30,40,50};
         int []b = new int [4];
         System.arraycopy(a, 1, b, 0, 4);
         System.out.println(Arrays.toString(a));
         System.out.println(Arrays.toString(b));
        //  数组复制练习1：
        //  随机产生10个int类型[0,100)的数据存入数组，并输出；
        //  截取下标从3(含)至7(含)的元素存入另一个数组并输出。
         int arr1[] = new int[10];
         int arr11[] = new int[5];
         for (int i = 0; i < arr1.length; i++) {
            arr1[i] =(int) (Math.random()*100);            
         }
         System.out.println(Arrays.toString(arr1));
         System.arraycopy(arr1, 3, arr11, 0, 5);
         System.out.println(Arrays.toString(arr11)); 
```
    8) 数组扩容
```java
Arrays.copyOf()
        //  Arrays.copyOf(int[] original, int newLength)
        //  int[] original：目标数组
        //  int newLength：新长度

        //  数组复制练习2：
        //  随机产生5个int类型的[0,100)数据存入数组，并输出；
        //  使用Arrays.copyOf()在以上数组基础上扩容出一共
        //  含8个元素的数组，并在新元素位置存放随机产生的3个
        //  [0,500)元素，并输出。
       
        int arr2[] = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] =(int) (Math.random()*100);
        }
        System.out.println(Arrays.toString(arr2));
        int arr3[] = Arrays.copyOf(arr2, 8);
        for (int i = 0; i<arr3.length; i++) {
            if(i>=5){
                arr3[i] =(int) (Math.random()*500);
            }
        }
        System.out.println(Arrays.toString(arr3)); 

    //  输出数组内容3_____Arrays.toString()
    //  Arrays.toString(array)
```

#### 4-1、一维数组
    1）初始化
    方式一 ：int[] a = {1,2,3,5,6}
    方式二：int[] b = new int[]{1,2,3,4,5,6}
    2）

#### 4-2、 二维数组


### 5、流程控制
####  5-1、选择结构语句

##### 

##### 5-1-1、if结构

1）、简单if结构 用于简单的判断

```java
       int money=20;
		if(money>100) {
			System.out.println("吃肯德基！");
		}else{
			System.out.println("吃南昌拌粉！");
		}
```

2）、else if多重if结构

多重选择但是只会选择一种的情况下使用

```java
package day02;

import java.util.Scanner;

/**
 * 控制台输入分数
 * 如果分数大于90分，奖励兰博基尼
 * 如果大于等于80分，奖励保时捷
 * 如果大于60分 ，奖励大众
 * 低于60分，不奖励
 * 
 *
 */
public class Day01 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("请输入分数:");
	int score=input.nextInt();
	//多重if结构，多重选择但是只会选择一种的情况下使用
	if(score>90){
		System.out.println("奖励兰博基尼一台");
	}else if (score>=80) {
		System.out.println("奖励保时捷一台");
	}else if (score>=60) {
		System.out.println("奖励大众");
	}else{
		System.out.println("不奖励");
	}
	
	}
}

```

3）、嵌套if结构

用于复杂的判断，  先满足外层的if结构条件，再去执行内存if结构

```java
package day02;

import java.util.Scanner;

/**
 * 输入星期   一 二等
 * 
 * 如果星期1 :吃炒粉
 * 如果星期2  :吃沙县料理
 * 如果星期3  :吃兰州料理
 * 如果星期4、5:吃盖饭
 * 其他时间吃肯德基
 * 判断如果不是1-7之间的数，就提示输入星期错误
 * 
 * 
 *
 */
public class Day02 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入星期：");
		int week=input.nextInt();
		//嵌套if结构  用于复杂的判断，  先满足外层的if结构条件，再去执行内存if结构
		if (week>=1&&week<=7) {
			if (week==1) {
				System.out.println("星期一吃炒粉");
			}else if (week==2) {
				System.out.println("星期二吃沙县小吃");
			}else if(week==3) {
				System.out.println("星期三吃兰州拉面");
			}else if(week==4||week==5){
				System.out.println("星期四和星期五都盖饭");
			}else {
				System.out.println("其他时间吃肯德基");
			}
		}else {
			System.out.println("输入错误，请输入合法的星期");
		}	
	}
}

```



##### 5-1-2、switch结构

就是用来替代else-if多重结构的，作用一致，都是用于多种选择但只选择一种。

```java
 Scanner input=new Scanner(System.in);
	 System.out.print("请输入星期:");
	 char week=input.next().charAt(0);
	 switch(week) {
	 case '一':
		 break;
	 case '二':
		 System.out.println("星期二吃DKS");
		 break;	 
	 case '三':
	 case '四':
		 System.out.println("星期三、四吃MDL");
		 break;
	default:
		System.out.println("其他时间吃盖饭");
		break;
	 }
```



【**else -if和switch的区别？**】

```java
switch只能用于等值判断，而else-if可以用于等值判断也能用于区间判断。
```

==switch中表达式的类型只能是:int、char、String类型==

【问题】

switch能不能嵌套？

```java
可以switch嵌套switch，但是这些写太乱不建议这样写，建议switch嵌套if结构
```



```java
Scanner input=new Scanner(System.in);
	 System.out.print("请输入星期:");
	 char week=input.next().charAt(0);
	 char sex='男';
	 switch(week) {
	 case '一':
		 System.out.println("星期一吃肯德基");
		 if (sex=='男') {
			System.out.println("男的吃肯德基打八折");
		}else {
			System.out.println("女的吃肯德基免费！");
		}
		 break;
	 case '二':
		 System.out.println("星期二吃DKS");
		 break;	 
	 case '三':
	 case '四':
		 System.out.println("星期三、四吃MDL");
		 break;
	default:
		System.out.println("其他时间吃盖饭");
		break;
	 }
```

##### 【面试题】== 和equals的区别

== 是数值之间的比较，比较的内存地址，char类型也是用 == 比较，比如sex=='男'。

equals()是字符串之间的比较，比较的是两个值是否相等，比如   "男生".equals(sex），注意一定要把“男生”值放前面，防止空指针异常。

```java
//	char sex='女';
//	if(sex=='男'){
//		System.out.println("去男厕所");
//	}else {
//		System.out.println("去女厕所");
//	}
	Scanner input=new Scanner(System.in);	
	String sex=input.next();
//	if("男生".equals(sex)){
//		System.out.println("男神去男厕所");
//	}else {
//		System.out.println("女生去女厕所");
//	}
	if(!"男生".equals(sex)){
		System.out.println("女生去女厕所");
	}else {
		System.out.println("男生去男厕所");
	}
```



#### 5-2、 循环语句

```java
1）if()...else...if()

    int s = 75;
    if (s >= 90) {
        System.out.println("优秀");
    } else if (s >= 80) {
        System.out.println("良好");
    } else if (s >= 70) {
        System.out.println("中等");
    } else if (s >= 60) {
        System.out.println("及格");
    } else {
        System.out.println("不及格");
    }

```

```java
2) switch 
    int num = 6;
    switch (num) {
    case 1:
    System.out.println("代码1");
    break;
    case 2:
    System.out.println("代码2");
    break;
    case 3:
    System.out.println("代码3");
    break;
    default:
    System.out.println("默认");
    }
    System.out.println("结束");

```
####5-3、循环语句

  ##### 5-3-1、while 循环语句

```java
  while(布尔值){
    表达式
  }
```
```java
    int n = 0;
    while(true){
            num++;
            if(num>100)break;
            System.out.println("❤我的小鱼❤\n"+"❤你醒了❤\n"+num);
        }
```

  ##### 5-3-2、do...while 循环

```java
 * do-while特征：先执行，后判断。不管条件是否成立，至少会执行一次
 *
 */ 
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);	
	String answer;	
	do {
		System.out.println("练习敲代码一遍！");
		System.out.println("是否合格?(y/n):");
		answer=input.next();
	}while("n".equals(answer));	
	
	System.out.println("及格了不需要练习了！");
} 
```


  ##### 5-3-3、for 循环语句

``` java
    a、for循环
   
          for (int i = 0; i < 100; i++) {
              System.out.println("❤"+ i);
          }

  
   b、嵌套for循环
    外层循环一次内层循环一轮
          int a=0;
          for(int i=0;i<5;i++){
              for(int j=0;j<5;j++){
                  a++;
                  System. out . println("oK:a="+a+",i="+i+",j="+5);
              }
          }
```
  ##### 5-3-4、foreach 语句

```java
  用于数组或集合的遍历取值；不能赋值
  int array[] = {7, 8, 9};
       for (int arr : array) {
       System.out.println(arr);
  }
```
####5-4、跳转
  ```text
 1、System.exit(int  status)：不管status为何值都会退出程序（即结束当前正在运行的java虚拟机），但是只有在status等于0，即System.exit(0)；的时候整个程序正常退出。
    
 当status为除0之外的数字时都视为程序的不正常退出。（示例在一个if-else判断中，如果我们程序是按照我们预想的执行，到最后我们需要停止程序，那就使用System.exit(0)，而System.exit(1)一般放在catch块中，当捕获到异常，需要停止程序，我们使用System.exit(1)。）

 2、return：return；是只能直接回到上一层继续往下执行，不会直接导致整个程序的停止执行。

 3、break：break；只在switch语句体和循环体应用，一个break；语句能退出一个switch语句体或循环体，不会执行循环体或switch语句体余下的语句，不能连续退出多个switch语句体或循环体。

 4、continue：自己目前只在循环体应用。continue；跳过本次循环体中余下尚未执行的语句，接着再一次进行循环的条件判定是否执行。
   
  ```
# 二、面向对象

## 6、OOP
Object Orieented Programming 面型对象编程，是编程思想中最重要的概念
### 6-1 面向过程：
1）、概述：

    在OOP之前我们是面向过程编程
    面向过程编程：把一个项目在一个类中去写，把一个项目分成每一步去执行，自顶而下的编程模式，比如c语言

2）、面向过程的弊端：

    1、代码在一个类中，自上而下执行，代码耦合度高，后期拓展和维护成本高
    2、代码自上而下执行，代码复用性不高

### 6-2 面向对象：
### 6-3、面型对象特性：
#### 6-2-1、封装
1、概念：

    概念：把客观事物抽象成抽象的类，并且类可以把自己的属性和方法只让可以信任的类或者对象进行操作，对不可以信任的类或者对象隐藏，这样的过程叫做封装。

2、分类：

         1) 对属性的封装:
            将属性设置为private (私有)，限制其只能在类的内部使用
         2) 对方法的封装:
            将外部可以访问的方法设置为public,不能访问的设置为private
         3) 对私有属性:
            提供get、set方法，可酌情设置密码
         4) 对私有方法:
            提供相应调用，常用场景:懒汉单例模式
3、步骤:

    1）.将属性private     
    2）. get和s et方法分别获取值和设置值

4、作用：
    
    通过将属性封装，提高数据的安全性

5、 懒汉单例：
```java
public class LazySingleton {
  private static LazySingleton ls = null;
  int a = (int) (Math.random()*10000000);
  private LazySingleton(){}
      public static LazySingleton getInstance() {
      if (ls==null) {
          ls=new LazySingleton();
          return ls;
      }else
          return ls;
      }
}

```
懒汉单例模式（单线程）
```java
//(多线程不安全)
//      LazySingleton ls=new LazySingleton();
//      LazySingleton ls2=new LazySingleton();//构造设置为私有才可能单例
        LazySingleton ls3=LazySingleton . getInstance();
        LazySingleton ls4=LazySingleton . getInstance();
        System. out . println(ls3.a);
        System. out . println(ls4.a);//A没有实现单例
```
#### 6-2-2、继承

1)、概述：

    继承是指这样一种能力：它可以使用现有类的所有功能，并在无需重新编写原始的类的情况下对这些功能进行扩展。
    通过继承的新类称为“子类”或“派生类”，被继承的类称为“基类”，“父类”或“超类”。
    继承的过程，就是从一般到特殊的过程。
2）、实现：

    要实现继承，可以通过“继承”（继承）和“组合”（组成）来实现。
    继承概念的实现方式有二类：实现继承与接口继承。
    实现继承是指直接使用基类的属性和方法而无需额外编码的能力；
    接口继承是指仅使用属性和方法的名称，但是子类必须提供实现的能力；

#### 6-2-3、多态
1)、概述：

    所谓多态就是指一个类实例的相同方法在不同情况有不同的表现形式。
    多态机制使具有不同内部结构的对象可以共享相同的外部接口。
    这意味着，虽然针对不同对象的具体操作不同，但通过一个公共的类，它们（那些操作）可以通过相同的方式调用。
    最常见的多态就是将子类纳入父类参数中，运行时调用父类方法时通过引入的子类决定具体的内部结构或行为。
### 6-3 类与对象
1、类：

    类（ class ) 归类，把相同特征的属性和方法归为一类，类里面有属性和方法，是构造对象的模板或蓝图 ，是一个抽象的概念

2、对象： 
    
    1).是类中抽象概念的一个具体的一个实例，是具体的 
    2).由类构造 （ construct ) 对象的过程称为创建类的实例 （ instance ) 。
    3).对象也是一种存储形式，存储对象的不同属性

3、类和对象的联系：

    1).类里面有属性和方法，想要调用里面的属性或方法需要创建一个类对象来调用(私有的除外)
    
    2).直接使用对象可以重复调用方法属性

4、优势：

    代码复用，提高工作效率
```java
/**
*创建学生类
*学生属性
**/

public class Student{
//特征：属性,全局变量也叫实例变量

//类变量 存放在方法区
private static int a;
//成员变量  存放在堆内存
    String name;
    int age;
    char sex;

//行为：方法
    public void Study(){
        //局部变量 存放在栈内存
        int
        System.out.println("学生学习");
    }
//get()and set()
    public void setName(String name){
        this.name = name;    
    }
    public void setAge(int age){
        this.age = age;    
    }
    public void setName(char sex){
        this.sex = sex;    
    }
    public String getName(){
        return this.name;
    }
    public int  getAge(){
        return this.age;
    }
    public Char getSex(){
        return this.sex;
    }
//    构造方法 
//    初始化成员变量
    public Student(){} //无参数构造
//  方式三 给成员变量赋值
    public student(String name,int age,char sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
/**
*测试类
**/
public class Test{
    public static void main(String[] args){
    //局部变量
    int i = 0;
    //创建类实例（对象）s
    Student s = new Student();
    s.age=10;//给成员变量赋值 方式一 直接操作属性
    //通过实例调用成员方法
    s.Study();
    }
}
```

## 7、方法

### 7-1、定义

    把逻辑细节用方法封装起来，通过对象能够重复调用方法。代码复用，提高工作效率
### 7-2、方法种类







  ### 7-3、阐述形参和实参的使用

    1) 形参:
        定义时可以没有实际值，但要有数据类型，可以接受实参传递过来的相应
    数据类型的数据值。
    2) 实参:
        可以是常量，也可以是变量，数据类型必须和形参保持一 致;如果是变量,
    在传递时里面必须存有实际的值。
    3) 传递方式:
        位置对应原则。

### 7-4、对象数组
1.案例1 基本数组类型（值传递）为方法参数
 在实参中复制了一份值给参数，形参里面发生改变，实参不发生改变

```java


```

2.案例2 数组对象（引用传递）为方法参数 
引用传递 把arr1的内存地址复制了一份给arr2 ，arr1 和arr2 引用的是同一个地址 
arr2改变 那么arr1指引的内存地址的值也发生改变

```java
public class Cal{
    //交换
    public void exChange(int a,int b){
            int c = a;
            a=b;
            b=c;
        }
    }
    //排序
    public void sortArr(int[] arr2){
        for(int i = 0; i <arr2.length ; i++) {
            for(int j = 0; j <i ; j++) {
              if (arr2[j]>j[h+1]){
                    exChange(arr2[j],arr2[j+1]);
                }
            }
        }
        
    }

}
```

```java
public class Test{
    public static  void main(String[] args){
    int arr1[] =  new int []{10,5};
    Cal cal = new Cal; 
    cal.sort(arr1);
    }     
}
```

#### 7-4-1 根据参数返回值分类    
    1)、无参无返回值方法
    2）、无参有返回值方法    
    3）、有参无返回值方法
    4）、有参有返回值方法
#### 7-4-2 根据功能实现
1）、构造方法 (构造函数)
    
    构造函数，是一种特殊的方法。主要用于在创建对象时初始化对象，即为对象成员赋值初始值，总与新运算符一起使用在创建对象的语句中。
    特别是一个类可以有多一个构造函数，可根据其参数个数的不同或参数类型的不同来区分其即构造函数的重载。
    构造函数跟一般的实例方法非常相似；但是与其他方法不同，构造器没有返回类型，不会被继承，并且可以有范围修饰符。
    构造器的函数名称必须和它所属的类的名称相同。承担着初始化对象数据成员的任务。
    如果在编写一个可实例化的类时没有专门编写的构造函数，则多个编程语言会自动生成变形构造器（重组构造函数）。

2）、成员方法
### 7-5、方法重载
简单说，就是函数或者方法有同样的名称，但是参数列表不相同的情形，这样的同名不同参数的函数或者方法之间，互相称之为重载函数或者重载方法。
```java
public class Test {
    /*方法重载*/
    /*相同的方法名，不同的参数*/
    /*使用场景：构造方法的重载；普通方法的重载*/
    public void eat(){
        System.out.println("什么都吃");
    }
    public void eat(String name,int number){
        System.out.println("吃"+name+"数量："+number);
    }
    
}
```
### 7-6、方法的重写
    重写指的是在Java的子类与父类中有两个名称、参数列表都相同的方法的情况。由于他们具有相同的方法签名，所以子类中的新方法将覆盖父类中原有的方法。
    使得代码扩展性更强
#### 7-6-1、方法重写的“两同两小一大”原则

```java
1) 两同:
    方法名相同，参数列表相同
2) 两小:
    2-1) 子类方法的返回值类型小于或等于父类的
        2-1-1) void和基本类型时必须相同
        2-2-2) 引用类型时小于或等于
3) 一大:
    3-1) 子类的访问权限大于或等于父类的 子类的访问控制小于父类的，确保访问父类时一定能访问子类。
```

### 7-7 、方法重写与方法重载的区别

```text
1) 重载:
    1-1)含义:方法名相同，参数列表不同，发生在同一个类中。
    1-2)意义:解决同一个类功能相似但并不相同的行为设计问题。
2) 重写:
    2-1)含义:方法名相同，参数列表相同，发生在父子类中。
    2-2)意义:解决父子类之间功能相同但表现形态不同的行为设计问题。
```



## 8、枚举

### 8-1、 什么是枚举
#### 8-1-1、概述：
    枚举是一种数据类型，具有集合的一些特点，可以存放多个元素，但存储对象有限且固定
### 8-2、枚举的使用场景:
    如我们需要表达性别（男、女），颜色（红、黄、蓝），星期（星期一、星期二...星期日），四季（春、夏、秋、冬），
    地理位置（东、西、南、北），方向（前、后、左、右）等，这些场景都非常适合枚举。
### 8-3、 定义枚举 
#### 8-3-1、默认构造器（空构造器）
```java

class Test {
    public static void main(String[] args) {
        // week的数据类型是Week枚举类型，就约定了Week变量里面只能是Week枚举里面的七个固定变量
        // 数据类型比常量更为严格
        List<Week> list = new ArrayList<>();
        for (Week week : Week.values()) {
            list.add(week);
        }
        for (Week week : list) {
            System.out.println(getWeek(week));
        }
    }

    enum Week {
        星期一,
        星期二,
        星期三,
        星期四,
        星期五,
        星期六,
        星期天;
    

        Week() {
        }

        /**
         * 使用枚举作为方法的参数
         *
         * @param week
         * @return
         */
        public static String getWeek(Test.Week week) {
            String instruct = "";
            switch (week) {
                case 星期一:
                    instruct="今天星期一";
                    break;
                case 星期二:
                    instruct="今天星期二";
                    break;
                case 星期三:
                    instruct="今天星期三";
                    break;
                case 星期四:
                    instruct="今天星期四";
                    break;
                case 星期五:
                    instruct="今天星期五";
                    break;
                case 星期六:
                    instruct="今天星期六";
                    break;
                case 星期天:
                    instruct="今天星期天";
                    break;
            }
            return instruct;
        }
    }
}


```
#### 8-3-2、定义了成员变量、带参构造器    
```java

/**
 * 枚举里面可以实现序列，成员变量 ，普通方法，构造方法
 * 自定义枚举类可以看作一个类，继承于java.lang.Enum类
 *
 * @author BING
 */
public enum Week {

    // 实现序列
    MONDAY("星期一",1),
    TUESDAY("星期二",2),
    WEDNESDAY("星期三",3),
    THURSDAY("星期四",4),
    FRIDAY("星期五",5),
    SATURDAY("星期六",6),
    SUNDAY("星期天",7);

    private String name;
    private int Num;
    //空参构造
    Week() {
    }
    //有参构造
    private Week(String name, int Num){
        this.name = name;
        this.Num = Num;
    }

    /**
     * 遍历枚举取值
     * @param name
     * @return
     */
    public static String getName(String name){
        for (Week w:Week.values()
             ) {
            if (name.equals(w.name)){
                return w.name;
            }
        }
        return null;
    }

    /**
     *
     * @param num
     * @return
     */
    public static int getNumber(int num){
        for (Week w:Week.values()
             ) {
            if (num==w.Num){
                return w.Num;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
```
### 8-4、注意：

    枚举和类一样，可以有多个构造器，即有了一个带参构造器，还可以有无参构造器，编译是可以通过的。
    除此之外：
    枚举enum 默认继承了java.lang.Enum类，
    实现了 java.lang.Seriablizable 和 java.lang.Comparable 两个接口，可序列化以及进行比较；
    所有的枚举值都是常量，默认采用了public static final 进行了修饰，enum不是类，自然也不能被继承或实现；
    枚举值必须在第一行，否则编译出错

## 9、继承
    作为一门面向对象开发的语言，代码复用是Java引人注意的功能之一。Java代码的复用有继承，组合以及代理三种具体的表现形式。
### 9-1、概述：
    继承：如果多个类的某个部分的属性或功能相同，那么可以抽象出一个类出来，把他们的相同部分都放到父类里，让他们都继承这个类。
    子类继承父类就可以拥有父类的属性和方法（私有的除外），优点是：提高代码复用
    
    继承是java面向对象编程技术的一块基石，因为它允许创建分等级层次的类。
    继承就是子类继承父类的特征和行为，使得子类对象（实例）具有父类的实例域和方法，或子类从父类继承方法，使得子类具有父类相同的行为。
###  9-2、向上转型和向下转型
#### 9-2-1、概述
    要转型，首先要有继承。继承是面向对象语言中一个代码复用的机制，
    简单说就是子类继承了父类中的非私有属性和可以继承的方法，然后子类可以继续扩展自己的属性及方法。
    
    向上转型: 通过子类对象 (小范围) 实例化父类对象 (大范围) , 这种属于自动转换
    Father f = new Son();
    向下转型: 通过父类对象 (大范围) 实例化子类对象 (小范围) , 这种属于强制转换
    Son s = (Son) f
```java
/**
 * 父类 人类
 */
public class Person {
    private String name;
    private int age;
    private char sex;
    private int weight;
    public Person(){
        System.out.println("父类SPerson无参构造");
    }
    public  Person(String name,int age,char sex,int weight){
        this.name= name;
        this.age= age;
        this.sex = sex;
        this.weight= weight;
    }

    /**
     *
     * @return
     */
    public String study(){
       return  "学习";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
```
```java

/**
 * 学生类继承父类
 * @author BING 
 * @date 2020/8/19 15:33
 * 
 */
public class Student extends Person {
    private double money;

    public Student(){
        System.out.println("子类Student无参构造");
    }
    //super 调用父类的构造方法
    public Student(String name,int age,char sex,int weight,double money){
        super(name, age, sex, weight);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    /**
     *
     * @return
     */
    public String PlayGame(){
        return "学生，打游戏";
    }

    /**
     *
     * @return
     */
    public String ShowInfo() {
        // super调用父类的属性和方法 可以省略super
        // this 本类对象的引用，通过this调用本类属性方法(在本类可以省略)
        return "我叫："
                 + super.getName() + '\'' +
                ", 年龄=" + super.getAge() +
                ", 性别=" + super.getSex() +
                ", 学费=" + this.money+
                ", 爱好1=" + super.study()+
                ", 爱好2=" + this.PlayGame();
    }

    //在继承关系下，子类（派生类）和父类（基类）的方法名相同，参数个数不同，具体实现不同，叫做方法覆盖，也叫方法重写
    @Override
    public String study() {
        return "我是学生，我在："+super.study();
    }
}

```
```java
/**
 * 子类 教师类
 * @author BING 
 * @date 2020/8/19 15:38
 */
public class Teacher extends Person {
    double wage;//工资

    public Teacher() {
    }

    public Teacher(String name, int age, char sex, int weight, double wage) {
        super(name, age, sex, weight);
        this.wage = wage;
    }

    /**
     *
     * @return
     */
    public  String  teach(){
     return "老师 ，教书";
    }

    @Override
    public String study() {
        return "我是老师+我在：" +super.study();
    }
}
```
测试类
```java
public class Test {
    public static void main(String[] args) {
        //给属性赋值 方式一
        Student student = new Student();
        student.setName("张三");
        student.setAge(20);
        student.setMoney(10000);
        student.setSex('男');
        //调用重写方法
        student.study();
        //调用特有的方法
        student.PlayGame();
        //student.weight;//子类不能调用父类私有方法
        System.out.println(student.ShowInfo());
        //给属性赋值 方式二
        Teacher teacher = new Teacher("李四",22,'男',52,5000);
        //调用重写方法
        teacher.study();
        //调用特有的方法
        teacher.teach();

        Person person = new Person("小明",23,'女',60);
        //person.PlayGame();不能调用子类方法 //可以使用向下转型
        person.study();//不能调用子类重写的方法,只能调用父类的
        

        //向上转型  创建子类以父类接受子类实例
        //使用场景一
        Person person2 = new Student("李四",22,'男',52,5000);
        person2.study();
        //使用场景二
        //做都有的附加信息后的动作
        doStudy(new Student());
        doStudy(new Teacher());
        //向下转型  取到子类特有的方法，需要将父类类型的对象向下转型
        Student student1 = (Student)person;
        //使用场景
        //做特有的动作
        doSpecific(new Teacher());
        doSpecific(new Student());

    }

    /**
     * 做都有的附加信息后的动作
     * @param p
     */
    public static void doStudy(Person p){
        p.study();
    }

    /**
     * 做特有的动作
     */
    public static void doSpecific(Person p){
        //如果碰撞到 Student
        if (p instanceof Student){
            //向下转型为
            Student student = (Student)p;
            student.PlayGame();
        //如果碰撞到 Teacher
        }else if(p instanceof Teacher){
            //向下转型为
            Teacher teacher = (Teacher)p;
            teacher.teach();
        }
    }
}

```
### 9-3、继承关系

![img](https://www.runoob.com/wp-content/uploads/2013/12/types_of_inheritance-1.png)

### 9-4、继承关键字

```text
继承可以使用 extends 和 implements 这两个关键字来实现继承，而且所有的类都是继承于 java.lang.Object，当一个类没有继承的两个关键字，则默认继承object（这个类在 java.lang 包中，所以不需要 import）祖先类。
```

### 9-5、继承的特性

```text
1)、子类拥有父类非 private 的属性、方法。

2）、子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。

3）、子类可以用自己的方式实现父类的方法。

4）、Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 A 类继承 B 类，B 类继承 C 类，所以按照关系就是 C 类是 B 类的父类，B 类是 A 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。

5）、提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）
```

### 9-6、注意 
    继承关系下,会优先走父类的无参构造,再去走子类的无参数构造,可以把一些初始化的工作交给父类无参构造

## 10、多态
    1) 概念:
        顾名思义，是指多种形态;相同的调用，得到不同的形态结果。不同子类
    或实现类的引用值赋值给父类或父接口的引用变量，调用父类或父接口的方法时，
    会运行不同子类或实现类的不同方法。形成多态的三个前提条件:继承、重写、向上
    造型。
    2) 意义:
        提供统一入口形成约定、提高代码复用性、提高代码可扩展性、降低代码
    的耦合度


 ## 11、封装

  ### 11-1、包的概念:

    1) 如果仅仅将类名作为类的唯一标识，则不可避免会出现命名冲突，java中用包的概念来解决命名冲突。在定义类时，第一行必须是声明包的语句， 类的全称是包名加类名。包在存储空间上是以项目开始的文件夹的层次目录。
    2) 正规的包命名规则是域名倒着写，其后跟项目名、模块名。例如:cn. com. zte. project1. register
    3) 访问一个类时，可以使用类的全称，但是这样过于繁琐。
    4) 通过import语句声明了类的全称，该源文件中就可以直接用类名来表示类的全称了
 ### 11-2、访问权限修饰符:

    访问修饰符可以用于修饰属性和方法，用于定义属性和方法的权限
    
     1) private修饰的成员:只能在本类中访问。
     2) (defau1t)修 饰的成员:只能在本类和同包中访问。
     3) protected修饰的成员:可以在本类和同包、以及异包的子类中访问。
     4) public修饰的成员:可以在整个项目中访问。

![image-20200826162239954](C:\Users\BING\IdeaProjects\Demo1\imges\image-20200826162239954.png)

 ## 12、内部类:
    1) 定义：
        一个类可以定义在另一个类的内部，这个类称为另外-个类的内部类
  ### 12-1、成员内部类:

    当定义的位置是作为一一个成员时，称为成员内部类
    1) 对外不具备可见性，所属外部类则可见。
    2) 内部类可以调用所属外部类的成员。
    3) 内部类有与外部类同名成员会覆盖，可用“外部类.this.成员”来调出外部类的同名成员。
    4) 内部类可以自由访问外部类成员，但是，外部类访问内部类成员需要内部类对象名.调用。
    5) 对外要new内部类对象，得通过外部类的对象进行
    6) 内部类和所属外部类是两个类。参见.class文件

  ### 12-2、局部内部类:
    当定义的位置在方法内或某作用域内时，称为局部内部类
    1) 类似于一个局部变量，只在本方法内或本作用域内定义后有效。
    2) 类似于局部变量，不能用static修饰。

  ### 12-3、 匿名内部类:
    没有类名(匿名)，是对某个类的继承或某个接口的实现
    1) 定义方式:(比较特别) new Class(){}。
    2) 作用:一 般用于实现父类或者接口中的方法。
    3) 唯一的没有构造方法的类一- 没有类名怎么去写构造?
    4) 只可能生成唯一的对 象。
    5) 该对象如果需要引用，只能向上造型。
    6) 可以作为成员内部类存在，也可以作为局部内部类存在。
    7) .class文件名 为: outer$1.class

  ### 12-4、静态内部类:
    static修饰的内部类
    1) 只能是成员内部类，不能是局部内部类。
    2) 不能访问外部类的实例成员。
    3) 匿名内部类唯一的对象可以赋值给静态成员。

  ### 12-5、可以实现多继承的效果

​			


​         
## 13、 普通类、抽象类、接口

### 13-1、相同点:
    1）、都可以声明引用
    2）、都可以向上造型
### 13-2、不同点及使用场景:

    1) 普通类:
        有构造方法，可以new对象; 可以写普通方法，不能写抽象方法;既可以有成员变量，也可以有静态变量;只能单继承。
        使用场景:所有对象最终都是通过普通类来描绘的，普通类是new对象的模板。
    2) 抽象类:
        有构造方法，不能new对象;可以写普通方法，也可以写抽象方法;既可以有成员变量，也可以有静态变量;只能单继承。
        使用场景:当某个类不具备足够的信息来描绘一个对象时，可以设置为抽象类;抽象类是对某类事物全部的、正式的抽象，可以对该类事物进行属性和行为上的全面约束。
    3) 接口:
        没有构造方法，不能new对象;不可以写普通方法，只能写抽象方法;不能有成员变量，只能有静态常量;可以多继承。
        使用场景:当想要对某些类进行行为上的约束，或者行为上也不约束、而只是作为某些类的共同标识时，使用接口;接口是对某些事物方法部分的、撮合性的抽象。 

## 14、类成员、实例成员 区别

### 14-1、类成员:
        static修饰的，属于类的，属性可以类名点调用、也可以对象名点调用，行为必须类名点调用，加载时相对先加载一类加载时即加载。
### 14-2、实例成员:
        没有static修饰的，属于实例的，属性和行为都必须对象名点来调用，加载时相对后加载一new对 象时实例化。
  ## 15、常用类

    1) object类
        java.lang.object
        object类是类层次结构中最顶层父类。
        所有类(包括数组)直接或间接的继承自0bject类。
        同时也继承了该类中的方法



    参考自链接：https://blog.csdn.net/huhahuha_/java/article/details/80516198

# 四、java高级特性
## 16、泛型

泛型 （Generic ） jdk1.5 加入的新特性

### 16-1、概述：

```text
对类型的限定
本质1：把对象、集合里面元素的类型推迟到创建集合的时候确定   本质2 ：把类型参数化  
```

### 16-2、泛型的使用

```text
<数据类型>    数据类型：只能是引用数据类型
集合<泛型的类型> 对象 = new 集合<泛型类型>();
jdk1.7加入了泛型推断，所以等号右边的泛型类型可以不加
完整写法两边都加
```



#### 16-2-1、未使用泛型

```java
public class Demo02Generic {
    public static void main(String[] args) {    
		ArrayList a = new ArrayList();
        	a.add("1");
        	a.add("小明");
        	a.add("小明白");
        for (Object object:a
             ) {
            String s = 	(String)object;
            //java.lang.ClassCastException
            //会报类强制转换异常
        }
```



#### 16-2-2、使用泛型

```java
    public static void main(String[] args){
        Set<Integer> intsSet = new HashSet<Integer>();
        intsSet.add(5);
        intsSet.add(4);
        intsSet.add(6);
        intsSet.add(8);
        intsSet.add(2);
        
        for(Iterator<Integer> it = intsSet.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }
```

#### 16-2-3、自定义泛型

```text
 泛型也可以自定义使用，也有三步骤:
       是Object的子类
        1、泛型的定义:定义在类、定义在方法、
        2、泛型的设置
        3、泛型的确定
        4、泛型的触发:当调用设置的代码时  泛型:把类型作为变量的值
```



### 16-3、泛型的好处

```
1.可以限定类型，避免类型转换的错误
2.可以把运行时的异常提前到编译期
```

### 16-4、注意

```
1.泛型不接受八种基本数据类型，必须申明引用类型
2.想定对象里面能够操作的数据类型
```



 ## 17、反射

 ## 18、注解

#  五、Java关键字
## 常用关键字

    1)访问控制:
    	private	protected	public				
    2)类，方法和变量修饰符:
    	abstract	class	extends	final	implements	interface	native  new	static	strictfp	synchronized	transient	volatile	
    3)程序控制:
    	break	continue	return	do	while	if	else    for	instanceof	switch	case	default		
    4)错误处理:
    	try	catch	throw	throws	finally		
    5)包相关:
    	import	package					
    6)基本类型:
    	boolean	byte	char	double	float	int	long    short	null	true	false			
    7)变量引用:
    	super	this	void				
    8)保留字:
        goto	const

## static

### 1）、static 修饰的变量 类变量

    我们用static表示变量的级别，一个类中的静态变量，不属于类的对象或者实例。因为静态变量与所有的对象实例共享，因此他们不具线程安全性。
    通常，静态变量常用final关键来修饰，表示通用资源或可以被所有的对象所使用。如果静态变量未被私有化，可以用“类名.变量名”的方式来使用。

### 2）、static 修饰的方法 静态方法

    一个静态方法只能使用静态变量和调用静态方法。通常静态方法通常用于想给其他的类使用而不需要创建实例。例如：Collections class(类集合)。

### 3）、static 修饰的代码块 静态代码块

    Java的静态块是一组指令在类装载的时候在内存中由Java ClassLoader执行。
    静态块常用于初始化类的静态变量。大多时候还用于在类装载时候创建静态资源。
```java
public class Student {
    String name = "张三";
    int age=21; //没有使用static修饰的叫做成员变量或者实例变量，通过对象调用
    static int money=100; //类变量 通过类名.类变量调用
    //静态代码块在累加在的时候执行，就执行一次，先执行静态代码块在加载Student()构造方法
    static {
        //能初始化类变量
        money=500;
    }
    
    public Student(){}
    
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*成员方法*/
    public void show(){
        /*成员方法能直接调用静态方法或变量*/
        System.out.println(this.name+"\t"+this.age);
    }
    /*静态方法*/
    public static void  showIn(){
        /*静态不能直接使用非静态变量或方法,要先创建对象，通过对象调用*/
        System.out.println(Student.money+"\t");
    }
}

class Test{
    public static void main(String[] args) {
        Student student = new Student();
        //成员方法通对象调用
        student.show();
        System.out.println(student.money);//不推荐对象直接调用类变量
        System.out.println(student.name);
        //静态方法通过类名调用
        Student.showIn();
        //静态变量通过类名调用
        System.out.println(Student.money);
    }
}
```
## final 
    final 修饰的变量叫常量
```java

```
    final 修饰的方法不能被重写

## this和 super

    1)、 this:
        代表当前对象的引用。使用场景:对象调用本类的成员变量成员方法，也可以调用本类的构造方法
    2)、 super: 
        代表本对象的父类对象。使用场景:在子类中调用本对象的父类对象，调用父类构造方法
    3)、 在子类没有重写父类方法的情况下,也可以通过this调用父类方法
#  n、Java 内存理解
## 堆

​     

