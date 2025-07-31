package monkeyTrouble_question;

public class Main {

    public static void main(String[] args) {
        Main objMain = new Main();  // Main sınıfından nesne oluşturuldu
        System.out.println(objMain.monkeyTrouble(true, true)); //return true
        System.out.println(objMain.monkeyTrouble(true, false)); //return false
        System.out.println(objMain.monkeyTrouble(false, true)); //return false
        System.out.println(objMain.monkeyTrouble(false, false)); //return true
    }

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        if (aSmile == bSmile) {
            return true;
        } else {
            return false;
        }

    }
}
