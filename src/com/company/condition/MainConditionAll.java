package com.company.condition;

import com.company.AutoPark;
import com.company.Driver;
import com.company.Main;

import java.util.Scanner;

public class MainConditionAll {
    public static void main(String[] args) {

        printDriver(new Driver[]{new Driver(1,"Sasha"),
                new Driver(2,"Petya"),
                new Driver(3,"Vasya")});

        printCar(new AutoPark[]{new AutoPark(1,"Renault Magnum","","on base"),
                new AutoPark(2,"Volvo FH12","","on base"),
                new AutoPark(3,"DAF XF","","on base")});


        Scanner sc = new Scanner(System.in);
        int a;
        int b = 0;
        while (true) {
            try {
                System.out.println("*****Выберите один из машин****");
                a = sc.nextInt();

                if (a == 1) {
                    System.out.println(new AutoPark(1, "Renault Magnum", "", "on base")
                            + " " + new Driver(1, "Sasha"));
                } else if (a == 2) {
                    System.out.println(new AutoPark(2, "Volvo FH12", "", "on base")
                            + " " + new Driver(2, "Petya"));

                } else if (a == 3) {
                    System.out.println(new AutoPark(3, "DAF XF", "", "on base")
                            + " " + new Driver(3, "Vasya"));

                } else {
                    System.out.println("Что-то пошло не так");
                    break;
                }

//                for(a:b) {
//                    if (a == 4) break;
//                    System.out.println(a);
//                }

            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    }


    public  static void printCar(AutoPark[]autoParks){
        System.out.println("---------------------------TRUCK-------------------------------");
        System.out.println("      *       |       BUS       |     STATE     |     DRIVER   ");
        System.out.println("--------------|-----------------|---------------|--------------");
        for (int f = 0; f <autoParks.length; f++) {
            System.out.println(autoParks[f]);
        }
    }
    public static void printDriver(Driver[]drivers){
        System.out.println("----------------------DRIVER-----------------------");
        System.out.println("       *       |      DRIVER      |      BUS       ");
        System.out.println("---------------|------------------|-----------------");
        for (int c = 0; c < drivers.length; c++) {
            System.out.println(drivers[c]);
        }
    }

}
