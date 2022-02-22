package MidExam;
class Color{
    void docolor()
    {
        System.out.println("From Color class");
    }
}
class Red extends Color{
    @Override
    void docolor()
    {
        System.out.println("From Red class");
    }
}
public class CO3b {
    public static void main(String[] args) {
        Color v = new Red();
        v.docolor();

    }
}
