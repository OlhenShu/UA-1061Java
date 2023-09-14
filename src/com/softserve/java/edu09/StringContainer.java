package com.softserve.java.edu09;

class StringContainer {
    private String item;

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }
}

class IntegerContainer {
    private Integer item;

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getItem() {
        return item;
    }
}

class Container<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

class DemoContainer {
    public static void main(String[] args) {
        Container<String> stringContainer = new Container<>();
        stringContainer.setItem("Hello, World!");

        Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(12345);
    }
}

