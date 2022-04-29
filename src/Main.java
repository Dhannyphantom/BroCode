import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                for (int i = 10; i > 0; i--) {
                    System.out.println(i + "seconds left");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                timer.cancel();
                System.out.println("It's 12:20");
            }
        };

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2022);
        date.set(Calendar.MONTH, Calendar.APRIL);
        date.set(Calendar.DAY_OF_MONTH, 30);
        date.set(Calendar.HOUR_OF_DAY, 0);
        date.set(Calendar.MINUTE, 19);
        date.set(Calendar.SECOND, 50);
        date.set(Calendar.MILLISECOND, 0);

//        timer.schedule(task,3000);
        timer.scheduleAtFixedRate(task,date.getTime(),3000);

    }
}