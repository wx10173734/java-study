package thread;

/**
 * @title: CpuNum
 * @Author luozouchen
 * @Date: 2022/9/27 15:07
 * @Version 1.0
 */
public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        //获得当前电脑的cpu数量
        int cpuNums = runtime.availableProcessors();
        System.out.println(cpuNums);

    }
}
