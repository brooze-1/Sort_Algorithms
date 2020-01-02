class Array2Sum {
    public static void main(String[] var0) {
        int[][] var1 = new int[][]{{22, 66, 44}, {77, 33, 88}, {25, 45, 65}, {11, 66, 99}};
        int var2 = 0;

        for(int var3 = 0; var3 < var1.length; ++var3) {
            for(int var4 = 0; var4 < var1[var3].length; ++var4) {
                var2 += var1[var3][var4];
            }
        }

        System.out.println("总数为：" + var2);
    }
}