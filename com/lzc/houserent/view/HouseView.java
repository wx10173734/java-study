package com.lzc.houserent.view;

import com.lzc.houserent.domain.House;
import com.lzc.houserent.service.HouseService;
import com.lzc.houserent.utils.Utility;
import com.sun.scenario.effect.impl.prism.PrImage;

/**
 * @author luozouchen
 * @date 2022/7/31
 * @apiNote
 */
public class HouseView {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接受用户选择
    private HouseService houseService = new HouseService(2);//设置数组大小为10

    //编写addHouse，接收输入，创建house对象，调用add方法
    public void addHouse() {
        System.out.println("===========添加房屋===========");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租金：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        //创建一个信息的house对象，注意id是系统分配的，用户不能输入
        House house = new House(0, name, phone, address, rent, state);
        if (houseService.add(house)) {
            System.out.println("===========添加房屋成功===========");
        } else {
            System.out.println("===========添加房屋失败===========");
        }
    }

    public void deleteHouse() {
        System.out.println("===========删除房屋信息===========");
        System.out.print("请输入待删除房屋的编号(-1退出):");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("===========放弃删除房屋信息===========");
            return;
        }
        //该方法本身就有循环判断的逻辑，必须输出Y/N
        char choice = Utility.readConfirmSelection();//
        if (choice == 'Y') {
            //真的删除
            if (houseService.delete(delId)) {
                System.out.println("===========删除房屋信息成功===========");
            } else {
                System.out.println("===========房间编号不存在，删除失败===========");
            }
        } else {
            System.out.println("===========放弃删除房屋信息===========");
        }
    }

    //编写listhouses显示房屋列表
    public void listHouse() {
        System.out.println("===========房屋列表===========");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] house = houseService.list();//得到所有房屋信息
        for (int i = 0; i < house.length; i++) {
            if (house[i] == null) {//如果为空不要显示
                break;
            }
            System.out.println(house[i].toString());
        }
        System.out.println("===========房屋列表显示完毕===========");
    }

    //完成退出确认
    public void exit() {
        //使用Utility提供方法，完成确认
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    public void findHouse() {
        System.out.println("===========查找房屋信息===========");
        System.out.print("请输入待查找房屋的编号(-1退出):");
        int findId = Utility.readInt();
        if (findId == -1) {
            System.out.println("===========放弃查找房屋信息===========");
            return;
        }
        House house = houseService.find(findId);
        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("===========查找房屋信息id不存在===========");
        }
    }

    public void updateHouse() {
        System.out.println("===========修改房屋信息===========");
        System.out.print("请输入待修改房屋的编号(-1退出):");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("===========放弃修改房屋信息===========");
            return;
        }
        House house = houseService.find(updateId);
        System.out.print("姓名(" + house.getName() + ")");
        String name = Utility.readString(8,"");//这里如果用户回车表示不修改信息，默认""
        System.out.print("电话(" + house.getPhone() + ")");
        String phone = Utility.readString(12);
        System.out.print("地址(" + house.getAddress() + ")");
        String address = Utility.readString(16);
        System.out.print("月租金(" + house.getRent() + ")");
        int rent = Utility.readInt();
        System.out.print("状态(" + house.getState() + ")");
        String state = Utility.readString(3);
        House newHouse = new House(updateId, name, phone, address, rent, state);
        boolean update = houseService.update(newHouse, updateId);
        if (!update) {
            System.out.println("===========修改失败===========");
        } else {
            System.out.println("===========修改成功===========");
        }
    }

    //显示主菜单
    public void mainMenu() {
        do {
            System.out.println("===========房屋出租系统菜单===========");
            System.out.println("\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t3 删 除 房 屋 信 息");
            System.out.println("\t\t\t4 修 改 房 屋 信 息");
            System.out.println("\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t6 退           出");
            System.out.println("请输入你的选择(1-6)");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    deleteHouse();
                    break;
                case '4':
                    updateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }
}
