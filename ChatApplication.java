class ChatApplication {

    static class Sender extends Thread {
        public void run() {
            try {
                System.out.println("Sender thread started");
                for (int i = 1; i <= 3; i++) {
                    Thread.sleep(1000);
                    System.out.println("Sending message " + i);
                }
                System.out.println("Sender thread finished");
            } catch (InterruptedException e) {
                System.out.println("Sender interrupted");
            }
        }
    }

    static class Receiver extends Thread {
        public void run() {
            try {
                System.out.println("Receiver thread started");
                for (int i = 1; i <= 3; i++) {
                    Thread.sleep(1200);
                    System.out.println("Receiving message " + i);
                }
                System.out.println("Receiver thread finished");
            } catch (InterruptedException e) {
                System.out.println("Receiver interrupted");
            }
        }
    }

    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        // Thread lifecycle: NEW → RUNNABLE → RUNNING → TERMINATED
        sender.start();
        receiver.start();

        try {
            sender.join();
            receiver.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("Chat application finished");
    }
}
