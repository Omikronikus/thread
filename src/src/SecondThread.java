import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SecondThread extends Thread {

    public void run() {

        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SS");
        System.out.format("    [%s]: Поток: %s\n", dateFormat.format(new Date()), "Второй поток");
    }
}
