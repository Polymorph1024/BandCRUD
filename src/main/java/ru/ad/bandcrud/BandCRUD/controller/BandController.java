package ru.ad.bandcrud.BandCRUD.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.ad.bandcrud.BandCRUD.model.Band;
import ru.ad.bandcrud.BandCRUD.service.BandService;

import java.util.List;

@Controller
class BandController {
    private BandService bandService;
    @GetMapping("/band")
    public String findAll(){
        List<Band> bands = bandService.findAll();
        return "";
    }
}
