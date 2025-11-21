public class Ahorro{
 public static void main(String [] args){
   double saldo=0;
 for(int mes=1;mes<=12;mes++){
    saldo+=500; 
     saldo*=1.09; 
    System.out.printf("\nAl final del mes " + mes+ " el ahorro acumulado es de: %.2f",  + saldo); 
    }
   System.out.printf("\nTotal ahorrado al año es de : %.2f", + saldo);   
    }
  }    
   