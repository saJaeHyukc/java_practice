public class HelloWorldApp { // HelloWorldApp이라는 파일을 실행
    // public: 메서드의 접근제어자, public은 누구나 이 메서드에 접근할 수 있다는 의미
    // static: 메서드에 static이 지정되어 있는 경우 이 메서드는 인스턴스 생성없이 실행할 수 있음을 의미
    // void: 메서드의 리턴값이 없음(void: 사전적으로 "팅 빈"이라는 뜻)을 의미
    // main: 프로그램 실행을 위해서 반드시 필요함
    // String[]: 문자열을 나타내는 자바의 자료형 []가 있으므로 한 개가 아닌 여러개의 값으로 이루어진 배열
    // args: String[]자료형에 대한 변수명
    // System.out.println: 표준 출력으로 데이터를 보내는 자바의 내장 메서드로 문자열을 화면에 출력

    public static void main(String[] args){ //main method 이름을 찾음
        System.out.println("Hello World!!");
    }
}
// 저장을 하게되면 자바는 컴파일을 진행하게 되고 확장자가 class라는 것을 생성하게됨 (이것을 실행하게됨)