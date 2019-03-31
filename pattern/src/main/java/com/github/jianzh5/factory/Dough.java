package com.github.jianzh5.factory;

/**
 * <p>
 * <code>Dough</code>
 * </p>
 * Description:
 *
 * @author jam
 * @date 2019/3/31上午11:54
 */
public abstract class Dough {
    String name;
    String color;

    public Dough(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
