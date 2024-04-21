package all;

public class HROfficer {

    public Developer devObj;
    public int result;

    HROfficer() {

    }

    HROfficer(Developer devObj) {
        this.devObj = devObj;
    }

    void checkPerformance() {

        result = (devObj.getTotalMonths() * devObj.getTotalProjects()) + 100;

        System.out.printf("Performance result is: %d\n", result);

        if (result % 2 == 0) {
            System.out.println("Developer’s performance is bad");
        } else {
            System.out.println("Developer's performance is good");
        }

    }

}
