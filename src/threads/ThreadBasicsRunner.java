package threads;

class TaskOne extends Thread {

    public void run() {
        //Task One
        System.out.print("\n Task One Started");

        for (int i = 101; i <= 199; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n Task One Done");
    }

}

class TaskTwo implements Runnable {

    @Override
    public void run() {
        //Task Two
        System.out.print("\n Task Two Started");

        for (int i = 201; i <= 299; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n Task Two Done");
    }

}

public class ThreadBasicsRunner {

    public static void main(String[] args) throws InterruptedException {
        TaskOne taskOne = new TaskOne();
        taskOne.setPriority(1); //minimum priority
        taskOne.start();
        taskOne.join();

        TaskTwo taskTwo = new TaskTwo();
        Thread thread = new Thread(taskTwo);
        thread.setPriority(10); //maximum priority
        thread.start();
        thread.join();

        //Task Three
        for (int i = 301; i <= 399; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\n Task Three Done");
    }

}
