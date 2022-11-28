package main;

import java.util.Scanner;

import clases.*;

public class Main {

	public static void main(String[] args) {

        Menu();
        
	}
	
	public static void Menu ()
    {
		
		Scanner escoger = new Scanner(System.in);
		int num;
        IEstrategia operacion = null;
		
        int i = 0;
        while(true) 
        {
        	System.out.println("Escoge una opcion del 1 al 4:");

            num = escoger.nextInt();
            
	        switch (num) {
				case 1: 
					operacion = new IEstrategiaEncender();
					
					break;
				case 2:
					operacion = new IEstrategiaLavar();
					
					break;
				case 3:
					operacion = new IEstrategiaSecar();
					
					break;
				case 4:
					operacion = new IEstrategiaApagar();
					
					break;		
				default:
					System.out.println("Error!!!");
					break;
	        	}
	        i++;
	        operacion.funcion();	
		}
        
        
        
        
    }
	
	

}
