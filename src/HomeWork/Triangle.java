package HomeWork;

public class Triangle extends Figures{
    int a ;
    int b ;
    int c ;
    int sinY ;

    public Triangle(int a, int b, int c, int sinY){
        this.a = a;
        this.b = b;
        this.c = c;
        this.sinY = sinY;
    }
    @Override
    public int S() {
        int S = (this.a * this.b * this.sinY)/2;


        return S;
    }
    @Override
    public int P() {
        int P = this.a + this.b + this.c;


        return P;
    }
}
