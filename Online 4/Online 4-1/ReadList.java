package all;

public class ReadList {

    private int userNo;
    int i;

    ReadList() {

    }

    ReadList(int userNo) {
        this.userNo = userNo;
    }

    int getUserNo() {
        return userNo;
    }

    void setUserNo(int usernNo) {
        this.userNo = userNo;
    }

    void bookList(Book arr[]) {
        String bookID = "";

        for (i = 0; i < 3; i++) {
            bookID += String.valueOf(arr[i].getBookID());
        }
        if (bookID.length() > 30) {
            System.out.println("Cannot add so many books");
        } else {
            System.out.println(bookID);
        }

    }

}

