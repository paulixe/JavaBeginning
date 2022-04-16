package testpackage;

// in C# we use base of the "mother class",  in java it is Super
class SuperClass {
    void CurrentType()
    {
        App.Print(getClass().toString());
    }

    void test()
    {
        System.out.println("Superclass Behaviour");
    }
}
class SubClass1 extends SuperClass{}
class SubClass2 extends SuperClass{}

class SubClass3 extends SuperClass{
    
   
    @Override void test()
    {
        System.out.println("Subclass Behaviour");
    }
}

public class TestInheritance{
    public static void Test1()
    {
        SubClass1 o1=new SubClass1();
        o1.CurrentType();
        SubClass2 o2=new SubClass2();
        o2.CurrentType();

        SuperClass o3=new SubClass1();
        o3.CurrentType();
        SuperClass o4=new SubClass2();
        o4.CurrentType();

        SuperClass o5=new SuperClass();
        o5.CurrentType();
    }
    public static void Test2()
    {
        SuperClass o1=new SuperClass();
        o1.test();

        SubClass3 o2=new SubClass3();
        o2.test();

        SuperClass o3=new SubClass3();
        o3.test();

    }
}