
public class DemoIf {

    public static void main(String[] args) {
        int num = 4085;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("ODD");
        }
        int x, y, z;
        x = 3;
        y = 6;
        z = 5;
        if (x > y && x > z) {
            System.out.println(x);

        } else if (y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
    }
}
