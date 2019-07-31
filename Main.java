public class Main {
    public static void main(String[] args) {
        calcEquation(1, 2, 3);
        calcEquation(5, -7, 2);
    }

    private static void calcEquation(float a, float b, float c) {
        double x, y, d, f;
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Not an equation");
        } else if (a == 0 && b != 0 && c == 0) {
            x = 0;
            System.out.println(x);
        } else if (a == 0 && b != 0 && c != 0) {
            x = (-c) / b;
            System.out.println(x);
        } else if (a != 0 && b == 0 && c != 0) {
            f = (-c) / a;
            if (f < 0) {
                System.out.println("No real roots");
            } else {
                x = Math.sqrt(f);
                System.out.println(x);
            }
        } else if (a != 0 && b == 0 && c == 0) {
            x = 0;
            System.out.println(x);
        } else if (a != 0 && b != 0 && c == 0) {
            x = 0;
            y = (-b) / a;
            System.out.println(x + " " + y);
        } else {
            d = Math.pow(b, 2) - 4 * a * c;
            if (d < 0) {
                System.out.println("No real roots");
            } else if (d == 0) {
                x = (-b) / (2 * a);
                System.out.println(x);
            } else {
                x = (-b + Math.sqrt(d)) / (2 * a);
                y = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println(x + " " + y);
            }
        }
    }
}
