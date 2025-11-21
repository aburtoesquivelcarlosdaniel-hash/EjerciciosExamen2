import java.util.Scanner; 
  public class tablaM{
    public static void main(String [] args){
     Scanner sc=new Scanner(System.in); 
    int num=0;
      System.out.println("Ingresa el numero del cual quieres conocer su tabla de multiplicar"); 
    num=sc.nextInt(); 
     for(int i=0;i<=10;i++){
    System.out.println(num + "X" + i + "=" + i*num);
     }
   }
} 
