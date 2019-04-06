package model;

public class Container{
	
	//Atributes
	private double height;
	private double base;
	private double width;
	
	//Constructor
	public Container(double height, double base, double width){
		
		this.height=height;
		this.base=base;
		this.width=width;
		
	}
	
	//Calculators
	public double volume(){
		
		double volume=(height*base*width);
		return volume;
		
	}
	
	//Gets
	public double getHeight(){
		
		return height;
		
	}
	
	public double getBase(){
		
		return base;
		
	}
	
	public double getWidth(){
		
		return width;
		
	}
	
	//Sets
	public void setHeight(double height){
		
		this.height=height;
		
	}
	
	public void setBase(double base){
		
		this.base=base;
		
	}
	
	public void setWidth(double width){
		
		this.width=width;
		
	}
	
}