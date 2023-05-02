public class JavaStringBuffer {

    public static void main (String[] args){
        // StringBuffer는 문자열을 추가하거나 변경할 때 주로 사용하는 자료형
        // append -> 객체를 생성하고 문자열을 생성
        // 예제 1
        StringBuffer sb1 = new StringBuffer();  // StringBuffer 객체 sb 생성
        sb1.append("hello");
        sb1.append(" ");
        sb1.append("jump to java");
        String result1 = sb1.toString(); // toString()를 이요하여 String 자료형으로 변경
        System.out.println(result1); // "hello jump to java"

        // 예제 2
        String result2 = "";
        result2 += "hello";
        result2 += " ";
        result2 += "jump to java";
        System.out.println(result2);  // "hello jump to java"
        /*
            두 개의 예제의 결과는 동일하지만 내부적으로 객체가 생성되고 메모리가 사용하는 과정은 다름
            StringBuffer 객체는 한번만 생성된다 (1개의 객체) -> 생성하면 값 변경 o -> mutable
            String 자료형은 + 있을 때 마다 새로운 객체가 생성된다 (4개의 객체) -> 생성하면 값 변경 x -> immutable
            toUppperCase등의 메서드를 보면 변경되는 것처럼 보이나 해당 메서드 수행 시 또 다른 String 객체를 생성하여 리턴할 뿐 (5개의 객체)

            StringBuffer가 좋은 선택?
            StringBuffer는 String보다 무거운 편에 속함 new StringBuffer()로 객체를 생성하는 것은 일반 String을 사용하는 것보다
            메모리 사용량도 많고 속도도 느림
            상황에 따라 다름
            StringBuffer -> 문자열 추가나 변경 등의 작업이 많을 경우
            String -> 문자열 변경 작업이 거의 없는 경우
         */

        // StringBuilder -> StringBuffer와 사용법은 동일함
        /*
        StringBuffer는 멀티 스레드 환경에서 안전하다는 장점
        StringBuilder는 StringBuffer보다 선으이 우수한 장점

        따라서 동기화를 고려할 필요가 없는 상황에서는 StringBuffer보다는 StringBuilder를 사용하는 것이 유리
         */
        StringBuilder sb2 = new StringBuilder();
        sb2.append("hello");
        sb2.append(" ");
        sb2.append("jump to java");
        String result3 = sb2.toString();
        System.out.println(result3); // hello jump to java

        // insert -> 특정 위치에 원하는 문자열을 삽입할 수 있음
        StringBuffer sb3 = new StringBuffer();
        sb3.append("jump to java");
        sb3.insert(0, "hello ");
        System.out.println(sb3.toString()); // hello jump to java

        // substring -> 문자열 중 특정 부분을 뽑아낼 경우에 사용
        StringBuffer sb4 = new StringBuffer();
        sb4.append("Hello jump to java");
        System.out.println(sb4.substring(0, 4));

    }
}
