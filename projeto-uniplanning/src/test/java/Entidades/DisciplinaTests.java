package Entidades;

import org.junit.jupiter.api.Test;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import jakarta.transaction.Transactional;

@QuarkusTest
public class DisciplinaTests {
@Test
@Transactional
public void testSalvaUmaDisciplina() {
    Disciplina disciplina = new Disciplina();
    disciplina.nome = "Matemática";
    disciplina.professor = Professor.findById(1);
    disciplina.persist();

        Assertions.assertEquals(disciplina.id,1);
    }

}
