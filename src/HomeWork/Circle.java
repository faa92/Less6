package HomeWork;

public class Circle extends Figures{
    float r;
    float pi;

    public Circle (float r, float pi){
        this.r = r;
        this.pi = pi;
    }
    @Override
    public int S() {
        float S = this.pi * (this.r * this.r);

        return (int) S;
    }

    @Override
    public int P() {
        float P = 2 * this.pi * this.r;

        return (int) P;
    }
}
