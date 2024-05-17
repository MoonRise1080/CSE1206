

package all;

public class Library {

    public static void main(String[] args) {
        Book arr[] = new Book[3];
        
        arr[0] = new Book(10156756);
        arr[1] = new Book(3033424);
        arr[2] = new Book(40421456);
        
        ReadList list = new ReadList();
        
        list.bookList(arr);
    }
}
