public class book
{
    String bookID1,name1,author1;
    book(String bookID,String name,String author)
    {
        name1=name;
        author1=author;
        bookID1=bookID;
        
    }
    
    public String format() 
    {
        return bookID1+","+name1+ "," +author1;
    }
}

        
    