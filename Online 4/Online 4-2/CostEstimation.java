package all;

import java.util.Scanner;

public class CostEstimation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numberOfPages, costPerPage;
        
        System.out.print("Number of pages: ");
        numberOfPages = input.nextInt();
        System.out.print("Cost per page: ");
        costPerPage = input.nextInt();
        
        Book boi = new Book(numberOfPages, costPerPage);
        TotalPricing daam = new TotalPricing(boi);
        
        daam.finalCost();
    }
}

