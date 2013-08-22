package com.bo;

import com.bo.Sender;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Class com.bo.SenderApp.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
public class SenderReceiverRawApp {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("rmi-sender-receiver-raw.xml");
//        Sender sender = context.getBean(Sender.class);

//        System.out.println("start");
//        long time = System.currentTimeMillis();
//        for (int i = 0; i < 10000; i++) {
//            sender.send(time);
//        }
//        System.out.println(System.currentTimeMillis() - time);

//        ContinuousSender sender = context.getBean(ContinuousSender.class);
//        sender.start();
    }

}
