public class ShopOne extends Shop {
    String name;


    public ShopOne(int prise) {

        super(prise);
    }

    @Override   // переопределение метод
    public void things() {
        System.out.println(prise + name);

    }
}
