package com.scp.java.oop;

import java.util.Arrays;
import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		
		
		int num1[] = {10,20,30,40,50};
		System.out.println(Arrays.toString(num1) +" -> " +num1.length);
		num1 = Arrays.copyOf(num1, 20);
		System.out.println(Arrays.toString(num1) +" -> " +num1.length);

		
		if(true)
			return;
		int num2[] = new int[3];
		int count = 0;
		for (int item : num1) {
			if(item==30 || item==40) {
				continue;
			}else {
				num2[count++]=item;
			}
		}
		
		num1=num2;

		System.out.println(Arrays.toString(num2) +" -> " +num2.length);
		System.out.println(Arrays.toString(num1) +" -> " +num1.length);
		
		
		if(true)
			return;
		
		StudentServiceImpl impl = new StudentServiceImpl(100);
		
		for(int i=0;i<10;i++) {
				Address address1= new Address(100+i,"Pune"+i,412333);
				Student st1 = new Student(1+i, "AAAA"+i, 20, 29383.3, address1);
				System.out.println(impl.addStudent(st1));
		}
		
		System.out.println(impl.deleteStudent(2));
		System.out.println(impl.deleteStudent(7));
		System.out.println(impl.deleteStudent(2));
		System.out.println(impl.deleteStudent(6));
		
		
		System.out.println(Arrays.toString(impl.getStudents()));

		
		
		/*
		 * if(true) return;
		 * 
		 * System.out.println("Before : "+Arrays.toString(impl.getStudents()));
		 * 
		 * //System.out.println(Arrays.toString(impl.getStudents())); Student newSt =
		 * new Student(2, "XXXX", 24, 59383.3, address3);
		 * System.out.println(impl.updateStudent(newSt));
		 * 
		 * System.out.println("After : "+Arrays.toString(impl.getStudents()));
		 * 
		 * 
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Enter no of students you want enter :  "); int nostud =
		 * scanner.nextInt();
		 * 
		 * 
		 * //for(int i=0;i<nostud;i++) { // will iterate no of times //stud int counter
		 * = 0; while(true) { counter++; System.out.println("Enter studId"); int stId =
		 * scanner.nextInt(); System.out.println("Enter studName"); String stName =
		 * scanner.next(); System.out.println("Enter studAge"); int stAge =
		 * scanner.nextInt(); System.out.println("Enter studFees"); double stFees =
		 * scanner.nextDouble(); //Address System.out.println("Enter AddressId"); int
		 * aid = scanner.nextInt(); System.out.println("Enter studPincode"); int
		 * stPincode = scanner.nextInt(); System.out.println("Enter studCity"); String
		 * stState = scanner.next();
		 * 
		 * Address address = new Address(aid, stState, stPincode);
		 * 
		 * Student st = new Student(stId,stName,stAge,stFees,address);
		 * 
		 * System.out.println(impl.addStudent(st));
		 * 
		 * if(counter%2==0) { System.out.
		 * println("Do you want to continue...Zero for Break...or else continue!"); int
		 * no= scanner.nextInt(); if(no==0) { break; } } }
		 * 
		 * 
		 * System.out.println(impl.getStudents());
		 */	
		
		
		
	}
	
}
