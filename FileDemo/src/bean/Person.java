package bean;

import java.io.Serializable;

public class Person implements Serializable {
    String name = "断开";

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
