package com.jdk8.multithreading.consumerProducerProblem;

public class ProduceTask implements Runnable{
    SharedResource sharedResource;
    public ProduceTask(SharedResource sharedResource){
        this.sharedResource=sharedResource;
    }
    @Override
    public void run() {
        System.out.println("Producer Thread: "+Thread.currentThread().getName() );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }

        sharedResource.addItem();
    }
}
