import java.util.Scanner; 
    public class Tienda{
       public static void main(String [] args){
      String [][] articulos= new String[3][4]; 
     articulos[0][0]= "camisa  "; 
     articulos[1][0]="zapatos "; 
     articulos[2][0]="Pantalon";

     Scanner sc= new Scanner(System.in); 
      for(int n=0;n<3;n++){
        System.out.println("Ingresa los datos para " + articulos[n][0]); 
      System.out.println("Talla "); 
       articulos[n][1]=sc.nextLine();
      System.out.println("Color: ");
       articulos[n][2]=sc.nextLine();
      System.out.println("Precio :"); 
       articulos[n][3]=sc.nextLine(); 
     } 
        System.out.println("Tabla de artículos"); 
       System.out.println("Articulo\ttalla\tcolor\tprecio");
     for(int n=0;n<3;n++){
           System.out.println(articulos[n][0]  + "           " + articulos[n][1] +"\t" + articulos[n][2] + "\t" + articulos[n][3]);
        
      } 
       sc.close();
     }
   }

     

