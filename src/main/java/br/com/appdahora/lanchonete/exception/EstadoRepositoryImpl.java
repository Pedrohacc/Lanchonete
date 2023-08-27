package br.com.appdahora.lanchonete.exception;

import br.com.appdahora.lanchonete.model.Cliente;
import br.com.appdahora.lanchonete.model.Estado;
import br.com.appdahora.lanchonete.repository.EstadoRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EstadoRepositoryImpl implements EstadoRepository {
    @PersistenceContext
    private EntityManager manager;
    @Override
    public List<Estado> findAll() {
        return manager.createQuery("from Estado",
                Estado.class).getResultList();
    }


    @Override
    public Estado findById(Long id) {

        return manager.find(Estado.class, id);
    }

    @Override
    public Estado save(Estado estado) {

        return manager.merge(estado);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Estado estado = findById(id);
        manager.remove(estado);
    }
}
