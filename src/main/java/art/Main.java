package art;

import java.util.Scanner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Main {
    private static final Log LOGGER = LogFactory.getLog(Main.class);
    public static final String VERSION = "1.0003";
    public static final String DATE = "22.01.2022";

    public static void main(String[] args) {
        LOGGER.info("* * *");
        LOGGER.info(String.format("Algo initialized, version %s, date %s", VERSION, DATE));
        Scanner scan = new Scanner(System.in);

        LOGGER.info("Press Enter key to exit . . . ");
        scan.nextLine();
    }
}
