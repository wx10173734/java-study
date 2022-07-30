package com.lzc.polyarr_;

/**
 * @author luozouchen
 * @date 2022/7/30
 * @apiNote
 */
public class PolyArray {
    public static void main(String[] args) {
        Person[] persons = new Person[5];
        persons[0] = new Person("jack", 20);
        persons[1] = new Student("lzc", 12, 90);
        persons[2] = new Student("cp", 20, 80);
        persons[3] = new Teacher("wd", 18, 7000);
        persons[4] = new Teacher("tu", 41, 9000);
        for (int i = 0; i < persons.length; i++) {
            //person[i] 编译类型时person,运行类型是根据实际情况有jvm来判断
            System.out.println(persons[i].say());
            if (persons[i] instanceof Student) {//判断persons[i]的运行类型是不是student
                //Student student = (Student) persons[i];
                //student.study();
                ((Student)persons[i]).study();
            } else if (persons[i] instanceof Teacher) {
                Teacher teacher = (Teacher) persons[i];
                teacher.teach();
            }else if (persons[i] instanceof Person){
                //System.out.println("你的类型有误，请检查");
            }else {
                System.out.println("你的类型有误，请检查");

            }
        }
    }
}
