package task_03;

class Berries {

    public Berries(Thread group, String name) {
        super(group, name);
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (String berry : getBerries()) {
            System.out.println(berry);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ie) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    private /* ??? **/ getBerries() {
        return new String[]{"cherry", "strawberry", "raspberry"};
    }
}
