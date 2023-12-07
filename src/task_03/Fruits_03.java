package task_03;

class Fruits_03 extends Thread{

    public Fruits_03(Thread group, String name) {

        super(group, name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (String fruit : getFruits()) {
            System.out.println(fruit);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    private static String[] getFruits() {

        return new String[] {"orange", "apple", "plum"};
    }
}
