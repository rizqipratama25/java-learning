class App {
    public static void main(String[] args) {
        // conversion
        int num1 = 10;
        long num2 = num1;
        System.out.println(num2);

        // casting
        byte num3 = 127;
        int num4 = (int) num3;
        System.out.println(num4);

        // type promotion
        byte a = 10;
        byte b = 20;
        int c = a + b;
        System.out.println(c);
    }
}