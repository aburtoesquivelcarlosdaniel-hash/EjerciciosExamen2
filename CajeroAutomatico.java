import java.util.Scanner; 
  public class CajeroAutomatico{
    public static void main(String [] args){ 
      Scanner sc=new Scanner(System.in);
         double saldo=5000.00;
      String continuar; 
     do{
      System.out.println("Bienvenido usuario \nTienes un saldo disponible de: "+ saldo + "\nIngresa el monto que desea retirar: $");
      double retiro=sc.nextInt(); 
     if(retiro<=saldo && retiro>0){
     saldo-=retiro;
       System.out.println("Retiro exitoso. Saldo actual es:  " + saldo);
      } else { 
     System.out.println("Monto invalido el retiro debe ser menor a tu saldo");
       }
       System.out.println("desea continuar con otra operacion? (si/no)"); 
   continuar=sc.next().toLowerCase();
     }while(!continuar.equals("no")); 
    System.out.println("Gracias por utilizar este cajero.¡ten lindo dia!"); 
      
       sc.close(); 
      }
    }
     