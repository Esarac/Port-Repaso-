package ui;
import java.util.Scanner;
import model.*;

public class Main{
	
	private Port port;
	private Scanner s;
	
	public static void main(String[]args){
		
		Main m=new Main();
		m.menu();
		
	}
	
	public void containerMenu(){
		
		double height;
		double base;
		double width;
		
		//Container 1
		System.out.print("\ncontenedor #1:\n Altura:");
		
		height=s.nextDouble();
		s.nextLine();
		
		System.out.print(" Base:");
		
		base=s.nextDouble();
		s.nextLine();
		
		System.out.print(" Profundidad:");
		
		width=s.nextDouble();
		s.nextLine();
		
		port.createContainer(height, base, width, 1);
		
		//Container 2
		System.out.print("\ncontenedor #2:\n Altura:");
		
		height=s.nextDouble();
		s.nextLine();
		
		System.out.print(" Base:");
		
		base=s.nextDouble();
		s.nextLine();
		
		System.out.print(" Profundidad:");
		
		width=s.nextDouble();
		s.nextLine();
		
		port.createContainer(height, base, width, 2);
		
		//Container 3
		System.out.print("\ncontenedor #3:\n Altura:");
		
		height=s.nextDouble();
		s.nextLine();
		
		System.out.print(" Base:");
		
		base=s.nextDouble();
		s.nextLine();
		
		System.out.print(" Profundidad:");
		
		width=s.nextDouble();
		s.nextLine();
		
		port.createContainer(height, base, width, 3);
		
	}
	
	public void menu(){
		
		containerMenu();
		
		boolean run=true;
		
		while(run){
			
			System.out.print("\n----------\nBienvenue sur le port \n 1.Volumen total de la mercancia \n 2.Volumen promedio de la mercancia \n 3.Hasta luego amiguisimo\n----------\n~");
			
			int option=s.nextInt();
			s.nextLine();
			
			switch(option){
				
				case 1:
					
					System.out.print("Volumen total="+port.totalVolume());
					
				break;
				
				case 2:
					
					System.out.print("Volumen total="+port.averageVolume());
					
				break;
				
				case 3:
					
					System.out.print("Ciao bambino");
					run=false;
					
				break;
				
				default:
					
					System.out.print("Se equivoco. Porfavor no se equivoque");
					
				break;
				
			}
			
		}
		
	}
	
	public Main(){
		
		init();
		
	}
	
	public void init(){
		
		Container cA=new Container(1,1,1);
		Container cB=new Container(1,1,1);
		Container cC=new Container(1,1,1);
		
		port=new Port(cA, cB, cC);
		s=new Scanner(System.in);
		
	}
	
}