package Entidades;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Professor extends PanacheEntityBase{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    public Integer id;
    public String nome;
    public String cpf;
    public String email;
    public String senha;
}
