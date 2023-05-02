public class Letter {

    public static void main (String[] args){
        // 다른 사람이 파악할 수 있도록 코드 작성 ******
        // * 변수의 효용: 어떤 값을 넣어야 하는 부분에 '변수'를 사용함으로써,
        // 특정 값의 수정이 필요할 때 변수하나만 수정하면 모두 일괄 수정 적용이 일어나는 폭발적인 효과가 있다.
        // * 변수의 활용상황: "값이 변할 수 있는 부분", 즉 고객 나이, 직업, 신분 등 정보가 변할 수 있는 부분을 변수로 해 사용하면 유용할 것이다
        String name = "egoing";
        System.out.println("Hello,"+name+" ... "+name+" bye" );

        double VAT = 10.0;
        System.out.println(VAT);
    }
}
