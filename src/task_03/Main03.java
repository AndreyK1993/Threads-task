package task_03;

public class Main03 {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Thread group");
        getFruits(group);
        getVeges(group);
        getBerries(group);
    }

    private static void getFruits(ThreadGroup group) throws InterruptedException {
        Fruits03 fruits = new Fruits03(group, "\nFruits:");
        fruits.start();
        fruits.join();/* чекає, поки цей потік помре, і приєднує інший потік **/
    }

    private static void getVeges(ThreadGroup group) throws InterruptedException {
        Veges03 veges = new Veges03(group, "\nVeges:");
        veges.start();
        veges.join();/* чекає, поки цей потік помре, і приєднує інший потік **/
    }

    private static void getBerries(ThreadGroup group) throws InterruptedException {
        Berries berries = new Berries(group, "\nBerries:");
        berries.start();
        berries.join();/* чекає, поки цей потік помре, і приєднує інший потік **/
    }
}
