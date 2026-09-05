package assignment.practiceset;

class Cylinder{
    private double radius;
    private double height;
    //private double area;
    private final static double pi = 3.14;

    void setRadius(int radius){
        this.radius = radius;
    }

    void setHeight(int height){
        this.height = height;
    }

    double getRadius(){
        return radius;
    }

    double getHeight(){
        return height;
    }

    void calculateSurface(){
        double surfaceArea = 2*((pi*radius*height)+(pi*radius*radius));
        System.out.println("the surface area of cylinder is : "+surfaceArea);
    }
    void calcualteVolume(){
        double volume = pi*radius*radius*height;
        System.out.println("the volume os cylinder is : "+ volume);
    }
}

class C9Rectangle{
    private int length;
    private int breadth;
    C9Rectangle(){
        length =4;
        breadth = 5;
    }
    C9Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void printDetails(){
        System.out.println("length :"+ length+"\nBreadth :"+breadth);
    }
}

class C9Sphere{
    private int radius;
    private int height;

    void setDetails(int radius, int height){
        this.radius = radius;
        this.height = height;
    }
    int getHeight(){
        return height;
    }
    int getRadius(){
        return radius;
    }
}

public class C9AccessModifierAndConstraints {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setHeight(10);
        c1.setRadius(20);
        System.out.println("Height : "+c1.getHeight());
        System.out.println("Radius : "+c1.getRadius());
        c1.calculateSurface();
        c1.calcualteVolume();

        //Rectangle
        C9Rectangle r1 = new C9Rectangle();
        C9Rectangle r2 = new C9Rectangle(5,10);
        r1.printDetails();
        r2.printDetails();

        C9Sphere s1 = new C9Sphere();
        s1.setDetails(20, 30);
        System.out.println("sphere Radius :"+s1.getRadius());
        System.out.println("sphere Height :"+s1.getHeight());
    }
}
