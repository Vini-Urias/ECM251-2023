import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.SortedMap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import exemplo.Calculadora;


public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    @Test
    @DisplayName("Soma: ")
    public void deveSomarIntteiros(){
        assertEquals(2,calc.soma(1,1));
    }   
}
