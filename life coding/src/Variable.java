public class Variable {

    public static void main(String[] args){

        // 자바는 데이터타입을 명확하게 표시해줘야함
        // 변수의 데이터 타입을 지정하는 이유는 지정해둔 데이터 타입과 다른 값이 입력될 경우
        // java가 complie하지 않고 걸러주기 때문임
        // 덕분에 추후 각 변수마다 어떤 데이터 타입의 값이 입력돼있는지 확신
        int a = 1; // Number -> integer
        System.out.println(a); // 1

        double b = 1.1; // real number -> double
        System.out.println(b); // 1.1

        String c = "Hello World";
        System.out.println(c); // Hello World

    }
}
