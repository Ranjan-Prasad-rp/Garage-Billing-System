import  java.util.Scanner;
public class GarageBillApp {
    public static void main(String[] args) {

        GarageService garageService = new GarageService();
        System.out.println("----------------Auto-Mobiles Centre----------------");
        try {
            while (true) {
                System.out.println("1. Add Customer");
                System.out.println("2. Display Services ");
                System.out.println("3.Exit ");
                System.out.println("Enter Your Choice ");
                Scanner sc = new Scanner(System.in);
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter Customer Name ");
                        String name = sc.next();
                        System.out.println("Enter Customer Phone Number");
                        String phone = sc.next();
                        System.out.println("Enter Customer Car Number ");
                        String carNumber = sc.next();
                        System.out.println("Enter Car Model");
                        String model = sc.next();
                        garageService.addCustomer(name, phone, carNumber, model);
                        break;

                    case 2:
                        System.out.println("Enter Car Number: ");
                        String carNum = sc.next();
                        garageService.createInvoice(carNum);
                        break;
                    case 3:
                        System.out.println("Exiting............!");
                        sc.close();
                        break;
                    default:
                        System.out.println("Invalid Choice.  /n Please Try Again");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Thank you for visting");

    }
        finally {
            System.out.println("Please Visit Again");
        }
        }
        }

