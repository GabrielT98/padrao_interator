import org.example.Loja;
import org.example.Produto;
import org.example.ProdutoInfo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class ProdutoInfoTest {
    @Test
    void deveContarTotalAlunosCurso() {
        Loja loja = new Loja(
                new Produto("Blusa Reserva", 10.00),
                new Produto("Blusa Glue", 100.00),
                new Produto("Blusa BRW", 150.00),
                new Produto("Calça Reserva", 157.00),
                new Produto("Casaco Reserva", 180.00),
                new Produto("Blusa TeD", 110.00)
        );
        assertEquals(6, ProdutoInfo.contarTotalProdutoLoja(loja));
    }
}
