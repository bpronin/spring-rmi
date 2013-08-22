package com.bo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class com.bo.SenderApp.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
public class SenderApp {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("rmi-sender.xml");
        Sender sender = context.getBean(Sender.class);

        System.out.println("start");
        long time = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            sender.send(System.currentTimeMillis());
        }
        System.out.println(System.currentTimeMillis() - time);
    }
}
