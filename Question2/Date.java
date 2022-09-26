package Question2;

public class Date {
    // Cool variables though.
    private int day, month, year;

// Constructy Struct.
public void createDate(int d, int m, int y)
{
    this.day = d;
    this.month = m;
    this.year = y;
}

// Information Display Commands.
public void getDay()
{
    System.out.println(this.day);
}
public void getMonth()
{
    System.out.println(this.month);
}
public void getYear()
{
    System.out.println(this.year);
}

// THE MOST IMPORTANT INFORMATION DISPLAY COMMAND
public String toString()
{ 
    return day + "/" + month + "/" + year;  
}  

// Lets change stuff!
public void setDay(int x)
{
    this.day = x;
    System.out.println("Change successful!");
}
public void setMonth(int x)
{
    this.month = x;
    System.out.println("Change successful!");
}
public void setYear(int x)
{
    this.year = x;
    System.out.println("Change successful!");
}

// LETS CHANGE EVERYTHING!
public void setDate(int d, int m, int y)
{
    this.day = d;
    this.month = m;
    this.year = y;
    
    System.out.println("Change successful!");
}}