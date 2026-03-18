package OOPS;
class Rectangle{
    private int l;
    private int d;

    // constructor overloading (done to assign custom default values)
    public Rectangle(){
        l = 1;
        d = 1;
    }
    public Rectangle(int l, int d){
        this.l = l;
        this.d = d;
    }


    //getter and setter to update the private variables = property methods
    //setter methods
    public void setLength(int l){
        if(l>0){
            this.l = l;
            return;
        }
    }
    public void setBreadth(int d){
        if(d>0){
            this.d = d;
            return;
        }
    }

    //getter method 
    public int getLength(){
        return l;
    }
    public int getBreadth(){
        return d;
    }

    //useful methods
    public int area(){
        return l*d;
    }
}
public class Constructor{
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle();
        Rectangle myRectangle2 = new Rectangle(5, 2);
        System.out.println(myRectangle.area());
        System.out.println(myRectangle2.area());
    }
}