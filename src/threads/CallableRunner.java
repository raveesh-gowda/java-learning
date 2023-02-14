package threads;

import java.util.concurrent.*;

class CallableTask implements Callable<String> {
    private final String name;

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    }
}

public class CallableRunner {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);
        Future<String> welcomeFuture = executorService.submit(new CallableTask("Raveesh"));
        System.out.println("CallableTask is Submitted");
        String welcomeMessage = welcomeFuture.get();
        System.out.println(welcomeMessage);
        executorService.shutdown();
    }

}
