package com.example.buildingcompany.service;

import com.example.buildingcompany.model.Material;
import com.example.buildingcompany.publisher.RabbitMQProducer;
import com.example.buildingcompany.repository.MaterialRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialObserver {

    private final MaterialRepository materialRepository;

    private final RabbitMQProducer producer;

    @Autowired
    public MaterialObserver(MaterialRepository materialRepository, RabbitMQProducer producer) {
        this.materialRepository = materialRepository;
        this.producer = producer;
    }

    public void checkStateOfMaterial() {
        List<Material> materials = materialRepository.findAll();
        materials.forEach(material -> {
            if (material.getAmount() < material.getMinAmount()) {
                producer.sendMessage(String.format("Material %s with id: %s is under minimal allowed amount.",
                        material.getName(), material.getId()));
            }
        });
    }
}
