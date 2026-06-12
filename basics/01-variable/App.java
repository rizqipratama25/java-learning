class App {
    public static void main(String[] args) {

        // Integer data type
        // int -> 4 bytes -> -2,147,483,648 to 2,147,483,647
        int num1 = 3;
        int num2 = 5;
        int result = num1 + num2;
        System.out.println(result);

        // long -> 8 bytes -> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        long num3 = 10l;
        System.out.println(num3);

        // short -> 2 bytes -> -32,768 to 32,767
        short num4 = 10;
        System.out.println(num4);

        // byte -> 1 byte -> -128 to 127
        byte num5 = 10;
        System.out.println(num5);

        // Float data type
        // float -> 4 bytes -> -2,147,483,648 to 2,147,483,647
        float num6 = 3.14f;
        System.out.println(num6);

        // double -> 8 bytes -> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        double num7 = 3.14;
        System.out.println(num7);

        // char -> 2 bytes
        char char1 = 'A';
        System.out.println(char1);

        // boolean -> 1 byte -> true or false
        boolean bool1 = true;
        System.out.println(bool1);
    }
}