package Entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
@Transactional
public class TurmaTests {

    @Test
    public void testSalvarUmaTurma() {
        Turma turma = new Turma();
        turma.nome = "3º Ano B";

        turma.persist();
        Assertions.assertEquals(6, turma.id);
    }
}