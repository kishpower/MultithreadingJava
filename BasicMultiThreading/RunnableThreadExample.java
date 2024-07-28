package BasicMultiThreading;

public class RunnableThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ThreadOne());
        Thread thread2 = new Thread(new ThreadTwo());

        thread1.start();
        thread2.start();
    }
}

class ThreadOne implements Runnable{

    @Override
    public void run() {
        for (int i = 0 ; i < 5 ; i++){
            System.out.println("Thread 1 : i = " + i);
        }
    }
}
class ThreadTwo implements Runnable{

    @Override
    public void run() {
        for (int j = 0 ; j < 5 ; j++){
            System.out.println("Thread 2 : j = " + j);
        }
    }
}
