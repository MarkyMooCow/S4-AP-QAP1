package Question2;

public class TestDate {
    public static void main(String[] args){
    Date D1 = new Date();
    
    // Creation Suite.
    D1.createDate(2, 2, 2022);
    
    // Eh lets try both methods anyways.
    D1.getDay();
    D1.getMonth();
    D1.getYear();
    
    // I like this one more it's less tedious.
    System.out.println(D1);

    // Now lets change our date!
    D1.setDate(12, 12, 2022);
    
    // And use both methods again anyways.
    D1.getDay();
    D1.getMonth();
    D1.getYear();

    // FLEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX!
    System.out.println(D1);
}}
