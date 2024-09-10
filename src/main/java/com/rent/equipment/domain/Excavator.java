package com.rent.equipment.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@SuperBuilder
public class Excavator extends BaseEntity{
    private Double backScoopVolume;
    private Double FrontScoopVolume;
    private Double maxDiggingDepth;
    private Double maxLiftingWeight;
}
