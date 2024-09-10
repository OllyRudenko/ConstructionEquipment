package com.rent.equipment.service.impl;

import com.rent.equipment.domain.Excavator;
import com.rent.equipment.service.ExcavatorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExcavatorServiceImpl implements ExcavatorService<Excavator> {
    @Override
    public List<Excavator> getAll() {
        return List.of(Excavator.builder()
                .id(1L)
                .serialCode("123")
                .year(2021)
                .model("model JCB 3CX")
                .maxLiftingWeight(1000.0)
                .maxDiggingDepth(5.0)
                .build());
    }

    @Override
    public Excavator getById(Long id) {
        return Excavator.builder()
                .id(1L)
                .serialCode("123")
                .year(2021)
                .model("model JCB 3CX")
                .maxLiftingWeight(1000.0)
                .maxDiggingDepth(5.0)
                .build();
    }
}
