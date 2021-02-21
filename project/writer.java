import java.io.*;
public class writer
{
    void append(String filename, String data) throws IOException
    {
        FileWriter fw=new FileWriter(filename,true);
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter outfile=new PrintWriter(bw);
        outfile.println(data);
        outfile.close();
        bw.close();
        fw.close();
    }
    
    
}