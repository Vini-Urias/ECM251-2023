import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import retangulo.Retangulo;

public class RetanguloTest {
    Retangulo test = new Retangulo();
    private int base_test = 3;
    private int altura_test = 2;

    @Test
    @DisplayName("Teste da Area: ")
    public void testArea(){
        assertEquals(6,test.calcularArea(base_test, altura_test));
    }

    @Test
    @DisplayName("Teste da Area: ")
    public void testPerimetro(){
        assertEquals(10,test.calcularPerimetro(base_test, altura_test));
    }
}
