package com.lufthansa.test.test2;

// What will happen when you attempt to compile and run the following code?

    class MyThread extends Thread {
        public void run() {
            System.out.println("MyThread: run()");
        }

        public void start() {
            System.out.println("MyThread: start()");
        }
    }


