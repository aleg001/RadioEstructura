import java.util.Scanner;

public class Vista {

  Scanner scan = new Scanner(System.in);

  // ------------------------------------------------------ PROGRA DEFENSIVA
  // ------------------------------------------------------
  /**
   * Método para validar cualquier número ingresado.
   * 
   * @param Num String de un número para verificar lo ingresado.
   * @return Número convertido en int.
   * @author Marco Antonio y Alejandro Jose
   **/
  public int ValideNum(String Num) {
    int newNum = -1;
    try {
      newNum = Integer.parseInt(Num);
    } catch (NumberFormatException e) {
      System.out.println("\nError! Ingrese un número valido por favor");
    }

    return newNum;
  }

  // ------------------------------------------------------ METODOS
  // ------------------------------------------------------

  /**
   * Se muestra mensaje para encender la radio.
   * 
   * @param Num String de un número para verificar lo ingresado.
   * @return Número convertido en int.
   * @author Alejandro Jose
   **/

  public void MensajeEncender() {
    System.out.println("La radio se encendio");
  }

  public void MensajeApagar() {
    System.out.println("La radio se apago");
  }

  /**
   * Método para validar cualquier número ingresado.
   * 
   * @param Num String de un número para verificar lo ingresado.
   * @return Número convertido en int.
   * @author Alejandro Jose
   **/
  public int GuardarEmisora() {
    int EmisoraNum = 0;
    String NumEmi;
    boolean Valide = true;
    System.out.println("En que boton desea guardar la emisora?");
    while (Valide == true) {
      System.out.println("Ingrese numero de opcion: ");
      NumEmi = scan.nextLine();
      EmisoraNum = ValideNum(NumEmi);
      if (EmisoraNum != -1) {
        Valide = false;

      } else {
      }
    }

    return EmisoraNum;
  }

  // public int SeleccionarEmisora(){
  // return int emisoraSelec;
  // }

  /**
   * Método para validar cualquier número ingresado.
   * 
   * @param Num String de un número para verificar lo ingresado.
   * @return Número convertido en int.
   * @author Alejandro Jose
   **/
  public int MensajeAMFM() {
    String opcS;
    int retorno = 0;
    boolean Valide = true;

    System.out.println("Que emisora desea sintonizar?");
    System.out.println("1) AM" + "\n2) FM");

    Scanner scan = new Scanner(System.in);
    int ingreso = scan.nextInt();

    while (Valide == true) { // Validar el ingreso del usuario.
      System.out.println("Ingrese numero de opcion: ");
      opcS = scan.nextLine();
      retorno = ValideNum(opcS);
      if (retorno != -1) {
        Valide = false;

      } else {
      }
    }
    return retorno; // devuelve la seleccion

  }

  /**
   * Método mostrar las opciones del menu general al usuario y el decida que
   * accion realiza la radio.
   * 
   * @param n/a
   * @return Opcion del menu que el usuario selecciona
   * @author Marco Antonio
   **/
  public int MenuGeneral() {
    String opcS;
    int opc = 0;
    boolean Valide = true;
    // Opciones del menu
    System.out.println("\n\nMENU PRINCIPAL:\n" + "1) Prender Radio\n" + "2) Cambiar frecuencua AM/FM\n"
        + "3) Avanzar en el dial de las emisoras\n" + "4) Guardar emisora\n" + "5) Seleccionar emisora\n"
        + "6) Apagar el radio\n");
    while (Valide == true) { // Validar el ingreso del usuario.
      System.out.println("Ingrese numero de opcion: ");
      opcS = scan.nextLine();
      opc = ValideNum(opcS);
      if (opc != -1) {
        Valide = false;

      } else {
      }
    }
    return opc; // devuelve la seleccion
  }
}
