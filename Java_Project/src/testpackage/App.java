package testpackage;

import anotherpackage.classInAnotherPackage;

public class App {
    public static void main(String[] args) throws Exception {
            TestAccess.Test();
            
            
    }
    public static void Print(String s)
    {
        System.out.println(s);
    }
    public static void TestVariables()
    {
        int x;
        double a=10;
        boolean isBig=true;
        final int B=10;

        String t="azkdkazdkaz";
        t=t.toUpperCase();

        String s="123456";
        s=s.replace("123","WOOWOWO");
        s.contains("45");
        CallHello.SayHello();
        Print(s);
    }
}
