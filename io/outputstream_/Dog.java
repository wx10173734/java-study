package io.outputstream_;



import java.io.Serializable;

//如果需要序列化某个类的对象，实现Serializable
public class Dog implements Serializable {
    private String name;
    private int age;
    //序列化对象时，默认将里面所有属性进行序列化，除了static 或transient修饰的成员
    private static String nation;
    private transient String color;
    //serialVersionUID 序列化的版本号，可以提高兼容性
    private Master master = new Master();
    private static final long serialVersionUID = 1L;

    public Dog(String name, int age, String nation, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.nation = nation;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}' + nation+master;
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
}