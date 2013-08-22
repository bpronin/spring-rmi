package com.bo;

import java.util.LinkedList;

/**
 * Class Printer.
 *
 * @author Boris Pronin (<a href="mailto:bpronin@bttprime.com">bpronin@bttprime.com</a>)
 */
public class Receiver implements Processor {

    @Override
    public void process(long time) {
        long local = System.currentTimeMillis();
        System.out.println("latency: " + (local - time) + " ms");
    }
}
