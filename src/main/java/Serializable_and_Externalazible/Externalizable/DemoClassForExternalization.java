package Serializable_and_Externalazible.Externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class DemoClassForExternalization implements Externalizable{
    private static final long serialVersionUID = 1L;

    private String name = "DemoName";
    private int age = 0;


    public DemoClassForExternalization() {
    }

    public DemoClassForExternalization(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.getName());
        out.writeObject(this.getAge());

    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name=(String) in.readObject();
        age = (Integer) in.readObject();
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DemoClassForExternalization{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}

