package my;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestLogger
{
    private static Logger logger = LoggerFactory.getLogger(TestLogger.class);

    public static void main(String[] args)
    {
        logger.error("Start ...");
    }
}