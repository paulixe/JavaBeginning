package testpackage;
import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class TestSet {
    public static void Test1()
    {
        List<String> myList = new ArrayList<String>(); //List in java is an interface
        myList.add("Woooowww");
        myList.add("Hello World again ?.?!?!");
        for (String e:myList)
        {
            App.Print(e);
        }

    }
    public static void Test2()
    {
        Set<String> myList = new HashSet<String>();
        myList.add("Woooowww");
        myList.add("Hello World again ?.?!?!");
        for (String e:myList)
        {
            App.Print(e);
        }
    }
    public static void Test3()
    {   
        Map<String,Integer> myList = new HashMap<String,Integer>();
        myList.put("Jean",20);
        myList.put("Noemie",10);
        myList.put("Jean",12);
        for ( Map.Entry<String,Integer> entry:myList.entrySet())
        {
            App.Print(entry.getKey()+ "--->"+entry.getValue());
        }
        App.Print(Integer.toString(myList.get("Jean")));


    }

}

