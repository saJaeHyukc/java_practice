public class Boolean {
    // 불 True, False
    boolean isSuccess = true;
    boolean isTest = false;

    public static void main(String[] args) {
        // 불연산
        System.out.println(2 > 1); // True
        System.out.println(1 == 2); // False
        System.out.println(3 % 2 == 1); // True
        System.out.println("3".equals("2")); // False

        // 조건문
        int base = 180;
        int height = 185;
        boolean isTall = height > base;

        if (isTall) {
            System.out.println("키가 큽니다.");
        }

        int i = 3;
        boolean isOdd = i % 2 == 1;
        System.out.println(isOdd); // True
    }
}
