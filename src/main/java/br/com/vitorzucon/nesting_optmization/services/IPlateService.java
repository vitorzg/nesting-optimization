package br.com.vitorzucon.nesting_optmization.services;

import br.com.vitorzucon.nesting_optmization.models.Plate;

import java.util.List;
import java.util.Optional;

public interface IPlateService {
    List<Plate> findAll();
    Optional<Plate> findById(Long id);
    Plate save(Plate plate);
    void deleteById(Long id);
}
