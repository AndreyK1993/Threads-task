package task_03;

public class Main_03 {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("Thread group");
        getFruits(group);
        getVeges(group);
        getBerries(group);
    }

    private static void getFruits(ThreadGroup group) {
        Fruits fruits = new Fruits(group, "\nFruits:");
        fruits.start();
        fruits./* чекає, поки цей потік помре, і приєднує інший потік **/
    }

    private static void getVeges(ThreadGroup group) throws InterruptedException {
        Veges veges = new Veges(group, "\nVeges:");
        veges.start();
        veges./* чекає, поки цей потік помре, і приєднує інший потік **/
    }

    private static /* ??? **/ getBerries(ThreadGroup group) throws InterruptedException {
        Berries berries = new Berries(group, "\nBerries:");
        berries.start();
        berries/* чекає, поки цей потік помре, і приєднує інший потік **/
    }
}
