package br.com.appdahora.lanchonete.repository;

import br.com.appdahora.lanchonete.model.Estado;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstadoRepository {
    List<Estado> findAll();
    Estado findById(Long id);
    Estado save(Estado estado);
    void deleteById(Long id);
}