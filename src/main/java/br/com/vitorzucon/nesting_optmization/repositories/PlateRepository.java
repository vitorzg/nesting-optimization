package br.com.vitorzucon.nesting_optmization.repositories;

import br.com.vitorzucon.nesting_optmization.models.Plate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlateRepository extends JpaRepository<Plate, Long> {

}
