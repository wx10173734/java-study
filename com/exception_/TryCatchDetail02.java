package com.exception_;

/**
 * @author luozouchen
 * @date 2022/8/3
 * @apiNote
 */
public class TryCatchDetail02 {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            person = null;
            System.out.println(person.getName());
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        } catch (NullPointerException | ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}
