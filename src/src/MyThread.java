import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyThread extends Thread {
    public void run() {

        Log.consoleOutput("Поток " + this.getName());
    }
}
