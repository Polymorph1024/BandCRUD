package ru.ad.bandcrud.BandCRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ad.bandcrud.BandCRUD.model.Band;

public interface BandRepository extends JpaRepository<Band, Long> {
}
