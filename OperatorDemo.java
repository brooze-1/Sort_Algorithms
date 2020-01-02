class OperatorDemo {
    OperatorDemo() {
    }

    public static void main(String[] var0) {
        byte var1 = 10;
        byte var2 = 20;
        byte var3 = 30;
        System.out.println(var1 > var2 & var1 > var3);
        System.out.println(var1 > var2 & var1 < var3);
        System.out.println(var1 < var2 & var1 > var3);
        System.out.println(var1 < var2 & var1 < var3);
        System.out.println("--------");
        System.out.println(var1 > var2 | var1 > var3);
        System.out.println(var1 > var2 | var1 < var3);
        System.out.println(var1 < var2 | var1 > var3);
        System.out.println(var1 < var2 | var1 < var3);
        System.out.println("--------");
        System.out.println(var1 > var2 ^ var1 > var3);
        System.out.println(var1 > var2 ^ var1 < var3);
        System.out.println(var1 < var2 ^ var1 > var3);
        System.out.println(var1 < var2 ^ var1 < var3);
        System.out.println("--------");
        System.out.println(var1 > var2);
        System.out.println(var1 <= var2);
        System.out.println(var1 > var2);
        System.out.println(var1 <= var2);
        System.out.println(var1 > var2);
    }
}
