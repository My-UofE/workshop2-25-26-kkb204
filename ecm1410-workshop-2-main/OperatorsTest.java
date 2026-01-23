public class OperatorsTest {
    public static void main(String[] args) { 
        int a = 4;
        int b = ++a +7;

        System.out.println(a);
        System.out.println(b);

        double x=-2.0;

        double y = (x>1)?x-1:(x<-1)?x+1:0;
        System.out.println(y);
        
    }

}
