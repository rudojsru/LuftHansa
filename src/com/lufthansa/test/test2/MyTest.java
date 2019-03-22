package com.lufthansa.test.test2;

public class MyTest
{
     public static void main(String args[])
     {
     MyThread myThread = new MyThread();
     MyRunnable myRunnable = new MyRunnable();
     Thread thread = new Thread(myRunnable);
     myThread.start();
     thread.start();
     }
}
