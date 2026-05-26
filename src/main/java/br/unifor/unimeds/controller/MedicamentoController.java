package br.unifor.unimeds.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.unifor.unimeds.model.Medicamento;


@RestController
public class MedicamentoController {
    private ArrayList<Medicamento> medicamentos = new ArrayList<>(Arrays.asList(
            new Medicamento(0, "Rivotril", 7),
            new Medicamento(1, "VitaC", 30)
    ));

    @GetMapping("/medicamentos")
    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }
    
}