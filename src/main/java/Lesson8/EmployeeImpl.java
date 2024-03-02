package Lesson8;

public class EmployeeImpl extends Human {
    private String company;

    public EmployeeImpl(String name, String company) {
        super(name);
        this.company = company;
    }

    @Override
    public void display(){
        System.out.println("Name" + getName() + "Company" + company);

    }

}
