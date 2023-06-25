public class Main {
    public static void main(String[] args) {
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 1000L;
        float e = 100.5F;
        double f = 100.5;

        System.out.println("Переполнение типа byte: " + (byte)(a + 10));
        System.out.println("Переполнение типа short: " + (short)(b + 10));
        System.out.println("Переполнение типа int: " + (c + 10));

        System.out.println("Арифметические операции:");
        System.out.println(d + 100);
        System.out.println(e - 100);
        System.out.println(f * 5);
        System.out.println(c / 10);
        System.out.println(c % 10);

        System.out.println("Логические операции:");
        System.out.println(a + b < c);
        System.out.println(a + c < b);
        System.out.println(a * b < c && a * b < d);
        System.out.println(a * b < c || a * b > d);
        System.out.println(!(a > b));

        System.out.println("Вычисления комбинаций типов данных int и double");
        int g = 500;
        System.out.println(f + g);
        System.out.println(f - g);
        System.out.println(f * g);
        System.out.println(g / f);
        System.out.println(g % f);
    }
}
