package task_04;

public class Main04 {

    public static void main(String[] args) {

        Fruits04 fruits = new Fruits04();
        fruits.start();
        fruits.interrupt();/* переривається цей потік **/
        showVeges();
    }

    private static String[] getVeges() {

        return new String[]{"tomato", "cucumber", "carrot"};
    }

    private static void showVeges() {
        String[] veges = getVeges();
        for (String veg : veges) System.out.println(veg);
    }
}
