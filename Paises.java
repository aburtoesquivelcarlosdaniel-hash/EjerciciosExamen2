import java.util.Scanner; 
   public class Paises{
      public static void main(String [] args){
         Scanner sc= new Scanner(System.in); 
       String [] pais= new String[4];
          double [][] temperatura = new double[4][3]; 
      System.out.println("Ingresa el nombre de cuatro paises");
       for( int i=0; i <4; i++){ 
      System.out.println("Pais " + (i+1)); 
    pais[i]=sc.nextLine(); 
     } 
    System.out.println("\nIngresa la temperatura media mensual para cada pais (tres trimestres)");
          for(int i=0; i<4; i++){ 
    System.out.println("Para " + pais[i]); 
       for(int n=0;n<3;n++){
     System.out.print("Mes " + (n+1) + " ");
    temperatura[i][n]=sc.nextDouble();  
       }
      }
    System.out.println("\nTemperaturas ingresadas: "); 
     for(int i=0; i<4; i++){ 
     System.out.println(pais[i]);
      for(int n=0;n<3;n++){
        System.out.println(temperatura[i][n]);
     }  
       } 
     double [] media= new double[4];
       for(int i=0; i<4; i++){ 
         double me=0;
         for(int n=0;n<3;n++){
          me+=temperatura[i][n];
       }
      media[i]=me/3; 
         }
       
        System.out.println("\nTemperatura media trimestral"); 
           for(int i=0; i<4; i++){ 
            System.out.printf(pais[i] + ": " + "%.2f%n", + media[i]);
       }
    int max=0; 
     for(int i=0; i<4; i++){ 
     if(media[i]>media[max]){
       max=i; 
        } 
      }
        System.out.printf("\nPais con la temperatura media mas alta: " + pais[max] + "%.2f%n", + media[max]);
    sc.close();
    }
   }
      
