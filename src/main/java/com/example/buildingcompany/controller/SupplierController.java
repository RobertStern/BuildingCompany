package com.example.buildingcompany.controller;

import com.example.buildingcompany.model.Supplier;
import com.example.buildingcompany.service.SupplierService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/supplier/")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping("all")
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }
}
