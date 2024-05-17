package all;

public class Book {
    private int numberOfPages, costPerPage;
    
    Book() {
        
    }
    
    Book(int numberOfPages, int costPerPage) {
        this.numberOfPages = numberOfPages;
        this.costPerPage = costPerPage;
    }
    
    int getNumberOfPages() {
        return numberOfPages;
    }
    
    void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
    
    int getCostPerPage() {
        return costPerPage;
    }
    
    void setCostPerPage(int costPerPage) {
        this.costPerPage = costPerPage;
    } 

}
