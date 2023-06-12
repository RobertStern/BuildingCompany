package com.example.buildingcompany.controller;

import com.example.buildingcompany.model.House;
import com.example.buildingcompany.service.HouseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/house/")
public class HouseController {

    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("all")
    public List<House> getAllHouses() {
        return houseService.getAllHouses();
    }


}
