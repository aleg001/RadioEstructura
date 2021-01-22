import java.util.Scanner;
import java.util.ArrayList;

/***************************************************************
 * Radio.java Autores: Marco Jurado y Alejandro Gómez Universidad del Valle de
 * Guatemala
 *
 * Fecha creacion: 18/01/21 Ultima modificacion: 21/01/21
 *
 * 
 ***************************************************************/

public class Radio implements Interface {
    public int opcionboton;
    public boolean salir;
    // Botones que posee la radio.
    public Boton btn1;
    public Boton btn2;
    public Boton btn3;
    public Boton btn4;
    public Boton btn5;
    public Boton btn6;
    public Boton btn7;
    public Boton btn8;
    public Boton btn9;
    public Boton btn10;
    public Boton btn11;
    public Boton btn12;

    // Estados de la radio.
    public static boolean ONOFF;
    public float DialAM;
    public float DialFM;
    public boolean Frecuencia;

    public int MultiploAM = 10;
    public float MultiploFM = 0.2f;

    public void MaxAM() {
        if (DialAM > 1611) {
            DialAM = 530;
        }
    }

    public void MaxFM() {
        if (DialFM > 107.9) {
            DialFM = 87.9f;
        }
    }

    public void MinAM() {
        if (DialAM < 530) {
            DialAM = 530;
        }
    }

    public void MinFM() {
        if (DialFM < 87.9) {
            DialFM = 87.9f;
        }
    }

    /**
     * Método constructor de Radio
     * 
     * @param n/a
     * @return Radio
     * @author Marco Jurado
     **/
    public Radio() {
        btn1 = new Boton(1);
        btn2 = new Boton(2);
        btn3 = new Boton(3);
        btn4 = new Boton(4);
        btn5 = new Boton(5);
        btn6 = new Boton(6);
        btn7 = new Boton(7);
        btn8 = new Boton(8);
        btn9 = new Boton(9);
        btn10 = new Boton(10);
        btn11 = new Boton(11);
        btn12 = new Boton(12);

        DialAM = 530f; // Multiplos de 10
        DialFM = 87.9f; // Multiplos de 0.2

        ONOFF = false; // False = OFF, True = ON
        Frecuencia = false; // False = AM, True = FM
    }

    /**
     * Método que actua como un switch para encender y apagar la radio
     * 
     * @param n/a
     * @return boolean
     * @author sección 30 Curso EDS
     **/
    public boolean encenderApagar() {
        boolean retorno = false;

        if (ONOFF == true) {
            retorno = false;
            ONOFF = false;
            System.out.println("Se ha apagado la radio");
        } else {
            retorno = true;
            ONOFF = true;
            System.out.println("Se ha encendido la radio");
        }

        return retorno;

    }

    /**
     * Método que actua como un switch para cambiar emisora
     * 
     * @param n/a
     * @return boolean
     * @author sección 30 Curso EDS
     **/
    public boolean amFM() {
        boolean retorno = false;
        if (ONOFF == false) {
            retorno = false;

        } else {
            if (Frecuencia == true) {
                // Esta en FM
                Frecuencia = false;
                retorno = true;
                System.out.println("  ---- Usted sintonizo frecuencia AM ----  ");
            } else {
                // Esta en AM
                Frecuencia = true;
                retorno = true;
                System.out.println(" ---- Usted sintonizo frecuencia FM ---- ");
            }
        }

        return retorno;
    }

    /**
     * Método que guarda la emisora que el usuario tiene sintonizada
     * 
     * @param int numero del boton en el que se desea guardar la radio.
     * @return String
     * @author sección 30 Curso EDS
     **/
    public String guardar(int btn) {

        String guardarEmi = "";
        String mensajeFrec = "";
        ArrayList<Float> datos = new ArrayList<Float>(); // Lista donde se guardan los datos que asigna el radio al
                                                         // momento de ejecutar guardar
        float freq = 0f;
        float emix = 0f;

        if (ONOFF == false) {
            System.out.println("La radio esta apagada. No se ha guardado exitosamente.");

        } else {
            if (btn == 1) {
                if (Frecuencia == true) {
                    // frecuencia esta en FM
                    freq = 2f;
                    emix = DialFM;
                    mensajeFrec = "FM";
                } else {
                    // Frecuencia esta en AM
                    freq = 1f;
                    emix = DialAM;
                    mensajeFrec = "AM";
                }

                datos.add(emix);
                datos.add(freq);
                btn1.guardar(datos);
                guardarEmi = " ----->  Se ha guardado exitosamente la emisora " + emix + " de la frecuencia "
                        + mensajeFrec + " en el boton 1";

            } else if (btn == 2) {
                if (Frecuencia == true) {
                    // frecuencia esta en FM
                    freq = 2f;
                    emix = DialFM;
                    mensajeFrec = "FM";
                } else {
                    // Frecuencia esta en AM
                    freq = 1f;
                    emix = DialAM;
                    mensajeFrec = "AM";
                }

                datos.add(emix);
                datos.add(freq);
                btn2.guardar(datos);
                guardarEmi = " ----->  Se ha guardado exitosamente la emisora " + emix + " de la frecuencia "
                        + mensajeFrec + "en el boton 2";
            } else if (btn == 3) {
                if (Frecuencia == true) {
                    // frecuencia esta en FM
                    freq = 2f;
                    emix = DialFM;
                    mensajeFrec = "FM";
                } else {
                    // Frecuencia esta en AM
                    freq = 1f;
                    emix = DialAM;
                    mensajeFrec = "AM";
                }

                datos.add(emix);
                datos.add(freq);
                btn3.guardar(datos);
                guardarEmi = " ----->  Se ha guardado exitosamente la emisora " + emix + " de la frecuencia "
                        + mensajeFrec + "en el boton 3";
            } else if (btn == 4) {
                if (Frecuencia == true) {
                    // frecuencia esta en FM
                    freq = 2f;
                    emix = DialFM;
                    mensajeFrec = "FM";
                } else {
                    // Frecuencia esta en AM
                    freq = 1f;
                    emix = DialAM;
                    mensajeFrec = "AM";
                }

                datos.add(emix);
                datos.add(freq);
                btn4.guardar(datos);
                guardarEmi = " ----->  Se ha guardado exitosamente la emisora " + emix + " de la frecuencia "
                        + mensajeFrec + "en el boton 4";
            } else if (btn == 5) {
                if (Frecuencia == true) {
                    // frecuencia esta en FM
                    freq = 2f;
                    emix = DialFM;
                    mensajeFrec = "FM";
                } else {
                    // Frecuencia esta en AM
                    freq = 1f;
                    emix = DialAM;
                    mensajeFrec = "AM";
                }

                datos.add(emix);
                datos.add(freq);
                btn5.guardar(datos);
                guardarEmi = " ----->  Se ha guardado exitosamente la emisora " + emix + " de la frecuencia "
                        + mensajeFrec + "en el boton 5";
            } else if (btn == 6) {
                if (Frecuencia == true) {
                    // frecuencia esta en FM
                    freq = 2f;
                    emix = DialFM;
                    mensajeFrec = "FM";
                } else {
                    // Frecuencia esta en AM
                    freq = 1f;
                    emix = DialAM;
                    mensajeFrec = "AM";
                }

                datos.add(emix);
                datos.add(freq);
                btn6.guardar(datos);
                guardarEmi = " ----->  Se ha guardado exitosamente la emisora " + emix + " de la frecuencia "
                        + mensajeFrec + "en el boton 6";
            } else if (btn == 7) {
                if (Frecuencia == true) {
                    // frecuencia esta en FM
                    freq = 2f;
                    emix = DialFM;
                    mensajeFrec = "FM";
                } else {
                    // Frecuencia esta en AM
                    freq = 1f;
                    emix = DialAM;
                    mensajeFrec = "AM";
                }

                datos.add(emix);
                datos.add(freq);
                btn7.guardar(datos);
                guardarEmi = " ----->  Se ha guardado exitosamente la emisora " + emix + " de la frecuencia "
                        + mensajeFrec + "en el boton 7";
            } else if (btn == 8) {
                if (Frecuencia == true) {
                    // frecuencia esta en FM
                    freq = 2f;
                    emix = DialFM;
                    mensajeFrec = "FM";
                } else {
                    // Frecuencia esta en AM
                    freq = 1f;
                    emix = DialAM;
                    mensajeFrec = "AM";
                }

                datos.add(emix);
                datos.add(freq);
                btn8.guardar(datos);
                guardarEmi = " ----->  Se ha guardado exitosamente la emisora " + emix + " de la frecuencia "
                        + mensajeFrec + "en el boton 8";
            } else if (btn == 9) {
                if (Frecuencia == true) {
                    // frecuencia esta en FM
                    freq = 2f;
                    emix = DialFM;
                    mensajeFrec = "FM";
                } else {
                    // Frecuencia esta en AM
                    freq = 1f;
                    emix = DialAM;
                    mensajeFrec = "AM";
                }

                datos.add(emix);
                datos.add(freq);
                btn9.guardar(datos);
                guardarEmi = " ----->  Se ha guardado exitosamente la emisora " + emix + " de la frecuencia "
                        + mensajeFrec + "en el boton 9";
            } else if (btn == 10) {
                if (Frecuencia == true) {
                    // frecuencia esta en FM
                    freq = 2f;
                    emix = DialFM;
                    mensajeFrec = "FM";
                } else {
                    // Frecuencia esta en AM
                    freq = 1f;
                    emix = DialAM;
                    mensajeFrec = "AM";
                }

                datos.add(emix);
                datos.add(freq);
                btn10.guardar(datos);
                guardarEmi = " ----->  Se ha guardado exitosamente la emisora " + emix + " de la frecuencia "
                        + mensajeFrec + "en el boton 10";
            } else if (btn == 11) {
                if (Frecuencia == true) {
                    // frecuencia esta en FM
                    freq = 2f;
                    emix = DialFM;
                    mensajeFrec = "FM";
                } else {
                    // Frecuencia esta en AM
                    freq = 1f;
                    emix = DialAM;
                    mensajeFrec = "AM";
                }

                datos.add(emix);
                datos.add(freq);
                btn11.guardar(datos);
                guardarEmi = " ----->  Se ha guardado exitosamente la emisora " + emix + " de la frecuencia "
                        + mensajeFrec + "en el boton 11";
            } else if (btn == 12) {
                if (Frecuencia == true) {
                    // frecuencia esta en FM
                    freq = 2f;
                    emix = DialFM;
                    mensajeFrec = "FM";
                } else {
                    // Frecuencia esta en AM
                    freq = 1f;
                    emix = DialAM;
                    mensajeFrec = "AM";
                }

                datos.add(emix);
                datos.add(freq);
                btn12.guardar(datos);
                guardarEmi = " ----->  Se ha guardado exitosamente la emisora " + emix + " de la frecuencia "
                        + mensajeFrec + "en el boton 12";
            }
        }

        return guardarEmi;
    }

    //////////////////////////////////////////////////////////////// Vista
    //////////////////////////////////////////////////////////////// ////////////////////////////////////////////////////////////////////////
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

    /*
     * 
     * Método para validar cualquier número ingresado.
     * 
     * @param Num String de un número para verificar lo ingresado.
     * 
     * @return Número convertido en int.
     * 
     * @author Alejandro Jose
     * 
     * public int GuardarEmisora() { int EmisoraNum = 0; String NumEmi; boolean
     * Valide = true; System.out.println("En que boton desea guardar la emisora?");
     * while (Valide == true) { System.out.println("Ingrese numero de opcion: ");
     * NumEmi = scan.nextLine(); EmisoraNum = ValideNum(NumEmi); if (EmisoraNum !=
     * -1) { Valide = false;
     * 
     * } else { } }
     * 
     * return EmisoraNum; }
     */

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
        String ingreso = "";

        System.out.println("Que emisora desea sintonizar?");
        System.out.println("1) AM" + "\n2) FM");

        ingreso += scan.nextLine();

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
        System.out.println("\n\nMENU PRINCIPAL:\n" + "1) Prender Radio\n" + "2) Cambiar frecuencia AM/FM\n"
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

    /**
     * Método que sintoniza la emisora que el usuario ha guardado en sus botones.
     * 
     * @param int numero del boton que se desea sintonizar.
     * @return String
     * @author sección 30 Curso EDS
     **/
    public String seleccionar(int btn) {
        String mensajeRetorno = "";
        if (ONOFF == false) {

        } else {
            // Segun la seleccion del usuario se utilizan los if para determinar cual boton
            // se presiono y sintonizar la emisora guardada en ese boton.
            if (btn == 1) {
                // Se almacena en boton 1

                ArrayList<Float> datos = btn1.Sintonizar();
                float emi1 = datos.get(0);
                float frec1 = datos.get(1);
                if (emi1 == 0f || frec1 == 0f) {
                    mensajeRetorno = "No hay emisora guardada en este boton todavia!";
                } else {
                    if (frec1 == 1f) {
                        // Sintoniza AM
                        Frecuencia = false;
                        DialAM = (int) emi1;
                        

                        mensajeRetorno = "Sintonizando la emisora " + DialAM + " en la frecuencia AM";
                      

                    } else if (frec1 == 2f) {
                        // Sintoniza FM
                        Frecuencia = true;
                        DialFM = emi1;
                        mensajeRetorno = "Sintonizando la emisora " + DialFM + " en la frecuencia FM";
                     
                    }

                }
            } else if (btn == 2) {
                // Se almacena en boton 2
                ArrayList<Float> data = btn2.Sintonizar();
                float emi2 = data.get(0);
                float frec2 = data.get(1);
                if (emi2 == 0f || frec2 == 0f) {
                    mensajeRetorno = "No hay emisora guardada en este boton todavia!";
                   
                } else {
                    if (frec2 == 1f) {
                        // Sintoniza AM
                        Frecuencia = false;
                        DialAM = (int) emi2;
                        mensajeRetorno = "Sintonizando la emisora " + DialAM + " en la frecuencia AM";
                     
                    } else if (frec2 == 2f) {
                        // Sintoniza FM
                        Frecuencia = true;
                        DialFM = (int) emi2;

                        mensajeRetorno = "Sintonizando la emisora " + DialFM + " en la frecuencia FM";
                       
                    }
                }
            } else if (btn == 3) {
                // se almacena en boton 3
                ArrayList<Float> data = btn3.Sintonizar();
                float emi3 = data.get(0);
                float frec3 = data.get(1);
                if (emi3 == 0f || frec3 == 0f) {
                    mensajeRetorno = "No hay emisora guardada en este boton todavia!";
                    System.out.println(mensajeRetorno);
                } else {
                    if (frec3 == 1f) {
                        // Sintoniza AM
                        Frecuencia = false;
                        DialAM = emi3;
                        mensajeRetorno = "Sintonizando la emisora " + DialAM + " en la frecuencia AM";
                    } else if (frec3 == 2f) {
                        // Sintoniza FM
                        Frecuencia = true;
                        DialFM = emi3;

                        mensajeRetorno = "Sintonizando la emisora " + DialFM + " en la frecuencia FM";
                    }
                }
            } else if (btn == 4) {
                // se almacena en boton 4
                ArrayList<Float> data = btn4.Sintonizar();
                float emi4 = data.get(0);
                float frec4 = data.get(1);
                if (emi4 == 0f || frec4 == 0f) {
                    mensajeRetorno = "No hay emisora guardada en este boton todavia!";
                    ;
                } else {
                    if (frec4 == 1f) {
                        // Sintoniza AM
                        Frecuencia = false;
                        DialAM = emi4;
                        mensajeRetorno = "Sintonizando la emisora " + DialAM + " en la frecuencia AM";
                    } else if (frec4 == 2f) {
                        // Sintoniza FM
                        Frecuencia = true;
                        DialFM = emi4;

                        mensajeRetorno = "Sintonizando la emisora " + DialFM + " en la frecuencia FM";
                    }
                }
            } else if (btn == 5) {
                // se almacena en boton 5
                ArrayList<Float> data = btn5.Sintonizar();
                float emi5 = data.get(0);
                float frec5 = data.get(1);
                if (emi5 == 0f || frec5 == 0f) {
                    mensajeRetorno = "No hay emisora guardada en este boton todavia!";
                } else {
                    if (frec5 == 1f) {
                        // Sintoniza AM
                        Frecuencia = false;
                        DialAM = emi5;
                        mensajeRetorno = "Sintonizando la emisora " + DialAM + " en la frecuencia AM";
                    } else if (frec5 == 2f) {
                        // Sintoniza FM
                        Frecuencia = true;
                        DialFM = emi5;

                        mensajeRetorno = "Sintonizando la emisora " + DialFM + " en la frecuencia FM";
                    }
                }
            } else if (btn == 6) {
                ArrayList<Float> data = btn6.Sintonizar();
                float emi6 = data.get(0);
                float frec6 = data.get(1);
                if (emi6 == 0f || frec6 == 0f) {
                    mensajeRetorno = "No hay emisora guardada en este boton todavia!";
                } else {
                    if (frec6 == 1f) {
                        // Sintoniza AM
                        Frecuencia = false;
                        DialAM = emi6;
                        mensajeRetorno = "Sintonizando la emisora " + DialAM + " en la frecuencia AM";
                    } else if (frec6 == 2f) {
                        // Sintoniza FM
                        Frecuencia = true;
                        DialFM = emi6;

                        mensajeRetorno = "Sintonizando la emisora " + DialFM + " en la frecuencia FM";
                    }
                }

            } else if (btn == 7) {
                // se almacena en boton 7
                ArrayList<Float> data = btn7.Sintonizar();
                float emi7 = data.get(0);
                float frec7 = data.get(1);
                if (emi7 == 0f || frec7 == 0f) {
                    mensajeRetorno = "No hay emisora guardada en este boton todavia!";
                } else {
                    if (frec7 == 1f) {
                        // Sintoniza AM
                        Frecuencia = false;
                        DialAM = emi7;
                        mensajeRetorno = "Sintonizando la emisora " + DialAM + " en la frecuencia AM";
                    } else if (frec7 == 2f) {
                        // Sintoniza FM
                        Frecuencia = true;
                        DialFM = emi7;

                        mensajeRetorno = "Sintonizando la emisora " + DialFM + " en la frecuencia FM";
                    }
                }
            } else if (btn == 8) {
                // se almacena en boton 8
                ArrayList<Float> data = btn8.Sintonizar();
                float emi8 = data.get(0);
                float frec8 = data.get(1);
                if (emi8 == 0f || frec8 == 0f) {
                    mensajeRetorno = "No hay emisora guardada en este boton todavia!";
                } else {
                    if (frec8 == 1f) {
                        // Sintoniza AM
                        Frecuencia = false;
                        DialAM = emi8;
                        mensajeRetorno = "Sintonizando la emisora " + DialAM + " en la frecuencia AM";
                    } else if (frec8 == 2f) {
                        // Sintoniza FM
                        Frecuencia = true;
                        DialFM = emi8;

                        mensajeRetorno = "Sintonizando la emisora " + DialFM + " en la frecuencia FM";
                    }
                }
            } else if (btn == 9) {
                // se almacena en boton 9
                ArrayList<Float> data = btn9.Sintonizar();
                float emi9 = data.get(0);
                float frec9 = data.get(1);
                if (emi9 == 0f || frec9 == 0f) {
                    mensajeRetorno = "No hay emisora guardada en este boton todavia!";

                } else {
                    if (frec9 == 1f) {
                        // Sintoniza AM
                        Frecuencia = false;
                        DialAM = emi9;
                        mensajeRetorno = "Sintonizando la emisora " + DialAM + " en la frecuencia AM";
                    } else if (frec9 == 2f) {
                        // Sintoniza FM
                        Frecuencia = true;
                        DialFM = emi9;

                        mensajeRetorno = "Sintonizando la emisora " + DialFM + " en la frecuencia FM";
                    }
                }
            } else if (btn == 10) {
                // se almacena en boton 10
                ArrayList<Float> data = btn10.Sintonizar();
                float emi10 = data.get(0);
                float frec10 = data.get(1);
                if (emi10 == 0f || frec10 == 0f) {
                    mensajeRetorno = "No hay emisora guardada en este boton todavia!";

                } else {
                    if (frec10 == 1f) {
                        // Sintoniza AM
                        Frecuencia = false;
                        DialAM = emi10;
                        mensajeRetorno = "Sintonizando la emisora " + DialAM + " en la frecuencia AM";
                    } else if (frec10 == 2f) {
                        // Sintoniza FM
                        Frecuencia = true;
                        DialFM = emi10;

                        mensajeRetorno = "Sintonizando la emisora " + DialFM + " en la frecuencia FM";
                    }
                }
            } else if (btn == 11) {
                // se almacena en boton 11
                ArrayList<Float> data = btn11.Sintonizar();
                float emi11 = data.get(0);
                float frec11 = data.get(1);
                if (emi11 == 0f || frec11 == 0f) {
                    mensajeRetorno = "No hay emisora guardada en este boton todavia!";
                } else {
                    if (frec11 == 1f) {
                        // Sintoniza AM
                        Frecuencia = false;
                        DialAM = emi11;
                        mensajeRetorno = "Sintonizando la emisora " + DialAM + " en la frecuencia AM";
                    } else if (frec11 == 2f) {
                        // Sintoniza FM
                        Frecuencia = true;
                        DialFM = emi11;

                        mensajeRetorno = "Sintonizando la emisora " + DialFM + " en la frecuencia FM";
                    }
                }
            } else if (btn == 12) {
                ArrayList<Float> data = btn12.Sintonizar();
                float emi12 = data.get(0);
                float frec12 = data.get(1);
                if (emi12 == 0f || frec12 == 0f) {
                    mensajeRetorno = "No hay emisora guardada en este boton todavia!";
                } else {
                    if (frec12 == 1f) {
                        // Sintoniza AM
                        Frecuencia = false;
                        DialAM = emi12;
                        mensajeRetorno = "Sintonizando la emisora " + DialAM + " en la frecuencia AM";
                    } else if (frec12 == 2f) {
                        // Sintoniza FM
                        Frecuencia = true;
                        DialFM = emi12;

                        mensajeRetorno = "Sintonizando la emisora " + DialFM + " en la frecuencia FM";
                    }
                }
            }
        }
        return mensajeRetorno;
    }

    /**
     * Método que permite avanzar la emisora la cual se está usando
     * 
     * @param n/a
     * @return Double
     * @author sección 30 Curso EDS
     **/
    public Double avanzar() {
        Double retornoavanzar = 0.0;
        if (ONOFF == false) {
            System.out.println("La radio esta apagada.");

        } else {

            System.out.println("*ZZzzzZ*  Avanzando...");

            if (Frecuencia == true) {
                // Avanza en Frecuencia FM
                DialFM += 0.2f;
                double DialFM1 = DialFM;
                retornoavanzar = DialFM1;
                if (DialFM > 107.9) {
                    System.out.println(" * Bzzzzz *");
                    DialFM = 87.9f;

                }
                System.out.println("Usted ha avanzado a la emisora " + retornoavanzar);

            } else {
                // Avanza en Frecuencia AM
                DialAM += 10f;
                double DialAM1 = DialAM;
                retornoavanzar = DialAM1;
                if (DialAM > 1610) {
                    System.out.println("* Bzzzzz *");
                    DialAM = 530f;
                }
                System.out.println("Usted ha avanzado a la emisora " + retornoavanzar);

            }
        }
        return retornoavanzar;

    }

}