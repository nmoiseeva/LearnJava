package lesson5;


import org.apache.log4j.Logger;

public class Console {
    Logger logger = Logger.getLogger(getClass());
    public void printLogger(){
        logger.info("test");
    }
}
