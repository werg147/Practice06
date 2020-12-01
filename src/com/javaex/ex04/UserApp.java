package com.javaex.ex04;

public class UserApp {

	public static void main(String[] args) {
		
		User[] user = new User[3];
		
		User p1 = new Customer("jws", "i1234", "정우성", 1000);
		User p2 = new Customer("yjs", "y2345", "이효리", 2000);
		User s1 = new Employee("master", "m7788", "운영자", 5000000);
		
		user[0] = p1;
		user[1] = p2;
		user[2] = s1;
			
		for(int i=0; i<user.length; i++) {
			user[i].showInfo();
		}
		
		User s2 = new Employee();
		((Employee)s2).setSalary(5000000);
		System.out.println("운영자의 월급은 " + ((Employee)s2).getSalary() + "원 입니다.");
		

	}

}
