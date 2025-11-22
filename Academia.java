import java.util.Scanner; 
    public class Academia{
      public static void main(String [] args){
     int matriz[][] =new int[3][4];
       String[]nivel={"básico","medio","perfeccionamiento"};
       String[] idioma={"ingles","frances","aleman","ruso"};
       Scanner sc=new Scanner(System.in);
     System.out.println("Ingresa el nivel y idioma de cada alumno"); 
       for(int i=0; i<12; i++){
     System.out.println("estudiante " + (i+1));
    int ni;
  do{
  System.out.println("Nivel (0=basico, 1=medio, 2=perfecciamiento)");
     ni=sc.nextInt();
  } while(ni <0 || ni > 2); 
    int id;
      do{
  System.out.println("idioma (0=ingles, 1=frances, 2=aleman, 3=ruso)");
   id=sc.nextInt();
 }while(id <0 || id > 3);
    matriz[ni][id]++; 
   }
    System.out.println("\nAlumnos por nivel e idioma ");
   for( int i=0;i <3;i++){
      System.out.println(nivel[i]);
         for(int n=0; n < 4;n++){
           System.out.println(idioma[n]+ ": " + matriz[i][n]);
      }
         System.out.println();
     }
     sc.close();
    }
}
           
   

  
    
     
    
    