package com.company.epam.introduction_to_java_online.basics.lineprogramm;

public class Task6 {
    public void getCoordinates (double x, double y){
        double z = ((x+0.1)*(x+0.1)/(0.4*0.4)) + ((y+1.1)*(y+1.1)/(0.6*0.6));
        if(z < 1){
            System.out.println(false);
        }
        else if (((x <= 2 && x >= -2) && (y >= 0 && y <= 4)) || ((x <= 4 && x >= -4) && (y >= -3 && y <= 0))) {
            System.out.println(true);
        }
        else System.out.println(false);
    }
}
