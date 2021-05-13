package com.company.epam.introduction_to_java_online.tasks_6.task4.entity;

public class Ship implements Runnable{
    Thread thread;
    private final int maxContainers;
    private int currentContainers;

    public Ship(int maxContainers, int currentContainers) {
        thread = new Thread(this);
        this.maxContainers = maxContainers;
        this.currentContainers = currentContainers;
    }

    public static Ship createAndStart(int maxContainers, int currentContainers){
        Ship ship = new Ship( maxContainers, currentContainers);
        ship.thread.start();
        return ship;
    }

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public int getMaxContainers() {
        return maxContainers;
    }

    public int getCurrentContainers() {
        return currentContainers;
    }

    public void setCurrentContainers(int currentContainers) {
        this.currentContainers = currentContainers;
    }

    @Override
    public void run() {
            System.out.println(thread.getName().replace("Thread", "Ship") +
                    " на борту " + currentContainers + " контейнеров" + ", зашёл в порт");
            System.out.println(" в порту " + Port.numberOfShips + " кораблей");
            try {
                    Port.loadingUnloading(this);
                }
            catch (InterruptedException exc) {
                System.out.println(thread.getName().replace("Thread", "Ship") + " interrupted");
            }
            System.out.println(thread.getName().replace("Thread", "Ship") +
                    " на борту " + currentContainers + " контейнеров" + ", вышел из порта");
            Port.numberOfShips--;
            System.out.println(" в порту " + Port.numberOfShips + " кораблей");
        }
    }

