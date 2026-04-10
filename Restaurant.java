class Restaurant {
    boolean foodReady = false;

    synchronized void prepare() throws InterruptedException {
        System.out.println("Chef prepared food");
        foodReady = true;
        notify();
    }

    synchronized void serve() throws InterruptedException {
        while (!foodReady)
            wait();

        System.out.println("Waiter served food");
    }

    public static void main(String[] args) {
        Restaurant r = new Restaurant();

        new Thread(() -> {
            try { r.prepare(); } catch (Exception e) {}
        }).start();

        new Thread(() -> {
            try { r.serve(); } catch (Exception e) {}
        }).start();
    }
}
