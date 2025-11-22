import java.util.Scanner; 
 public class Num8{
    public static void main(String [] args){ 
     int num[]=new int[8]; 
    Scanner sc=new Scanner(System.in); 
   for(int i=0; i<8; i++){
   System.out.println("Ingresa el numero: " + (i+1));
    num[i]=sc.nextInt();
    }
  System.out.println("Ingresa el numero a buscar: "); 
  int numb=sc.nextInt(); 
  
   boolean encontrado= false; 
    for(int i=0 ; i<8; i++){
       if(num[i]==numb){
      encontrado=true; 
     break; 
   }
  } 
  if(encontrado){
      System.out.println("El numero " + numb + " existe en el arreglo");
     } else {
     System.out.println("El numero " + numb + " no existe en el arreglo");
    }
    sc.close();
   }
}
   
   
   