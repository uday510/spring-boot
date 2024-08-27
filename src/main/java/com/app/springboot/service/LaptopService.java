package com.app.springboot.service;

import com.app.springboot.model.Laptop;
import com.app.springboot.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop) {
        laptopRepository.save(laptop);
    }
    public boolean isGoodForProgramming(Laptop laptop) {
        return true;
    }
}
