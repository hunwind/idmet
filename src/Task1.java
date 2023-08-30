public class Task1 {

        public static void main(String[] args) {

            Thread thread1 = new Thread(new Task(1, 50));
            Thread thread2 = new Thread(new Task(51, 100));


            thread1.start();
            System.out.println("1ci:"+thread1.getName());

            thread2.start();
            System.out.println("2ci:"+thread2.getName());
        }

        public static class Task implements Runnable {
            int start;
            int end;

            public Task(int start, int end) {
                this.start = start;
                this.end = end;
            }

            @Override
            public void run() {
                for (int i = start; i <= end; i++) {
                    System.out.println(i);
                }
            }
        }
    }






