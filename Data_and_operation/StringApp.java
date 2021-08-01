package Data_and_operation;

public class StringApp {
    public static void main(String[] args) {
        System.out.println("Hello World");
        // System.out.println('Hello World!'); Java에서는 작은 따옴표는 특수한 데이터 타입을 가리킨다. //Chracter(문자)
        System.out.println('H'); //''는 한개의 문자를 Chracter 데이터 타입이라고 가리킨다. 이게 모여 있는 것이 String(문자열)
        System.out.println("H");

        System.out.println("Hello " 
        + "World"); //+는 줄바꿈이 아니다.

        System.out.println("Hello \nWorld"); //newLine 의 약자

        //escape
        System.out.println("Hello \"World\""); //역슬레쉬 뒤에 따옴표는 일반 문자열이 된다. //Hello "World"

    }
}
