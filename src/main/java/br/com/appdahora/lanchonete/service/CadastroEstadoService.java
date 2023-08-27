package br.com.appdahora.lanchonete.service;

import br.com.appdahora.lanchonete.exception.EntidadeNaoEncontradaException;
import br.com.appdahora.lanchonete.model.Cidade;
import br.com.appdahora.lanchonete.model.Estado;
import br.com.appdahora.lanchonete.repository.CidadeRepository;
import br.com.appdahora.lanchonete.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

@Service
public class CadastroEstadoService {

    @Autowired
    private EstadoRepository estadoRepository ;

    public Estado salvar(Estado estado) {
        return estadoRepository.save(estado);
    }

    public void remover(Long estadoId) {
        try {
            estadoRepository.deleteById(estadoId);
        } catch (EmptyResultDataAccessException e) {
            throw new EntidadeNaoEncontradaException(
                    String.format("Não existe um cadastro" +
                            "de estado com código %d", estadoId));
        }
    }
}
