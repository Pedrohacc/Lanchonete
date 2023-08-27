package br.com.appdahora.lanchonete.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;




@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Cidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @ManyToOne
    @JoinColumn(nullable = false)
    private Estado estado;


}
