
package tarea3_201700473;

import java.util.Scanner;

/**
 *
 * @author JAVI
 */
public class Tarea3_201700473 {

        public static void menuPrincipal(){
            System.out.println("    MENU PRINCIPAL");
             System.out.println("1 - Usuarios\n"
                + "2 - Contador de Digitos\n"
                + "3 - Tres Numero de Mayor a Menor\n"
                + "4 - Calcular Promedio\n"
                + "5 - Salir\n"
                + "INGRESE UNA OPCION");
           
            
         }
        
        public static void ordenamiento(){
            
        }
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int MENU,MENUUSUARIO,MENUDIGITS,MENUORDEN,opcion5;
        int numero;
        //estas varibles son para el uso del meno de ordenamiento
        int numero1=0;
        int numero2=0;
        int numero3=0;
        int i;
        
        Boolean comprobacion;
        //-----------------------------------
        // variables para el menu usuario
       String usuario1,usuario2,usuario3,usuario4,usuario5;
        String[]nombreusuarios=new String[6];
        //--------------------------------
        int contadordigitos=0;
        
        
        
         
        
        do{
            menuPrincipal();
         MENU=teclado.nextInt();
        
         switch(MENU){
            //OPCION USUARIOS
            case 1:
                int usuarioback=0;
                do{
                System.out.println("    MENU DE USUARIOS");
        System.out.println("1 - 1ngresar Usuarios\n"
                + "2 - Mostar Usuarios Ascendentemente\n"
                + "3 - Mostar Usuarios Descendentemente\n"
                + "4 - Menu Principal");
                MENUUSUARIO=teclado.nextInt();
        switch(MENUUSUARIO){
            case 1:
                
                System.out.println("Ingrese 5 el nombres de usuario");
                
                for(i=0;i<nombreusuarios.length;i++){
                    
                    usuario1=teclado.nextLine();
                    nombreusuarios[i]=usuario1;
                }
                    usuarioback=1;
                break;
            case 2:
                for(i=5;i>=0;i--){
                    System.out.println(nombreusuarios[i]);
                }
                 usuarioback=1;
                break;
            case 3:
                for(i=0;i<=5;i++){
                    System.out.println(nombreusuarios[i]);
                }
                usuarioback=1;
                 
                break;
            case 4:
                MENU=1; //VOLVER AL MENU PRINCIPAL
                break;
                }  
                }while(usuarioback==1);
        break;
                
            
// MENU PARA CONTAR DIGITOS    
            case 2:
                int digitosback=0;
               do{
              
                System.out.println("    MENU DEL CONTADOR DE DIGITOS");
                System.out.println("1 - Ingresar Un Numero\n"
                         + "2 - Mostrar Numero de Digitos\n"
                         + "3 - Menu Principal\n"
                         + " INGRESE UNA OPCION");
                MENUDIGITS=teclado.nextInt();
                switch(MENUDIGITS){
                    case 1:
                        System.out.println("Ingrese un numero");
                        numero=teclado.nextInt();
                       
                       if(numero<100000 && numero>0){
                       while(numero>0){
                           numero=(numero/10);
                           contadordigitos=contadordigitos+1;
                       }
                        digitosback=1;
                        
                       }
                       else{
                    
                    System.out.println("EL NUMERO NO ES VALIDO!!!!");
                    digitosback=1;
                    contadordigitos=0;
                       } 
                               
                    break;
                        
                    case 2:
                        if(contadordigitos>0){
                System.out.println("El numero de Digitos es   "+contadordigitos+"\n"
                        + "  ");
                contadordigitos=0;
                break;
                }
                 System.out.println("¡¡¡DEBE INGRESAR UN NUMERO!!!!");
                        digitosback=1;
                       
                    case 3:
                        digitosback=0;
                        MENU=1; //VOLVER AL MENU PRINCIPAL 
                        break; 
                }
               }while(digitosback==1);
              break;
                
            //OPCION TRES NUMEROS MAYOR A MENOR    
                
            case 3:
                int ordenback=0;
                do{
                
                System.out.println("   MENU TRES NUMEROS");
                 System.out.println("1 - Ingresar Numeros\n"
                         + "2 - Mostar Ordenados\n"
                         + "3 - Menu Principal\n"
                         + "Eliga una Opción");
                 MENUORDEN=teclado.nextInt();
                 switch(MENUORDEN){
                  

                     case 1:
                         System.out.println("Ingrese los numeros:");
                         numero1=teclado.nextInt();
                         numero2=teclado.nextInt();
                         numero3=teclado.nextInt();
                         ordenback=1;
                         comprobacion=true;
                         break;
                     case 2:
                         if (comprobacion=true){
                         if(numero1>numero2&&numero2>numero3){
                             System.out.println("El Orden es:");
                             System.out.println(numero1+"_"+numero2+" "+numero3);
                             ordenback=1;                             
                         }else if(numero1>numero3&&numero3>numero3){
                             System.out.println("El Orden es:");
                             System.out.println(numero1+" "+numero3+" "+numero2);
                             ordenback=1;
                         }
                         else if(numero2>numero1&&numero1>numero3){
                             System.out.println("El Orden es:");
                             System.out.println(numero2+" "+numero1+" "+numero3);
                             ordenback=1;
                         }else if(numero2>numero3&&numero3>numero1){
                             System.out.println("El Orden es:");
                             System.out.println(numero2+" "+numero3+" "+numero1);
                             ordenback=1;
                         }else if(numero3>numero2&&numero2>numero1){
                             System.out.println("El Orden es:");
                             System.out.println(numero3+" "+numero2+" "+numero1);
                             ordenback=1;
                         }else if(numero3>numero1&&numero1>numero2){
                             System.out.println("El Orden es:");
                             System.out.println(numero3+" "+numero1+" "+numero2);
                             ordenback=1;
                         }else if(numero2==numero3&&numero3==numero2&&numero1!=0){
                             System.out.println("El Orden es:");
                             System.out.println("Los numeros son iguales"); 
                             ordenback=1;
                         }else if(numero3>numero2&&numero2==numero1){
                             System.out.println("El Orden es:");
                             System.out.println(numero3+" "+numero2+" "+numero1);
                             ordenback=1;
                         }else if(numero2>numero3&&numero3>numero1){
                             System.out.println("El Orden es:");
                             System.out.println(numero2+" "+numero3+" "+numero1);
                             ordenback=1;
                         }else if(numero2>numero1&&numero1==numero3){
                             System.out.println("El Orden es:");
                             System.out.println(numero2+" "+numero1+" "+numero3);
                             ordenback=1;
                         }else if(numero1>numero2&&numero2==numero3){
                             System.out.println("El Orden es:");
                             System.out.println(numero1+" "+numero2+" "+numero3);
                             ordenback=1;
                         }
                         }
                               ordenback=1;
                               System.out.println("DEBE DE INGRESAR LOS NUMEROS!!!!!");
                      break;
                         
                     case 3:
                         ordenback=0;
                         MENU=1;
                      break;  
                 }
                }while(ordenback==1);
                break;
                
            case 4:
                //CALCULO DEL PROMEDIO
                break;
                
                
    }
        
        
    }while(MENU==1);    
    }
    
}