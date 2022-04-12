package com.company;


import java.util.Random;

public class Status {



    public static void changeDriver(AutoPark autoPark, String driver) {
        if (autoPark.getState().equals(State.ROUTE)){
            System.out.println("Водитель уже в пути");
        }else {
            System.out.println("Водитель уже в пути, невозможно сменить водителя");
        }
    }




    public static void startDriving(AutoPark autoPark){
        if (autoPark.getState().equals(State.BASE)){
            if (autoPark.getName()!=null){
                autoPark.getState();
                System.out.println("Успешно вышли на маршрут");
            }else {
                System.out.println("Водитель не найден");
            }

        }else {
           Random random=new Random();
            int rd= random.nextInt(2);
            if (rd==0){
                autoPark.getState();
                System.out.println("Машина в пути");
            }else {
                autoPark.getState();
                System.out.println("Машина на базе");
            }
        }

    }
    public static void startRepair(AutoPark autoPark){
        if (autoPark.getState().equals(State.BASE)){
            autoPark.getState();
            System.out.println("Машина в ремонте");
        }else if (autoPark.getState().equals(State.ROUTE)){
            autoPark.setState(String.valueOf(State.REPAIR));
        }else {
            System.out.println("Уже в ремонте");
        }
    }


}
