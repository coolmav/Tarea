
package PrácticaAbstracta;


public class CalculoPrestacionesEmpFijo extends Empleado{

@Override
    public void PrestaciónLaboral(double pagoH, double incen, double sueldo,  double tiempoServicio, byte tiempo) {
    
           System.out.println("Tus horas de trabajo son " +tiempoServicio);
    
           System.out.println("Tu incentivo ganado es " +incen);
           
           System.out.println("Tu tiempo de Contrato es " +tiempo);
    
    sueldo=tiempoServicio*pagoH*incen;
           System.out.println("El sueldo es: " +sueldo);
    
    pagoH=sueldo/tiempoServicio;
           System.out.println("El pago por hora es: " +pagoH);
       
    
          
          

}
    
      
    

}
