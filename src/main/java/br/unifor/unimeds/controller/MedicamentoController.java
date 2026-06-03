package br.unifor.unimeds.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.unifor.unimeds.model.Medicamento;
import br.unifor.unimeds.service.MedicamentoService;

@RestController
public class MedicamentoController {
    @Autowired
    private MedicamentoService service;

    @GetMapping("/medicamentos")
    public List<Medicamento> listarMedicamentos() {
        return service.recuperarMedicamentos();
    }

    @PostMapping("/medicamentos")
    public void criarMedicamento(@RequestBody Medicamento novo) {
        service.salvar(novo);
    }
    
}