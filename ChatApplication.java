class ChatApplication {

    static class Sender extends Thread {
        public void run() {
            try {
                System.out.println("Sender started");
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Sending message " + i);
                    Thread.sleep(500);
                }
                System.out.println("Sender finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Receiver extends Thread {
        public void run() {
            try {
                System.out.println("Receiver started");
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Receiving message " + i);
                    Thread.sleep(500);
                }
                System.out.println("Receiver finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        sender.start();
        receiver.start();
    }
}