public class FunctionInterfaceTest2 {

    public static void main(String[] args) {
        MathOperation mo = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };

        System.out.println(mo.operate(1, 2));
    }
}
