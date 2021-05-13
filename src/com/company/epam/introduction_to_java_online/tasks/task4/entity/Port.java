package com.company.epam.introduction_to_java_online.tasks.task4.entity;

public class Port {
    private static final int CAPACITY = 1000;
    private static int currentContainersInPort = 0;
    public static int numberOfShips = 0;

    public static synchronized void loadingUnloading(Ship ship) throws InterruptedException {

            if (ship.getCurrentContainers() != 0) {
                while((currentContainersInPort + ship.getCurrentContainers()) > CAPACITY) {
                    System.out.println("корабль ждет пока освободится место в порту");
                    Port.class.wait();
                }
                    int temp = 1000 * ship.getCurrentContainers();
                    System.out.println(ship.thread.getName().replace("Thread", "Ship") + " разгружается");
                    currentContainersInPort = currentContainersInPort + ship.getCurrentContainers();
                    ship.setCurrentContainers(0);
                    Thread.sleep(temp);
                    Port.class.notifyAll();

            } else {
                while((currentContainersInPort - ship.getMaxContainers() < 0)){
                    System.out.println("корабль ждет в порту поступление контейнеров");
                    Port.class.wait();
                }
                    int temp = 1000 * ship.getMaxContainers();
                    System.out.println(ship.thread.getName().replace("Thread", "Ship") + " загружается");
                    currentContainersInPort = currentContainersInPort - ship.getMaxContainers();
                    ship.setCurrentContainers(ship.getMaxContainers());
                    Thread.sleep(temp);
                    Port.class.notifyAll();
            }
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public int getCurrentContainers() {
        return currentContainersInPort;
    }

    public static int getNumberOfShips() {
        return numberOfShips;
    }

    public static void print() {
        System.out.println("Port " + CAPACITY + "/" + currentContainersInPort);
    }
}
