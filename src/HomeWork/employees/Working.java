package HomeWork.employees;

public class Working implements Iinfo{
    String W = "Working";
    @Override
    public void print() {
        System.out.println("Название должности: "+W);
    }

    public Working () {
        String W = "Working";
    }
}
