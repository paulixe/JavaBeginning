package testpackage;

public class TestConstructor {
    int i;
    int b;
    TestConstructor(int i)
    {
        this(i,2);
    }
    TestConstructor(int i,int b)
    {
        this.i=i;
        this.b=b;
    }
    public static void Try()
    {
        TestConstructor newobject=new TestConstructor(1);
        App.Print(Integer.toString(newobject.i));
        App.Print(Integer.toString(newobject.b));

        TestConstructor newobject2=new TestConstructor(4,5);
        App.Print(Integer.toString(newobject2.i));
        App.Print(Integer.toString(newobject2.b));
    }
}
