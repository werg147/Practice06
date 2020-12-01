package com.javaex.ex06;

public class MyBase extends Base{

    //코드작성
    
	public void service(String status) {
		
		if(status.equals("낮")) {
			day();
		} else if(status.equals("밤")) {
			night();
		} else if(status.equals("오후")) {
			afternoon();
		}
		//System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
	
	public void afternoon() {
		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
	}
	
}
