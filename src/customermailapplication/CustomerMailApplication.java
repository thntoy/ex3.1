/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

import java.util.Scanner;

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {

    /**
     * @param args the command line arguments
     */
    private Customer customer;
    public static Customer getCustomerTypeFromUser() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int type = inp.nextInt();
        Customer cust = null;
        switch(type) {
            case 1:
                cust = CustomerFactory.createCustomer("Regular");
                break;
            case 2:
                cust = CustomerFactory.createCustomer("Mountain");
                break;
            case 3:
                 cust = CustomerFactory.createCustomer("Delinquent");
                break;
        }
        return cust;
    }
  
        public String generateMail() {
            return customer.createMail();
    }
          
    public static void main(String[] args) {
        CustomerMailApplication app = new CustomerMailApplication();
        app.customer = getCustomerTypeFromUser();
        System.out.println(app.generateMail());
    }
}
