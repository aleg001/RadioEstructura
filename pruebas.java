import static org.junit.Assert.*;
import org.junit.*;
public class pruebas {
    Radio r = new Radio();
    @Test
    public void test(){
        r.guardar(15);
        Assertsequals(true,true); 
        
    }

}
