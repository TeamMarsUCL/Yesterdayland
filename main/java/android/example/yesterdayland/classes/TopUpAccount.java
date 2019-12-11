package android.example.yesterdayland.classes;

public class TopUpAccount {
    int attendeeID, balance, accountID;

    public TopUpAccount(int attendeeID) {
        this.attendeeID = attendeeID;
        this.accountID = getAccountIdFromDatabase();
        this.balance = getBalanceFromDatabase();
    };

    public void topUp(int amount) { this.balance += amount; }

    public int getBalance() { return this.balance; }

    private int getAccountIdFromDatabase(){
        // Interact with DB by passing attendee ID to get corresponding account
        return 0;
    }

    private int getBalanceFromDatabase(){
        // Interact with DB by passing attendee ID to get corresponding account balance
        return 0;
    }


}
