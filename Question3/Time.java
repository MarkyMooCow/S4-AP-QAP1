package Question3;

/* 
WARNING
[=========================================================================================]
THERE IS NOTHING WRONG WITH THE CODE I JUST DECIDED TO RHYME ALL MY COMMENTS FOR NO REASON.
RHYMES MAY BE PAINFUL TO READ.
YOU HAVE BEEN WARNED.
[=========================================================================================]
WARNING
*/

public class Time {
    // Tick tock make the clock.
    private int hour, minute, second;

// Eat a lime, make the time.
public void createTime (int h, int m, int s)
{
    this.hour = h;
    this.minute = m;
    this.second = s;
}

// Find the info, now say yo.
public void getHour()
{
    System.out.println(this.hour);
}
public void getMinute()
{
    System.out.println(this.minute);
}
public void getSecond()
{
    System.out.println(this.second);
}

// Change the time, and then rhyme.
public void setHour(int x)
{
    this.hour = x;
    System.out.println("Change successful!");
}
public void setMinute(int x)
{
    this.minute = x;
    System.out.println("Change successful!");
}
public void setSecond(int x)
{
    this.second = x;
    System.out.println("Change successful!");
}

// Change it all, leave them appalled.
public void setTime(int h, int m, int s)
{
    this.hour = h;
    this.minute = m;
    this.second = s;
    System.out.println("Change successful!");
}

// With a toString(), like a king. (Or Queen if that's what you prefer)
public String toString()
{ 
    return hour + ":" + minute + ":" + second;  
}

// Count it up, break a cup.
public String nextSecond()
{
    this.second++;
    return hour + ":" + minute + ":" + second;
}
// Count it back, rack attack.
public String previousSecond()
{
    this.second--;
    return this.hour + ":" + this.minute + ":" + this.second; 
}
}

// I AM IN PAIN.