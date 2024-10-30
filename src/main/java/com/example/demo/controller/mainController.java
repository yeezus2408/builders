package com.example.demo.controller;

import com.example.demo.Repository.repos;
import com.example.demo.model.Buildings;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
@RequestMapping
public class mainController {
    private final repos repo;


    @PostMapping("/buildings")
    public void add(@RequestBody Buildings buildings){
        repo.add(buildings);
    }

    @GetMapping("/buildings/{id}")
    public Buildings read(@PathVariable Integer id){
        return repo.read(id);
    }

    @PostMapping("/buildings/delete/{id}")
    public void delete(@PathVariable Integer id){
        repo.delete(id);
    }

    @PostMapping("/buildings/update/{id}")
    public Buildings update(@PathVariable Integer id, @RequestBody Buildings updatedBuild) throws Exception {
        return repo.update(id, updatedBuild);
    }

    @GetMapping("/buildings/all")
    public ArrayList<Buildings> readAll(){
        return repo.readAll();
    }
}
