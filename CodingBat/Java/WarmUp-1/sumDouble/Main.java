package sumDouble;

public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.sumDouble(1, 2));
        System.out.println(obj.sumDouble(3, 2));  // 3 döner
        System.out.println(obj.sumDouble(2, 2));  // 12 döner (çiftlenmiş)
    }

    public int sumDouble(int a, int b) {
        int sum = a + b;
        if (a == b) {
            return sum * 2;
        }
        return sum;
    }
}
