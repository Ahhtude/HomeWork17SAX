package Serializable_and_Externalazible.Serialazible;

import java.io.*;

public class DemoClassForSerializableApplication {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        //save object
        DemoClassForSerializable demo = new DemoClassForSerializable();
        FileOutputStream outputStream = new FileOutputStream("/Users/sergey/IdeaProjects/HomeWork17SAX/src/main/resources/FileForSerialization.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(demo);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("/Users/sergey/IdeaProjects/HomeWork17SAX/src/main/resources/FileForSerialization.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        DemoClassForSerializable demo2 = (DemoClassForSerializable) objectInputStream.readObject();
        System.out.println(demo + "\n "+ demo2);

    }
}
