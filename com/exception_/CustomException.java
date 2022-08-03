package com.exception_;

/**
 * @author luozouchen
 * @date 2022/8/3
 * @apiNote
 */
public class CustomException {
    public static void main(String[] args) {
        int age =1111;
        //要求在18-120内，否则抛出一个自定义异常
        if (!(age >= 18 && age <=120)){
            throw new AgeException("年龄需要在18-120内");
        }
        System.out.println("你的年龄是正确的");
    }
}
//自定义异常
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}