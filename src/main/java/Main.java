import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Main {

    private static final Logger logger = LogManager.getLogger();
    private static final Marker repetitive  = MarkerManager.getMarker("repetitive");
    private static final Marker question = MarkerManager.getMarker("question");

    public static void main(String[] args) throws InterruptedException {

        int iter = Integer.parseInt(args[0]) , i=0;
        while(i<iter){
            logger.error(repetitive,"Baa, baa, black sheep,");
            logger.warn(question," Have you any wool? ");
            logger.info(repetitive, "Yes sir, yes sir,");
            logger.debug(repetitive, "Three bags full.");
            logger.fatal("One for the master,");

            i++;

            Thread.sleep(1000);
        }


    }
}
