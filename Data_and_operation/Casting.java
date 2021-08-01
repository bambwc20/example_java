package Data_and_operation;

public class Casting {
    public static void main(String[] args) {
        double a = 1.1;

        double b = 1;
        double b2 = (double) 1; //같은 코드이다.

        System.out.println(b); //1.0   1은 정수이지만, 실수에 넣으면 자동으로 실수로 컨버팅이 된다.

        //int c = 1.1;
        double d = 1.1;
        int e = (int) 1.1; //1.1을 int로 강제로 바꾸는 코드이다. 1.1은 실수이지만 (int) 1.1은 정수 1이다. 
        System.out.println(e); //1
        //손실이 없다면 자동으로 케스팅해주지만 손실이 있다면 자동으로 해주지 않는다. 
    }
}
