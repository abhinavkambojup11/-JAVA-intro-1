public class Q5 {

    private String fName;
    private String lName;
    private int age;
    private String desig;

    public void setFirstName(String fName) {
        this.fName = fName;
    }

    public void setLastName(String lName) {
        this.lName = lName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String desig)      {
        this.desig = desig;
    }

    public Q5() {
        System.out.println("Default Constructor");

    }

    public Q5(String fName, String lName, int age, String desig) {
        super();
        this.fName = fName;
        this.lName = lName;
        this.age = age;
        this.desig = desig;
        System.out.println("Parametrized Constructor");

    }

    @Override
    public String toString() {
        return "firstName=" + fName + " \nlastName=" + lName + " \nage=" + age
                + " \ndesignation=" + desig + "\n";
    }

    public static void main(String[] args) {
        Q5 employee = new Q5();
        Q5 employee2 = new Q5("Abhinav", "Kamboj", 22, "Software Engineer");
        System.out.println(employee);
        System.out.println(employee2);
    }
}