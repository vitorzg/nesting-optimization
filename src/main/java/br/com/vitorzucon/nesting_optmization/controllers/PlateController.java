package br.com.vitorzucon.nesting_optmization.controllers;

import br.com.vitorzucon.nesting_optmization.models.Plate;
import br.com.vitorzucon.nesting_optmization.services.IPlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/plate")
public class PlateController {

    @Autowired
    private final IPlateService plateService;

    public PlateController(IPlateService plateService) {
        this.plateService = plateService;
    }

    @GetMapping
    public List<Plate> findAll() {
        return plateService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plate> findById(@PathVariable Long id){
        Optional<Plate> plate = plateService.findById(id);
        return plate.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Plate> save(@RequestBody Plate plate){
        Plate plateSaved = plateService.save(plate);
        return ResponseEntity.ok(plateSaved);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        plateService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
