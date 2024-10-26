package br.com.vitorzucon.nesting_optmization.services;

import br.com.vitorzucon.nesting_optmization.models.Piece;
import br.com.vitorzucon.nesting_optmization.repositories.PieceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PieceService implements IPieceService{

    @Autowired
    private PieceRepository pieceRepository;

    @Override
    public List<Piece> findAll() {
        return pieceRepository.findAll();
    }

    @Override
    public Optional<Piece> findById(Long id) {
        return pieceRepository.findById(id);
    }

    @Override
    public Piece save(Piece plate) {
        return pieceRepository.save(plate);
    }

    @Override
    public void deleteById(Long id) {
        pieceRepository.deleteById(id);
    }
}
