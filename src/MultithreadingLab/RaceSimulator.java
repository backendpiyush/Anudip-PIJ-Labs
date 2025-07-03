package MultithreadingLab;

class Racer extends Thread {
    public Racer(String name) {
        super(name);
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + " - Step " + i);
            try {
                Thread.sleep(500); // mimic real time race feel
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(getName() + " finished the race!");
    }
}

public class RaceSimulator {
    public static void main(String[] args) {
        Racer r1 = new Racer("Flash");
        Racer r2 = new Racer("Bolt");
        Racer r3 = new Racer("Zoom");

        r1.setPriority(Thread.MIN_PRIORITY);   // slowest
        r2.setPriority(Thread.NORM_PRIORITY);  // average
        r3.setPriority(Thread.MAX_PRIORITY);   // fastest

        r1.start();
        r2.start();
        r3.start();
    }
}


