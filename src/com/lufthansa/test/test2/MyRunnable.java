package com.lufthansa.test.test2;

class MyRunnable implements Runnable
{
     public void run() {
     System.out.println("MyRunnable: run()");
    }
    public void start()
    {
     System.out.println("MyRunnable: start()");
     }
}
