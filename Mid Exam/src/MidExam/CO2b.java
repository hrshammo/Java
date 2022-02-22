package MidExam;
class addition {
    int a,b;
    addition(int x, int y)
    {
        a=x;
        b=y;
    }
    void add()
    {
        System.out.println("Sum of a+b = "+(a+b));
    }
}
class AdvanceAddition extends addition {
    int c;
    AdvanceAddition(int x,int y,int z)
    {
        super(x,y);
        c=z;
    }
    @Override
    void add()
    {
        System.out.println("Sum of a+b+c = "+(a+b+c));
    }
}
public class CO2b {
    public static void main(String[] args) {
        AdvanceAddition ob = new AdvanceAddition(5,10,15);
        ob.add();
    }
}
