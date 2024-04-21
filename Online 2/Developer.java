package all;

public class Developer {

    private int totalProjects, totalMonths;

    Developer() {

    }

    Developer(int totalProjects, int totalMonths) {
        this.totalMonths = totalMonths;
        this.totalProjects = totalProjects;

    }

    public int getTotalProjects() {
        return totalProjects;
    }

    public int getTotalMonths() {
        return totalMonths;
    }

}
