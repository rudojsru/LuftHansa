package com.lufthansa.test;

public class TestClass {

         public static void main(String[] args) {
             String str = null;
             switch (str) {
                 case "null":
                     System.out.println("1");
                     break;
                 case "":
                     System.out.println("2");
                     break;
                 default:
                     System.out.println("3");
             }
         }
}
