import java.util.Scanner;

class MyArrayDemo {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("请输入三个数据：");
        int var3 = 0;
        int[] var2 = new int[3];
        System.out.println(var2);

        do {
            var2[var3] = var1.nextInt();
            ++var3;
        } while(var3 < var2.length);

        int var4;
        for(var4 = 0; var4 < var2.length; ++var4) {
            System.out.println("arr[" + var4 + "]=" + var2[var4]);
        }

        var4 = 0;

        for(int var5 = 1; var5 < var2.length; ++var5) {
            var4 = var2[var5 - 1] >= var2[var5] ? var2[var5 - 1] : var2[var5];
        }

        System.out.println("arr数组中最大值为：" + var4);
    }
}
