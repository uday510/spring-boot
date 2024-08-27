package com.app.springboot.repository;

import com.app.springboot.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop) {
        System.out.println("Saving laptop...");
    }
}
