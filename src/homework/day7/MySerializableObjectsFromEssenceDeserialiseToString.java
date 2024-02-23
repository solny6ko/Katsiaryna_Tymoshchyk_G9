package homework.day7;

import homework.day5.playground.essence.creatures.Maylily;

import java.io.*;

public class MySerializableObjectsFromEssenceDeserialiseToString implements Serializable {

    public void SerializableObjectsFromEssenceDeserialiseToString() {

        try {
            FileInputStream fis = new FileInputStream("C:\\Katarina\\Java\\files\\SerializableObjectsFromEssence");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Maylily maylily = (Maylily) ois.readObject();
            BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Katarina\\Java\\files\\MySerializableObjectsFromEssenceDeserialiseToString.txt"));
            out.write(maylily.toString());
            /*ois.close();*/
            out.close();

        } catch (IOException | NullPointerException | ClassNotFoundException e) {
            System.out.println(e);

        }


    }

    public static void main(String[] args) {

        MySerializableObjectsFromEssenceDeserialiseToString serializableObjectsFromEssenceDeserialiseToString = new MySerializableObjectsFromEssenceDeserialiseToString();
        serializableObjectsFromEssenceDeserialiseToString.SerializableObjectsFromEssenceDeserialiseToString();

    }
}
