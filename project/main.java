import java.io.*;
public class main
{
    static void main()throws IOException
    {
        System.out.println("1. Enter a Student");
        System.out.println("2. Enter a Book");
        System.out.println("3. Issue");
        System.out.println("4. Return");
        System.out.println("5. Exit");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        main m1=new main();
        int p=Integer.parseInt(br.readLine());
        switch(p)
        {
            case 1:
            {
                System.out.println("Enter Registration no.");
                String id=br.readLine();
                System.out.println("Enter Name");
                String name=br.readLine();
                System.out.println("Enter Class");
                String clas=br.readLine();
                System.out.println("Enter Section");
                String section=br.readLine();
                student s1=new student(id,name,clas,section);
                String data =s1.format();
                writer w1=new writer();        
                w1.append("student_database.txt",data);
                m1.main();break;
            }
            case 2:
            {
                System.out.println("Enter Book ID");
                String bookID=br.readLine();
                System.out.println("Enter name of the book");
                String name=br.readLine();
                System.out.println("Enter name of the Author");
                String author=br.readLine();
                book b1=new book(bookID,name,author);
                String data=b1.format();
                writer w1=new writer();
                w1.append("book_database.txt",data);
                m1.main();break;
            }
            case 3:
            {
                System.out.println("Enter Student ID");
                String studentID=br.readLine();
                System.out.println("Enter Book ID");
                String bookID=br.readLine();
                System.out.println("Enter Date of Return");
                String date=br.readLine();
                issue i1=new issue(studentID,bookID,date);
                String data=i1.format();
                writer w1=new writer();
                w1.append("issue_book.txt",data);
                m1.main();break;
                            
            }
            case 4:
            {
                System.out.println("Enter Student ID");
                String studentID=br.readLine();
                Return return1=new Return();
                return1.Return(studentID);
                m1.main();break;
            }
            case 5:
            {
                break;
            }
            default:
            {
                System.out.println("Invalid input");
                m1.main();break;
            }
        }
    }
}

