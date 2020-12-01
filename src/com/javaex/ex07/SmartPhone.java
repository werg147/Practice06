package com.javaex.ex07;

public class SmartPhone extends MusicPhone {
    
    public void execute(String str){
        
        //코드작성
        if("앱".equals(str)) {
        	app();
        } else if("음악".equals(str)) {
        	playMusic();
        } else if("통화".equals(str)) {
        	System.out.println("통화기능시작");
        }
    }
    
 
    //메소드작성
    public void playMusic() {
    	System.out.println("다운로드해서 음악재생");
    }
    
    //메소드작성
    public void app() {
    	System.out.println("앱 실행");
    }
    
    
}
