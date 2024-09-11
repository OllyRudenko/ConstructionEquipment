package com.rent.equipment.domain;

import com.rent.equipment.enums.Types;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
//@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class BaseEntity {
    private Long id;
    private String serialCode;
    private String model;
    private int year;
    private Enum<Types> typesEnum;
}
