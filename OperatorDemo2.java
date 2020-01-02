class OperatorDemo2 {
    public static void main(String[] var0) {
        byte var1 = 10;
        byte var2 = 20;
        byte var3 = 30;
        System.out.println(var1 > var2 & var1 > var3);
        System.out.println(var1 > var2 & var1 < var3);
        System.out.println(var1 < var2 & var1 > var3);
        System.out.println(var1 < var2 & var1 < var3);
        System.out.println("--------");
        System.out.println(var1 > var2 && var1 > var3);
        System.out.println(var1 > var2 && var1 < var3);
        System.out.println(var1 < var2 && var1 > var3);
        System.out.println(var1 < var2 && var1 < var3);
        System.out.println("--------");
        System.out.println(var1 > var2 | var1 > var3);
        System.out.println(var1 > var2 | var1 < var3);
        System.out.println(var1 < var2 | var1 > var3);
        System.out.println(var1 < var2 | var1 < var3);
        System.out.println("--------");
        System.out.println(var1 > var2 || var1 > var3);
        System.out.println(var1 > var2 || var1 < var3);
        System.out.println(var1 < var2 || var1 > var3);
        System.out.println(var1 < var2 || var1 < var3);
        System.out.println("--------");
        byte var4 = 3;
        int var5 = 4;
        int var6 = var4 + 1;
        System.out.println(var4 > 3 && var5++ > 4);
        System.out.println(var6);
        System.out.println(var5);
    }
}
