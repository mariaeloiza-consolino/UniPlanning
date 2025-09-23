package Entidades;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class CursoTests {
@Test
@Transactional
    public void testSalvaUmCurso() {
        Curso curso = new Curso();
        curso.nome = "Matemática Básica";

        curso.turma = Turma.findById(1);
        curso.disciplina = Disciplina.findById(1);
    
        curso.persist();

        Assertions.assertEquals(6, curso.id);
    }
}