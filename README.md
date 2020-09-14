

# 目录


* [目录](#%E7%9B%AE%E5%BD%95)
* [javaSE基础](#javase%E5%9F%BA%E7%A1%80)
    * [变量和常量](#%E5%8F%98%E9%87%8F%E5%92%8C%E5%B8%B8%E9%87%8F)
      * [定义](#%E5%AE%9A%E4%B9%89)
      * [变量类型：](#%E5%8F%98%E9%87%8F%E7%B1%BB%E5%9E%8B)
      * [变量种类：](#%E5%8F%98%E9%87%8F%E7%A7%8D%E7%B1%BB)
        * [局部变量:](#%E5%B1%80%E9%83%A8%E5%8F%98%E9%87%8F)
        * [成员变量：](#%E6%88%90%E5%91%98%E5%8F%98%E9%87%8F)
        * [静态变量：](#%E9%9D%99%E6%80%81%E5%8F%98%E9%87%8F)
      * [常量](#%E5%B8%B8%E9%87%8F)
      * [变量三步骤：](#%E5%8F%98%E9%87%8F%E4%B8%89%E6%AD%A5%E9%AA%A4)
      * [程序调试：](#%E7%A8%8B%E5%BA%8F%E8%B0%83%E8%AF%95)
        * [调试的作用：](#%E8%B0%83%E8%AF%95%E7%9A%84%E4%BD%9C%E7%94%A8)
        * [调试步骤：](#%E8%B0%83%E8%AF%95%E6%AD%A5%E9%AA%A4)
    * [数据类型](#%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B)
      * [基本数据类型](#%E5%9F%BA%E6%9C%AC%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B)
        * [整数类型:](#%E6%95%B4%E6%95%B0%E7%B1%BB%E5%9E%8B)
        * [小数类型:](#%E5%B0%8F%E6%95%B0%E7%B1%BB%E5%9E%8B)
        * [布尔类型:](#%E5%B8%83%E5%B0%94%E7%B1%BB%E5%9E%8B)
        * [字符类型:](#%E5%AD%97%E7%AC%A6%E7%B1%BB%E5%9E%8B)
      * [引用数据类型](#%E5%BC%95%E7%94%A8%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B)
      * [数据类型转换](#%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2)
        * [自动类型转换](#%E8%87%AA%E5%8A%A8%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2)
        * [强制类型转换](#%E5%BC%BA%E5%88%B6%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%8D%A2)
    * [运算](#%E8%BF%90%E7%AE%97)
      * [赋值运算](#%E8%B5%8B%E5%80%BC%E8%BF%90%E7%AE%97)
      * [算术运算](#%E7%AE%97%E6%9C%AF%E8%BF%90%E7%AE%97)
      * [比较运算](#%E6%AF%94%E8%BE%83%E8%BF%90%E7%AE%97)
      * [逻辑运算](#%E9%80%BB%E8%BE%91%E8%BF%90%E7%AE%97)
      * [位运算](#%E4%BD%8D%E8%BF%90%E7%AE%97)
      * [三目运算](#%E4%B8%89%E7%9B%AE%E8%BF%90%E7%AE%97)
      * [运算符优先级](#%E8%BF%90%E7%AE%97%E7%AC%A6%E4%BC%98%E5%85%88%E7%BA%A7)
    * [数组](#%E6%95%B0%E7%BB%84)
      * [一维数组](#%E4%B8%80%E7%BB%B4%E6%95%B0%E7%BB%84)
      * [二维数组](#%E4%BA%8C%E7%BB%B4%E6%95%B0%E7%BB%84)
    * [流程控制](#%E6%B5%81%E7%A8%8B%E6%8E%A7%E5%88%B6)
      * [选择结构语句](#%E9%80%89%E6%8B%A9%E7%BB%93%E6%9E%84%E8%AF%AD%E5%8F%A5)
        * [if结构](#if%E7%BB%93%E6%9E%84)
        * [switch结构](#switch%E7%BB%93%E6%9E%84)
        * [循环语句](#%E5%BE%AA%E7%8E%AF%E8%AF%AD%E5%8F%A5)
        * [while 循环语句](#while-%E5%BE%AA%E7%8E%AF%E8%AF%AD%E5%8F%A5)
        * [do\.\.\.while 循环](#dowhile-%E5%BE%AA%E7%8E%AF)
        * [for 循环语句](#for-%E5%BE%AA%E7%8E%AF%E8%AF%AD%E5%8F%A5)
        * [foreach 语句](#foreach-%E8%AF%AD%E5%8F%A5)
        * [跳转](#%E8%B7%B3%E8%BD%AC)
        * [break](#break)
        * [continue](#continue)
        * [return](#return)
* [面向对象](#%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1)
  * [OOP](#oop)
    * [面向过程：](#%E9%9D%A2%E5%90%91%E8%BF%87%E7%A8%8B)
    * [面向对象：](#%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1-1)
    * [面型对象特性：](#%E9%9D%A2%E5%9E%8B%E5%AF%B9%E8%B1%A1%E7%89%B9%E6%80%A7)
      * [封装](#%E5%B0%81%E8%A3%85)
      * [继承](#%E7%BB%A7%E6%89%BF)
      * [多态](#%E5%A4%9A%E6%80%81)
    * [类与对象](#%E7%B1%BB%E4%B8%8E%E5%AF%B9%E8%B1%A1)
  * [方法](#%E6%96%B9%E6%B3%95)
    * [定义](#%E5%AE%9A%E4%B9%89-1)
    * [方法种类](#%E6%96%B9%E6%B3%95%E7%A7%8D%E7%B1%BB)
    * [阐述形参和实参的使用](#%E9%98%90%E8%BF%B0%E5%BD%A2%E5%8F%82%E5%92%8C%E5%AE%9E%E5%8F%82%E7%9A%84%E4%BD%BF%E7%94%A8)
    * [对象数组](#%E5%AF%B9%E8%B1%A1%E6%95%B0%E7%BB%84)
      * [根据参数返回值分类](#%E6%A0%B9%E6%8D%AE%E5%8F%82%E6%95%B0%E8%BF%94%E5%9B%9E%E5%80%BC%E5%88%86%E7%B1%BB)
      * [根据功能实现](#%E6%A0%B9%E6%8D%AE%E5%8A%9F%E8%83%BD%E5%AE%9E%E7%8E%B0)
    * [方法重载](#%E6%96%B9%E6%B3%95%E9%87%8D%E8%BD%BD)
    * [方法的重写](#%E6%96%B9%E6%B3%95%E7%9A%84%E9%87%8D%E5%86%99)
      * [方法重写的“两同两小一大”原则](#%E6%96%B9%E6%B3%95%E9%87%8D%E5%86%99%E7%9A%84%E4%B8%A4%E5%90%8C%E4%B8%A4%E5%B0%8F%E4%B8%80%E5%A4%A7%E5%8E%9F%E5%88%99)
    * [方法重写与方法重载的区别](#%E6%96%B9%E6%B3%95%E9%87%8D%E5%86%99%E4%B8%8E%E6%96%B9%E6%B3%95%E9%87%8D%E8%BD%BD%E7%9A%84%E5%8C%BA%E5%88%AB)
  * [枚举](#%E6%9E%9A%E4%B8%BE)
    * [什么是枚举](#%E4%BB%80%E4%B9%88%E6%98%AF%E6%9E%9A%E4%B8%BE)
      * [概述：](#%E6%A6%82%E8%BF%B0)
    * [枚举的使用场景:](#%E6%9E%9A%E4%B8%BE%E7%9A%84%E4%BD%BF%E7%94%A8%E5%9C%BA%E6%99%AF)
    * [定义枚举](#%E5%AE%9A%E4%B9%89%E6%9E%9A%E4%B8%BE)
      * [默认构造器（空构造器）](#%E9%BB%98%E8%AE%A4%E6%9E%84%E9%80%A0%E5%99%A8%E7%A9%BA%E6%9E%84%E9%80%A0%E5%99%A8)
      * [定义了成员变量、带参构造器](#%E5%AE%9A%E4%B9%89%E4%BA%86%E6%88%90%E5%91%98%E5%8F%98%E9%87%8F%E5%B8%A6%E5%8F%82%E6%9E%84%E9%80%A0%E5%99%A8)
    * [注意：](#%E6%B3%A8%E6%84%8F)
  * [继承](#%E7%BB%A7%E6%89%BF-1)
    * [概述：](#%E6%A6%82%E8%BF%B0-1)
    * [向上转型和向下转型](#%E5%90%91%E4%B8%8A%E8%BD%AC%E5%9E%8B%E5%92%8C%E5%90%91%E4%B8%8B%E8%BD%AC%E5%9E%8B)
      * [概述](#%E6%A6%82%E8%BF%B0-2)
    * [继承关系](#%E7%BB%A7%E6%89%BF%E5%85%B3%E7%B3%BB)
    * [继承关键字](#%E7%BB%A7%E6%89%BF%E5%85%B3%E9%94%AE%E5%AD%97)
    * [继承的特性](#%E7%BB%A7%E6%89%BF%E7%9A%84%E7%89%B9%E6%80%A7)
    * [注意](#%E6%B3%A8%E6%84%8F-1)
  * [多态](#%E5%A4%9A%E6%80%81-1)
    * [概述:](#%E6%A6%82%E8%BF%B0-3)
    * [形成多态的三个前提条件:](#%E5%BD%A2%E6%88%90%E5%A4%9A%E6%80%81%E7%9A%84%E4%B8%89%E4%B8%AA%E5%89%8D%E6%8F%90%E6%9D%A1%E4%BB%B6)
    * [多态的实现方式](#%E5%A4%9A%E6%80%81%E7%9A%84%E5%AE%9E%E7%8E%B0%E6%96%B9%E5%BC%8F)
      * [方式一：重写：](#%E6%96%B9%E5%BC%8F%E4%B8%80%E9%87%8D%E5%86%99)
      * [方式二：接口](#%E6%96%B9%E5%BC%8F%E4%BA%8C%E6%8E%A5%E5%8F%A3)
      * [方式三：抽象类和抽象方法](#%E6%96%B9%E5%BC%8F%E4%B8%89%E6%8A%BD%E8%B1%A1%E7%B1%BB%E5%92%8C%E6%8A%BD%E8%B1%A1%E6%96%B9%E6%B3%95)
    * [意义（优点）:](#%E6%84%8F%E4%B9%89%E4%BC%98%E7%82%B9)
    * [实例](#%E5%AE%9E%E4%BE%8B)
  * [封装](#%E5%B0%81%E8%A3%85-1)
    * [封装概述：](#%E5%B0%81%E8%A3%85%E6%A6%82%E8%BF%B0)
    * [封装的优点](#%E5%B0%81%E8%A3%85%E7%9A%84%E4%BC%98%E7%82%B9)
    * [实现Java封装的步骤](#%E5%AE%9E%E7%8E%B0java%E5%B0%81%E8%A3%85%E7%9A%84%E6%AD%A5%E9%AA%A4)
    * [包的概念:](#%E5%8C%85%E7%9A%84%E6%A6%82%E5%BF%B5)
    * [访问权限修饰符:](#%E8%AE%BF%E9%97%AE%E6%9D%83%E9%99%90%E4%BF%AE%E9%A5%B0%E7%AC%A6)
  * [内部类:](#%E5%86%85%E9%83%A8%E7%B1%BB)
    * [成员内部类:](#%E6%88%90%E5%91%98%E5%86%85%E9%83%A8%E7%B1%BB)
    * [局部(方法)内部类:](#%E5%B1%80%E9%83%A8%E6%96%B9%E6%B3%95%E5%86%85%E9%83%A8%E7%B1%BB)
    * [匿名内部类:](#%E5%8C%BF%E5%90%8D%E5%86%85%E9%83%A8%E7%B1%BB)
    * [静态内部类:](#%E9%9D%99%E6%80%81%E5%86%85%E9%83%A8%E7%B1%BB)
    * [可以实现多继承的效果](#%E5%8F%AF%E4%BB%A5%E5%AE%9E%E7%8E%B0%E5%A4%9A%E7%BB%A7%E6%89%BF%E7%9A%84%E6%95%88%E6%9E%9C)
  * [抽象类](#%E6%8A%BD%E8%B1%A1%E7%B1%BB)
    * [概述](#%E6%A6%82%E8%BF%B0-4)
    * [抽象类的定义](#%E6%8A%BD%E8%B1%A1%E7%B1%BB%E7%9A%84%E5%AE%9A%E4%B9%89)
    * [抽象方](#%E6%8A%BD%E8%B1%A1%E6%96%B9)
      * [抽象方法的定义（代码实现）](#%E6%8A%BD%E8%B1%A1%E6%96%B9%E6%B3%95%E7%9A%84%E5%AE%9A%E4%B9%89%E4%BB%A3%E7%A0%81%E5%AE%9E%E7%8E%B0)
    * [抽象类总结规定](#%E6%8A%BD%E8%B1%A1%E7%B1%BB%E6%80%BB%E7%BB%93%E8%A7%84%E5%AE%9A)
  * [接口](#%E6%8E%A5%E5%8F%A3)
  * [常见面试题](#%E5%B8%B8%E8%A7%81%E9%9D%A2%E8%AF%95%E9%A2%98)
    * [类成员、实例成员 区别](#%E7%B1%BB%E6%88%90%E5%91%98%E5%AE%9E%E4%BE%8B%E6%88%90%E5%91%98-%E5%8C%BA%E5%88%AB)
      * [类成员:](#%E7%B1%BB%E6%88%90%E5%91%98)
      * [实例成员:](#%E5%AE%9E%E4%BE%8B%E6%88%90%E5%91%98)
    * [普通类、抽象类、接口](#%E6%99%AE%E9%80%9A%E7%B1%BB%E6%8A%BD%E8%B1%A1%E7%B1%BB%E6%8E%A5%E5%8F%A3)
      * [相同点:](#%E7%9B%B8%E5%90%8C%E7%82%B9)
      * [不同点及使用场景:](#%E4%B8%8D%E5%90%8C%E7%82%B9%E5%8F%8A%E4%BD%BF%E7%94%A8%E5%9C%BA%E6%99%AF)
  * [异常](#%E5%BC%82%E5%B8%B8)
  * [常用类](#%E5%B8%B8%E7%94%A8%E7%B1%BB)
    * [object类](#object%E7%B1%BB)
    * [包装类](#%E5%8C%85%E8%A3%85%E7%B1%BB)
      * [包装类的创建(基本数据类型转成包装类)](#%E5%8C%85%E8%A3%85%E7%B1%BB%E7%9A%84%E5%88%9B%E5%BB%BA%E5%9F%BA%E6%9C%AC%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B%E8%BD%AC%E6%88%90%E5%8C%85%E8%A3%85%E7%B1%BB)
      * [把包装类转换成基本数据类型](#%E6%8A%8A%E5%8C%85%E8%A3%85%E7%B1%BB%E8%BD%AC%E6%8D%A2%E6%88%90%E5%9F%BA%E6%9C%AC%E6%95%B0%E6%8D%AE%E7%B1%BB%E5%9E%8B)
      * [包装类的特点总结：](#%E5%8C%85%E8%A3%85%E7%B1%BB%E7%9A%84%E7%89%B9%E7%82%B9%E6%80%BB%E7%BB%93)
    * [String类](#string%E7%B1%BB)
      * [概述：](#%E6%A6%82%E8%BF%B0-5)
      * [常见面试题](#%E5%B8%B8%E8%A7%81%E9%9D%A2%E8%AF%95%E9%A2%98-1)
* [java高级特性](#java%E9%AB%98%E7%BA%A7%E7%89%B9%E6%80%A7)
  * [泛型](#%E6%B3%9B%E5%9E%8B)
    * [概述：](#%E6%A6%82%E8%BF%B0-6)
    * [泛型的使用](#%E6%B3%9B%E5%9E%8B%E7%9A%84%E4%BD%BF%E7%94%A8)
      * [未使用泛型](#%E6%9C%AA%E4%BD%BF%E7%94%A8%E6%B3%9B%E5%9E%8B)
      * [使用泛型](#%E4%BD%BF%E7%94%A8%E6%B3%9B%E5%9E%8B)
      * [自定义泛型](#%E8%87%AA%E5%AE%9A%E4%B9%89%E6%B3%9B%E5%9E%8B)
      * [泛型通配符    ?  上限extends和下限super](#%E6%B3%9B%E5%9E%8B%E9%80%9A%E9%85%8D%E7%AC%A6------%E4%B8%8A%E9%99%90extends%E5%92%8C%E4%B8%8B%E9%99%90super)
      * [泛型数组](#%E6%B3%9B%E5%9E%8B%E6%95%B0%E7%BB%84)
    * [泛型的好处](#%E6%B3%9B%E5%9E%8B%E7%9A%84%E5%A5%BD%E5%A4%84)
    * [注意](#%E6%B3%A8%E6%84%8F-2)
  * [反射](#%E5%8F%8D%E5%B0%84)
  * [注解](#%E6%B3%A8%E8%A7%A3)
  * [集合容器](#%E9%9B%86%E5%90%88%E5%AE%B9%E5%99%A8)
    * [Collection](#collection)
      * [List](#list)
        * [ArrayList](#arraylist)
        * [LinkedList](#linkedlist)
      * [Set](#set)
        * [LinkedHashSet](#linkedhashset)
        * [HashSet](#hashset)
        * [TreeSet](#treeset)
      * [Map](#map)
        * [HashMap](#hashmap)
        * [linkedHashMap](#linkedhashmap)
        * [TreeMap](#treemap)
        * [Properties](#properties)
        * [Hashtable](#hashtable)
    * [collections工具类](#collections%E5%B7%A5%E5%85%B7%E7%B1%BB)
* [设计模式](#%E8%AE%BE%E8%AE%A1%E6%A8%A1%E5%BC%8F)
  * [单例模式](#%E5%8D%95%E4%BE%8B%E6%A8%A1%E5%BC%8F)
    * [懒汉单例](#%E6%87%92%E6%B1%89%E5%8D%95%E4%BE%8B)
    * [饿汉单例](#%E9%A5%BF%E6%B1%89%E5%8D%95%E4%BE%8B)
    * [双检索模式](#%E5%8F%8C%E6%A3%80%E7%B4%A2%E6%A8%A1%E5%BC%8F)
    * [内部模式](#%E5%86%85%E9%83%A8%E6%A8%A1%E5%BC%8F)
    * [通过枚举实现单例](#%E9%80%9A%E8%BF%87%E6%9E%9A%E4%B8%BE%E5%AE%9E%E7%8E%B0%E5%8D%95%E4%BE%8B)
* [Java关键字](#java%E5%85%B3%E9%94%AE%E5%AD%97)
  * [常用关键字](#%E5%B8%B8%E7%94%A8%E5%85%B3%E9%94%AE%E5%AD%97)
    * [static 修饰的变量 类变量](#static-%E4%BF%AE%E9%A5%B0%E7%9A%84%E5%8F%98%E9%87%8F-%E7%B1%BB%E5%8F%98%E9%87%8F)
    * [static 修饰的方法 静态方法](#static-%E4%BF%AE%E9%A5%B0%E7%9A%84%E6%96%B9%E6%B3%95-%E9%9D%99%E6%80%81%E6%96%B9%E6%B3%95)
    * [static 修饰的代码块 静态代码块](#static-%E4%BF%AE%E9%A5%B0%E7%9A%84%E4%BB%A3%E7%A0%81%E5%9D%97-%E9%9D%99%E6%80%81%E4%BB%A3%E7%A0%81%E5%9D%97)
  * [final](#final)
    * [声明类：](#%E5%A3%B0%E6%98%8E%E7%B1%BB)
    * [声明方法：](#%E5%A3%B0%E6%98%8E%E6%96%B9%E6%B3%95)
  * [this和 super](#this%E5%92%8C-super)
  * [break](#break-1)
  * [continue](#continue-1)
  * [return](#return-1)
* [Java 内存理解](#java-%E5%86%85%E5%AD%98%E7%90%86%E8%A7%A3)
  * [概述](#%E6%A6%82%E8%BF%B0-7)
  * [数据结构的堆栈](#%E6%95%B0%E6%8D%AE%E7%BB%93%E6%9E%84%E7%9A%84%E5%A0%86%E6%A0%88)
    * [栈](#%E6%A0%88)
    * [堆](#%E5%A0%86)
  * [常量池](#%E5%B8%B8%E9%87%8F%E6%B1%A0)

[TOC]

------



# javaSE基础

### 变量和常量

#### 定义

```
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

#### 变量类型：

```java
变量类型分为基本类型和引用类型
```

#### 变量种类：

##### 局部变量:

在方法或语句块内部定义的变量，叫局部变量。生命周期是从声明位置开始到方法或语句块执行完毕为止。局部变量必须先声明再赋值后使用。

##### 成员变量：

也叫实例变量，方法外部、类内部定义的变量，叫做全局变量，作用域是整个类中，从属于对象，生命周期伴随对象始终。如果不自行初始化，他会自动初始化成该类型的默初始值。

##### 静态变量：

也叫类变量，使用static修饰，从属于类，生命周期伴随类始终，从类加载到卸载。

#### 常量

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

#### 变量三步骤：

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



#### 程序调试：

##### 调试的作用：

```
当程序的流程越来越复杂，我们想要看到代码如何一行一行的去执行的，那么我们就需要学会如何去进行调试
调试目的有两个：
    1.让自动执行的代码变成手动模式一步一步的去执行，看到程序运行的步骤
    2.可以监视内存中变量的值如何发生改变
```

##### 调试步骤：

> 1.打断点，自动执行的代码遇到断点就会停住，开始手动执行
>
> 2.debug as 调试模式启动
>
> 3.F6，手动执行代码，观察变量里面的值如何发生改变
>
> 4.如果需要将手动执行的代码变成自动执行，可以按F8变成自动执行

### 数据类型
#### 基本数据类型
<!-- 基础数据类型（四类八种） -->
#####  整数类型: 

        - byte 字节型：8bit=1byte:-128~127 
        - short 短整型 16bit=2byte
        - int 整型: 32bit: =4byte
        - 1ong 长整型: 64bit=8byte

##### 小数类型: 
        - float 单精度浮点型: 32bit=4byte
        - double 双精度浮点型: 64bit=8byte

##### 布尔类型:

        - boolean 布尔型: 8bit=1byte, 占1bit

##### 字符类型:

        - char 字符类： 16bit=2byte

#### 引用数据类型

        - String 32 bit = 4 byte  特殊的引用数据类型
        - 接口   interface     32 bit = 4 byte
        - 类    class 32 bit =4 byte

#### 数据类型转换

##### 自动类型转换

```
小的空间里面的数据放到大的空间里面去，能放下，叫自动类型转换
```

##### 强制类型转换

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

### 运算

####    赋值运算
```text
赋值运算以”=“表示 把右边的值赋给"="左边的值
int a = 100;//把100赋给a变量
```
####    算术运算
i++与++i

```java
int a = 5;
int b = a+++5;//先运算后自增 先拿5+5再去自增1结果b=10；
int c = ++a+5;//先自增后运算先拿5+1再去拿6+5结果c=11;
System.out.println("a:"+a+"b:"+b);
System.out.println("a:"+a+"c:"+c);
```
 + - * / %

####    比较运算

```
a>b
a<b
a>=b
a<=b
a==b
a!=b    
条件运算符也可以比较运算符，得到结果是bolean类型，也就true或者false 
```



####    逻辑运算

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



####    位运算

```java
	System.out.println(12<<3);
	System.out.println(2>>3);
```



####    三目运算

```java
  //类似于if结构，？前面的做比较，如果比较结果是true就把:前面的1赋值给a,否则把:后面的5赋给a	
	int a=7>8?1:5;
	System.out.println("a:"+a);
		
	String str=9>8?"帅哥":"妹子";
	System.out.println(str);
```



####    运算符优先级

![image-20200826204534852](https://images2015.cnblogs.com/blog/1001990/201610/1001990-20161025144757265-1724289762.png)


### 数组 
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

#### 一维数组
    1）初始化
    方式一 ：int[] a = {1,2,3,5,6}
    方式二：int[] b = new int[]{1,2,3,4,5,6}
    2）

#### 二维数组


### 流程控制
####  选择结构语句

##### if结构

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



##### switch结构

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

【面试题】== 和equals的区别

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

##### 循环语句

  ##### while 循环语句

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

  ##### do...while 循环

```java
/** 
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


  ##### for 循环语句

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
  ##### foreach 语句

```java
  //用于数组或集合的遍历取值；不能赋值
  int array[] = {7, 8, 9};
       for (int arr : array) {
       System.out.println(arr);
  }
```
##### 跳转

  ```text
 1、System.exit(int  status)：不管status为何值都会退出程序（即结束当前正在运行的java虚拟机），但是只有在status等于0，即System.exit(0)；的时候整个程序正常退出。
    
 当status为除0之外的数字时都视为程序的不正常退出。（示例在一个if-else判断中，如果我们程序是按照我们预想的执行，到最后我们需要停止程序，那就使用System.exit(0)，而System.exit(1)一般放在catch块中，当捕获到异常，需要停止程序，我们使用System.exit(1)。）

 2、return：return；是只能直接回到上一层继续往下执行，不会直接导致整个程序的停止执行。

 3、break：break；只在switch语句体和循环体应用，一个break；语句能退出一个switch语句体或循环体，不会执行循环体或switch语句体余下的语句，不能连续退出多个switch语句体或循环体。

 4、continue：自己目前只在循环体应用。continue；跳过本次循环体中余下尚未执行的语句，接着再一次进行循环的条件判定是否执行。
   
  ```
##### break

```text
中断的意思，遇到break跳出循环语句结束循环
```

```java
	for (int i = 1; i <=10; i++) {
		if (i==5) {
		break;//遇到break直接跳出循环语句结束循环
		}
		System.out.println(i);
	}
//结果:1 2 3 4 
```
##### continue

```text
继续的意思，遇到continue，continue后面的代码不执行，直接继续执行下一次循环
```

```java
	for (int i = 1; i <=10; i++) {
		if (i==5) {
			continue;//遇到continue后面代码不执行，直接继续下一次循环
		}
		System.out.println(i);
	}
//结果: 1 2 3 4  6 7 8 9  10
```
##### return

```java
用于方法内部返回结果值,也会提前结束循环返回结果
```

```java
public boolean login(String name,int pwd){
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)&&passwords[i]==pwd) {
				return true;//返回结果，结束循环
			}
		}
		return false;
	}
```

# 面向对象

## OOP
Object Orieented Programming 面型对象编程，是编程思想中最重要的概念
### 面向过程：
1）、概述：

    在OOP之前我们是面向过程编程
    面向过程编程：把一个项目在一个类中去写，把一个项目分成每一步去执行，自顶而下的编程模式，比如c语言

2）、面向过程的弊端：

    1、代码在一个类中，自上而下执行，代码耦合度高，后期拓展和维护成本高
    2、代码自上而下执行，代码复用性不高

### 面向对象：
### 面型对象特性：
#### 封装
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
#### 继承

1)、概述：

    继承是指这样一种能力：它可以使用现有类的所有功能，并在无需重新编写原始的类的情况下对这些功能进行扩展。
    通过继承的新类称为“子类”或“派生类”，被继承的类称为“基类”，“父类”或“超类”。
    继承的过程，就是从一般到特殊的过程。
2）、实现：

    要实现继承，可以通过“继承”（继承）和“组合”（组成）来实现。
    继承概念的实现方式有二类：实现继承与接口继承。
    实现继承是指直接使用基类的属性和方法而无需额外编码的能力；
    接口继承是指仅使用属性和方法的名称，但是子类必须提供实现的能力；

#### 多态
1)、概述：

    所谓多态就是指一个类实例的相同方法在不同情况有不同的表现形式。
    多态机制使具有不同内部结构的对象可以共享相同的外部接口。
    这意味着，虽然针对不同对象的具体操作不同，但通过一个公共的类，它们（那些操作）可以通过相同的方式调用。
    最常见的多态就是将子类纳入父类参数中，运行时调用父类方法时通过引入的子类决定具体的内部结构或行为。
### 类与对象
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

## 方法

### 定义

    把逻辑细节用方法封装起来，通过对象能够重复调用方法。代码复用，提高工作效率
### 方法种类







  ### 阐述形参和实参的使用

    1) 形参:
        定义时可以没有实际值，但要有数据类型，可以接受实参传递过来的相应
    数据类型的数据值。
    2) 实参:
        可以是常量，也可以是变量，数据类型必须和形参保持一 致;如果是变量,
    在传递时里面必须存有实际的值。
    3) 传递方式:
        位置对应原则。

### 对象数组
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

#### 根据参数返回值分类    
    1)、无参无返回值方法
    2）、无参有返回值方法    
    3）、有参无返回值方法
    4）、有参有返回值方法
#### 根据功能实现
1）、构造方法 (构造函数)
    
    构造函数，是一种特殊的方法。主要用于在创建对象时初始化对象，即为对象成员赋值初始值，总与新运算符一起使用在创建对象的语句中。
    特别是一个类可以有多一个构造函数，可根据其参数个数的不同或参数类型的不同来区分其即构造函数的重载。
    构造函数跟一般的实例方法非常相似；但是与其他方法不同，构造器没有返回类型，不会被继承，并且可以有范围修饰符。
    构造器的函数名称必须和它所属的类的名称相同。承担着初始化对象数据成员的任务。
    如果在编写一个可实例化的类时没有专门编写的构造函数，则多个编程语言会自动生成变形构造器（重组构造函数）。

2）、成员方法
### 方法重载
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
### 方法的重写
    重写指的是在Java的子类与父类中有两个名称、参数列表都相同的方法的情况。由于他们具有相同的方法签名，所以子类中的新方法将覆盖父类中原有的方法。
    使得代码扩展性更强
#### 方法重写的“两同两小一大”原则

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

### 方法重写与方法重载的区别

```text
1) 重载:
    1-1)含义:方法名相同，参数列表不同，发生在同一个类中。
    1-2)意义:解决同一个类功能相似但并不相同的行为设计问题。
2) 重写:
    2-1)含义:方法名相同，参数列表相同，发生在父子类中。
    2-2)意义:解决父子类之间功能相同但表现形态不同的行为设计问题。
```



## 枚举

###  什么是枚举
#### 概述：
    枚举是一种数据类型，具有集合的一些特点，可以存放多个元素，但存储对象有限且固定
### 枚举的使用场景:
    如我们需要表达性别（男、女），颜色（红、黄、蓝），星期（星期一、星期二...星期日），四季（春、夏、秋、冬），
    地理位置（东、西、南、北），方向（前、后、左、右）等，这些场景都非常适合枚举。
###  定义枚举 
#### 默认构造器（空构造器）
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
#### 定义了成员变量、带参构造器    
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
### 注意：

    枚举和类一样，可以有多个构造器，即有了一个带参构造器，还可以有无参构造器，编译是可以通过的。
    除此之外：
    枚举enum 默认继承了java.lang.Enum类，
    实现了 java.lang.Seriablizable 和 java.lang.Comparable 两个接口，可序列化以及进行比较；
    所有的枚举值都是常量，默认采用了public static final 进行了修饰，enum不是类，自然也不能被继承或实现；
    枚举值必须在第一行，否则编译出错

## 继承
    作为一门面向对象开发的语言，代码复用是Java引人注意的功能之一。Java代码的复用有继承，组合以及代理三种具体的表现形式。
### 概述：
    继承：如果多个类的某个部分的属性或功能相同，那么可以抽象出一个类出来，把他们的相同部分都放到父类里，让他们都继承这个类。
    子类继承父类就可以拥有父类的属性和方法（私有的除外），优点是：提高代码复用
    
    继承是java面向对象编程技术的一块基石，因为它允许创建分等级层次的类。
    继承就是子类继承父类的特征和行为，使得子类对象（实例）具有父类的实例域和方法，或子类从父类继承方法，使得子类具有父类相同的行为。
###  向上转型和向下转型
#### 概述
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
### 继承关系

![img](https://www.runoob.com/wp-content/uploads/2013/12/types_of_inheritance-1.png)

### 继承关键字

```text
继承可以使用 extends 和 implements 这两个关键字来实现继承，而且所有的类都是继承于 java.lang.Object，当一个类没有继承的两个关键字，则默认继承object（这个类在 java.lang 包中，所以不需要 import）祖先类。
```

### 继承的特性

```text
1)、子类拥有父类非 private 的属性、方法。

2）、子类可以拥有自己的属性和方法，即子类可以对父类进行扩展。

3）、子类可以用自己的方式实现父类的方法。

4）、Java 的继承是单继承，但是可以多重继承，单继承就是一个子类只能继承一个父类，多重继承就是，例如 A 类继承 B 类，B 类继承 C 类，所以按照关系就是 C 类是 B 类的父类，B 类是 A 类的父类，这是 Java 继承区别于 C++ 继承的一个特性。

5）、提高了类之间的耦合性（继承的缺点，耦合度高就会造成代码之间的联系越紧密，代码独立性越差）
```

### 注意 
    继承关系下,会优先走父类的无参构造,再去走子类的无参数构造,可以把一些初始化的工作交给父类无参构造

## 多态
### 概述:
        顾名思义，是指多种形态;相同的调用，得到不同的形态结果。不同子类
    或实现类的引用值赋值给父类或父接口的引用变量，调用父类或父接口的方法时，
    会运行不同子类或实现类的不同方法。
    简单来说，多态是同一个行为具有多个不同表现形式或形态的能力。
    多态就是同一个接口，使用不同的实例而执行不同操作
### 形成多态的三个前提条件:
    继承、重写、向上造型。
### 多态的实现方式
#### 方式一：重写：
这个内容已经在上一章节详细讲过，就不再阐述，详细可访问：Java 重写(Override)与重载(Overload)。

#### 方式二：接口
1. 生活中的接口最具代表性的就是插座，例如一个三接头的插头都能接在三孔插座中，
因为这个是每个国家都有各自规定的接口规则，有可能到国外就不行，那是因为国外自己定义的接口类型。
2. java中的接口类似于生活中的接口，就是一些方法特征的集合，但没有方法的实现。
具体可以看 java接口 这一章节的内容。

#### 方式三：抽象类和抽象方法
详情请看 Java抽象类 章节。    
    
### 意义（优点）:
        提供统一入口形成约定、提高代码复用性、提高代码可扩展性、降低代码
    的耦合度

### 实例

父类 Person.java

```java

/**
 * 父类 人类
 * @author BING
 * @date 2020/8/20
 */
public class Person {
    private String name;
    private int age;
    private char sex;
    private int weight;

    public Person(){
        System.out.println("人类，无参构造");
    }
    public  Person(String name,int age,char sex,int weight){
        this.name= name;
        this.age= age;
        this.sex = sex;
        this.weight= weight;
    }

    /**
     *
     * @return String
     */
    public String study(){
       return  "学习";
    }
//Getter Setter
}

```

子类 Student.java

```java

import java.util.Objects;

/**
 * 学生类 继承Person类
 * @author BING
 * @date 2020/8/19 15:33
 *
 */
public class Student extends Person {
    //学费
    private double money;


    public Student(){
        System.out.println("学生，无参构造方法");
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
    
    @Override
    public String study() {
        return "我是学生，我在："+super.study()+"学生考试知识";
    }
}

```

子类 Teacher.java

```java

/**
 * 子类 教师类 继承Person类
 * @author BING
 * @date 2020/8/19 15:38
 */
public class Teacher extends Person {
    double wage;//工资

    public Teacher() {
        System.out.println("教师，无参构造方法");
    }

    public Teacher(String name, int age, char sex, int weight, double wage) {
        super(name, age, sex, weight);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
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
        return "老师，在：" +super.study()+"学生管理知识";
    }
}

```

孙子类 PETeacher.java

```java

/**
 * 体育老师类 继承 Teacher类
 * @author BING
 * @date 2020/8/19 16:20
 */
public class PETeacher extends Teacher {
    String clazz;//班级
    public PETeacher(String name, int age, char sex, int weight, double wage, String clazz) {
        super(name, age, sex, weight, wage);
        this.clazz = clazz;
    }

    public PETeacher() {
        System.out.println("体育老师，无参构造方法");
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    @Override
    public String teach() {
        return super.teach();
    }

    @Override
    public String study() {
        //super.study()调用的是老师类的study方法
        return  "我是体育"+super.study()+"体育知识";
    }

}

```

自习室类 StudyRoom.java

```java
/**
 * 自习室类
 * @author BING
 *
 */
public class StudyRoom {
    /**
     * 自习方法
     * @param person
     */
    public void selfStudy(Person person){
        //以父类类型接受，因子类实例不同而会因调用到不同子类被重写的方法，从而表现出多态
        System.out.println(person.study());
    }
}

```
测试类 Test.java

```java
/**
 * @author BING
 * @date 2020/8/20
 */
public class Test {
    public static void main(String[] args) {


        /* 多态 */
        //形成多态的三个前提条件：
        // 继承、重写、向上造型。
        // 在学习这个行为上，不同类的人有不同的学习特点，相同的调用selfStudy()方法，得到不同的形态结果
        StudyRoom studyRoom = new StudyRoom();

        Person student2 = new Student();
        //使用子类无参构造会先调用父类无参构造，所以先输出 “人类，无参构造”，然后输出“学生，无参构造方法”

        //学生学习
        studyRoom.selfStudy(student2);
        Person teacher2  = new Teacher();
        //老师学习
        studyRoom.selfStudy(teacher2);
        Person peTeacher = new PETeacher();
        //体育老师学习
        studyRoom.selfStudy(peTeacher);

    }
```

输出 

```text
人类，无参构造
学生，无参构造方法
我是学生，我在：学习学生考试知识
人类，无参构造
教师，无参构造方法
老师，在：学习学生管理知识
人类，无参构造
教师，无参构造方法
体育老师，无参构造方法
我是体育老师，在：学习学生管理知识体育知识
```

 ## 封装

 ###  封装概述：
    在面向对象程式设计方法中，封装（英语：Encapsulation）是指一种将抽象性函式接口的实现细节部分包装、隐藏起来的方法。
    
    封装可以被认为是一个保护屏障，防止该类的代码和数据被外部类定义的代码随机访问。
    
    要访问该类的代码和数据，必须通过严格的接口控制。
    
    封装最主要的功能在于我们能修改自己的实现代码，而不用修改那些调用我们代码的程序片段。
    
    适当的封装可以让程式码更容易理解与维护，也加强了程式码的安全性。

###  封装的优点
     1. 良好的封装能够减少耦合。
     
     2. 类内部的结构可以自由修改。
     
     3. 可以对成员变量进行更精确的控制。
     
     4. 隐藏信息，实现细节。

### 实现Java封装的步骤
 1)、修改属性的可见性来限制对属性的访问（一般限制为private），例如：

```java
 public class Person {
     private String name;
     private int age;
 }
```
 这段代码中，将 name 和 age 属性设置为私有的，只能本类才能访问，其他类都访问不了，如此就对信息进行了隐藏。

 2)、对每个值属性提供对外的公共方法访问，也就是创建一对赋取值方法，用于对私有属性的访问，例如：

```java
 public class Person{
     private String name;
     private int age;
 
     public int getAge(){
       return age;
     }
 
     public String getName(){
       return name;
     }

     public void setAge(int age){
       this.age = age;
     }

     public void setName(String name){
       this.name = name;
     }
 }
```
 采用 this 关键字是为了解决实例变量（private String name）
 和局部变量（setName(String name)中的name变量）之间发生的同名的冲突。

 3)、实例

 让我们来看一个java封装类的例子：
 ```java
 public class EncapTest{
  
    private String name;
    private String idNum;
    private int age;
  
    public int getAge(){
       return age;
    }
  
    public String getName(){
       return name;
    }
  
    public String getIdNum(){
       return idNum;
    }
  
    public void setAge( int newAge){
       age = newAge;
    }
  
    public void setName(String newName){
       name = newName;
    }
  
    public void setIdNum( String newId){
       idNum = newId;
    }
 }
 ```
 以上实例中public方法是外部类访问该类成员变量的入口。

 通常情况下，这些方法被称为getter和setter方法。

 因此，任何要访问类中私有成员变量的类都要通过这些getter和setter方法。

 通过如下的例子说明EncapTest类的变量怎样被访问：
  ```java
 public class RunEncap{
    public static void main(String args[]){
       EncapTest encap = new EncapTest();
       encap.setName("James");
       encap.setAge(20);
       encap.setIdNum("12343ms");
       System.out.print("Name : " + encap.getName()+ 
                              " Age : "+ encap.getAge());
     }
 }
  ```
  ### 包的概念:
    1) 如果仅仅将类名作为类的唯一标识，则不可避免会出现命名冲突，java中用包的概念来解决命名冲突。在定义类时，第一行必须是声明包的语句， 类的全称是包名加类名。包在存储空间上是以项目开始的文件夹的层次目录。
    2) 正规的包命名规则是域名倒着写，其后跟项目名、模块名。例如:cn. com. zte. project1. register
    3) 访问一个类时，可以使用类的全称，但是这样过于繁琐。
    4) 通过import语句声明了类的全称，该源文件中就可以直接用类名来表示类的全称了
 ### 访问权限修饰符:

    访问修饰符可以用于修饰属性和方法，用于定义属性和方法的权限
    
     1) private修饰的成员:只能在本类中访问。
     2) (defau1t)修 饰的成员:只能在本类和同包中访问。
     3) protected修饰的成员:可以在本类和同包、以及异包的子类中访问。
     4) public修饰的成员:可以在整个项目中访问。

 ## 内部类:
    1) 定义：
        一个类可以定义在另一个类的内部，这个类称为另外-个类的内部类
  ### 成员内部类:

    当定义的位置是作为一一个成员时，称为成员内部类
    1) 对外不具备可见性，所属外部类则可见。
    2) 内部类可以调用所属外部类的成员。
    3) 内部类有与外部类同名成员会覆盖，可用“外部类.this.成员”来调出外部类的同名成员。
    4) 内部类可以自由访问外部类成员，但是，外部类访问内部类成员需要内部类对象名.调用。
    5) 对外要new内部类对象，得通过外部类的对象进行
    6) 内部类和所属外部类是两个类。参见.class文件

```java

public class Outer {
	String name = "张三";
	//内部类对象作为外部类成员
	Inner in = new Inner();
	public class Inner{
		String name = "李四";
		public  void innerMet() {
			System.out.println("内部类访问内部类属性"+this.name);
			System.out.println("内部类访问外部类属性"+Outer.this.name);
		}
	}
	public static void main(String[] args) {
		//方式一 
		Outer out = new Outer();
		Inner in1 = out.new Inner();
		in1.innerMet();
		//方式二  //内部类对象作为外部类成员 然后通过外部类对象调用
		out.in.innerMet();
	}
}
```
  ### 局部(方法)内部类:
    当定义的位置在方法内或某作用域内时，称为局部内部类
    1) 类似于一个局部变量，只在本方法内或本作用域内定义后有效。
    2) 类似于局部变量，不能用static修饰。
```java
/**
 * 方法内部类
 * @author BING
 *
 */
public class MethodInnerClass {
	public void show() {
		final int a = 20;
		int b = 15;
		class Inner{
			int c = 10;
			public void print() {
				System.out.println("访问外部类的方法中的常量"+a);
				System.out.println("访问外部类的方法中的变量"+b);
				System.out.println("访问内部类中的变量"+c);
			}
		}
		Inner in = new Inner();
		in.print();
	}
	public static void main(String[] args) {
		MethodInnerClass out = new MethodInnerClass();
		out.show();
	}
}
```
  ###  匿名内部类:
    没有类名(匿名)，是对某个类的继承或某个接口的实现
    1) 定义方式:(比较特别) new Class(){}。
    2) 作用:一 般用于实现父类或者接口中的方法。
    3) 唯一的没有构造方法的类一- 没有类名怎么去写构造?
    4) 只可能生成唯一的对 象。
    5) 该对象如果需要引用，只能向上造型。
    6) 可以作为成员内部类存在，也可以作为局部内部类存在。
    7) .class文件名 为: outer$1.class
```java
/**
 * 匿名内部类
 * @author BING
 *
 */
public class NMInnerClass {
	
	
	
	Person p = new Person() {
		
		@Override
		public void eat() {
			System.out.println("匿名内部类方法");
		}
	};
	public static void main(String[] args) {
		NMInnerClass  out = new NMInnerClass();
		//连调
		out.p.eat();
		
	}
}

```
  ### 静态内部类:
    static修饰的内部类
    1) 只能是成员内部类，不能是局部内部类。
    2) 不能访问外部类的实例成员。
    3) 匿名内部类唯一的对象可以赋值给静态成员。
  ```JAVA
public class StaticOutInClass {
	String name ="张三";
	static String hobby="篮球";
	public static class Inner{
		static String name2 = "李四";
		
		public  void test() {
			System.out.println("范围内部类的name2:"+name2);
			//访问外部类属性
			StaticOutInClass out = new StaticOutInClass();
			System.out.println("外部类的name:"+out.name);
			System.out.println("外部类的hobby:"+out.hobby);
			
		}
	}
	public static void main(String[] args) {
		//静态内部类不需要创建外部类对象，可以直接创建静态内部类对象使用
		Inner in = new Inner();
		in.test();
	}
}
  ```

  ### 可以实现多继承的效果
  ```java
/*
 *  实现多继承
 */
public class Outer {
	String name = "张三";
	//内部类对象作为外部类成员
	Inner in = new Inner();
	Inner2  in2 = new Inner2();
	public class Inner extends StaticOutInClass{
		String name = "李四";
		public  void innerMet() {
			System.out.println("内部类访问内部类属性"+this.name);
			System.out.println("内部类访问外部类属性"+Outer.this.name);
		}
		@Override
		public void print() {
			System.out.println("这是继承的方法1");
		}
		
	}
	public class Inner2 extends OutClass{
		@Override
		public void OutMethod() {
			// TODO Auto-generated method stub
			System.out.println("这是继承的方法2");
		}
	}
	
	public static void main(String[] args) {
		//方式一 
		Outer out = new Outer();
		Inner in1 = out.new Inner();
		in1.innerMet();
		
		//方式二  //内部类对象作为外部类成员 然后通过外部类对象调用
		out.in.innerMet();
		out.in.print();
		out.in2.OutMethod();
	}
}

  ```

## 抽象类
### 概述
```
在面向对象的概念中，所有的对象都是通过类来描绘的，但是反过来，并不是所有的类都是用来描绘对象的，如果一个类中没有包含足够的信息来描绘一个具体的对象，这样的类就是抽象类。

抽象类除了不能实例化对象之外，类的其它功能依然存在，成员变量、成员方法和构造方法的访问方式和普通类一样。

由于抽象类不能实例化对象，所以抽象类必须被继承，才能被使用。也是因为这个原因，通常在设计阶段决定要不要设计抽象类。

父类包含了子类集合的常见的方法，但是由于父类本身是抽象的，所以不能使用这些方法。

在Java中抽象类表示的是一种继承关系，一个类只能继承一个抽象类，而一个类却可以实现多个接口。
```
### 抽象类的定义
 抽象类在Java语言中使用abstract class来定义抽象类。
```java
/**
*   雇员类
**/
public abstract class Employee
{
   private String name;
   private String address;
   private int number;
   public Employee(String name, String address, int number)
   {
      System.out.println("Constructing an Employee");
      this.name = name;
      this.address = address;
      this.number = number;
   }
   public double computePay()
   {
     System.out.println("Inside Employee computePay");
     return 0.0;
   }
   public void mailCheck()
   {
      System.out.println("Mailing a check to " + this.name
       + " " + this.address);
   }
   public String toString()
   {
      return name + " " + address + " " + number;
   }
   public String getName()
   {
      return name;
   }
   public String getAddress()
   {
      return address;
   }
   public void setAddress(String newAddress)
   {
      address = newAddress;
   }
   public int getNumber()
   {
     return number;
   }
}
```

### 抽象方
    抽象方法
    如果你想设计这样一个类，该类包含一个特别的成员方法，该方法的具体实现由它的子类确定，那么你可以在父类中声明该方法为抽象方法。   
    Abstract 关键字同样可以用来声明抽象方法，抽象方法只包含一个方法名，而没有方法体。    
    抽象方法没有定义，方法名后面直接跟一个分号，而不是花括号。
#### 抽象方法的定义（代码实现）
```java
/**
*   雇员类
**/
public abstract class Employee
{
   private String name;
   private String address;
   private int number;
   //定义计算工资抽象方法
   public abstract double computePay();
   
   //其余代码
}
```
    声明抽象方法会造成以下两个结果：
    
    1）、如果一个类包含抽象方法，那么该类必须是抽象类。
    2）、任何子类必须重写父类的抽象方法，或者声明自身为抽象类。
    继承抽象方法的子类必须重写该方法。否则，该子类也必须声明为抽象类。
    最终，必须有子类实现该抽象方法，否则，从最初的父类到最终的子类都不能用来实例化对象。
    如果Salary类继承了Employee类，那么它必须实现computePay()方法：
```java
public class Salary extends Employee
{
   private double salary; // Annual salary
  
   public double computePay()
   {
      System.out.println("Computing salary pay for " + getName());
      return salary/52;
   }
 
   //其余代码
}
```
### 抽象类总结规定
    1. 抽象类不能被实例化(初学者很容易犯的错)，如果被实例化，就会报错，编译无法通过。只有抽象类的非抽象子类可以创建对象。
    
    2. 抽象类中不一定包含抽象方法，但是有抽象方法的类必定是抽象类。
    
    3. 抽象类中的抽象方法只是声明，不包含方法体，就是不给出方法的具体实现也就是方法的具体功能。
    
    4. 构造方法，类方法（用 static 修饰的方法）不能声明为抽象方法。
    
    5. 抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类。
## 接口

```java
/**
 * 纸张接口
 * @author BING
 *
 */
public interface Paper {
	public String getSize();

}
```
```java
/**
 * 墨盒接口
 * @author BING
 *
 */
public interface InkBox {
/**
 * 返回纸张大小 墨盒颜色
 * @return
 */
	public String getColor();
}

```
```java
/**
 * A4纸张
 * @author BING
 *
 */
public class A4Paper implements Paper {

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "A4";
	}

}

```
```java
/**
 * B5纸张
 * @author BING
 *
 */
public class B5Paper implements Paper {
	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return "B5";
	}
}
```
```java
/**
 * 彩色盒子
 * @author BING
 *
 */
public class ColorBox implements InkBox{

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "彩色";
	}
}

```
```java
/**
 * 灰色墨盒
 * @author BING
 *
 */
public class GrayInBox implements InkBox {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "灰色";
	}

}

```
```java
/**
 * 打印机类
 * @author BING
 *
 */
public class Printer {
	
	private InkBox inkBox;
	private Paper paper;
	
	
	public InkBox getInkBox() {
		return inkBox;
	}
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	public void print() {
		//用接口实现多态
		System.out.println("打印机效果："+inkBox.getColor()+"纸张"+paper.getSize());
	}
}
```
```java

public class Test {
	public static void main(String[] args) {
		//创建墨盒接口对象
		InkBox inkBox = null;
		//创建纸张接口对象
		Paper paper = null;
	
		
		inkBox = new GrayInBox();
		paper = new A4Paper();
		
		Printer printer = new Printer();
		printer.setInkBox(inkBox);
		printer.setPaper(paper);
		printer.print();
		
		System.out.println("--------------------------");
		inkBox = new ColorBox();
		paper = new B5Paper();
		printer.setInkBox(inkBox);
		printer.setPaper(paper);		
		printer.print();
		
	}
}
```
## 常见面试题
### 类成员、实例成员 区别

#### 类成员:
        static修饰的，属于类的，属性可以类名点调用、也可以对象名点调用，行为必须类名点调用，加载时相对先加载一类加载时即加载。
#### 实例成员:
        没有static修饰的，属于实例的，属性和行为都必须对象名点来调用，加载时相对后加载一new对 象时实例化。

### 普通类、抽象类、接口

#### 相同点:
    1）、都可以声明引用
    2）、都可以向上造型
#### 不同点及使用场景:

    1) 普通类:
        有构造方法，可以new对象; 可以写普通方法，不能写抽象方法;既可以有成员变量，也可以有静态变量;只能单继承。
        使用场景:所有对象最终都是通过普通类来描绘的，普通类是new对象的模板。
    2) 抽象类:
        有构造方法，不能new对象;可以写普通方法，也可以写抽象方法;既可以有成员变量，也可以有静态变量;只能单继承。
        使用场景:当某个类不具备足够的信息来描绘一个对象时，可以设置为抽象类;抽象类是对某类事物全部的、正式的抽象，可以对该类事物进行属性和行为上的全面约束。
    3) 接口:
        没有构造方法，不能new对象;不可以写普通方法，只能写抽象方法;不能有成员变量，只能有静态常量;可以多继承。
        使用场景:当想要对某些类进行行为上的约束，或者行为上也不约束、而只是作为某些类的共同标识时，使用接口;接口是对某些事物方法部分的、撮合性的抽象。 
 ## 异常
###11-1、概述
     Java编程语言使用异常处理机制为程序提供了错误处理的能力;程序出现错误,程序安全退出的机制。
     java是采用面向对象的方式来处理异常的。处理过程:
     1.抛出异常:在执行一一个方法时，如果发生异常，则这个方法生成代表该异常的一个对象，停止当前执行路径，并把异常对
     象提交给jre。
     2.捕获异常: jre得到该异常后，寻找相应的代码来处理该异常。jre在方法的调用栈中查找，从生成异常的方法开始回
     溯，直到找到相应的异常处理代码为止。     
 ## 常用类





 ### object类
        java.lang.object
        object类是类层次结构中最顶层父类。
        所有类(包括数组)直接或间接的继承自0bject类。
        同时也继承了该类中的方法

### 包装类

包装类是把基本数据类型转换为对象，是引用类型包包装类可以有很多操作的方法

包装类的继承关系

![包装类的继承关系图](imges/包装类继承关系.png)



#### 包装类的创建(基本数据类型转成包装类)

方式一、构造方法创建

1.在构造方法中可将与之对应的基本数据类型作为构造方法参数，来创建包装类型的对象
2.Character除外，在构造方法中可将对应的基本类型以字符形式作为构造方法参数，来创建包装类型的对象

```java
Double d2=new Double(98.72); .
```

方式二、以字符串方式创建包装类型对象

```java
Double d2=new Double("98.7"); .
Boolean b2=new Boolean("true");
Float f2=new Float("87.4");
Character C2=new Character("男");/ /Character只能是字符类型为参
```



方式三、自动装箱

```java
//自动装箱
Integer i = new Integer(10);//使用自动装箱
Integer j = 10; //自动装箱 将一个基本数据类型传给包装类对象，底层自动实现

```

方式四、通过valueOf方法创建包装类对象

```java
int i = 10;
Integer  integer= Integer.valueOf(i);
Double d = Double.valueOf(i);
```



#### 把包装类转换成基本数据类型

方式一、自动拆箱

```java
Integer i = new Integer(10);//自动装箱
int intValue = i; //自动拆箱 将一个包装类对象转换成基本数据类型
```

方式二、使用包装类的xxxValue()方法

```java
Double dou = new Double(10);
//使用包装类的xxxValue()方法

double v = dou.doubleValue();
int aInt = dou.intValue();
```



#### 包装类的特点总结：

所有的包装类型都是final类型，不能创建他们的子类

java5子后，允许基本数据类型和包装类型混合运算

包装类型是引用类型存储在堆内存里面，基本类型数存储在栈内存中，由于由于存储简单的值，所以存储在栈内存的效率比较快

但是在基本数据类型需要用到对象的时候或者调用方法的时候需要使用包装类

### String类

#### 概述：

注意: String不是基本数据类型! 是引用类型！！！

String是一个特殊的包装类型，我们其他的包装类都是需要Integer age=new Integer()来创建，是保存在堆内存里面的。

String str =new String()来创建

也可以: str ing str2=" abc" ;来创建

关于String str2="abc"java内部将此语句转化分为以下几个步骤:

1.先定义一个名为str2的对String类的对象的引用变量存入栈中

2.在常量池中查找是否存在内容为“abc"字符串对象。

(3) 如果不存在则在常量池中创建"abc"，并让str引用该对 象。 

(4) 如果存在则直接让str引用该对象。

为了更好地说明这个问题，我们可以通过以下的几个代码进行验证

```java
String str1 =  "abc";
String str2 = "abc";
System.out.println(str1==str2);//true
```

#### 常见面试题

- [ ] **面试题1：**

  字符串创建

  ```java
  String str1 = "abc";
  String str2 = "abc";
  System.out.println(str1==str2);//true
  ```

  1第一次创建String str1="abc";的时候，先在常量池判断有没有“abc”，如果没有就在常量池中创建"abc"然后将常量池的引用地址赋给在栈内存开辟的str1（str1是在常量池中“abc“的引用）
  2.第二次创建String str2="abc";的时候也先判断常量池有没有“abc”，如果有就不需要在常量池再次创建“abc”,可以将已经创建好了的"abc"指引赋给str2；
  3.因此str1==str2去比较两个指引的地址的时候，是指向了同一个地址，所以返回true

- [ ] **面试题2：**

 字符串中==和equals

1. ==比较是是两个字符串的地址，用于判断引用是否是同一个地址,如果是同一个地址那么值肯定相等

2. equals()方法比较如果不是同一个地址那么就去比较两个字符串之间的值

   ```java
       public boolean equals(Object anObject) {
           if (this == anObject) {
               return true;
           }
           if (anObject instanceof String) {
               String anotherString = (String)anObject;
               int n = value.length;
               if (n == anotherString.value.length) {
                   char v1[] = value;
                   char v2[] = anotherString.value;
                   int i = 0;
                   while (n-- != 0) {
                       if (v1[i] != v2[i])
                           return false;
                       i++;
                   }
                   return true;
               }
           }
           return false;
       }
   ```

   



# java高级特性

## 泛型

泛型 （Generic ） jdk1.5 加入的新特性

### 概述：

```text

Java泛型(gener ics )是java5引入的一一个新特性，泛型提供了编译时类型安全的监测机制，该机制允许我们在编译时检测
到非法的数据类型结构。泛型的本质是参数化类型，通过<>指定参数来设定该数据结构的数据类型。

对类型的限定
本质1：把对象、集合里面元素的类型推迟到创建集合的时候确定   本质2 ：把类型参数化  
```

### 泛型的使用

```text
<数据类型>    数据类型：只能是引用数据类型
集合<泛型的类型> 对象 = new 集合<泛型类型>();
jdk1.7加入了泛型推断，所以等号右边的泛型类型可以不加
完整写法两边都加
```



#### 未使用泛型

```java
public class Demo02Generic {
    public static void main(String[] args) {    
        //1、可以添加任意类型
		ArrayList a = new ArrayList();
        	a.add("1");
        	a.add("小明");
        	a.add("小明白");
        for (Object object:a
             ) {
            String s = 	(String)object;
            //java.lang.ClassCastException
            //2、会报类强制转换异常
        }
```



#### 使用泛型

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


/**
*泛型接口的实现类，-定要保证实现接口的泛型子类的泛型标识要包含泛型接口的标识
*
//public class Pair<T> implements Generator<T>{
//泛型类继承泛型接口，除了必须标识父类的泛型标识之外，还可以实现泛型的扩充
public class Pair<T,E> implements Generator<T>{
@Override
public T getKey() {
return nu1l;
I

```

#### 自定义泛型

```text
 泛型也可以自定义使用，也有三步骤:
       是Object的子类
        1、泛型的定义:定义在类、定义在方法、
        2、泛型的设置
        3、泛型的确定
        4、泛型的触发:当调用设置的代码时  泛型:把类型作为变量的值
```

#### 泛型通配符    ?  上限extends和下限super

?是通配符 代表任意类型

? extends  A  表示 这个类型为 A 或A的子类

？super A 表示  这个类型为A的父类

代码演示：

```java

```







#### 泛型数组

1、可以声明带泛型的数组引用，但是也不能直接创建带泛型的数组对象
2、可以通过java.lang.Array .newInstance(Calss clz, int lengtn)创建

自定义泛型数组

```java

import java.lang.reflect.Array;

public class Fruit<T> {
    private T[] array = null;
    public Fruit(Class<T> clz, int length) {
        //可以通过java.lang.reflect.Array的呢哇Instance(Class,int)创建T[]数组
        array = (T[]) Array.newInstance(clz,length);
    }

    /**
     * 添加元素
     * @param index
     * @param item
     */
    public void put(int index,T item){
        this.array[index]=item;
    }

    /**
     * 返回索引处的值
     * @param index
     * @return
     */
    public T get(int index){
        return this.array[index];
    }

    /**
     * 返回数组
     * @return
     */
    public T[] getArray(){
        return this.array;
    }


}

```

测试类

```java

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        1、可以声明带泛型的数组引用，但是也不能直接创建带泛型的数组对象
//        ArrayList[] lists = new ArrayList<String>[5];

//        分为两步创建了一个能够存储5个长度的String类型的ArrayList的数组
        ArrayList[] lists = new ArrayList[5];
        ArrayList<String>[]lists1 =lists;
//       2、还可以这样创建泛型类型数组
        ArrayList<String>[] lists2 = new ArrayList[5];
        ArrayList<String> str= new ArrayList<String>();
        lists2[0]=str;


        //创建自定义泛型数组
        Fruit<String> fruit = new Fruit<String>(String.class,3);
        
        fruit.put(0,"苹果");
        fruit.put(1,"西瓜");
        fruit.put(2,"香蕉");

        System.out.println(Arrays.toString(fruit.getArray()));
    }
}

```



### 泛型的好处

```
1.可以限定类型，避免类型转换的错误
2.可以把运行时的异常提前到编译期
```

### 注意

```
1.泛型不接受八种基本数据类型，必须申明引用类型
2.想定对象里面能够操作的数据类型
```



 ## 反射

 ## 注解

 ## 集合容器
 1.集合的继承关系
 ![集合关系图](imges/集合完整继承关系图.png)

 常用集合
 ![常用集合](imges/集合0.png)
 ### Collection
 所有集合的父类接口
 #### List
 List接口集合代表一个有序的，可重复的集合，集合每个元素都有对应的索引顺序。
 List集合默认按照元素顺序设置元素的索引，可以通过索引来访问指定位置的集合元素。
 实现List接口的集合常用的有:ArrayList、LinkedL ist、Vector子类等。

##### ArrayList
1）、概述：

    ArrayList 是我们最常用的遍历数据的集合，底层是Object类型的数组，
    允许设置值为null;该Object类型数组默认为0，可以添加长度，自动扩容；

2）、特点：

    ArrayList是一个有序可扩容的长度的数组，所以可以插入有序的可重复的元素，
    优点是可以快速通过下标获取元素，遍历元素和查找快。
    缺点是由于插入删除需要位移，所以插入和删除效率慢。

3）、具体使用：

```java
package javase.day18.se03.n1Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author BING
 * @date 2020/9/7 11:16
 */
public class Demo04ArrayList {
    public static void main(String[] args) {
        /**
         *ArrayList集合数据存储的结构是数组结构。元素增删慢，查找快。由于日常
         * 开发中使用最多的功能就是查询数据、遍历数据，所以，ArrayList是 最常用
         * 的集合。但是，倘若我们需求的容器是经常要增删、不怎么查找的话，就不应该
         * 任意的滥用ArrayList。|
         *
         *
         */

        //构造方法初始化ArrayList
        /**
         *  public ArrayList(Collection<? extends E> c) {
         *         elementData = c.toArray();
         *         if ((size = elementData.length) != 0) {
         *             // c.toArray might (incorrectly) not return Object[] (see 6260652)
         *             if (elementData.getClass() != Object[].class)
         *                 elementData = Arrays.copyOf(elementData, size, Object[].class);
         *         } else {
         *             // replace with empty array.
         *             this.elementData = EMPTY_ELEMENTDATA;
         *         }
         *     }
         */
        List<Student> list1 = new ArrayList();
        list1.add(new Student("小j",15));
        list1.add(new Student("小k",18));
        list1.add(new Student("小l",16));
        ArrayList<Student> students= new ArrayList<>(list1);
        //底层先使用List.toArray()，转换成数组,用了数组复制方法Arrays.copyOf(数组,容量,数据类型)
        for (Student s:students
             ) {
            System.out.println(s);
        }
        System.out.println();
        //克隆
        //clone() 复制一个ArrayList到另一个ArrayList中去
        ArrayList oldArray=new ArrayList();
        ArrayList newArray = (ArrayList) oldArray.clone();


        List list = new ArrayList(10);


        //添加元素
        //将指定元素添加到此列表（可选操作）的结束。
        list.add(100);
        list.add("小明");
        //可以添加重复元素
        list.add(100);
        //可以添加null;
        list.add(null);

        //通过索引添加元素，原来索引往后移
        list.add(1,100.0001);
        //添加集合
        list.addAll(students);
        ArrayList a= new ArrayList(list);
        //在倒数第1个开始插入新集合的所有元素
        list.addAll(list.size()-2,students);

        //get(index i)获取索引为i的元素
        //list.size()-1为最后一个元素
        System.out.println(list.get(list.size()-1));

        //遍历
        //迭代器
        Iterator iterator = a.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
        //foreach
        for (Object o:list
             ) {
            System.out.println(o);
        }
        System.out.println();
        //foreach遍历器
        for (Iterator it= list.iterator(); it.hasNext();
             ) {
            System.out.println(it.next());
        }
        
        /**
		*
		*
		**/

        //泛型集合
//      泛型是一种类型约束；
//      不用泛型时，集合可以添加任意元素
        ArrayList list2 = new ArrayList(10);
        list2.add(1);
        list2.add(1.2);
        list2.add("ss");
        list2.add(true);
//      但是遍历读取时，只能用Object类型接收，
        Object obj = list.get(2);
//      需要强转成需要的类型，才能使用使用指定对象的功能
        String s= (String) list.get(2);
//        使用泛型时
        ArrayList<String> strings = new ArrayList<String>();
        //只能添加String类型的
        strings.add("小明");
        strings.add("小k");
        strings.add("小l");
//        strings.add(2);//报错
//        输出String类型元素
        for (String str:strings
             ) {
            System.out.println(str);
        }
    }
}

```
##### LinkedList

```text
把元素插入到集合容器中的同时,将该元素记录在该元素的前、后的位置。所以插入和删除该元素不需要位移。
linkedList集合的geti) ,是根据下标为参数,先将index位置化成两半,如果index是小于集合的一半就是从第一个
往后找。知道找到index的值赋给x返回,如果大于就从集合最后的值往前找，找到index的個赋给x返回，这样可
以减少一部分不必要的遍历。 但是还是没有ArrayLlst直接找到下标位置的元素效率高!
```



#####　Vector

Vector 的操作与ArrayList一样，但是区别于：

```java
1、Vector是线程安全的，关键的方法有锁（synchronized修饰方法）增加了系统开销，降低了效率；ArrayList是非线程安全的
2、ArrayList在底层数组不够用时在原来的基础数拓展0.5倍，Vector是拓展1倍
```

#### Set

##### LinkedHashSet

```text
linkedHashset是介于Hashset和Tr eeSet之间,内部是一一个双向链表结构，所以它插入是有有序的。1inkedHashset
是HashSet的一个子类，具有HashSet的特性,也是根据元素的hashCode值来决定元素的存储位置。但它使用链表维护元
素的次序，元素的顺序与源加顺序-致。由于L inkedHashset需要维护元素的插入顺序，因此性能上略低于Hashset,但在造代访问Set.里面的全部元素时候有很好的性能。

```

##### HashSet

##### TreeSet

#### Map

```text
Map接口下的集合采用键值对Map<k，v>的存储方式，保存具有映射关系的数据。因此Map集合里保存两组值，-组用于保存
Map里面的key，另外-组值用于保存Map的value值，key和value可以是任意引用类型的数据。
Key值不允许重复,可以为nu11。
如果添加key-value键值对时已经有重复的key ,则新添加的value会覆盖key原来对应的value值。
常用的实现类有HashMap、LinkedHashMap、 TreeMap等。

```

hashMap是以hash算法存储的，无序的

linkedHashMap链表存储的 有序的

TreeMap红黑树，非线程安全，有序。

##### HashMap

```java
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 * @author BING
 */
public class HashMap_Test {
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<String,String>();
//        增 改
        hm.put("xiao",null);
        //put(k,v)如果没有增加，如果有修改值
        hm.put("xiao","15");
        //键值可以为空， 键只能有一个为null
        hm.put(null,null);
        hm.put(null,"15");
        hm.put("15",null);
        System.out.println(hm);
//        删除
//        删除键
        hm.remove(null);
        //删除键值对
        hm.remove(null,null);
//        查
        //get(key)
        hm.get("xiao");
//        是否包含键
        hm.containsKey(null);
//            是否包含值 
        hm.containsValue(null);

        //遍历
//        foreach()遍历
//        entrySet();返回一个键值对集合
        Set<Map.Entry<String,String>>  entrySet= hm.entrySet();
        for (Map.Entry<String,String>keys:entrySet) {
            System.out.println(keys.getKey()+"="+keys.getValue());
        }
//        Iterator
//        keySet;返回键的集合
        Set<String> keys = hm.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String key = it.next();
            String value = hm.get(key);
            System.out.println(key+"="+value);
        }
    }

}

```

##### linkedHashMap

```text
LinkedHashMaplMap接口的哈希表算法和连接列表实现，具有顺序的Map
采用双向涟表来维护key-value对的次序(其实只要考虑key的次序即可) , 该随表负责维护Map的迭代顺序，与插入顺序一
致，因此性能比HashMap第,但在选代Map李的全部元素时有较好的性能

LinkedHas hMap以双向链表式按照你插入元素的顺序放到L inkedHashMap容器中
插入性能低，按键取值性能比hashMap低,但是遍历所有的值的时候效率高


```

代码：

```java
/**
 * @author BING
 */
public class LinkedHashMap_Test {
    public static void main(String[] args) {

        LinkedHashMap<Student,Integer> linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(new Student("小明","18"),0);
        linkedHashMap.put(new Student("小k","19"),1);
        linkedHashMap.put(new Student("小l","18"),2);

        Set<Map.Entry<Student, Integer>> entries = linkedHashMap.entrySet();
        Iterator<Map.Entry<Student, Integer>> iterator = entries.iterator();
        for (Iterator<Map.Entry<Student, Integer>> entryIterator = entries.iterator(); entryIterator.hasNext(); ) {
            Map.Entry<Student, Integer> next =  entryIterator.next();
            System.out.println(next.getKey()+"\t"+next.getValue());
        }
    }
}
//输出：
Student{id='null', name='小明', age='18', className='null', profession='null'}	0
Student{id='null', name='小k', age='19', className='null', profession='null'}	1
Student{id='null', name='小l', age='18', className='null', profession='null'}	2
```



##### TreeMap

```
基于红黑树算法的实现，非线程安全,不允许nu11, key不允许重复。它是SortedMap的实现类,会根据红黑树算法将key排
序后插入到TreeMap容器中。也可采用自然排序和自定义排序。
如果要采用自定义排序，可以实现Compareab1e接口或者ompar ator接口来重写compar ato方法来自定义排序规则
```

实现：

```java
/**
 * @author BING
 */
public class TreeMap_Test {
    public static void main(String[] args) {
        //TreeMap是会排序后插入到容器中(linkedHashMap是按序插入)
        //默认是自然排序，如果需要使用新的的规则，需要实现Comparator接口重写排序规则

        Map<String,Integer>map = new TreeMap<>();
        map.put("小d",18);
        map.put("小c",20);
        map.put("小a",19);
        map.put("小b",17);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Iterator<Map.Entry<String, Integer>> iterator = entries.iterator(); iterator.hasNext(); ) {
            Map.Entry<String, Integer> next =  iterator.next();
            System.out.println(next.getKey()+"\t"+next.getValue());
        }
    }
}

```





##### Properties

```
Properties类是HashTable的子类，它相当于一-个key、 va lue都是Str ing类型的Map,主要用于读取配置文件，比如之
前学习过的1og4j . pr operti es配置文件，将系统的配置信息配置在该文件中。

```

##### Hashtable

操作与HashMap一样，但是Hashtable是线程安全的，所以效率比HashtMap低



各Map实现类的性能分析:
1. HashMap以哈希算法存储，存储无序的，通过键获取值速度最快;最常用  
2. linkedHashMap以双向链表式存储，会按照存储的顺序存放到集合容器里，因为还要记录存储的顺序所以效率偏低，但是
遍历集合效率高
3. Pr operties集合也是以键值对形式存储，-般用于配置文件的存储，比如1og4j配置
4. TreeMap以红黑树算法存储，存储的是会按照排序后再去存储在集合容器中，排序方式有自然排序和定制排序
5. HashTableHashMap-一样的存储方式，Hashtable考虑线程安全，HashMap不考虑线程安全,查询效率上HashMap要更快

### collections工具类

```java
/**
 * 通过TreeSet比较顺序
 * 1、可以通过实体类实现comparable接口实现comparableTo()方法写一套比较规则
 * 2、通过类实现comparator接口实现compare(<T>o1,<T>o2)方法写比较器
 */


```

Student类

```java
/**
 *	实体类实现Comparable接口
 **/
public class Student implements Comparable<Student> {
   private  String name ;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", age=" + age ;
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

    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
//重写比较规则
    @Override
    public int compareTo(Student o) {

//        根据姓名排序
//        加-取反
        return this.getName().compareTo(o.getName());
//        根据年龄排序降序
//        return this.age-o.age;
//        根据年龄排序升序
//        return o.age-this.age;
    }
}
```

* 1、可以通过实体类实现comparable接口实现comparableTo()方法只能写一套比较规则

```java
/**
 * @author BING
 */
public class Collections_Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(10);
        list.add(30);
        list.add(80);
        list.add(100);
        //使用工具类排序 升序
        Collections.sort(list);
        System.out.println(list.toString());
        //输出：[10, 30, 50, 80, 100]
        //使用Tree自然排序 升序
        Set<Integer> set= new TreeSet<>(list);
        System.out.println(set.toString());
        //输出：[10, 30, 50, 80, 100]
        //使用Tree自定义排序
        /**
         * 通过TreeSet比较顺序
         * 
         */

        Set<Student>studentSet = new TreeSet<>();
        studentSet.add(new Student("小w",10));
        studentSet.add(new Student("小a",19));
        studentSet.add(new Student("小k",12));
        studentSet.add(new Student("小v",16));
        studentSet.add(new Student("小q",19));

        for (Iterator<Student> iterator = studentSet.iterator(); iterator.hasNext(); ) {
            Student next =  iterator.next();
            System.out.println(next);
        }
    }
}
```

* 2、通过类实现comparator接口实现compare(<T>o1,<T>o2)方法写比较器，有多套比较规则

  

# 设计模式

## 单例模式

    所谓单例，就是整个程序有且仅有一个实例。
    该类负责创建自己的对象，同时要确保只有一个对象被创建。
    好处就是一个类你只能创建一个实例对象会节约了内存开销。
    一般常用在工具类的实现。
    
    特点：
    类构造器私有 
    持有自己类型的属性 
    对外提供获取实例的静态方法 
### 懒汉单例
延迟加载，线程不安全，严格意义上不是单例模式

    该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。
    非线程安全，调用方法的时候才创建对象（延迟加载）
```java
public calss LazySingleton{
    //持有自己类型的属性
    private static  LazySingleton instance  = null; 
    //类构造器私有
    private lazySingleton(){}
    //对外提供获取实例的静态方法
    public static LazySingleton getInstance(){
        if(instance == null){
            instance =new LazySingleton(); 
        }    
        return instance;
    }
}
```
改进的懒汉单例
```java
/**
 * 改进的懒汉单例
**/
public calss LazySingleton{
    //保证instance 在所有线程中同步
    private static volatile LazySingleton instance  = null; 
    private lazySingleton(){}
    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance =new LazySingleton(); 
        }    
        return instance;
    }
}
```
注意：添加了关键字 volatile 和 synchronized，否则将存在线程非安全的问题。
如果不删除这两个关键字就能保证线程安全，但是每次访问时都要同步，会影响性能，且消耗更多的资源，这是懒汉式单例的缺点。

### 饿汉单例
线程安全，比较常用，但是容易产生垃圾，
因为饿汉模式是一开始加载类的时候就初始化了实例
```java
public class HungrySingleton{
    //持有自己类型的属性
    //由于static 修饰，只在类加载的时候执行
    private static final HungrySingleton instance= new Singleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return instance;
    }
}
```
### 双检索模式
结合懒汉单例和饿汉单例的优点，延迟加载并且线程安全
```java
public class DoubleSearchSingleton{
    //volatile
    private static volatile DoubleSearchSingleton instance;
    private DoubleSearchSingleton(){}
    public static DoubleSearchSingleton getInstance(){
        if(instance=null){
            synchronized(DoubleSearchSingleton.class){
                if(instance==null){
                        instance=new DoubleSearchSingleton();
                }    
            }
        }
    }
}
```
双检锁模式，进行两次判断，第一次判断是为了避免不要的实例，第二次是了进行同步，避免多线程问题。
 由于Singleton instance()对象在创建的时候jvm中可能会重新排序，在多线程访问下存在风险。
 使用 volatile修饰 instance实例操作不会被jvm重排序。解决该问题
### 内部模式


```java
public class InnerSingleton{
    privtae Singleton(){}
    public static InnerSingleton(){
        return Inner.instance;
    }
    public static  class Inner{
        //常量，不能被改变
        private static final InnerSingleton instance = new InnerSingleton();    
    } 
}
```
只有第一次调用getInstance()方法时，虚拟机才加载Inner并初始化instance，
只有一个线程可以获得对象的初始化锁，其他线程无法进行初始化,保证对象的唯一性。
【目前此方式是所有单例模式中最值得 推荐的一种方式】

### 通过枚举实现单例
默认枚举实例的创建是线程安全的，并且在任何情况下都是单例
实际上枚举类隐藏了私有的构造器。 
枚举类的域 是相应类型的一个实例对象 
那么枚举类型日常用例是这样子的：
```java
public enum EnumSingleton{
    INSTANCE;
    //doSomething 该实例支持的行为
    //可以省略此方法。通过Singleton、  INSATANCE进行操作
    public static EnumSIngleton getInstance(){
        return Singleton.INSTANCE;
    }
}
```

## 
#  Java关键字
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

##2、static

### static 修饰的变量 类变量

    我们用static表示变量的级别，一个类中的静态变量，不属于类的对象或者实例。因为静态变量与所有的对象实例共享，因此他们不具线程安全性。
    通常，静态变量常用final关键来修饰，表示通用资源或可以被所有的对象所使用。如果静态变量未被私有化，可以用“类名.变量名”的方式来使用。

### static 修饰的方法 静态方法

    一个静态方法只能使用静态变量和调用静态方法。通常静态方法通常用于想给其他的类使用而不需要创建实例。例如：Collections class(类集合)。

### static 修饰的代码块 静态代码块

    Java的静态块是一组指令在类装载的时候在内存中由Java ClassLoader执行。
    静态块常用于初始化类的静态变量。大多时候还用于在类装载时候创建静态资源。

```java
public class Student {
    String name = "张三";
    int age=21; //没有使用static修饰的叫做成员变量或者实例变量，通过对象调用
    static int money=100; //类变量 通过类名.类变量调用
    //静态代码块在累加在的时候执行，就执行一次，先执行静态代码块在加载Student()构造方法
    static {
        //通过静态代码块给静态变量初始化值
        // 静态代码块在类加载的时候执行一次，构造方法是在创建对象的时候可执行多次，所以静态代码块可以用于初始化数据
        money=500;
        //age = 100; 不能给非静态的赋值
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
final 关键字声明类可以把类定义为不能继承的，即最终类；或者用于修饰方法，该方法不能被子类重写
### 声明类：
```java
final class 类名 {//类体}
```
### 声明方法：
```java
修饰符(public/private/default/protected) final 返回值类型 方法名(){//方法体}
```
## this和 super

    1)、 this:
        代表当前对象的引用。使用场景:对象调用本类的成员变量成员方法，也可以调用本类的构造方法
    2)、 super: 
        代表本对象的父类对象。使用场景:在子类中调用本对象的父类对象，调用父类构造方法
    3)、 在子类没有重写父类方法的情况下,也可以通过this调用父类方法

## break

```text
中断的意思，遇到break跳出循环语句结束循环
```

```java
	for (int i = 1; i <=10; i++) {
		if (i==5) {
		break;//遇到break直接跳出循环语句结束循环
		}
		System.out.println(i);
	}
//结果:1 2 3 4 
```
## continue

```text
继续的意思，遇到continue，continue后面的代码不执行，直接继续执行下一次循环
```

```java
	for (int i = 1; i <=10; i++) {
		if (i==5) {
			continue;//遇到continue后面代码不执行，直接继续下一次循环
		}
		System.out.println(i);
	}
//结果: 1 2 3 4  6 7 8 9  10
```
## return

```java
用于方法内部返回结果值,也会提前结束循环返回结果
```

```java
public boolean login(String name,int pwd){
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)&&passwords[i]==pwd) {
				return true;//返回结果，结束循环
			}
		}
		return false;
	}
```
#  Java 内存理解
## 概述

系统中的堆栈和数据结构的堆栈不是一个概念，系统中的堆和栈是真实的物理内存

数据结构中的堆栈是抽象的数据存储结构。

## 数据结构的堆栈

### 栈

实际上就是满足先进后出的性质，是一种数据项按顺序排列的数据结构，只能在一端（称为栈顶（top）对数据项进行插

入和删除。

![image-20200827163742212](imges/栈.png)

### 堆

堆是一种万全二叉树或者近似完全二叉树，完全二叉树是一种的效率很高的数据结构，像十分常用的排序算法，Dijkstra算法、prim算法等都要用到堆才能优化

![image-20200827164456372](imges/堆.png)

## 常量池

3-1、概述

```text
常量池用于存放字符串常量和基本数据类型

常量池的好处时为了避免频繁创建和撤销对象而影响性能，实现对象的共享
```



3-2、

