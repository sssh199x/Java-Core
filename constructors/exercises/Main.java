package constructors.exercises;

public class Main {
    public static void main(String[] args) {

       Customer  customer1 = new Customer("Sandesh Hamal",1000.0,"sandeshhamal5890@gmail.com");
        System.out.println("Customer Name: " + customer1.getName());
        System.out.println("Credit Limit for " + customer1.getName() +": "+ customer1.getCreditLimit());
        System.out.println( customer1.getName() + "'s" + " Email: " + customer1.getEmail());


        System.out.println("--------------------------------------------");


        Customer customer2 = new Customer();
        System.out.println("Customer Name: " + customer2.getName());
        System.out.println("Credit Limit for " + customer2.getName() +": "+ customer2.getCreditLimit());
        System.out.println( customer2.getName() + "'s" + " Email: " + customer2.getEmail());


        System.out.println("--------------------------------------------");

        Customer customer3 = new Customer("Bishal Bhattarai","bishalbhattarai1998@gmail.com");
        System.out.println("Customer Name: " + customer3.getName());
        System.out.println("Credit Limit for " + customer3.getName() +": "+ customer3.getCreditLimit());
        System.out.println( customer3.getName() + "'s" + " Email: " + customer3.getEmail());
    }
}
