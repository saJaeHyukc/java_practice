public class Casting {

    public static void main(String[] args){
        double a = 1.1;
        double b = 1;
        double b2 = (double) 1; // 손실이 발생하기에 명시적으로 표시
        System.out.println(b); // 1.0'

        // int c = 1.1;
        double d = 1.1; // 1.1
        int e = (int) 1.1; // 손실이 발생하기에 명시적으로 표시
        System.out.println(e); // 1

        // 1 to String
        String f = Integer.toString(1);
        System.out.println(f.getClass()); //getClass 데이터 타입을 알 수 있음

    }
}
