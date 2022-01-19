package org.itstep;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*Грузовые перевозки. Имеются автомобили разной грузоподъемности. К каждому автомобилю прикреплен водитель.
Вывести список свободных автомобилей, находящихся в автопарке и подходящих по грузоподъемности для перевозки указанного груза.
Вывести список автомобилей, находящихся в рейсе; их водителей, информацию о маршруте перевозки и грузе.*/
    public static void main(String[] args) {
        Car car1 = new Car("MAZ", 10, "Иванов", "Свободен", "нет маршута", "пустой");
        Car car2 = new Car("MAZ", 20, "Петров", "Занят", "Витебск-Минск", "Песок");
        Car car3 = new Car("КАМАЗ", 10, "Романов", "Занят", "Витебск-Брест", "Доски");
        Car car4 = new Car("КАМАЗ", 20, "Владимир", "Свободен", "нет маршута", "пустой");
        Car car5 = new Car("ZIL", 5, "Алексей", "Свободен", "нет маршута", "пустой");
        Car[] cars = {car1, car2, car3, car4, car5};

        System.out.println("Cписок свободных автомобилей, находящихся в автопарке c грузоподъёмностью больше 5 тонн:");
        freeСars("Свободен", 5, cars).forEach(System.out::println);
        System.out.println();
        System.out.println("Cписок автомобилей, находящихся в рейсе:");
        busyCars("Занят", cars).forEach(System.out::println);
    }

    public static List<Car> freeСars(String status,int loadСapacity, Car[] cars) {
        List<Car> result = new ArrayList<>();

        for (Car car : cars) {
            if (status.equals(car.getStatus())) {
            if (loadСapacity < car.getLoadСapacity()) {
                result.add(car);
            }
            }
        }
        return result;
    }

    public static List<Car> busyCars(String status, Car[] cars){
        List<Car> result = new ArrayList<>();

        for (Car car : cars) {
            if (status.equals(car.getStatus())) {
                result.add(car);
            }
        }
        return result;
    }
}