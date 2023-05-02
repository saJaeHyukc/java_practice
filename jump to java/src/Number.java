public class Number {
    // 정수 int, long
    /* 표현범위
        int 범위 -2147483648 ~ 2147483647
        long 범위 -9223372036854775808 ~ 9223372036854775807
    */
    int age = 10;
    long conut0fSter = 8764827384923849L; // int 자료형의 최대값보다 큰 경우 접미사 L을 붙여야함 (누락 시 컴파일 에러)

    // 실수 float, double
    float pi = 3.14F; // 실수형은 default가 double이므로 float 변수에 값을 대입할 때에는 접미사 F를 붙여야함 (누락 시 컴파일 에러)
    double morePi = 3.14159265358979323846;
    double d1 = 123.4;
    double d2 = 1.234e2; // e2 -> 10의 제곱

    // 8진수와 16진수 int
    /*
        0으로 시작하면 8진수
        0x로 시작하면 16진수
     */
    int octal = 023; // 십진수: 19
    int hex = 0xc; // 십진수: 12

    // 숫자연산 +, -, *, /, %
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(a+b); // 15
        System.out.println(a-b); // 5
        System.out.println(a*b); // 50
        System.out.println(a/b); // 2
        System.out.println(7 % 3); // 1
        System.out.println(3 % 7); // 3

        // 증감연산 (++. --)
        int i = 0;
        int j = 10;
        i ++;
        j --;
        System.out.println(i); // 1
        System.out.println(j); // 9

        int k = 0;
        System.out.println(k++); // 0 코드 실행 순서로 인해 작동하지 않음 (코드는 위에서 아래로 왼쪽에서 오른쪽으로 순차적으로 진행)
        System.out.println(k); // 1
        System.out.println(++k); // 2 만약 증감시키는 것을 출력하고 싶다면 (--도 동일)
    }
}
