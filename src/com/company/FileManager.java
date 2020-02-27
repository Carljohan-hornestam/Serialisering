package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager {

    public static void serialize(Object o, String filepath){
        Path path = Paths.get(filepath);

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(o);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void deSerialize(Object o, String filepath){
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get(filepath)))) {
            o = ois.readObject();
            System.out.println(o);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
