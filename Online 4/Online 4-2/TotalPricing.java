package all;

public class TotalPricing {

    public Book bookObj;
    int result, flag = 1;
    int temp1, temp2, temp;

    TotalPricing() {

    }

    TotalPricing(Book bookObj) {
        this.bookObj = bookObj;
    }

    void finalCost() {
        System.out.println("");
        result = bookObj.getCostPerPage() * bookObj.getNumberOfPages();

        System.out.println("Total price: " + result);

        temp = (int) Math.pow(result, 2);

        while (result != 0) {
            
            temp1 = temp % 10;
            temp2 = result % 10;

            if (temp1 != temp2) {
                flag = 0;
                break;
            }
            result /= 10;
            temp /= 10;
        }

        if (flag == 1) {
            System.out.println("Pricing is too high");
        } 
        else {
            System.out.println("Pricing is okay");
        }
    }

}
