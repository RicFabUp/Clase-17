package pa.gob.dntic.ejemplo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTests {
    @Test
    void suma_dos_numeros(){
        assertEquals(5, new Calculadora().sumar(2,3));
    }
}
