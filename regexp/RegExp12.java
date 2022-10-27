package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @title: RegExp12
 * @Author luozouchen
 * @Date: 2022/10/27 17:45
 * @Version 1.0
 * 反向引用
 */
public class RegExp12 {
    public static void main(String[] args) {
       //String content = "hello33333 jack tom112321 -3339991111 jack22 yyy xxx 2552";
        String content = "12321 -333999111";
        //要匹配两个连续的相同数字 (\d\1)
        //String regStr = "(\\d\\1)";
        //要匹配5个连续的数字
        //String regStr = "(\\d\\1{4})";
        //String regStr = "(\\d)(\\d)\\2\\1";

        /**
         * 请在字符串中检索商品编号，形式如: 12321 -333999111 这样的号码，
         * 要求满足前面是 一个五位数， 然后一个1号，然后是一个九位数，连续的每三位要相同
         */
        String regStr =  "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";

        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()) {
            System.out.println("找到:" + matcher.group(0));
        }
    }
}
