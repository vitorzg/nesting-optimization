package br.com.vitorzucon.nesting_optmization.controllers;

import br.com.vitorzucon.nesting_optmization.models.Piece;
import br.com.vitorzucon.nesting_optmization.services.IPieceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/piece")
public class PieceController {

    @Autowired
    private final IPieceService pieceService;

    public PieceController(IPieceService pieceService) {
        this.pieceService = pieceService;
    }

    @GetMapping
    public List<Piece> findAll(){
        return pieceService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Piece> findById(@PathVariable Long id){
        Optional<Piece> plate = pieceService.findById(id);
        return plate.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Piece> save(@RequestBody Piece plate){
        Piece plateSaved = pieceService.save(plate);
        return ResponseEntity.ok(plateSaved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        pieceService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
