package ru.ad.bandcrud.BandCRUD.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import ru.ad.bandcrud.BandCRUD.model.Band;
import ru.ad.bandcrud.BandCRUD.service.BandService;

import java.util.List;

@Controller
class BandController {

    private final BandService bandService;

    @Autowired
    BandController(BandService bandService) {
        this.bandService = bandService;
    }

    @GetMapping("/bands")
    public String findAll(Model model) {
        List<Band> bands = bandService.findAll();
        model.addAttribute("bands", bands);
        return "band-list";
    }

    @GetMapping("/band-create")
    public String createBandForm(Band band) {
        return "band-create";
    }

    @PostMapping("/band-create")
    public String createBand(Band band) {
        bandService.saveBand(band);
        return "redirect:/bands";
    }

    @GetMapping("/band-delete/{id}")
    public String deleteBand(@PathVariable("id") Long id) {
        bandService.deleteById(id);
        return "redirect:/bands";
    }

    @GetMapping("/band-update/{id}")
    public String updateBandForm(@PathVariable("id") Long id, Model model) {
        Band band = bandService.findById(id);
        model.addAttribute("band", band);
        return "band-update";
    }

    @PostMapping("/band-update")
    public String updateBand(Band band) {
        bandService.saveBand(band);
        return "redirect:/bands";
    }
}
