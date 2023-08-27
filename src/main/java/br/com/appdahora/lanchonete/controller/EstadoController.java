package br.com.appdahora.lanchonete.controller;

import br.com.appdahora.lanchonete.model.Cidade;
import br.com.appdahora.lanchonete.model.Estado;
import br.com.appdahora.lanchonete.repository.CidadeRepository;
import br.com.appdahora.lanchonete.repository.EstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/estados")
public class EstadoController {

        @Autowired
        private EstadoRepository estadoRepository;

        @GetMapping
        public List<Estado> listar() {
            return estadoRepository.findAll();
        }

        @GetMapping("/{estadoId}")
        public Estado buscar(@PathVariable Long estadoId) {

            return estadoRepository.findById(estadoId);
        }

        @DeleteMapping("/{estadoId}")
        @ResponseStatus(HttpStatus.NO_CONTENT)
        public void remover(@PathVariable Long estadoId) {
            estadoRepository.deleteById(estadoId); // Chamar o método deleteById do repositór
        }





}
