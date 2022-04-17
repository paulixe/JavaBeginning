package testpackage;

interface Iinter{
    public void Write();
}
interface Iinter2{
    
}
public class TestInterface implements Iinter,Iinter2 {
    @Override
    public void Write() {
        // TODO Auto-generated method stub
        
    }
    private static Iinter func1=()->App.Print("Default");
    public static void Test()
    {
        func1=()->{WriteMethod(); func1.Write();}; // can't add functions
      func1.Write();
    }
    public static void WriteMethod()
    {
        App.Print("in WriteMethod");
    }
}

