 public class Pruebas{
    public static void main(String [] args){
     String [][] atletas= new String[5][4];
      String[] nombre={"Ana", "Luis", "Carla", "Jorge", "Maria"};
     String [] apellidos={"Lopez", "Pérez", "Diaz", "Ruiz", "Solis"};
      int[] especialidad={100,200,400,100,800};
     double[] tiempo={12.5,23.4,53.2,11.8,125};                                    
       for(int i=0; i<5; i++){
       atletas[i][0]=nombre[i];
       atletas[i][1]=apellidos[i];
       atletas[i][2]=String.valueOf(especialidad[i]); 
       atletas[i][3]=String.valueOf(tiempo[i]);
       }
     int mejor=0;
      double mejort=Double.parseDouble(atletas[0][3]);
       for(int i=0;i<5;i++){
     double tiempoa=Double.parseDouble(atletas[i][3]);
     if(tiempoa<mejort){
       mejort=tiempoa;
         mejor=i;
       }
      }
     
        System.out.println("Nombre\tApellidos\tEspecialidad\tTiempo"); 
   for(int n=0; n<5; n++){
    String time=atletas[n][3];
    if(n == mejor){
    time+=" ";
  } 
System.out.println(atletas[n][0] + "\t" + atletas[n][1] + "\t\t" + atletas[n][2] + "\t\t" + time);
  
}
}  
}


   
 