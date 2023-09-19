import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import exercicio1.OrdenaDecrescente;



public class TesteOrdenaDecrescente {
    OrdenaDecrescente test = new OrdenaDecrescente();
    private int vetor_test[] = test.Decrescente();

    @Test
    @DisplayName("Mesmo Tamanho: ")
    public void deveTerMesmoTamanho(){
        assertEquals(5,vetor_test.length);
    }

    @Test
    @DisplayName("Mesmo Numero Inicial: ")
    public void mesmoNumeroInicial(){
        assertEquals(8,vetor_test[0]);
    }

    @Test
    @DisplayName("Mesmo Numero Final: ")
    public void mesmoNumeroFinal(){
        assertEquals(1,vetor_test[4]);
    }
}
