package Entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.time.LocalDateTime;


@Entity
public class Planner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    public String prioridades;
    public LocalDateTime agenda;
    public String tarefas;

    @ManyToOne
    public Aluno aluno;

}

