package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;


public class Main {

    Scanner scanner = new Scanner(System.in);

    public static final GsonBuilder BUILDER = new GsonBuilder();
    public static final Gson GSON =BUILDER.setPrettyPrinting().create();
    public static final Path WRITE_PATH = Paths.get("./autoPark.json");

    public static void main(String[] args) {



        System.out.println(" # |  bus           | driver |  state");
        System.out.println("---+----------------+--------+---------");
        AutoPark[] autoParks = {new AutoPark(1,"Renault Magnum","","on base"),
                                new AutoPark(2,"Volvo FH12","","on base"),
                                new AutoPark(3,"DAF XF","","on base")};

        for (int i = 0; i < 3; i++) {
            System.out.printf("|%-3s", autoParks[i].getId());
            System.out.printf("|%-15s", autoParks[i].getName());
            System.out.printf("|%-8s", autoParks[i].getDriver());
            System.out.printf("|%-6s", autoParks[i].getState());
            System.out.println();
        }


        String json = GSON.toJson(autoParks);
        //System.out.println(json);
        //write(json);
        System.out.println(readFile());

        System.out.println("# | Driver      |  Bus");
        System.out.println("--+-------------+--------");

        Driver[]drivers={new Driver(1,"Sasha"),
                         new Driver(2,"Petya"),
                         new Driver(3,"Vasya")};

        String json1 = GSON.toJson(drivers);
        Driver.write(json1);

        for(Driver c : drivers){
            System.out.println(c.toString());
        }



    }

    private static void write(String object) {
        Path write = Paths.get(String.valueOf(WRITE_PATH));
        try {
            Files.writeString(write,object, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
        }catch(IOException e){
            e.getMessage();
        }
    }

    private static String readFile() {
        String json = " ";
        try {
            FileReader reader = new FileReader("./autoPark.json");
            int a;
            while ((a = reader.read()) != -1) {
               json += (char) a;
            }
            return json;
        } catch (IOException e) {
            e.printStackTrace();
        }        return json;
    }

}
