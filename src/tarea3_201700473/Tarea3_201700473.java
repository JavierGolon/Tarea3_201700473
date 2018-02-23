
package tarea3_201700473;

import java.util.Scanner;

/**
 *
 * @author JAVI
 */
public class Tarea3_201700473 {
// metodo para llamar desde cualquier punto al menu principal
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
        int MENU,MENUUSUARIO,MENUDIGITS,MENUORDEN;
        int numero;
        //VARIABLES MENU ORDENAMIENTO
        int numero1=0;
        int numero2=0;
        int numero3=0;
        int i;
        Boolean comprobacion;
        //-----------------------------------
        // VARIABLES MENU USUARIOS
        String[]nombreusuarios=new String[5];
        //--------------------------------
        //VARIABLES MENU PROMEDIO
        int[][]promedio=new int[6][6];
        int numeroalumno=0;
        int columna=0;
        int fila=0;
        int nota1;
        int totalnota=0;
        int promedioalumno;
        //VARIBLES CONTAR DIGITOS
        int contadordigitos=0;
        
        
        
         
        
        do{
            menuPrincipal();
         MENU=teclado.nextInt();
        
         switch(MENU){
            //---------------------------------------------------------------- 
            //CALCULO USUARIOS
            case 1:
                int usuarioback=0;
                do{
                System.out.println("    MENU DE USUARIOS");
        System.out.println("1 - Ingresar Usuarios\n"
                + "2 - Mostar Usuarios Ascendentemente\n"
                + "3 - Mostar Usuarios Descendentemente\n"
                + "4 - Menu Principal");
                MENUUSUARIO=teclado.nextInt();
        switch(MENUUSUARIO){
            case 1:
                
                System.out.println("Ingrese 5 el nombres de usuario");
                      // NO LOGRE QUE ME INGRESARA 5 USUARIOS A PESAR DE SER UN ARREGLO DE TAMAÑO 5
                        for(i=0;i<nombreusuarios.length;i++){
                        nombreusuarios[i]=teclado.nextLine(); 
                          for(int h=0;h<i;h++){
                            if(i>=1&&nombreusuarios[i].equals(nombreusuarios[h])){
                             System.out.println("USUARIO EXISTENTE INGRESO OTRO");
                             nombreusuarios[i]=teclado.nextLine();
                            }
                          }
                            
                        }
                    usuarioback=1; // VUELVO AL MENU DE USUARIO
                //ORDEN ASCENDENTE
                break;
            case 2:
                for(i=4;i>=0;i--){
                    System.out.println(nombreusuarios[i]);
                }
                 usuarioback=1;
                break;
                //ORDEN DESCENDENTE
            case 3:
                for(i=0;i<=4;i++){
                    System.out.println(nombreusuarios[i]);
                }
                usuarioback=1;
                 
                break;
            case 4:
                usuarioback=0;
                MENU=1; //VOLVER AL MENU PRINCIPAL
                break;
                }  
                }while(usuarioback==1);
        break;
                
            //-----------------------------------------------------------
            // CALCULO PARA CONTAR DIGITOS    
            case 2:
                int digitosback=0; // VUELVO AL MENU DE DIGITOS
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
            //-------------------------------------------------------------    
            //CALCULO TRES NUMEROS MAYOR A MENOR    
                
            case 3:
                int ordenback=0;// VUELVO AL MENU DE ORDEN
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
                //------------------------------------------------------
                //CODIGO PROMEDIO ESTUDIANTES
            case 4:
                int promedioback=0; // VUELVO AL MENU DE PROMEDIO
                
                do{
                  for(fila=0;fila<=5;fila++){
                  totalnota=0;
                  promedioalumno=0;
                  nota1=0;
                  numeroalumno=numeroalumno+1;
                  promedio[fila][0]=numeroalumno;
                  System.out.println("Ingrese 4 notas del estudiantes No. "+numeroalumno);
                      for(columna=1;columna<5;columna++){
                     promedio[fila][columna]=teclado.nextInt();
                     nota1=promedio[fila][columna];
                     totalnota=totalnota+nota1;
                     promedioalumno=(totalnota/4);
                     promedio[fila][5]=promedioalumno;
                      } 
                  }
                  
                  for(fila=0;fila<=5;fila++){    
                     System.out.println("");
                     for(columna=0;columna<=5;columna++){
                     System.out.print(promedio[fila][columna]+"  ");
                     
                     
                      }
                  }
                  
                }while(promedioback==1);
                break;
                
                
    }
        
        
    }while(MENU==1);   /// ME REPITE TODO EL PROCESO 
    }
    
}