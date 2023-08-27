package br.com.appdahora.lanchonete.repository;
import br.com.appdahora.lanchonete.model.Cidade;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CidadeRepository{
    List<Cidade> findAll();
    Cidade findById(Long id);
    Cidade save(Cidade cidade);
    void deleteById(Long id);

}
