package src.app;

class MyThread extends Thread {

    DataHandler dataHandler;

    public MyThread(String name, DataHandler dataHandler) {
        super(name);
        this.dataHandler = dataHandler;
    }

    public void run() {
        try {
            if (dataHandler != null) {
                dataHandler.getOutput();
            } else {
                System.err.println("DataHandler is null");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while getting output in MyThread.run: " + e.getMessage());
        }
    }

    public void start() {
        super.start();
    }
}


