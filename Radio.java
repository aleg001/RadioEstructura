import java.util.Scanner;

/***************************************************************
* Radio.java
* Autores: Marco Jurado y Alejandro Gómez
* Universidad del Valle de Guatemala
*
* Fecha creacion: 18/01/21
* Ultima modificacion: 21/01/21
*
* 
***************************************************************/

public class Radio implements Interface {
    public int opcionboton;
    public boolean salir;
    //Botones que posee la radio.
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
    
    //Estados de la radio. 
    public boolean ONOFF;
    public int DialAM;
    public float DialFM;
    public boolean Emisora;


    
    public int MultiploAM = 10;
    public float MultiploFM = 0.2f;

    public void MaxAM(){
        if(DialAM > 1611){
            DialAM = 530;
        }
    }
    public void MaxFM(){
        if(DialFM > 107.9){
            DialFM = 87.9f;
        }
    }
    public void MinAM(){
        if(DialAM < 530){
            DialAM = 530;
        }
    }
    public void MinFM(){
        if(DialFM < 87.9){
            DialFM = 87.9f;
        }
    }


    /**
     * Método constructor de Radio
     * @param n/a
     * @return Radio
     * @author Marco Jurado 
     **/    
    public Radio(){
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

        DialAM = 530; //Multiplos de 10
        DialFM = 87.9f; //Multiplos de 0.2
        
        ONOFF = false; //False = OFF, True = ON
        Emisora = false; // False = AM, True = FM
    }
    
    /**
     * Método que actua como un switch para encender y apagar la radio
     * @param n/a
     * @return boolean
     * @author sección 30 Curso EDS
     **/    
    public boolean encenderApagar(){
        if(ONOFF == true){
            ONOFF = false;
        }else{
            ONOFF = true;
        }

    }
    
    /**
     * Método que actua como un switch para cambiar emisora
     * @param n/a
     * @return boolean
     * @author sección 30 Curso EDS
     **/
    public boolean amFM(){
        if(Emisora == true){
            Emisora = false;
        }else{
            Emisora = true;
        }
    }

    /**
     * Método que guarda la emisora que el usuario tiene sintonizada 
     * @param int numero del boton en el que se desea guardar la radio.
     * @return String
     * @author sección 30 Curso EDS
     **/
    public String guardar(int btn){
        if(btn == 1){
            
        }else if (btn == 2){

        }
        else if (btn == 3){

        }
        else if (btn == 4){

        }
        else if (btn == 5){

        }
        else if (btn == 6){

        }
        else if (btn == 7){

        }
        else if (btn == 8){

        }
        else if (btn == 9){

        }
        else if (btn == 10){

        }
        else if (btn == 11){

        }
        else if (btn == 12){

        }
    }

    /**
     * Método que sintoniza la emisora que el usuario ha guardado en sus botones. 
     * @param int numero del boton que se desea sintonizar.
     * @return String
     * @author sección 30 Curso EDS
     **/
    public String seleccionar(int btn){
        //Segun la seleccion del usuario se utilizan los if para determinar cual boton se presiono y sintonizar la emisora guardada en ese boton. 
        if(btn == 1){
            //Se almacena en boton 1
    
                float emit = btn1.Sintonizar();
                if(emit ==0){
                    System.out.println("No hay emisora guardada en este boton todavia!");
                }
            }        
            else if(btn == 2){
            //Se almacena en boton 2   
                float emit2 = btn2.Sintonizar();
                if(emit2 ==0){
                    System.out.println("No hay emisora guardada en este boton todavia!");
                } 
            }
            else if(btn == 3){
            //se almacena en boton 3
                float emit3 = btn3.Sintonizar();
                if(emit3 ==0){
                    System.out.println("No hay emisora guardada en este boton todavia!");
                }     
            }
            else if(btn == 4){
             //se almacena en boton 4   
                float emit4 = btn4.Sintonizar();
                if(emit4 ==0){
                    System.out.println("No hay emisora guardada en este boton todavia!");
                }
            }
            else if(btn == 5){
            //se almacena en boton 5
                float emit5 = btn5.Sintonizar();
                if(emit5 ==0){
                    System.out.println("No hay emisora guardada en este boton todavia!");
                }
            }
            else if(btn == 6){
            //se almacena en boton 6 
            float emit6 = btn6.Sintonizar();
            if(emit6 ==0){
                System.out.println("No hay emisora guardada en este boton todavia!");
            }
               
            }
            else if(btn == 7){
            //se almacena en boton 7
            float emit7 = btn7.Sintonizar();
            if(emit7 ==0){
                System.out.println("No hay emisora guardada en este boton todavia!");
                }
            }
            else if(btn == 8){
            //se almacena en boton 8
            float emit8 = btn8.Sintonizar();
            if(emit8 ==0){
                System.out.println("No hay emisora guardada en este boton todavia!");
                }
            }
            else if(btn == 9){
            //se almacena en boton 9
            float emit9 = btn9.Sintonizar();
            if(emit9 ==0){
                System.out.println("No hay emisora guardada en este boton todavia!");
                
            }}
            else if(btn == 10){
            //se almacena en boton 10
            float emit10 = btn10.Sintonizar();
            if(emit10 ==0){
                System.out.println("No hay emisora guardada en este boton todavia!");
                
            }}
            else if(btn == 11){
            //se almacena en boton 11
                float emit11 = btn11.Sintonizar();
                 if(emit11 ==0){
                System.out.println("No hay emisora guardada en este boton todavia!");
                 }
            }
            else if(btn == 12){
                //se almacena en boton 12
                float emit12 = btn12.Sintonizar();
                if(emit12 ==0){
                    System.out.println("No hay emisora guardada en este boton todavia!");
                }
            }
    }
    
    /**
     * Método que permite avanzar la emisora la cual se está usando 
     * @param n/a
     * @return Double
     * @author sección 30 Curso EDS
     **/
    public Double avanzar(){

    }


    

}