package io.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @title: FileWriter_
 * @Author luozouchen
 * @Date: 2022/10/2 16:19
 * @Version 1.0
 */
public class FileWriter_ {
    public static void main(String[] args) {





        String destPath = "e:\\writer.txt";
        String str = "风雨之后，定见彩虹";
        FileWriter fileWriter = null;
        char[] buf = {'a', 'b', 'c'};
        try {
            fileWriter = new FileWriter(destPath);//默认是覆盖写入
            // 3) write(int):写入单个字符
            fileWriter.write('H');
            // 4) write(char[]):写入指定数组
            fileWriter.write(buf);
            // 5) write(char[],off,len):写入指定数组的指定部分
            fileWriter.write("韩顺平教育".toCharArray(),0,3);
            // 6) write（string）：写入整个字符串
            fileWriter.write("你好 罗邹晨");
            fileWriter.write("风雨之后，定见彩虹");
            // 7) write(string,off,len):写入字符串的指定部分
            fileWriter.write("上海天津",0,2);
            //在数据量大的情况下，可以使用循环操作.

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //对于fileWriter 一定要关闭流，或者flush才能真正把数据写入到文件中
            //看源码
            /*
                this.bb.flip();
        int var1 = this.bb.limit();
        int var2 = this.bb.position();

        assert var2 <= var1;

        int var3 = var2 <= var1 ? var1 - var2 : 0;
        if (var3 > 0) {
            if (this.ch != null) {
                assert this.ch.write(this.bb) == var3 : var3;
            } else {
                this.out.write(this.bb.array(), this.bb.arrayOffset() + var2, var3);
            }
             */
            try {
//                fileWriter.flush();
                //这里关闭文件流，等价flush() +关闭
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

}
