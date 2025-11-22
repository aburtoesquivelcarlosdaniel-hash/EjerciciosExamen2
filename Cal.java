import java.util.Scanner; 
  public class Cal{
    public static void main(String [] args){
   double calificaciones[]=new double[6];
  Scanner sc=new Scanner(System.in);
    for(int i=0;i<6;i++){ 
   System.out.println("Ingresa la calificacion del alumno: " + (i+1));
     calificaciones[i]=sc.nextDouble();
    } 
    double suma=0; 
      for(int i=0;i<6;i++){
       suma+=calificaciones[i];
    }
    double promedio=suma/6;
    for(int i=0;i<6;i++){
       System.out.println("las calificaciones de los alumnos en la posicion" + (i+1));
      System.out.println(calificaciones[i]); 
   }
     System.out.printf("\ncon un promedio final de: %.2f",  promedio);
   sc.close();
   }
} 

     
