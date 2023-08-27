package br.com.appdahora.lanchonete.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity //indica que a classe vai virar uma tabela
public class Cliente extends Pessoa{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public String toString(){
        return this.nome;

   }

}
