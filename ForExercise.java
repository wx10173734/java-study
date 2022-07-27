/**
 * @author luozouchen
 * @date 2022/7/27
 * @apiNote
 */
public class ForExercise {
    public static void main(String[] args) {
        int i = 0;
        int count = 0;
        int sum = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 9 == 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("总和:" + sum + "  " + "个数" + count);
        int s = 0;
        int a = 0;
        for (int j = 0; j < 6; j++) {
            a = 5 - j;
            s = j + a;
            System.out.println(j  + "+" + a + "=" + s);
        }
    }
}
