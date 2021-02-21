public class issue
{
    String studentID1,bookID1,date1;
    issue(String studentID,String bookID,String date)
    {
        studentID1=studentID;
        bookID1=bookID;
        date1=date;
    }
    public String format()
    {
        return studentID1+","+bookID1+","+date1;
    }
}