package HomeWork.employees;

public class Director implements Iinfo{
    String D = "Director";
    @Override
    public void print() {
        System.out.println("Название должности: "+D);
    }

    public Director () {
        String D = "Director";
    }
}
