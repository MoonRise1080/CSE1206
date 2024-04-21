package all;

import java.util.Scanner;

public class TestEmployee {

    public static void main(String[] args) {

        int totalMonths, totalProjects;

        Scanner input = new Scanner(System.in);

        System.out.print("Total Projects: ");
        totalProjects = input.nextInt();
        System.out.print("Total Months: ");
        totalMonths = input.nextInt();

        Developer dev = new Developer(totalProjects, totalMonths);
        HROfficer Hro = new HROfficer(dev);

        Hro.checkPerformance();

    }

}
