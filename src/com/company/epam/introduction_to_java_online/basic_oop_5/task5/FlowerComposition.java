package com.company.epam.introduction_to_java_online.basic_oop_5.task5;

import com.company.epam.introduction_to_java_online.basic_oop_5.task5.flowers.*;
import com.company.epam.introduction_to_java_online.basic_oop_5.task5.flowers.flowers.Flower;
import com.company.epam.introduction_to_java_online.basic_oop_5.task5.packaging.*;
import com.company.epam.introduction_to_java_online.basic_oop_5.task5.packaging.packagings.Packaging;

import java.util.ArrayList;

public class FlowerComposition {
    private String name;
    private double totalCost;
    ArrayList<Flower> flowers = new ArrayList<Flower>();
    ArrayList<Packaging> packagings = new ArrayList<Packaging>(1);

    public FlowerComposition(String name) {
        this.name = name;
    }

    public void addFlowerToComposition(String name){
        if(Validator.isValidFlowers(name)) {
            CreateFlower createFlower = createNewCreateFlower(name);
            Flower flower = createFlower.createFlower();
            flowers.add(flower);
            totalCost += flower.getCost();
        }
    }
    private CreateFlower createNewCreateFlower(String name) {
        if (name.equalsIgnoreCase("rose")) {
            return new CreateRose();
        } else if (name.equalsIgnoreCase("begonia")) {
            return new CreateBegonia();
        }
        else if (name.equalsIgnoreCase("tulip")){
            return new CreateTulip();
        }
        throw new RuntimeException("entered wrong flower");
    }

    public void addPackagingToComposition(String name) {
        if(Validator.isValidPackaging(name)) {
            if(packagings.isEmpty()) {
                CreatePackaging createPackaging = createNewCreatePackaging(name);
                Packaging p = createPackaging.createPackaging();
                packagings.add(p);
                totalCost += p.getCost();
            }
            else System.out.println("only one packaging for one composition");
        }
    }

    private CreatePackaging createNewCreatePackaging(String name) {
        if (name.equalsIgnoreCase("film")) {
            return new CreateFilm();
        } else if (name.equalsIgnoreCase("organza")) {
            return new CreateOrganza();
        }
        throw new RuntimeException("entered wrong packaging");
    }



    private String flowersToString(){
        String result = "";
        for(Flower f : flowers){
          result = result.concat(f.toString()).concat("\n");
        }
        return result;
    }
    private String packagingToString(){
        String result = "";
        for(Packaging p : packagings){
            result = result.concat(p.toString()).concat("\n");
        }
        return result;
    }
    @Override
    public String toString() {
        return "composition name: " + name + "\n\n" +
                "flowers: \n" + flowersToString() + "\npackaging: \n" + packagingToString() +"\n\ntotal cost: " + totalCost;
    }
}
