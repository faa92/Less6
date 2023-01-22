package HomeWork.employees;

public class Accountant implements Iinfo{
    String A = "Accountant";
    @Override
    public void print() {
        System.out.println("Название должности: "+A);
    }

    public Accountant () {
        String A = "Accountant";
    }
}
