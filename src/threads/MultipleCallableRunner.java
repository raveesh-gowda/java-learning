package threads;

import java.util.List;
import java.util.concurrent.*;

class MultipleCallableTask implements Callable<String> {
    private final String name;

    public MultipleCallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello " + name;
    }
}

public class MultipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<MultipleCallableTask> tasks = List.of(new MultipleCallableTask("Raveesh"),
                new MultipleCallableTask("Ranga"),
                new MultipleCallableTask("Adam"));

        List<Future<String>> welcomeAll = executorService.invokeAll(tasks);
        for (Future<String> welcomeFuture : welcomeAll) {
            System.out.println("List " + welcomeFuture.get());
        }

        String welcomeMessage = executorService.invokeAny(tasks);
        System.out.println("String " + welcomeMessage);

        executorService.shutdown();
    }
}

