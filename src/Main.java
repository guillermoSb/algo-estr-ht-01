import java.util.Scanner;

public class Main {
   
public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

        RadioSettings radiosettings = new RadioSettings();
       
       
        int opcion1 = 0;
        int opcion = 0;
        
        System.out.println("-----------RADIO-----------");
        System.out.println("-----------¿Desea encender el Radio? (1-si)(2-no)-----------");
        opcion1 = scan.nextInt();
        if (opcion1 == 1){
            // Se crea un ciclo while para el menu 
        while(opcion != 6){
            //Se crea el menu con las diferentes opciones 
            System.out.println("-----------Opciones:-----------");
            System.out.println("-----------(1)Siguiente Estacion-----------");
            System.out.println("-----------(2)Estacion Previa-----------");
            System.out.println("-----------(3)Guardar emisora-----------");
            System.out.println("-----------(4)Obtener frecuencia-----------");
            System.out.println("-----------(5)AM/FM-----------");
            System.out.println("-----------(6)Apagar-----------");
            System.out.println("Que deseas escoger?");
            opcion = scan.nextInt();
    
                
                    
                    if(opcion==1){
                        
                        
                        radiosettings.nextStation(radiosettings.getFrequency());
    
                        
                    }
                   
                    if(opcion==2){
                        
                        
                        radiosettings.prevStation(radiosettings.getFrequency());
                        
                    }
    
                
                    if(opcion==3){
                        
                        
                        radiosettings.getStation();
                        
    
                    }
                   
                    if(opcion==4){
                        
                        
                        radiosettings.getFrequency();
                        
                    }
    
                    if(opcion==5){
                        
                        
                        radiosettings.switchAMFM();
                        
                    }

                    if(opcion==6){
                        System.out.println("Feliz dia");
                    }
                    
    
        }
        }

        if (opcion1 == 2){
            
        }
        
        }
        
    }
