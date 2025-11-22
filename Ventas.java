import java.util.Scanner; 
   public class Ventas{
    public static void main(String [] args){
   double venta[]= new double[7];
   Scanner sc=new Scanner(System.in); 
  for(int i=0; i<7; i++){
  System.out.println("Ingresa el monto del dia: " + (i+1));
    venta[i]=sc.nextDouble();
    }
    double suma=0; 
      for(int i=0;i<7;i++){
       suma+=venta[i];
  }
     double ventam=venta[0];
     int dia=0; 
    for(int i=1; i<7; i++){
     if(venta[i] > ventam){
     ventam=venta[i];
      dia=i;
    }
   }
    System.out.printf("\nVenta total de la semana: %.2f", + suma);
    System.out.println("\nDia con mayor venta: " + (dia+1) + " con $" + ventam);
   sc.close();
}
 }  
  