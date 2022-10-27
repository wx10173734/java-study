package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @title: RegExp02
 * @Author luozouchen
 * @Date: 2022/10/27 16:20
 * @Version 1.0
 * 演示转义字符的使用
 */
public class RegExp02 {
    public static void main(String[] args) {
        String content = "abc$(a.bc(123(";
        //匹配( ==> \\(
        //匹配. ==> \\.
        String regStr = "\\.";
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到的"+matcher.group(0));
        }
    }
}
