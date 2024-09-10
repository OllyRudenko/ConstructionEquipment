package com.rent.equipment.controller;

import com.rent.equipment.domain.Excavator;
import com.rent.equipment.service.ExcavatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExcavatorController {
    private final ExcavatorService excavatorService;

    @Autowired
    public ExcavatorController(ExcavatorService excavatorService) {
        this.excavatorService = excavatorService;
    }

    @GetMapping("/excavators")
    public ResponseEntity<List<Excavator>> getExcavators() {
        return ResponseEntity.ok(excavatorService.getAll());
    }

}
