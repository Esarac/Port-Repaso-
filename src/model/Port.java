package model;

public class Port{
	
	//Atributes
	private Container containerA;
	private Container containerB;
	private Container containerC;
	
	//Constructor
	public Port(Container containerA, Container containerB, Container containerC){
		
		this.containerA=containerA;
		this.containerB=containerB;
		this.containerC=containerC;
		
	}
	
	//Calculators
	public String createContainer(double height, double base, double width, int container){
		
		Container newContainer=new Container(height, base, width);
		
		String message="Se ha creado el contenedor";
		
		if(container==1){
			
			containerA=newContainer;
			
		}
		else if(container==2){
			
			containerB=newContainer;
			
		}
		else if(container==3){
			
			containerC=newContainer;
			
		}
		else{
			
			message="No existe ese contenedor";
			
		}
		
		return message;
		
	}
	
	public double totalVolume(){
		
		double volumeA=0;
		double volumeB=0;
		double volumeC=0;
		
		if(containerA!=null){
			
			volumeA=containerA.volume();
			
		}
		if(containerB!=null){
			
			volumeB=containerB.volume();
			
		}
		if(containerC!=null){
			
			volumeC=containerC.volume();
			
		}
		
		double totalVolume=(volumeA+volumeB+volumeC);
		return totalVolume;
		
	}
	
	public double averageVolume(){
		
		double volumeA=0;
		double volumeB=0;
		double volumeC=0;
		double containerQuantity=0;
		
		if(containerA!=null){
			
			volumeA=containerA.volume();
			containerQuantity++;
			
		}
		if(containerB!=null){
			
			volumeB=containerB.volume();
			containerQuantity++;
			
		}
		if(containerC!=null){
			
			volumeC=containerC.volume();
			containerQuantity++;
			
		}
		
		double averageVolume=0;
		
		if(containerQuantity!=0){
			
			averageVolume=((volumeA+volumeB+volumeC)/containerQuantity);
			
		}
		
		return averageVolume;
		
	}
	
	//Gets
	public Container getContainerA(){
		
		return containerA;
		
	}
	
	public Container getContainerB(){
		
		return containerB;
		
	}
	
	public Container getContainerC(){
		
		return containerC;
		
	}
	
	//Sets
	public void setContainerA(Container container){
		
		containerA=container;
		
	}
	
	public void setContainerB(Container container){
		
		containerB=container;
		
	}
	
	public void setContainerC(Container container){
		
		containerC=container;
		
	}
	
}