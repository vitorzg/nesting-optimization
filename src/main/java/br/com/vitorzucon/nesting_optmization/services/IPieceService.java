package br.com.vitorzucon.nesting_optmization.services;

import br.com.vitorzucon.nesting_optmization.models.Piece;
import java.util.List;
import java.util.Optional;

public interface IPieceService {
    List<Piece> findAll();
    Optional<Piece> findById(Long id);
    Piece save(Piece plate);
    void deleteById(Long id);
}
