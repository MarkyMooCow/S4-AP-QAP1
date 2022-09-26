package Question3;

// I'm not rhyming like I did for the Time.java here that spent more brainpower then the actual coding.

public class TestTime {
    public static void main(String[] args){
        // Create our constructors.
        Time T1 = new Time();
        Time T2 = new Time();
        
        // Add our information.
        T1.createTime(21, 10, 15);
        T2.createTime(10, 20, 25);

        // Read our current time...
        System.out.println(T1);
        System.out.println(T2);

        // And bam, have our seconds go by and backwards!
        System.out.println(T1.nextSecond());
        System.out.println(T2.previousSecond());
    }
}
