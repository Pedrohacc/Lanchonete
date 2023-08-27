package br.com.appdahora.lanchonete.service;

import br.com.appdahora.lanchonete.model.Cliente;
import br.com.appdahora.lanchonete.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void remover(Long clienteId) {
        clienteRepository.deleteById(clienteId);
    }
}
