package task_04;

class Fruits_04 {

    public void run() {
        for (String fruit : getFruits()) {
            System.out.println(fruit);
        }
        try {
            Thread./* поток засинає на 2 секунди **/
        } catch (InterruptedException e) {
            System.out.println("Thread got interrupted");
        }
    }

    private /* ??? **/ getFruits() {
        return new String[] {"orange", "apple", "plum"};
    }
}
