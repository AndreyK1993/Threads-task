package task_02;

// Виводяться фрукти, потім овочі
public class Main_02 {

    public static void main(String[] arg) throws InterruptedException {

        /* ??? **/ = new Fruits();
        fruits.start();
        fruits./* чекає, поки цей потік помре, і приєднує інший потік **/

        showVeges(getVeges());
    }

    private static String[] getVeges() {
        return new String[]{"tomato", "cucumber", "carrot"};
    }

    private static void showVeges(/* ??? **/) {
        for (String veg : veges) System.out.println(veg);
    }
}
