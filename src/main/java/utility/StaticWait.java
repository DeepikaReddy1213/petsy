package utility;

public class StaticWait {

    public static void WaitForSecond(int threadSleepSeconds) {
        try {
            Thread.sleep(threadSleepSeconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}
