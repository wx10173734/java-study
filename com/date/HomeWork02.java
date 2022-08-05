package com.date;

/**
 * @author luozouchen
 * @date 2022/8/5
 * @apiNote
 */
public class HomeWork02 {
    public static void main(String[] args) {
        String name = "jack";
        String pwd = null;
        String email="jack@sohu.com";
        try {
            userRegister(name,pwd,email);
            System.out.println("注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String pwd, String email) {
        //再加入一些校验
        if (!(name !=null && pwd !=null && email!=null)){
            throw new RuntimeException("参数不能为空");
        }
        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("用户名长度要求2，3，4");
        }
        if (!(pwd.length() == 6 && isDigital(pwd))) {
            throw new RuntimeException("你的密码长度要为6并且要是数字");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > 0 && j>i)){
            throw new RuntimeException("邮箱中包含@和. 并且@在.前面");
        }
    }

    public static boolean isDigital(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
