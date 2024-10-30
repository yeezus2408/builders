package com.example.demo.Repository;

import com.example.demo.model.Buildings;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.*;

@Repository
public class repos {
    ArrayList<Buildings> REPOS = new ArrayList<>(Arrays.asList(

    ));

    public void add(Buildings build){
        build.setId(UUID.randomUUID());
        build.setConstructionDate(LocalDate.now());
        REPOS.add(build);
    }

    public Buildings read(Integer id){
        return (Buildings) REPOS.stream().filter(el -> Objects.equals(el.getId(), id));
    }

    public ArrayList<Buildings> readAll(){
        return REPOS;
    }


    public void delete(Integer id){
        REPOS.remove(read(id));
    }

    public Buildings update(Integer id, Buildings updatedBuild) throws Exception {
        Buildings build = read(id);
        if(build == null){
            throw new Exception("Нет такого строения");
        }
        build.setName(updatedBuild.getName());
        build.setBuilder(updatedBuild.getBuilder());
        build.setFloor(updatedBuild.getFloor());
        build.setStreet(build.getStreet());
        build.setNumberHouse(updatedBuild.getNumberHouse());
        return build;
    }
}
