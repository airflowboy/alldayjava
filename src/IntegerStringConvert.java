public class IntegerStringConvert {

    public static void main(String[] args) {
        String str = "123";
        int i = Integer.parseInt(str);
        System.out.println(i);

        String str1 = String.valueOf(i);
        System.out.println(str + str1);
    }

}
