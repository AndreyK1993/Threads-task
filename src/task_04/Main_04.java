package task_04;

public class Main_04 {

    public static void main(String[] args) {

        Fruits_04 fruits = new Fruits_04();
        fruits.start();
        fruits.interrupt();/* переривається цей потік **/
        showVeges();
    }

    private static String[] getVeges() {

        return new String[]{"tomato", "cucumber", "carrot"};
    }

    private static void showVeges() {

        for (String veg : veges) System.out.println(veg);
    }
}
