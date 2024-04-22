public class Test {

    public static void main(String[] args) {
        int num[][] = new int[3][1];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                num[i][j] = 10;
                System.out.println("num ["+ i + "]" + "[" + j + "]" + "=" + num[i][j]);
            }
        }
    }

}
