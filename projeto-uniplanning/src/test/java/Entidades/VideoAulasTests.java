package Entidades;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;
import jakarta.transaction.Transactional;

@QuarkusTest
@Transactional
public class VideoAulasTests {
    @Test
    public void testSalvarUmaVideoAula() {
        VideoAulas videoAula = new VideoAulas();
        videoAula.titulo = "Introdução à crase";
        videoAula.curso = Curso.findById(5);
        videoAula.turma = Turma.findById(3);
        videoAula.professor = Professor.findById(6);
        videoAula.persist();

        Assertions.assertEquals(6, videoAula.id);
    }
}
