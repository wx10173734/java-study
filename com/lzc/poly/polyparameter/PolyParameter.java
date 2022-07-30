package com.lzc.poly.polyparameter;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class PolyParameter {
    public static void main(String[] args) {
        Employee staff = new Staff("lzc",2000);
        Employee manager = new Manager("cp",5000,2000);
        showEmpAnnal(staff);
        showEmpAnnal(manager);
        testWork(staff);
        testWork(manager);


    }
    static void showEmpAnnal(Employee e){
        System.out.println(e.getAnnua());
    }
    static void testWork(Employee e){
        if (e instanceof Staff){
            ((Staff) e).work();
        }else if (e instanceof Manager){
            ((Manager) e).manage();
        }
    }

}
