package day15.se01.n1object;

public class Demo02Object {
    public static void main(String[] args) {


//        hashCode()、toString()、equals()这三个方法是我们在今后做项目经藏调用的三个方法，尤其是在编写一个标准的Java类之后，我们经常重写这三个方法标准的Java类又叫做JvavaBEan,要求如下：
//        1、所有成员变量的访问权限：private
//        2、为每一个成员变量设置一个getter&setter
//        3、设置一个无参构造和一个全参构造

        Person p = new Person();
        System.out.println(p.hashCode());//1163157884   //重写后 31
        System.out.println(p.toString());//没重写  day15.se01.n1object.Person@4554617c  //重写后 Person{name='null', age=null}


    }
}
