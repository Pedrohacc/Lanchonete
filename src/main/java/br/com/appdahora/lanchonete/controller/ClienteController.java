package br.com.appdahora.lanchonete.controller;

import br.com.appdahora.lanchonete.model.Cliente;
import br.com.appdahora.lanchonete.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping
    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    @GetMapping("/{clienteId}")
    public Cliente buscar(@PathVariable Long clienteId) {
        return clienteRepository.findById(clienteId);
    }

    @DeleteMapping("/{clienteId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long clienteId) {
        clienteRepository.deleteById(clienteId); // Chamar o método deleteById do repositór
    }
}
