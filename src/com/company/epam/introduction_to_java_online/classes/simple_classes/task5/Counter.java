package com.company.epam.introduction_to_java_online.classes.simple_classes.task5;

public class Counter {
    int min;
    int max;
    int current;

    public Counter(int min, int max, int current) {
        this.min = min;
        this.max = max;
        this.current = current;
    }

    public Counter() {
        min = 0;
        max = 100;
        current = 0;
    }
    public void increase(){
        current++;
        if(current > max){
            current = max;
        }
    }
    public void decrease(){
        current--;
        if(current < min){
            current = min;
        }
    }

    public int getCurrent() {
        return current;
    }
}
