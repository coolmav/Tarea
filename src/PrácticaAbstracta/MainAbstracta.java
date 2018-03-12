package PrácticaAbstracta;

import java.util.Scanner;


public class MainAbstracta {


public static void main(String[] args) {
        String nombre;  
        String apellido;
        double tiempoServicio;
        double incen;
        double sueldo;
        double pagoH;
        byte tiempo;
        
        
        Scanner ny=new Scanner(System.in);
        
        System.out.println("Despues de terminar la operación vamos a verificar si---¡Ha ocurrido un error!");
        
        System.out.println("\n");
        
        System.out.print("Digite tu nombre es: "); nombre=ny.next();
        System.out.print("Digite tu apellido es: "); apellido=ny.next();
        System.out.print("Tus horas de trabajo son ");tiempoServicio=ny.nextDouble();
        System.out.print("Tu incentivo ganado es ");incen=ny.nextDouble();
        System.out.print("Tu pago por hora es: ");pagoH=ny.nextDouble();
        System.out.print("El tiempo de trabajo es: ");tiempo=ny.nextByte();
        
        
      
    
           
       
    
    
         
        
        System.out.println("\n");
        
        
        
        
     try
        {
        System.out.println("Tu nombre es: " +nombre);
        System.out.println("Tu apellido es: " +apellido);
        System.out.println("Tus horas de trabajo son " +tiempoServicio);
        System.out.println("Tu incentivo ganado es " +incen); 
        sueldo=tiempoServicio*pagoH*incen;
        System.out.println("El sueldo es: " +sueldo);
        pagoH=sueldo/tiempoServicio;
        System.out.println("El pago por hora es: " +pagoH);
        System.out.println("El tiempo de trabajo es: " +tiempo);
         
        } catch (Exception e)
        {
           System.out.println("Ha ocurrido un error");       
           // System.out.println(e.toString());             
        }    
    }
    
}
