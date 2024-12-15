package concurrent;

public class SheepManager {
    private int sheepCount = 0;

    void incrementAndReport() {
        synchronized (this) {
            System.out.print((++sheepCount) + " ");
        }
    }
}
