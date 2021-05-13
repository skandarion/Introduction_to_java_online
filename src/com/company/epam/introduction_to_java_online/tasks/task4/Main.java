package com.company.epam.introduction_to_java_online.tasks.task4;

import com.company.epam.introduction_to_java_online.tasks.task4.entity.Ship;
import com.company.epam.introduction_to_java_online.tasks.task4.entity.ShipGenerator;

/*
Попробуйте решить данную задачу хотя бы на 50%.
Задание 4. Многопоточность. Порт . Корабли заходят в порт для
разгрузки/загрузки контейнеров. Число контейнеров, находящихся в текущий момент
в порту и на корабле, должно быть неотрицательным и превышающим заданную
грузоподъемность судна и вместимость порта. В порту работает несколько причалов.
У одного причала может стоять один корабль. Корабль может загружаться у причала
или разгружаться.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ShipGenerator sg = new ShipGenerator();
        sg.starGenerator();
    }
}
