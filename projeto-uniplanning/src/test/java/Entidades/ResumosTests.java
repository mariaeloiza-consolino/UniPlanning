package Entidades;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;

@QuarkusTest
public class ResumosTests {
    @Test
    @Transactional
    public void testSalvaUmResumo() {
        Resumos resumo = new Resumos();
        resumo.nome = "Resumo de Cálculo Diferencial";
        resumo.aluno = Aluno.findById(1);

        resumo.persist();

        Assertions.assertEquals(6, resumo.id);
    }
}