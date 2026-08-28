package com.equipit.equipment;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class EquipmentService {
    private final EquipmentRepository repository;

    public EquipmentService(EquipmentRepository repository) {
        this.repository = repository;
    }

    public List<Equipment> findAll() {
        return repository.findAll();
    }

    public Equipment borrowEquipment(Long id, String firstName, String lastName) {
        throw new UnsupportedOperationException("Exercise 1: implement equipment borrowing");
    }

    public Equipment returnEquipment(Long id) {
        throw new UnsupportedOperationException("Exercise 1: implement equipment return");
    }
}