public class student
{
    String id1,name1,class1,section1,issuebook1;
    student(String id,String name, String clas,String section)
    {
        id1=id;
        name1=name;
        class1=clas;
        section1=section;
    }
    
    
    public String format() 
    {
        return id1+","+name1+","+class1+","+section1+","+issuebook1;
    }
}

        
    