package com.bytecode;

import org.apache.log4j.Logger;

import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;

@Slf4j
public class MessageService {
    //private static final Logger logger = Logger.getLogger(MessageService.class);

    public void sendMessage(String message) {
        log.info("Sending message: " + message);
        log.debug("Debugging info about message: " + message);
        log.error("Just testing an error level log");
    }
}
