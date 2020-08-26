package day18.se03.n1Collection.MyArrayList;

import day08.oop3.Student;

public class Test {
    public static void main(String[] args) {
      MyArrayList myArrayList = new MyArrayList();
      myArrayList.add(new Student("sd",13,'男',1556,12123));
      System.out.println(myArrayList.get(0));
    }
}
