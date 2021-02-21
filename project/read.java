import java.io.*;
class read
{
    void main()throws IOException
    {
        FileReader fr=new FileReader("book.txt");
        BufferedReader br=new BufferedReader(fr);
        String line=br.readLine();
        System.out.println(line);
    }
}