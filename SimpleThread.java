public class SimpleThread implements Runnable {

        public static void main(String[] args) {
            SimpleThread runner = new SimpleThread();  // create the object that has run function
            Thread alpha = new Thread(runner);   // object runner it's a task for thread. Here we create a new thread with a task
            Thread beta = new Thread(runner);
            alpha.setName("Thread Alpha");
            beta.setName("Thread Beta");
            alpha.start();
            beta.start();
        }

        public void run(){  // this function should be implmented!!! Describe what the tread should execute
            for(int i = 0; i<25; i++) {
                String threadName  = Thread.currentThread().getName();
                System.out.println("Now works: " + threadName);
            }
        }
    }

