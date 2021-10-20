package com.pet.manager.crontroller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class PetController {

    @GetMapping("/pets")
    public ResponseEntity<List<Object>> getPets(@RequestParam String type) {

        System.out.println(type);
        return ResponseEntity.ok(Collections.emptyList());
    }
}
