package Entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
@Transactional
public class AlunoTests {
    @Test
    public void testSalvarUmAluno() {
        Aluno aluno = new Aluno();
        aluno.nome = "Fernanda Lima";
        aluno.cpf = "999.888.777-66";
        aluno.email = "fernanda.lima@gmail.com";
        aluno.senha = "senha987";

        aluno.curso = Curso.findById(1);   
        aluno.turma = Turma.findById(1);   

        aluno.persist();

        
        Assertions.assertEquals(6, aluno.id);
    }
}