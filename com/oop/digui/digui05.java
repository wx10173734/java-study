package com.oop.digui;

/**
 * @author luozouchen
 * @date 2022/7/29
 * @apiNote
 */
public class digui05 {
    public static void main(String[] args) {
        /**
         * 思路
         * 先创建迷宫，用二维数组表示，int[][] map = new int[8][7]
         * 规定map数组元素值，0表示可以走，1表示障碍物
         */
        int[][] map = new int[8][7];
        //3.将最上面一行和最下面的一行全部设置为1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //3.将最左边面和最右边一列全部设置为1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //设置障碍物
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;
        //输出当前的地图
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        //使用findway给老鼠找路
        findWay(map, 1, 1);
        System.out.println("=========找路的情况如下=====");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 此方法专门找路径
     * 如果找到返回true,否则false
     * map就是二维数组，表示迷宫
     * i,j就是老鼠的位置，初始化的位置为1，1
     * 因为是递归的找路，所以规定map数组各个值的含义
     * 0表示可以走，1表示障碍物 2表示可以走，3表示走过，但是走不通是死路
     * 当map[6][5]=2就说明找到通路，结束，否则继续找
     * 确定老鼠找路的策略下-》右-》上->左
     *
     * @param map
     * @param i
     * @param j
     * @return
     */
    static boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {//当前位置0说明可以走
                //假定可以走通
                map[i][j] = 2;
                //使用找路策略，来确定该位置是否真的可以走通
                //下-》右-》上->左
                if (findWay(map, i + 1, j)) {//先尝试走下
                    return true;
                } else if (findWay(map, i, j + 1)) {//右
                    return true;
                } else if (findWay(map, i - 1, j)) {//上
                    return true;
                } else if (findWay(map, i, j - 1)) {//左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }
            } else {//map[i][j]=1,2,3
                return false;
            }
        }
    }
}
