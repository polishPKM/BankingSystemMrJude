
package atm;


import java.util.LinkedList;
import java.util.Objects;

public class bank {

    private LinkedList<Customer> customers;
    private int numberOfCustomers;
    private String bankName;

    public bank(String bName){
        this.customers = new LinkedList<Customer>();
        this.bankName = bName;
    }

    public void addCustomer(String f, String l, int password){
        Customer customer = new Customer(f,l, password);
        this.customers.add(customer);
        numberOfCustomers += 1;
    }

    public int getNumOfCustomers(){
        return numberOfCustomers;
    }

    public Customer getCustomerInteger(int index){
        return this.customers.get(index);
    }

    public Customer getCustomerName(String name){
        for(int i = 0; i < numberOfCustomers; i++){
            if(Objects.equals(name, this.customers.get(i).getLastName())){
                return this.customers.get(i);
            }
        }
        return null;
    }

}