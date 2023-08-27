package br.com.appdahora.lanchonete.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

public abstract class Pessoa {
    protected String nome;
    @EqualsAndHashCode.Include
    protected String cpf;
    protected String telefone;
    protected String email;
    protected LocalDate dataNascimento;
}
