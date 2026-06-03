package br.unifor.unimeds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unifor.unimeds.model.Medicamento;
import br.unifor.unimeds.repository.MedicamentoRepository;
@Service
public class MedicamentoService {
    @Autowired
    private MedicamentoRepository repository;
    
    public List<Medicamento> recuperarMedicamentos() {
        return repository.findAll();
    }

    public void salvar(Medicamento novo) {
        repository.save(novo);
    }
    
}
