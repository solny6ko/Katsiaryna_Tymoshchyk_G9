package homework.day7;

import homework.day5.playground.essence.creatures.Maylily;

import java.io.*;


public class MySerializableObjectsFromEssence implements Serializable{
    public void SerializableObjectsFromEssence() {

        try {
            FileOutputStream fos = new FileOutputStream("C:\\Katarina\\Java\\files\\SerializableObjectsFromEssence");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(new Maylily(10, "Maylily"));
            /*oos.close();*/

        } catch (IOException | NullPointerException e) {
            System.out.println(e);

        }


    }

    public static void main(String[] args) {

        MySerializableObjectsFromEssence serializableObjectsFromEssence = new MySerializableObjectsFromEssence();
        serializableObjectsFromEssence.SerializableObjectsFromEssence();

    }
}
