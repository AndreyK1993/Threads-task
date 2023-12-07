package task_02;

// Виводяться фрукти, потім овочі
public class Main_02 {

    public static void main(String[] arg) throws InterruptedException {

        Fruits_02 fruits = new Fruits_02();
        fruits.start();
        fruits.join();

        showVeges(getVeges());
    }

    private static String[] getVeges() {

        return new String[]{"tomato", "cucumber", "carrot"};
    }

    private static void showVeges(String[] veges) {

        for (String veg : veges) System.out.println(veg);
    }
}
