package diff21_solution;

public class Main {

    public static void main(String[] args) {

        Main obj = new Main();
        System.out.println(obj.diff21(12)); //9
        System.out.println(obj.diff21(32)); //22(11*2)
        System.out.println(obj.diff21(21)); //0
        System.out.println(obj.diff21(19)); //2
        System.out.println(obj.diff21(22)); //2(1*2)

    }

    public int diff21(int a) {
        if (a < 21) {
            return 21 - a;
        } else {
            return (a - 21) * 2;
        }

    }
}
