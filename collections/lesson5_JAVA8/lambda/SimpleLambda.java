package collections.lesson5_JAVA8.lambda;

public class SimpleLambda {
    public static void main(String[] args) {

//        //realization without lambda expression
//        Operation add = new Operation() {
//            public int calc(int x, int y) {
//                return x + y;
//            }
//        };

        //realization with lambda expression
        Operation add = (x, y) -> x + y;
        Operation sub = (x, y) -> x - y;
        Operation div = (x, y) -> x / y;
        Operation multiply = (x, y) -> x * y;

        int resultAdd = add.calc(20, 30);
        int resultSub = sub.calc(20, 30);
        int resultDiv = div.calc(20, 30);
        int resultMult = multiply.calc(20, 30);
        System.out.println(resultAdd);
        System.out.println(resultSub);
        System.out.println(resultDiv);
        System.out.println(resultMult);


        String palindrome = "Dot saw I was Tod";
        StringBuilder sb = new StringBuilder(palindrome);
        sb.reverse();  // reverse it
        System.out.println(sb);

    }
}

@FunctionalInterface
interface Operation {
    int calc(int x, int y);
}
