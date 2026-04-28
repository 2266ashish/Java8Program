package com.jdk8.multithreading.consumerProducerProblem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread Started ");
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(new ProduceTask(sharedResource),"p1");

        Thread consumerThread = new Thread(new ConsumeTask(sharedResource),"c1");

        producerThread.start();
        consumerThread.start();
        System.out.println("Main Thread Ended");
    }
}
