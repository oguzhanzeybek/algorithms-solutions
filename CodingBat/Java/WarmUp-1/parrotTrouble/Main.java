package parrotTrouble;

public class Main {
    public static void main(String[] args) {
        Main objMain = new Main();
        System.out.println(objMain.parrotTrouble_solution(true, 2));   // true
        System.out.println(objMain.parrotTrouble_solution(true, 6));   // true
        System.out.println(objMain.parrotTrouble_solution(true, 12));  // false
        System.out.println(objMain.parrotTrouble_solution(false, 20)); // false
        System.out.println(objMain.parrotTrouble_solution(false, 21)); // false
        System.out.println(objMain.parrotTrouble_solution(false, 5));  // false
    }

    public boolean parrotTrouble_solution(boolean talking, int hours) {
        if (talking && (hours < 7 || hours > 20)) {
            return true;
        } else {
            return false;
        }
    }
}
