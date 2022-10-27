package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @title: RegExp11
 * @Author luozouchen
 * @Date: 2022/10/27 17:28
 * @Version 1.0
 */
public class RegExp11 {
    public static void main(String[] args) {
        //String content = "https://www.bilibili.com/video/BV1fh411y7R8?from=search&seid=1831060912083761326";
        String content = "https://www.bilibili.com/video/BV1z14y1572B/?spm_id_from=333.1007.tianma.1-1-1.click";
/**
 * 思路
 * 1. 先确定 url 的开始部分 https:// | http://
 * 2.然后通过 ([\w-]+\.)+[\w-]+ 匹配 www.bilibili.com
 * 3. /video/BV1fh411y7R8?from=sear 匹配(\/[\w-?=&/%.#]*)?
 */
//多写多练，多总结
        String regStr = "^((http|https)://)?([\\w-]+\\.)+[\\w-]+(\\/[\\w-?=&/%.#]*)?$";//注意：[. ? *]表示匹配就是.本身
        Pattern pattern = Pattern.compile(regStr);
        Matcher matcher = pattern.matcher(content);
        if (matcher.find()) {
            System.out.println("满足格式");
        } else {
            System.out.println("不满足格式");
        }
//这里如果使用 Pattern 的 matches 整体匹配 比较简洁
        System.out.println(Pattern.matches(regStr, content));

    }
}
