public class FunctionInterfaceTest implements MathOperation{

    @Override
    public int operate(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperation mathOperation = new FunctionInterfaceTest();
        System.out.println(mathOperation.operate(1, 2));
    }
}
