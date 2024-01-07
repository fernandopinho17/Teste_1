import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testFiltrarApenasMulheres() {
        // Cria uma lista de pessoas apenas com mulheres
        java.util.List<Pessoa> mulheres = new ArrayList<>();
        mulheres.add(new Pessoa("Maria", "F"));
        mulheres.add(new Pessoa("Ana", "F"));

        // Chama o método de filtro de mulheres
        List<Pessoa> mulheresFiltradas = Main.filtrarMulheres(mulheres);

        // Verifica se todas as pessoas na lista filtrada são mulheres
        assertTrue(mulheresFiltradas.stream().allMatch(pessoa -> pessoa.sexo.equalsIgnoreCase("F")));
    }
}
