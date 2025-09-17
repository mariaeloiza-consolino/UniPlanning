package Entidades;

import javax.annotation.processing.Generated;

import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; 
import jakarta.persistence.ManyToOne; 

@Entity 

public class Disciplina { 
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    public Integer id; 
    
    public String nome; 

    @ManyToOne 
    public Professor professor; 
}