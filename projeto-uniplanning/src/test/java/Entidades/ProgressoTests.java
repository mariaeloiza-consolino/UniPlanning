package Entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
@Transactional
public class ProgressoTests {
    @Test
    public void testSalvarUmProgresso() {
        Progresso progresso = new Progresso();
        progresso.disciplina = Disciplina.findById(4);
        progresso.aluno = Aluno.findById(3);
        progresso.persist();

        Assertions.assertEquals(6, progresso.id);
    }
}