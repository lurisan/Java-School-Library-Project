import java.io.*;
public class Return
{
    void Return(String studentID)throws IOException
    {
        String A=null,nword="";
        FileReader fr=new FileReader("issue_book.txt");
        BufferedReader br=new BufferedReader(fr);
        FileWriter fw=new FileWriter("temp_"+"issue_database.txt");
        BufferedWriter bw=new BufferedWriter(fw);
        PrintWriter outfile=new PrintWriter(bw);
        boolean condition=true,t1=false;
        outer:
        while(condition==true)
        {
            A=br.readLine();
            if (A==null)
            {
                condition=false;
                outfile.close();
                bw.close();
                fw.close();
                br.close();
                fr.close();
                break;
            }
            nword="";
            inner:
            for (int i=0;i<A.length();i++)
            {
                char c=A.charAt(i);
                if(c==',')
                {
                    if (nword.equals(studentID))
                    {
                        t1=true;
                        break inner;
                    }
                }
                else nword=nword+c;
            }
            
            if (t1==true)
            {
                t1=false;
            }
            else
            {
                outfile.println(A);
            }
        }
       
        String buffering1=null;
        FileReader fr1=new FileReader("temp_"+"issue_database.txt");
        BufferedReader br1=new BufferedReader(fr1);
        FileWriter fw1=new FileWriter("issue_book.txt");
        BufferedWriter bw1=new BufferedWriter(fw1);
        PrintWriter outfile1=new PrintWriter(bw1);
        boolean condition1=true;
        while(condition1==true)
        {
            buffering1=br1.readLine();
            if (buffering1==null)
            {
                condition1=false;
                outfile1.close();
                bw1.close();
                fw1.close();
                br1.close();
                fr1.close();
                break;
            }
            outfile1.println(buffering1);
        }
    }
}
