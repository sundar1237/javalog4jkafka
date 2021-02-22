package com.sundar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jKafka {

    private static final Logger logger = LogManager.getLogger(log4jKafka.class);

    public static void main(String[] args) {
        logger.debug("Hello from Log4j 2");
        try{
            for (int i = 0; i <10 ; i++) {
                Thread.sleep(10000);
                logger.info("info generated " + i);
                logger.debug("debug generated " + i);
                logger.warn("warn generated " + i);
                logger.error("error generated " + i);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.exit(0);
        }

    }

}
