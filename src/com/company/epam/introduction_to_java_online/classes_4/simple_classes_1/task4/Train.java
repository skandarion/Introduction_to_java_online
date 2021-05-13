package com.company.epam.introduction_to_java_online.classes_4.simple_classes_1.task4;

public class Train implements Comparable<Train> {
    String destination;
    int trainNumber;
    String departureTime;

    public Train(String destination, int trainNumber, String departureTime) {
        this.destination = destination;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    @Override
    public int compareTo(Train o) {
        int i = this.trainNumber - o.trainNumber;
        return i;
    }
    @Override
    public String toString() {
        return destination + " " + trainNumber + " " + departureTime;
    }

}
