import java.util.Scanner; 
   public class Calificaciones1{
    public static void main(String [] args){ 
   Scanner sc=new Scanner(System.in);
     int a=0,r=0;
     double cal,sum=0,prom;
      for(int i=1;i<=5;i++){
    System.out.println("Ingresa la calificación del alumno " + i);
      cal=sc.nextDouble(); 
     if(cal<0 || cal>10){ 
        System.out.println("Calificacion invalida.La calificacion debe ser entre 1-10");
       }
      sum+=cal;
      if(cal>=6){
      a++;
      }else{ 
       r++;
      }
      }
      prom=sum/5; 
    System.out.println("\tCalificaciones");
      System.out.println("Numero de aprobados: " + a); 
       System.out.println("Numero de reprobados: " + r); 
    System.out.println("EL promedio del grupo es: " + prom); 
   sc.close();
       }
    } 