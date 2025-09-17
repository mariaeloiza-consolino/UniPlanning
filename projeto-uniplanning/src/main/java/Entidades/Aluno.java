package Entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    public Integer id;
    public String nome;
    public String cpf;
    public String email;
    public String senha;

    @ManyToOne
    public Curso curso;

    @ManyToOne
    public Turma turma;
    
}
