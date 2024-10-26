package br.com.vitorzucon.nesting_optmization.services;

import br.com.vitorzucon.nesting_optmization.models.Plate;
import br.com.vitorzucon.nesting_optmization.repositories.PlateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlateService {

    @Autowired
    private PlateRepository plateRepository;

    public List<Plate> findAll() {
        return plateRepository.findAll();
    }

    public Optional<Plate> findById(Long id){
        return plateRepository.findById(id);
    }

    public Plate save(Plate plate){
        return plateRepository.save(plate);
    }

    public void deleteById(Long id){
        plateRepository.deleteById(id);
    }
}
