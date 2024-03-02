package Lesson8;

public class ImployerImpl extends Human{
    private String position;
    private int exp;

    public ImployerImpl(String name, String position, int exp) {
        super(name);
        this.position = position;
        this.exp = exp;
    }

    @Override
    public void display(){
        System.out.println(getName());
        System.out.println(position);
        System.out.println(exp);

    }
}
