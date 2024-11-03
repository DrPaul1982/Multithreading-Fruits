package src.app;

import java.util.concurrent.atomic.AtomicInteger;

public class DataHandler {

    String[] fruits = new DataRepository().getData();

    public void getOutput() {
        try {
        synchronized (this) {
            StringBuilder sb = new StringBuilder();
            AtomicInteger count = new AtomicInteger(1);
            for (String fruit : fruits) {
                sb.append(String.format("(%d) %s ",
                        count.getAndIncrement(), fruit));
            }
            System.out.println(Thread.currentThread().getName() + ": " + sb);
        }
    }
        catch (Exception e) {
            System.out.println("An error occurred while getting output in DataHandler.getOutput: " + e.getMessage());
        }
    }
}

