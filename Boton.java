import java.util.ArrayList;

public class Boton {

    // ----------------------------------------------------------Propiedades----------------------------------------------------------
    public int numbtn; // Numero de boton de emisora
    public float emisora; // Numero de frecuencia (Depende de la emisora.)
    public float frecuencia; // Numero 1f = AM, Numero 2f = FM

    // ----------------------------------------------------------Métodos----------------------------------------------------------

    /**
     * Método que sintoniza la emisora que el usuario ha guardado en sus botones.
     * 
     * @param n/a
     * @return float
     * @author Marco Jurado
     **/
    public Boton(int btn) {
        frecuencia = 0f;
        emisora = 0f;
        numbtn = btn;
    }

    /**
     * Método que sintoniza la emisora que el usuario ha guardado en sus botones.
     * 
     * @param n/a
     * @return float
     * @author Marco Jurado
     **/
    public ArrayList<Float> Sintonizar() {

        ArrayList<Float> retorno = new ArrayList<Float>();

        float emi = getEmisora();
        float frec = getFrecuencia();

        retorno.add(emi);
        retorno.add(frec);

        return retorno;
    }

    /**
     * Método que sintoniza la emisora que el usuario ha guardado en sus botones.
     * 
     * @param ArrayList<float> listado con la info que guarda el boton.
     * @return void
     * @author Marco Jurado
     **/
    public void guardar(ArrayList<Float> data) {
        float emit = data.get(0);
        float frecu = data.get(1);
        setFrecuencia(frecu);
        setEmisora(emit);
    }

    // ----------------------------------------------------------Getters y
    // Setters----------------------------------------------------------

    /**
     * Métodos con la función de getters.
     * 
     * @param n/a
     * @return int
     * @author Alejandro Gomez
     **/

    public float getEmisora() {
        return emisora;
    }

    public float getFrecuencia() {
        return frecuencia;
    }

    public int getNumbtn() {
        return numbtn;
    }

    /**
     * Métodos con la función de setters.
     * 
     * @param int/float
     * @return int
     * @author Alejandro Gomez
     **/
    public void setEmisora(float emisora) {
        this.emisora = emisora;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public void setNumbtn(int numbtn) {
        this.numbtn = numbtn;
    }
}
