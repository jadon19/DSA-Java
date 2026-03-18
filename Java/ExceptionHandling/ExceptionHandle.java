package ExceptionHandling;
public class ExceptionHandle{
    public static void main(String[] args) {
        int a =10;
        int b = 0;
        try{
            float c = a/b;
            System.out.println("Perfect" + c);
        }
        catch(ArithmeticException e){
            System.out.println("cannnot divide by 0");
        }
    }
}