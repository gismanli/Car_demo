import java.util.Timer;

/**
 *
 *
 * @author GisMan
 */
public class TimeTask {

    Timer timer;

    public TimeTask() {
        timer = new Timer();
    }

    public void main() {
        timer.schedule(new Task(), 0, 60 * 60 * 1000);
    }

    public void stop() {
        timer.cancel();
    }
}
