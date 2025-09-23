package Entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
public class ProfessorTest {
    @Test
    @Transactional

    public void AdicionarDadosNovoProfessor(){
        Professor professor = new Professor();

        professor.nome = "Carlos Torres";
        professor.cpf = "075.325.983-12";
        professor.email = "carlos.torres@gmail.com";
        professor.senha = "carlos@0125";

        professor.persist();

        Assertions.assertEquals(6, professor.id);
    }

}
