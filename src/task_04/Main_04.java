package task_04;

public class Main_04 {

    public static void main(String[] args) {

        Fruits fruits = new Fruits();
        fruits.start();
        fruits./* переривається цей потік **/

        showVeges();
    }

    private static /* ??? **/ getVeges() {
        return new String[]{"tomato", "cucumber", "carrot"};
    }

    private static void showVeges(String[] veges) {
        for (String veg : veges) System.out.println(veg);
    }
}
