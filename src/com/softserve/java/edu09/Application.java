package com.softserve.java.edu09;

public class Application{
  public static void main(String[ ] args) {
      String text = "Hello World";
      Box box = new Box();
      box.set(text);
      Integer i = (Integer) box.get();
    }
}
