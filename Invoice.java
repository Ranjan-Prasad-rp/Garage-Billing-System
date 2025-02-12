import java.util.ArrayList;
import java.util.List;

public class Invoice {
    private Customer customer;
    private List<Service> serviceList;
    private double totalAmount;

    public Invoice(Customer customer) {
        this.customer = customer;
        this.serviceList = new ArrayList<>();
        this.totalAmount = 0;
    }

    public void addService(Service service) { // adding a service to invoice
        serviceList.add(service);
        totalAmount += service.getPrice();
    }

    public void printInvoice() {    // invoice shown to user
        System.out.println("---------Invoice---------");
        System.out.println("Customer Name: " + customer.getName() + " | Phone Number: " + customer.getPhone());
        System.out.println("Car Model: " + customer.getCar().getModel() + "  |  Car Number : " + customer.getCar().getCarNumber());
        System.out.println("Services: ");
        for (int i = 0; i < serviceList.size(); ++i) {
            System.out.println((i + 1) + " " + serviceList.get(i).getName() + "₨. " + serviceList.get(i).getPrice());
        }

        System.out.println("Total Amount " + totalAmount);
        System.out.println("---------Thank you---------");
    }

}
