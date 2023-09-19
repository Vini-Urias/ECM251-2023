import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import checksum.Checksum;


public class ChecksumTest {
    Checksum test = new Checksum();
    String msg_test = test.Complemento2();
    
    @Test
    @DisplayName("Mesangens Iguais: ")
    public void deveSerIgual(){
        assertEquals("Casa1W", msg_test);
    }
}
