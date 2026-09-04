package assignment.practiceset;

class Employee{
    int salary;
    String name;


    int getsalary(){
        return salary;
    }
    String getName(){
        return name;
    }
    void setname(String a){
        name =a;
    } 
}
class Cellphone{
    String ringing(){
        return "Ringing...";
    }
    String vibrating(){
        return "Vibrating...";
    }
}

class Square{
    int sides,r=sides;
    void Setside(int n){
        sides=n;
    }
    int area(){
        return sides*sides;
    }
    int perimeter(){
        return 4*sides;
    }
}


class Rectangle{
    int length,breadth;
    void Setside(int m,int n){
        length=m;
        breadth=n;
    }
    int area(){
        return length*breadth;
    }
    int perimeter(){
        return 2*(length+breadth);
    }
}

class TommyVecetti{
    void hit(){
        System.out.println("hitting");
    }
    void run(){
        System.out.println("running");
    }
    void fire(){
        System.out.println("Fireing");
    }
    
}


public class Class8 {
    public static void main(String[] args) {
        //createing an object
        Employee akif = new Employee();
        //akif.name="akif";
        akif.setname("akif");
        akif.salary=35000;
        System.out.println(akif.getName());
        System.out.println(akif.getsalary());


        //2. create a class cellphone woth methods to print ringing and vibrating
        Cellphone phone = new Cellphone();
        System.out.println(phone.ringing());
        System.out.println(phone.vibrating());

        //create a class square with a method to initialize its side, calculating area and perimeter
        System.out.println();
        Square sq= new Square();
        sq.Setside(5);
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        Rectangle rec= new Rectangle();
        rec.Setside(5,5);
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        System.out.println();

        //rockstar games
        TommyVecetti play = new TommyVecetti();
        play.fire();
        play.hit();
        play.run();
         
    }    
}
