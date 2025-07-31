public class Main {
    public boolean sleepIn(boolean weekday, boolean vacation) {
        if(!weekday || vacation){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.sleepIn(false, false)); // true döner
        System.out.println(obj.sleepIn(true, false));  // false döner
        System.out.println(obj.sleepIn(false, true));  // true döner
    }
}
