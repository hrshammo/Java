package MidExam;

interface Eating{
    public void eat();
}
interface Travelling{
    public void travel();
}
class Animal implements Eating,Travelling{
    @Override
    public void eat()
    {
        System.out.println("Animal is eating");
    }
    @Override
    public void travel(){
        System.out.println("Animal is travelling");
    }
}
public class CO3a {
    public static void main(String[] args) {
        Animal ob = new Animal();
        ob.eat();
        ob.travel();
    }
}
