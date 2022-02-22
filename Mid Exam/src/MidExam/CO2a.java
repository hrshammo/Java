package MidExam;
abstract class Flower{
    String color,smell;
    int price;
    abstract void gift();
    abstract void buy();
}
class Rose extends Flower{
    Rose(String c, String s, int p)
    {
        color = c;
        smell = s;
        price = p;
    }
    @Override
    void gift()
    {
        System.out.println("Gift for you");
    }
    @Override
    void buy()
    {
        System.out.println("Color: "+color+"\nSmell: "+smell+"\nPrice: "+price);
    }
}
class Marigold extends Flower{
    Marigold(String c, String s, int p)
    {
        color = c;
        smell = s;
        price = p;
    }
    @Override
    void gift()
    {
        System.out.println("Gift for you");
    }
    @Override
    void buy()
    {
        System.out.println("Color: "+color+"\nSmell: "+smell+"\nPrice: "+price);
    }
}
public class CO2a {
    public static void main(String[] args) {
        Rose R = new Rose("Red","Good",20);
        R.buy();
        R.gift();
        Marigold M = new Marigold("Yellow","Nice",15);
        M.buy();
        M.gift();
    }
}
