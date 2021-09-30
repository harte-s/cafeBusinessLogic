import java.util.Date;
import java.util.ArrayList;

public class CafeUtil {
    // change all those string classes as needed
    public Integer getStreakGoal(int firstPurchase, int numWeeks) {
        int neededTotal = 0;
        for (int i = 0 ; i <= numWeeks ; i++) {
            neededTotal += i;
        }
        return neededTotal;
    }
    
    public String printPriceChart(String productName, double price, int maxNumber) {
        System.out.println(productName);
        for (int i = 1; i <= maxNumber; i++){
            System.out.println(String.format("%s - $%.2f", i, (price*i)));
        }
        return "complete";
    }
    
    public Double getOrderTotal(double[] order) {
        double total = 0;
        for (double item : order){
            total = total + item;
        }
        return total;
    }
    
    public void displayMenu(ArrayList<String> menu, ArrayList<Double> prices) {
        for (int i = 0; i < menu.size(); i++){
            System.out.println(String.format("%s %s -- $%.2f", i, menu.get(i), prices.get(i)));
        }
    }
    
    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello " + userName + "! There are " + customers.size() + " ahead of you.");
        customers.add(userName);
    }

}

