package MidExam;
class Square{
    int length;
    void set_length(int l){
        length=l;
    }
    int area(Square ob){
        return ob.length*ob.length;
    }
}
public class CO1b {
    public static void main(String[] args) {

        Square S=new Square();
        S.set_length(5);
        int result = S.area(S);
        System.out.println("Area "+result);
    }
}
