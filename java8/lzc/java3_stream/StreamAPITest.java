package java8.lzc.java3_stream;

import java8.lzc.java2.Employee;
import java8.lzc.java2.EmployeeData;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @title: StreamAPITest
 * @Author luozouchen
 * @Date: 2022/10/18 10:34
 * @Version 1.0
 * <p>
 * <p>
 * 1.stream关注的是数据的运算，与cpu 打交道
 * 集合关注的是数据的存储，与内存打交道
 * <p>
 * 2.
 * ①Stream 自己不会存储元素。
 * ②Stream 不会改变源对象。相反，他们会返回一个持有结果的新Stream。
 * ③Stream 操作是延迟执行的。这意味着他们会等到需要结果的时候才执行
 * <p>
 * 3.Stream 执行流程
 * * ① Stream的实例化
 * * ② 一系列的中间操作（过滤、映射、...)
 * * ③ 终止操作
 * *
 * * 4.说明：
 * * 4.1 一个中间操作链，对数据源的数据进行处理
 * * 4.2 一旦执行终止操作，就执行中间操作链，并产生结果。之后，不会再被使用
 * <p>
 * <p>
 * 测试Stream实例化
 */
public class StreamAPITest {

    //创建stream方式1：通过集合
    @Test
    public void test1() {
        List<Employee> employees = EmployeeData.getEmployees();
        //default stream<E> stream() 返回一个顺序流
        Stream<Employee> stream = employees.stream();

        //default stream<E> parallelStream 返回一个并行流
        Stream<Employee> employeeStream = employees.parallelStream();
    }

    //创建stream方式2：通过数组
    @Test
    public void test2() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        //调用 Arrays 类的static <T> stream <T> stream(T[] array) 返回一个流
        IntStream stream = Arrays.stream(arr);

        Employee e1 = new Employee(1001, "tom");
        Employee e2 = new Employee(1002, "jerry");
        Employee[] arr1 = new Employee[]{e1, e2};
        Stream<Employee> stream1 = Arrays.stream(arr1);

    }

    //创建 Stream方式三：通过Stream的of()
    @Test
    public void test3() {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6);
    }

    //创建 Stream方式四：创建无限流
    @Test
    public void test4() {
//      迭代
//      public static<T> Stream<T> iterate(final T seed, final UnaryOperator<T> f)
        //遍历前10个偶数
        Stream.iterate(0,t->t+2).limit(10).forEach(System.out::println);

//      生成
//      public static<T> Stream<T> generate(Supplier<T> s)
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
        
    }

}
