package day08.oop3;


/**
 * @author BING
 * @date 2020/8/20
 */
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
        Student student1 = (Student)person2;
        //使用场景
        //做特有的动作
        doSpecific(new Teacher());
        doSpecific(new Student());

        System.out.println(student.equals(new Student("张三",211,'女',55,45456)));

    }

    /**
     * 做都有的附加信息后的动作
     * @param p
     */
    public static void doStudy(Person p){
        System.out.println(p.study());
    }

    /**
     * 做特有的动作
     */
    public static void doSpecific(Person p){
        //如果p的类型是Student
        if (p instanceof Student){
            //向下转型为
            Student student = (Student)p;
            System.out.println(student.PlayGame());
        //如果p的类型是Teacher
        }else if(p instanceof Teacher){
            //向下转型为
            Teacher teacher = (Teacher)p;
            System.out.println(teacher.teach());
        }
    }
}
