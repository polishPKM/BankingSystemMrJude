package atm;
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    private int password;

    public Customer(String f, String l, int password){
        this.firstName = f;
        this.lastName = l;
        this.password = password;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public Account getAccount(){
        return this.account;
    }

    public void setAccount(Account acc){
        this.account = acc;
    }

    public int getPassword(){
        return this.password;
    }

}