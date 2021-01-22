import java.util.Scanner;

/***************************************************************
 * FuncionRadio.java Autores: Marco Jurado y Alejandro Gómez Universidad del
 * Valle de Guatemala
 *
 * Fecha creacion: 18/01/21 Ultima modificacion: 21/01/21
 *
 * 
 ***************************************************************/

public class FuncionRadio {
  public static void main(String[] args) {

    Radio R = new Radio(); // Instancia de Radio
    Scanner scan = new Scanner(System.in);

    boolean salir = false;
    while (salir == false) {
      // Ciclo principal donde se ejecuta el programa

      // ------------------------------ Menu -----------------------------------
      String opcS;
      int opc = 0;
      boolean Valide1 = true;
      int opcionmenu = 0;
      // Opciones del menu
      System.out.println("\n\nMENU PRINCIPAL:\n" + "1) Switch encender/apagar Radio\n" + "2) Cambiar frecuencua AM/FM\n"
          + "3) Avanzar en el dial de las emisoras\n" + "4) Guardar emisora\n" + "5) Seleccionar emisora\n"
          + "6) Salir del programa\n");

      while (Valide1 == true) { // Validar el ingreso del usuario en el menu.
        System.out.println("Ingrese numero de opcion: ");
        opcS = scan.nextLine();
        int newNume = -1;
        try {
          newNume = Integer.parseInt(opcS);
        } catch (NumberFormatException e) {
          System.out.println("\nError! Ingrese un número valido por favor");
        }

        if (newNume != -1) {
          Valide1 = false;
          opcionmenu = newNume;

        } else {
        }
      }

      if (opcionmenu == 1) {
        // Encender radio
        R.encenderApagar();
        System.out.println("* Click! *  Has activado el switch.");

      } else if (opcionmenu == 2) {
        // Cambiar Emisora
        boolean cambioAMFM = R.amFM();
        if (cambioAMFM == false) {
          System.out.println("La radio esta apagada");
        } else {
        }

      } else if (opcionmenu == 3) {
        R.avanzar();

      } else if (opcionmenu == 4) {
        // Opcion para guardar emisora

        // ingreso del usuario
        int EmisoraNum = 0;
        String NumEmi;
        boolean Valide = true;

        boolean frango4 = false;
        while (frango4 == false) {

          System.out.println("En que boton desea guardar la emisora?");
          while (Valide == true) {
            System.out.println("Ingrese numero de opcion: ");
            NumEmi = scan.nextLine();
            int newNum = -1;

            // Valida el ingreso del usuario.
            try {
              newNum = Integer.parseInt(NumEmi);
            } catch (NumberFormatException e) {
              System.out.println("\nError! Ingrese un número valido por favor");
            }

            if (EmisoraNum != -1) {
              Valide = false;
              EmisoraNum = newNum;

            } else {
            }
          }

          if(EmisoraNum > 12 || EmisoraNum < 1){
            frango4 = false;
          }else {
            frango4 = true;
          }
        }
        // accion de guardar por parte de la radio.
        String accionG = R.guardar(EmisoraNum);
        System.out.println(accionG);

      } else if (opcionmenu == 5) {
        // Seleccionar emisora en un boton
        System.out.println("Elige el boton de radio a seleccionar");
        System.out.println("1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12");
        int emisoraguarda = 0;

        boolean frango5 = false;
        while (frango5 == false) {
          System.out.println("Ingrese numero de opcion: ");
          String EmisoraNumerito = scan.nextLine();
          int newNumers = -1;
          try {
            newNumers = Integer.parseInt(EmisoraNumerito);
          } catch (NumberFormatException e) {
            System.out.println("\nError! Ingrese un número valido por favor");
          }

          if (newNumers != -1) {
            Valide1 = false;
            emisoraguarda = newNumers;

          } else {
          }

          if (emisoraguarda > 12 || emisoraguarda < 1) {
            frango5 = false;
          } else {
            frango5 = true; // Numero dentro de rango. Correcto. Sigue la vida.
          }
        }

        System.out.println(R.seleccionar(emisoraguarda));

        // Opcion para apagar radio
      } else if (opcionmenu == 6) {

        System.out.println("Grasias por probar esta interesante radio. salu2");
        break;

      } else {
        System.out.println("Opción no valida. Intente nuevamente ingresando numeros dentro del rango.");
      }
    }
  }
}