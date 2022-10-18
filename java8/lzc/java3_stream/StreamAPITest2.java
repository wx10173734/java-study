package java8.lzc.java3_stream;

import java8.lzc.java2.Employee;
import java8.lzc.java2.EmployeeData;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @title: StreamAPITest2
 * @Author luozouchen
 * @Date: 2022/10/18 14:27
 * @Version 1.0
 * 测试Stream的中间操作
 */
public class StreamAPITest2 {
    //3-排序
    @Test
    public void test4() {
//        sorted()——自然排序
        List<Integer> list = Arrays.asList(25, 45, 36, 12, 85, 64, 72, -95, 4);
        list.stream().sorted().forEach(System.out::println);
        //抛异常，原因:Employee没有实现Comparable接口
//        List<Employee> employees = EmployeeData.getEmployees();
//        employees.stream().sorted().forEach(System.out::println);


//        sorted(Comparator com)——定制排序
//
        List<Employee> employees = EmployeeData.getEmployees();
//        employees.stream().sorted((e1, e2) -> Integer.compare(e1.getAge(), e2.getAge())).forEach(System.out::println);
        employees.stream().sorted((e1, e2) -> {
                    int ageValue = Integer.compare(e1.getAge(), e2.getAge());
                    if (ageValue != 0) {
                        return ageValue;

                    } else {
                        return Double.compare(e1.getSalary(), e2.getSalary());
                    }
                }).

                forEach(System.out::println);

    }

}
