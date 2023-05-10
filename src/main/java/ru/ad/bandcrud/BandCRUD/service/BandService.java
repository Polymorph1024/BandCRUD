package ru.ad.bandcrud.BandCRUD.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.ad.bandcrud.BandCRUD.model.Band;
import ru.ad.bandcrud.BandCRUD.repository.BandRepository;

import java.util.List;
@Service
public class BandService {

    private final BandRepository bandRepository;
    @Autowired
    public BandService(BandRepository bandRepository) {
        this.bandRepository = bandRepository;
    }

    public Band findById(Long id) {
        return bandRepository.getReferenceById(id);
    }

    public List<Band> findAll() {
        return bandRepository.findAll();
    }

    public Band saveBand(Band band) {
        return bandRepository.save(band);
    }

    public void deleteById(Long id) {
        bandRepository.deleteById(id);
    }
}
