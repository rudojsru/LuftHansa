package com.lufthansa.test.Test3;

public class Static {
   // The following code will give
  static
        {
        int x = 5;
       }
       static int x,y;
       public static void main(String args[])
       {
        x--; myMethod();
        System.out.println(x + y + ++x);
       }
        public static void myMethod()
       {
        y = x++ + ++x;

       }


}
