package wangluo.socket;

import java.io.*;

/**
 * @title: StreamUtils
 * @Author luozouchen
 * @Date: 2022/10/7 14:04
 * @Version 1.0
 * 此类用于演示关于流的读写方法
 */

public class StreamUtils {
    /**
     * 功能：将输入流转换成 byte[] 即可以把问价你的内容读入到byte[]
     *
     * @param is
     * @return
     * @throws Exception
     */

    public static byte[] streamToByteArray(InputStream is) throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();//创建输出流对象
        byte[] b = new byte[1024];//字节数组
        int len;
        while ((len = is.read(b)) != -1) {//循环读取
            bos.write(b, 0, len);//把读取到的数据写入到ByteArrayOutputStream
        }
        byte[] array = bos.toByteArray();//然后将bos 转成字节数组
        bos.close();
        return array;
    }

    /**
     * 功能：将 InputStream 转换成 String
     *
     * @param is
     * @return
     * @throws Exception
     */
    public static String streamToString(InputStream is) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder builder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) { //当读取到 null 时，就表示结束
            builder.append(line + "\r\n");
        }
        return builder.toString();
    }
}

