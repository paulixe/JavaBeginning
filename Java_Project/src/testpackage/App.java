package testpackage;
import java.util.Scanner; //for FindNumberGame
//import anotherpackage.classInAnotherPackage;

import javax.management.ValueExp;

public class App {
    public static void main(String[] args) throws Exception {
        FindNumber();
            
    }
    public static void FindNumber()
    {
        Scanner inputReader=new Scanner(System.in);
        int numberToFind=(int)(Math.random()*100);
        int numberReturned;
        do
        {
            Print("Entrer un nombre entre 1 et 100");
            numberReturned=inputReader.nextInt();

            if (numberReturned<numberToFind)
            {
                Print("The number to find is greater");
            }
            else if(numberReturned>numberToFind)
            {
                Print("The number to find is less");
            }
        }
        while(numberReturned!=numberToFind);
        Print("You won !!!!!");
        inputReader.close();
    } 


    public static void test1()
    {
        for (int i=0;i<100;i++)
        {
            Print(Integer.toString(i));
        }
    }

    public static void test2()
    {
        int[] myArray=new int[]{1,2};
        for(int i:myArray)
        {
            Print(Integer.toString(i));
        }
        String[] myArray2=new String[]{"adazda","22222222"};
        for(String i:myArray2)
        {
            Print(i);
        }
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
        //CallHello.SayHello();
        Print(s);
    }
}
