package com.bytecode;

import org.apache.log4j.Logger;

public class MessageService {
    private static final Logger logger = Logger.getLogger(MessageService.class);

    public void sendMessage(String message) {
        logger.info("Sending message: " + message);
        logger.debug("Debugging info about message: " + message);
        logger.error("Just testing an error level log");
    }
}
