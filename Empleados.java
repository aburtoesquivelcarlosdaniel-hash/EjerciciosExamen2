public class Empleados{
   public static void main(String [] args){
     String [] nombres={"Marcos", "Matilde", "Paty", "Javier"};
    int[][]sueldo={
                {540,540,760}, 
                {200,220,250},
                {760,760,760},
                {605,799,810}
      };
            int[] acumulado=new int[4];
         for(int i=0; i<4; i++){
            acumulado[i]=sueldo[i][0]+ sueldo[i][1]+sueldo[i][2];
       }
       int total=0;
      for(int i=0;i<acumulado.length;i++){
       total+=acumulado[i];
      }
       
     System.out.println("Total pagado en sueldo a empleados: "+ total);
      int mayor=0; 
        for(int i=0; i<4;i++){
      if(acumulado[i]>acumulado[mayor]){
          mayor=i;
       }
     }
         System.out.println("Empleado con mayor ingreso: " + nombres[mayor] + " con un acumulado de: " + acumulado[mayor]);
     System.out.println("\nDetalle de empleados");
          System.out.println("\nEmpleados:  mes 1  mes 2  mes 3 Total");
      for(int i=0; i <4; i++){
          System.out.println(nombres[i] + "\t    " + sueldo[i][0] + "    " + sueldo[i][1] + "    " +sueldo[i][2] + "   " + acumulado[i]); 
     }
     System.out.println("                   \tTotal   " + total);
    } 
    }
          