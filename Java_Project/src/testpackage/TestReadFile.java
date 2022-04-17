package testpackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
public class TestReadFile {
    public static void TestRead() throws IOException
    {
        FileReader fileReader=new FileReader("Resources/Text.txt");
        BufferedReader reader=new BufferedReader(fileReader);
        String line;
        try
        {
            do{
                line=reader.readLine();
                System.out.println(line);
            }while (line!=null);
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        reader.close();
    }
    public static void TestWriteFile() throws IOException
    {
        FileWriter fileWriter=new FileWriter("Resources/Text.txt",false);
        BufferedWriter writer=new BufferedWriter(fileWriter);

        try{
            writer.write("WOWOWWOWO j'écris dans un fichier");

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        writer.close();
    }
}
