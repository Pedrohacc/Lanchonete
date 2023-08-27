package br.com.appdahora.lanchonete.service;


import br.com.appdahora.lanchonete.model.Cidade;
import br.com.appdahora.lanchonete.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CadastroCidadeService {
    @Autowired
    private CidadeRepository cidadeRepository ;

    public Cidade salvar(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    public void remover(Long cidadeId) {
        cidadeRepository.deleteById(cidadeId);
    }

}
