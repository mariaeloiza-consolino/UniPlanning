package Entidades;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Turma extends PanacheEntityBase{
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer id;

    public String nome;
   
} 