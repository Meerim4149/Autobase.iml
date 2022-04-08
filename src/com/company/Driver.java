package com.company;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

@Getter
@Setter

public class Driver {
    private String id;
    private String name;
    private static final Path WRITE_PATH = Paths.get("./datadrive.json");

    public Driver(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " | "+" "+ name + " | ";

    }

    public static void write(String object)  {
        Path writePath = Paths.get(String.valueOf(WRITE_PATH));
        try{
            Files.writeString(writePath,object, StandardOpenOption.CREATE,StandardOpenOption.WRITE);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
