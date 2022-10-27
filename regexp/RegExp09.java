package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @title: RegExp09
 * @Author luozouchen
 * @Date: 2022/10/27 17:18
 * @Version 1.0
 * 非贪婪匹配
 */
public class RegExp09 {
    public static void main(String[] args) {
        String content = "hello111111 ok";
        //String regStr = "\\d+";//默认是贪婪匹配
        String regStr = "\\d+?";//非是贪婪匹配
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到: " + matcher.group(0));
        }
    }
}
