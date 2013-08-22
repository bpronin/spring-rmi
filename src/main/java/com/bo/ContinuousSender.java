package com.bo;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Class ContinuousSenderImpl.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
public class ContinuousSender {

    private Processor processor;

    public ContinuousSender() {
    }

    public void setReceiver(Processor receiver) {
        this.processor = receiver;
    }

    public void start() {
        Executors.newSingleThreadScheduledExecutor().scheduleWithFixedDelay(new Runnable() {
            @Override
            public void run() {
                try {
                    processor.process(System.currentTimeMillis());
                } catch (Exception e) {
//                    e.printStackTrace();
                }
            }
        }, 100, 100, TimeUnit.MILLISECONDS);
    }

}
