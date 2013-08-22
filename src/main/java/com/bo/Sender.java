package com.bo;

/**
 * Class SenderImpl.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
public class Sender {

    private Processor processor;

    public void setReceiver(Processor receiver) {
        this.processor = receiver;
    }

    public void send(long time) {
        processor.process(time);
    }

}
