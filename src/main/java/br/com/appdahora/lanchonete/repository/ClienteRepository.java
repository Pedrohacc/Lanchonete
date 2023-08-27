package br.com.appdahora.lanchonete.repository;

import br.com.appdahora.lanchonete.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClienteRepository {
    List<Cliente> findAll();
    Cliente findById(Long id);
    Cliente save(Cliente cliente);
    void deleteById(Long id);
}