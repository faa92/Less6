package HomeWork;

public class Rectangle extends Figures{
    int a;
    int b;


    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public int S() {
        int S = this.a * this.b;
        return S;
    }

    @Override
    public int P() {
        int P = this.a + this.b + this.a + this.b;
        return P;
    }
}
