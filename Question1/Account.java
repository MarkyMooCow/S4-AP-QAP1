package Question1;

public class Account {
    // Neat variables though.
    private String id, name;
    private int balance;

// Construction in progress.
public void createAccount (String i, String u, int a)
{
    this.id = i;
    this.name = u;
    this.balance = a;
}

// Informational Display Commands
public void getID()
{
    System.out.println(this.id);
}

public void getName()
{
    System.out.println(this.name);
}

public void getBalance()
{
    System.out.println(this.balance);
}

// IMPORTANT DIVIDER OF JUSTICE AND STUFF
// FOR THESE BE THE COMMANDS THAT DISPLAY ALL THE INFORMATION IN BEAUTIFULLY FORMATTED FORM
// BOW BEFORE THE SUPERIOR COMMANDS

// Anyways this is a casual print method.
public void getAccount()
{
    System.out.println(this.name + " (" + this.id +  ")'s account balance is " + this.balance + ".");
}

// And this is a casual toString() method!
public String toString()
{ 
    return name + " (" + id + ") has " + balance + " in their account.";  
}  

// bank commands

// I'll describe this one, in order to use multiple objects, we can insert one object into the variables
// of our command based on a certain identifier.
// Like an ID! 
// So now we can recognize our main object with this.balance and our other object with id.balance!
public void transferTo(Account id, int amount){
    if(this.balance >= amount) {
        id.balance += amount;
        this.balance -= amount;
        System.out.println("Transaction Success!");
    } else {
        // I honestly hope to delve more into input validation in the future.
        // I like making my codes unbreakable.
        System.err.println("Insufficent funds!");
    }
}

// Change up some balances, no transfering needed!
public void credit(int amount){
    this.balance += amount;
    System.out.println("Funds added!");
}
public void debit(int amount){
    if(this.balance >= amount) {
        this.balance -= amount;
        System.out.println("Transaction Success!");
    } else {
        // Get validated.
        System.err.println("Insufficent funds!");
    }
}}