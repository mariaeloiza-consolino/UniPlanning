package Entidades;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;

@QuarkusTest
public class PlannerTests {
    @Test
    @Transactional
    public void testCriaUmPlanner() {

    Planner planner = new Planner();
    planner.prioridades = "Alta";
    planner.agenda = java.time.LocalDateTime.of(2025, 9, 20, 9, 0, 0);
    planner.tarefas = "Estudar para a prova de Cálculo e entregar o resumo de História.";
    planner.aluno = Aluno.findById(1);

    planner.persist();

    Assertions.assertEquals(6, planner.id);
    }
}