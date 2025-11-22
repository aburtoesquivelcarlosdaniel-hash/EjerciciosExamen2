import java.util.Scanner;
  public class Num10{
    public static void main(String [] args){ 
   int num[]=new int[10];
   Scanner sc=new Scanner(System.in);
   for(int i=0; i<10; i++){
  System.out.println("Ingresa el numero: " + (i+1)); 
  num[i]=sc.nextInt();
   } 
   System.out.println("Los números escritos fueron ");
	for(int i=9;i>=0;i--){
    	System.out.print(" " +num[i]);
	System.out.println("");
	}
   sc.close();
   }
}

  
  