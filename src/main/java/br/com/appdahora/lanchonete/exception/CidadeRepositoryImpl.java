package br.com.appdahora.lanchonete.exception;

import br.com.appdahora.lanchonete.model.Cidade;
import br.com.appdahora.lanchonete.model.Cliente;
import br.com.appdahora.lanchonete.repository.CidadeRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Component
public class CidadeRepositoryImpl  implements CidadeRepository {
    @PersistenceContext
    private EntityManager manager;
    @Override
    public List<Cidade> findAll() {
        return manager.createQuery("from Cidade",
                Cidade.class).getResultList();
    }

    @Override
    public Cidade findById(Long id) {

        return manager.find(Cidade.class, id);
    }

    @Override
    public Cidade save(Cidade cidade) {

        return manager.merge(cidade);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Cidade cidade = findById(id);
        manager.remove(cidade);
    }

}
