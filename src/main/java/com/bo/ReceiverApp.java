package com.bo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class com.bo.SenderApp.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
public class ReceiverApp {

    public static void main(String[] args) throws Exception {
        new ClassPathXmlApplicationContext("rmi-receiver.xml");
    }
}
