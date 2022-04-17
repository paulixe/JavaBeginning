package testpackage;

public class TestExceptions {
    public static void Test(int i)
    {
        String mesToDisplay;
        try{
               mesToDisplay=Calculate(i);
               App.Print(mesToDisplay);
        }
        catch(MyException e)
        {
            e.PrintCode();
            App.Print(e.getMessage());
            e.printStackTrace();
        }


    }
    public static String Calculate(int i) throws MyException
    {
        if(i==5)
        {
            throw new MyException("Error in Calculate","divide by 0");
        }
        return Integer.toString(10/(5-i));

    }
}
class MyException extends Exception
{
    private String code;
    public MyException(String code,String message)
    {
        super(message);
        this.code=code;
    }
    public MyException(String code, String message, Throwable cause)
    {
        super(message,cause);
        this.code=code;
    }
    public void PrintCode()
    {
        System.out.println(code);
    }

}
