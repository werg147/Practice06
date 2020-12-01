package com.javaex.ex03;

public class Shape {
	
	protected String fillColor;
	protected String lineColor;
	
	public Shape() {}
	
	public Shape(String fillColor, String lineColor) {
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}
	
	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}
	
	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public void showInfo() {
		System.out.println("====삼각형====");
		System.out.println("#면색:"+fillColor);
		System.out.println("#선색:"+lineColor);
	}
	
}

