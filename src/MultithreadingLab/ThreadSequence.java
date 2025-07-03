package MultithreadingLab;

class AverageThread extends Thread {
    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double avg = sum / 10.0;
        System.out.println("Average of first 10 numbers is: " + avg);
    }
}

class SquareThread extends Thread {
    int[] arr = {1, 20, 50, 15, 30};

    public void run() {
        System.out.println("Squares of array elements:");
        for (int num : arr) {
            System.out.println(num + "^2 = " + (num * num));
        }
    }
}

public class ThreadSequence {
    public static void main(String[] args) {
        AverageThread t1 = new AverageThread();
        SquareThread t2 = new SquareThread();

        t1.start();
        try {
            t1.join(); // t2 waits till t1 finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t2.start();
    }
}

