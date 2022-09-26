package Question1;
public class TestAccount {
    public static void main(String[] args){
        // Create our Accounts.
        Account A1 = new Account();
        Account A2 = new Account();
        
        // Fill our accounts with info.
        A1.createAccount("1", "Noah", 5000);
        A2.createAccount("2", "Mio", 4000);

        // Let's display our info quickly. I ain't going to jail for bank fraud.
        // I'll use my print display method here.
        A1.getAccount();
        A2.getAccount();
        
        // The first transfer will fail. The second however will succeed.
        A1.transferTo(A2, 10000);
        A1.transferTo(A2, 1000);
        
        // And now our final display with my toString() method!
        // FLEXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
        System.out.println(A1);
        System.out.println(A2);
    }
}
