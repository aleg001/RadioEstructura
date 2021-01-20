import java.util.Scanner;

/***************************************************************
* FuncionRadio.java
* Autores: Marco Jurado y Alejandro Gómez
* Universidad del Valle de Guatemala
*
* Fecha creacion: 18/01/21
* Ultima modificacion: 21/01/21
*
* 
***************************************************************/

public class FuncionRadio {
    

    public Radio = new Radio(); //Instancia de Radio



    //////////////////////////////////////////////////////////////// Vista ////////////////////////////////////////////////////////////////////////
    Scanner scan = new Scanner(System.in);
    //------------------------------------------------------ PROGRA DEFENSIVA ------------------------------------------------------
    /**
   * Método para validar cualquier número ingresado.
   * @param Num String de un número para verificar lo ingresado.
   * @return Número convertido en int.
   * @author Marco Antonio y Alejandro Jose
  **/  
    public int ValideNum ( String Num ) {
        int newNum = -1;
        try {
           newNum = Integer.parseInt(Num);
        }
        catch ( NumberFormatException e )
        {
           System.out.println( "\nError! Ingrese un número valido por favor" );
        }
        
        return newNum;
      } 

    // ------------------------------------------------------ METODOS ------------------------------------------------------

    /**
   * Se muestra mensaje para encender la radio.
   * @param Num String de un número para verificar lo ingresado.
   * @return Número convertido en int.
   * @author Alejandro Jose
  **/  

    public void MensajeEncender(){ 
        System.out.println("La radio se encendio");
    }
    
    public void MensajeApagar(){ 
        System.out.println("La radio se apago");
    }


  

    /**
   * Método para validar cualquier número ingresado.
   * @param Num String de un número para verificar lo ingresado.
   * @return Número convertido en int.
   * @author  Alejandro Jose
    **/  
    public int GuardarEmisora(){
        int EmisoraNum;
        String NumEmi;
        boolean Valide = true;
        System.out.println("En que boton desea guardar la emisora?");
        while(Valide == true){
            System.out.println("Ingrese numero de opcion: ");
            NumEmi = scan.nextLine();
            EmisoraNum = ValideNum( NumEmi );
            if(EmisoraNum != -1 ){
              Valide = false;
     
            }
            else{}
          }

        return EmisoraNum;
    }

    public int SeleccionarEmisora(){
        
    }

    /**
     * Método para validar cualquier número ingresado.
     * @param Num String de un número para verificar lo ingresado.
     * @return Número convertido en int.
     * @author Alejandro Jose
    **/  
    public int MensajeAMFM(){ 
        String opcS; 
        int retorno = 0;
        boolean Valide = true;
        
        System.out.println("Que emisora desea sintonizar?");
        System.out.println("1) AM"+"\n2) FM");

        String ingreso = scan.nextLine();

        while(Valide == true){ //Validar el ingreso del usuario.
            System.out.println("Ingrese numero de opcion: ");
            opcS = scan.nextLine();
            retorno = ValideNum( opcS );
            if( retorno != -1 ){
              Valide = false;
     
            }
            else{}
          }
          return retorno; //devuelve la seleccion
   
    }
    
    public void BotonesVisual(){
        System.out.println("Elige el boton de radio a seleccionar");
        System.out.println("1 2 3 4 5 6 7 8 9 10 11 12");
    }

    /**
     * Método mostrar las opciones del menu general al usuario y el decida que accion realiza la radio.
     * @param n/a
     * @return Opcion del menu que el usuario selecciona
     * @author Marco Antonio
     **/
    public int MenuGeneral(){
        String opcS;
        int opc = 0;
        boolean Valide = true;
        //Opciones del menu
        System.out.println(
          "\n\nMENU PRINCIPAL:\n"+
          "1) Prender Radio\n" +
          "2) Cambiar frecuencua AM/FM\n"+
          "3) Avanzar en el dial de las emisoras\n"+
          "4) Guardar emisora\n"+
          "5) Seleccionar emisora\n"+
          "6) Apagar el radio\n"
        );
        while(Valide == true){ //Validar el ingreso del usuario.
          System.out.println("Ingrese numero de opcion: ");
          opcS = scan.nextLine();
          opc = ValideNum( opcS );
          if( opc != -1 ){
            Valide = false;
   
          }
          else{}
        }
        return opc; //devuelve la seleccion
      }}

      ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public static void main (String[] args) {

        while(salir == false){
            //Ciclo principal donde se ejecuta el programa

        int opcionmenu = MenuGeneral(); //Selección del usuario
        if(opcionmenu == 1){
                //Encender radio
                Radio.encenderApagar();
                
        }
        else if(opcionmenu == 2){
            // Cambiar Emisora

        }else if(opcionmenu == 3){
            //Opcion para guardar emisora

        }else if(opcionmenu == 4){
            //Seleccionar emisora en un boton
            BotonesVisual();
            int EmisoraNum = scan.nextLine();
            
        }else if(opcionmenu == 5){
            
            //Opcion para apagar radio
        }else if(opcionmenu == 6){









        
    }