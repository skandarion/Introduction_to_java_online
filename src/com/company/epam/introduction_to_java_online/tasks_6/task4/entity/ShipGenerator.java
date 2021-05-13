package com.company.epam.introduction_to_java_online.tasks_6.task4.entity;

import java.util.Random;

public class ShipGenerator {
    public void starGenerator() throws InterruptedException {
        while(true) {
            if (Port.numberOfShips < 4) {
                Random random = new Random();
                int temp = random.nextInt(2);
                switch (temp) {
                    case 0: {
                        int temp2 = (random.nextInt(3) + 1) * 10;
                        incShip();
                        Ship.createAndStart(temp2, 0);
                        Thread.sleep(3000);
                    }
                    case 1: {
                        int temp2 = (random.nextInt(3) + 1) * 10;
                        switch (temp2) {
                            case 10: {
                                int temp3 = (random.nextInt(10) + 1);
                                incShip();
                                Ship.createAndStart(temp2, temp3);
                                Thread.sleep(3000);
                            }
                            case 20: {
                                int temp3 = (random.nextInt(20) + 1);
                                incShip();
                                Ship.createAndStart(temp2, temp3);
                                Thread.sleep(3000);
                            }
                            case 30: {
                                int temp3 = (random.nextInt(30) + 1);
                                incShip();
                                Ship.createAndStart(temp2, temp3);
                                Thread.sleep(3000);
                            }
                        }
                    }
                }
            }
        }
    }

    public void incShip(){
        Port.numberOfShips++;
    }
}
