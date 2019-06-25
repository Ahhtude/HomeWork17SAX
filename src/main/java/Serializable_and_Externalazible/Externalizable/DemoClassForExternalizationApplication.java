package Serializable_and_Externalazible.Externalizable;

import java.io.*;

public class DemoClassForExternalizationApplication {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


    DemoClassForExternalization demo = new DemoClassForExternalization("Lukas",77);

    ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("/Users/sergey/IdeaProjects/HomeWork17SAX/src/main/resources/FileForExternalization.txt"));
    oos.writeObject(demo);
    oos.close();

        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream("/Users/sergey/IdeaProjects/HomeWork17SAX/src/main/resources/FileForExternalization.txt"));
        DemoClassForExternalization demo2 = (DemoClassForExternalization) ois.readObject();
        System.out.println(demo.toString());
        System.out.println(demo2.toString());


    }

}
