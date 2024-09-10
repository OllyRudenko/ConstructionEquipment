package com.rent.equipment.service;

import java.util.List;

public interface ExcavatorService<E> {
    List<E> getAll();

    E getById(Long id);
}
