package Serializable_and_Externalazible.Serialazible;

import java.io.*;

public class DemoClassForSerializable implements Serializable{
    private static final long serialVersionUID = 1L;

    private String name = "DemoName";
    private int age = 0;

    public DemoClassForSerializable() {
    }

    public DemoClassForSerializable(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void writeExternal(ObjectOutput out) throws IOException {
    out.writeObject(this.getName());
    out.writeObject(this.getAge());

    }

    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        String name_ = in.readLine();
        name = name_;
        int age_ = in.read();
        age = age_;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DemoClassForSerializable{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}
