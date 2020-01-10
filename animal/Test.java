package com.bjpowernode.chapter01.abstractclass.animal;
/**
 * 1、抽象类也是一种引用数据类型，定义变量
 * 		Java数据类型包括基本数据类型和引用数据类型，其中引用数据类型包括：类、接口、数组、美剧
 * 2、抽象类不能实例化对象，抽象类的引用需要赋值子类对象
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) {
		//抽象类定义变量
		Animal animal;
		//抽象类不能实例化对象
		animal = new Dog();
		animal.eat();
		//抽象多态
		animal = new Cat();
		animal.eat();
		//抽象类可以赋值匿名内部类对象
		animal = new Animal() {
		};
	}

}
