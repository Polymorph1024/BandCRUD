package ru.ad.bandcrud.BandCRUD.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "band")
public class Band {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String label;
    private String genre;
    @Column(name = "foundation_year")
    private Short foundationYear;
}
