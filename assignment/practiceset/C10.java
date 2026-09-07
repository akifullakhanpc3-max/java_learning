package assignment.practiceset;

class Circle{
    public int radius;
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }

    Circle(int x){
        this.radius = x;
    }
    // public void setRadius(int radius) {
    //     this.radius = radius;
    // }
    public double getArea(){
        return 3.14*this.radius*this.radius;
    }
}
class cylinder extends Circle{
    private int length;
    cylinder(int x,int y){
        super(x);
        this.length=y;
    }
    public void setDetails(int radius,int length) {
        this.radius = radius;
        this.length=length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public double getArea(){
        return this.length*this.radius;
    }
}

class C10Rectangle {
    public int length;
    public int breadth;
    C10Rectangle(){
       System.out.println(); 
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public void setLength(int length) {
        this.length = length;
    }
    C10Rectangle(int x, int y){
        this.length = x;
        this.breadth =y;
    }
    public int getArea(){
        return length*breadth ;
    }

}
class C10cuboid extends C10Rectangle{
    private int height;

    C10cuboid(int x,int y,int z){
        super(x,y);
        this.height=z;
    }
    // @Override
    // public void setBreadth(int breadth) {
    //     // TODO Auto-generated method stub
    //     super.setBreadth(breadth);
    // }
    // @Override
    // public void setLength(int length) {
    //     // TODO Auto-generated method stub
    //     super.setLength(length);
    // }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getArea(){
        return 2*((length*breadth)+(breadth*height)+(height*length));
    }
}

public class C10 {
    public static void main(String[] args) {
        cylinder cy1 = new cylinder(5,10);
        Circle c1 = new  Circle(5);
        System.out.println("Area of circle is :" + c1.getArea());
        //cy1.setRadius(10);
        //System.out.println(cy1.getArea());
        System.out.println(cy1.getArea());

        C10Rectangle r1= new C10Rectangle(5,10);
        C10cuboid cuboid = new C10cuboid(50, 10, 0);
        System.out.println(r1.getArea());
        System.out.println(cuboid.getArea());

    }
    
}
