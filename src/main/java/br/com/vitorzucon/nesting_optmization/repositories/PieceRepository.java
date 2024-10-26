package br.com.vitorzucon.nesting_optmization.repositories;

import br.com.vitorzucon.nesting_optmization.models.Piece;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PieceRepository extends JpaRepository<Piece, Long> {
}
