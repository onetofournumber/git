package com.bjpowernode.chapter01.abstractclass.animal;
/**
 * 1.使用abstract修饰的类就是抽象类
 * 2.普通类有的实例变量、实例方法、静态变量、静态方法、构造方法等所有成员都可以在抽象类中定义
 */
public abstract class Animal {
	String color;
	static int xx = 123;
	public void eat() {
		System.out.println("动物吃食物");
	}
	public static void sm() {
		System.out.println("动物类需要sm");
	}
	public Animal() {
	}
	public Animal(String color) {
		super();
		this.color = color;
	}
	
}
