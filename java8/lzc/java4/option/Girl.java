package java8.lzc.java4.option;

/**
 * @title: Girl
 * @Author luozouchen
 * @Date: 2022/10/18 15:12
 * @Version 1.0
 */
public class Girl {
    private String name;

    public Girl() {
    }

    public Girl(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }
}
