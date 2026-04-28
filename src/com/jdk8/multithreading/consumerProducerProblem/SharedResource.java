package com.jdk8.multithreading.consumerProducerProblem;

public class SharedResource {
    boolean itemAvailable =false;

    public synchronized void addItem(){
        itemAvailable=true;
        System.out.println("Item added by "+Thread.currentThread().getName()+" and invoked all thread which are waiting");
        notifyAll();
    }

    public synchronized void consumeItem(){
        System.out.println("ConsumeItem() invoked by: "+Thread.currentThread().getName());

        while(!itemAvailable){
            try {
                System.out.println("Thread "+Thread.currentThread().getName() +" is waiting now");
                wait();
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
            }
        }
        System.out.println("Item consumed by "+Thread.currentThread().getName());
        itemAvailable=false;
    }
}
