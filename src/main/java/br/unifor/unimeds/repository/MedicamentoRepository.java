package br.unifor.unimeds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unifor.unimeds.model.Medicamento;
@Repository
public interface MedicamentoRepository extends JpaRepository<Medicamento, Integer>  {
    
}
