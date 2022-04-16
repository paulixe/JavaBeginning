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
}
