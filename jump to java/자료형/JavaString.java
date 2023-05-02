public class JavaString {
    public static void main(String[] args)  {
        // 문자열
        String a = "Happy Java";
        String b = "a";
        String c = "123";

        /* new
            객체를 만들 때 사용한다. 객체란 "새로 생성된 자료형"
            문자열을 표현할 때는 첫 번째 방식(리터럴표기)이 좋음 왜? 가독성 이잠, 컴파일 최적화

            리터럴 표기법은 happy java라는 문자열을 JVM의 intern pool이라는 메모리 공간에 저장하고
            다음에 다시 동일한 문자열이 선언될 때는 cache된 문자열을 리턴.

            이와 달리 두번째 방식은 항상 새로운 String 객체를 만듬(메모리 낭비)
         */
        String d = new String("Happy Java");
        String e = new String("a");
        String f = new String("123");

        /* primitive 자료형
            int, long, double, float, boolean, char 같은 자료형을 원시형 자료형 -> new 키워드로 그 값을 생성할 수 없음
            String은 리터럴로 표기가 가능하지만 primitive자료형은 아님 왜? String은 리터럴 표현식을 사용할 수 있도록
            자바에서 특별 대우 해주는 자료형

            [원시 자료형 -> Wrapper 클래스]
            왜? Wrapper클래스를 사용하면 값 대신 객체를 주고 받을 수 있어 코드를 객체 중심적으로 작성하는데 유리
            또한 멀티스레딩 환경에서 동기화를 지원하기 위해서도 Wrapper클래스는 반드시 필요
            int -> integer
            long -> Long
            double -> Double
            float -> Float
            boolean -> Boolean
            char -> Char
         */

        // 문자열 내장 메서드
        // equals: 두개의 문자열이 동일한지를 비교하여 결고값을 리턴
        String hello1 = "hello";
        String java = "java";
        String hello2 = "hello";
        String hello3 = new String("hello");

        System.out.println(hello1.equals(hello2)); // false
        System.out.println(hello1.equals(java)); // true

        System.out.println(hello1.equals(hello3)); // true
        System.out.println(hello1 == hello3); // false == 는 두개의 자료형이 동일한 객체인지를 판별할 때 사용하는 연산자이기 때문에 false 리턴

        // indexOf: 문자열에서 특정 문자열이 시작되는 위치(인덱스)를 리턴
        String helloJava = "Hello Java";
        System.out.println(helloJava.indexOf("Java")); // 6

        // contains: 문자열에서 특정 문자열이 포함되어 있는지의 여부를 리턴
        System.out.println(helloJava.contains("Java")); // true

        // charAt: 문자열에서 특정 위치의 문자(char)를 리턴한다
        System.out.println(helloJava.charAt(6)); // "J"

        // replaceAll: 문자열 중 특정 문자열을 다른 문자열로 바꾸고자 할 때 사용
        System.out.println(helloJava.replaceAll("Java", "World")); // Hello World

        // substring: 문자열 중 특정 부분을 뽑아낼 경우에 사용
        System.out.println(helloJava.substring(0, 4)); // Hell

        // toUpperCase: 문자열을 모두 대문자로 변경할 때 사용(소문자는 toLowerCase)
        System.out.println(helloJava.toUpperCase()); // HELLO JAVA

        // split: 문자열을 특정 구분자로 나누어 문자열 배열로 리턴
        String abcd = "a:b:c:d";
        String[] result = helloJava.split(":"); // {"a". "b", "c", "d"}

        // 문자열 포매팅
        /*
        %s -> 문자열
        %c -> 문자 1개
        %d -> 정수
        %f -> 부동소수
        %o -> 8진수
        %x -> 16진수
        %% -> Literal % (문자 % 자체)
         */
        System.out.println(String.format("I eat %d apples.", 3)); // 숫자 바로 대입 %d
        System.out.println(String.format("I eat %s apples.", "five")); // 문자열 바로 대입 %s

        int number = 3;
        String day = "three";
        System.out.println(String.format("I eat %d apples.", number)); // 숫자 값을 나타내는 변수로 대입
        System.out.println(String.format("I ate %d apples. so I was sick for %s days.", number, day)); // 2개 이상의 값 넣기

        // %s는 자동으로 전달되는 파라미터 값을 문자열로 바꾸어 사용함
        System.out.println(String.format("I have %s apples",  3));  // "I have 3 apples"
        System.out.println(String.format("rate is %s", 3.234));  // "rate is 3.234"

        // %d와 %를 같이 쓸 때는 %%를 쓴다
        // System.out.println(String.format("Error is %d%.", 98)); Error발
        System.out.println(String.format("Error is %d%%.", 98));  // "Error is 98%."

        // 포맷 코드와 숫자 함께 사용하기
        // 1. 정렬과 공백 %10s -> 전체 길이가 10개인 문자열 공간에서 대입되는 값을 오르쪽으로 정렬하고 그 앞의 나머지는 공백으로 남김
        System.out.println(String.format("%10s", "hi")); // "          hi"
        System.out.println(String.format("%-10s", "hi")); // "hi          "

        // 2. 소수점 표현하기 . 뒤에 4는 소수점 네 번째 자리까지만 표시/ 앞은 공백 표시
        System.out.println(String.format("%.4f", 3.42134234)); // 3.4213
        System.out.println(String.format("%10.4f", 3.42134234));  // '    3.4213'

        // String.format 과 System.out.printf의 차이는
        // 전자는 문자열을 리턴하는 메서드, 후자는 문자열을 출력하는 메서드
        System.out.printf("I eat %d apples.", 3); // "I eat 3 apples."



    }
}
