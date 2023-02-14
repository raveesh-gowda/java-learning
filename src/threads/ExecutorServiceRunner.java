package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task1 extends Thread {
    private final int number;

    public Task1(int number) {
        this.number = number;
    }

    public void run() {
        System.out.println("Task1 Started" + number + "\n");
        for (int i = number * 101; i <= number * 100 + 199; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask1 Done" + number + "\n");
    }
}

class Task2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Task2 Started \n");
        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask2 Done");
    }
}

public class ExecutorServiceRunner {

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(new Task1(1));
        executorService.execute(new Task1(2));
        executorService.execute(new Task1(3));
        executorService.execute(new Task1(4));
        executorService.execute(new Thread(new Task2()));

        System.out.println("Task Three Started \n");

        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n Task Three Done");

        executorService.shutdown();
    }

}
