package br.com.vitorzucon.nesting_optmization.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "Plates")
@Data
public class Plate {
    public Plate(Long id, Float com, Float large, int shape) {
        this.id = id;
        this.com = com;
        this.large = large;
        this.shape = shape;
    }

    public Plate() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Float com;
    private Float large;
    private int shape;
}
