package com.company.epam.introduction_to_java_online.basic_oop.task4.caves;

import com.company.epam.introduction_to_java_online.basic_oop.task4.treasures.Treasure;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class DragonCave extends Cave{
    private String dragonName;
    public ArrayList<Treasure> treasureList = new ArrayList<Treasure>();

    public DragonCave(String dragonName) {
        this.dragonName = dragonName;
    }

    public DragonCave(String dragonName, Treasure ... treasures) {
        this.dragonName = dragonName;
        for(Treasure t : treasures){
            treasureList.add(t);
        }
    }

    public void showTeasures(){
        treasureList.forEach(System.out::println);
    }
    public void showMostExpensive(){
        double temp = 0;
        for(Treasure t : treasureList){
            if(t.getCost() > temp){
                temp = t.getCost();
            }
        }
        for (Treasure t : treasureList){
            if(t.getCost() == temp){
                System.out.println(t.toString());
            }
        }
    }
    public void getTreasuresByTotalCost(double sum){
        ArrayList<Treasure> tempArrayList = new ArrayList<Treasure>();
        double temp = sum;
        for (Treasure t : treasureList){
            if(temp >= t.getCost()){
                tempArrayList.add(t);
                temp -= t.getCost();
            }
            else break;
        }
        tempArrayList.forEach(System.out::println);
    }
    public void setTreasuresFromFile(String PathToFile){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PathToFile)))
        {
            treasureList = ((ArrayList<Treasure>)ois.readObject());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
