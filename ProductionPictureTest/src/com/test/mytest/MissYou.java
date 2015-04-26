package com.test.mytest;

import java.lang.reflect.Proxy;

import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.TypeElement;

 public class MissYou {
	 int a;
	 void swap(String a,String b){
		 String temp = null;
		 temp = a;
		 a = b;
		 b = temp;
		 System.err.println("a:"+a+"...b:"+b);
	 }
	 int returnInt(String ...s){
		 int a;
		 this.getClass().getClassLoader();
		
		 return this.a;
	 }
	 
	public static void main(String[] args) {
		
		RoundEnvironment roundEnv;
		TypeElement e ;
		Proxy p;
		MissYou my = new MissYou();
		my.returnInt("","");
		String a = "aaa";
		 String b = "bbb"; 
		my.swap(a, b);
		System.err.println("a:"+a+".+++.b:"+b);
		
	}
	public class innerClass{
		
	}

}
 class ts{
	 String a = "aaa";
	 String b = "bbb";
	 
	 
 }
