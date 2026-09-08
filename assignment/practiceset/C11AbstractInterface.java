package assignment.practiceset;
abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("writting...");
    }
    void refill(){
        System.out.println("Refilling...");
    }
    void changeNib(){
        System.out.println("changing nib");
    }
}

interface BasicAnimal{
    void eat();    
    void sleep();
}

class Monkey{
    void jump(){
        System.out.println("jumping...");
    }
    void bite(){
        System.out.println("biting...");
    }
}

class Human extends Monkey implements BasicAnimal{
    public void eat(){
        System.out.println("eating food...");
    }
    public void sleep(){
        System.out.println("sleeping..");
    }
}

class Telephone{
    void ring(){
        System.out.println("ringing,...");
    }
    void lift(){
        System.out.println("lifting....");
    }
    void disconnect(){
        System.out.println("disconnecting..");
    }
}

class  Smartphone extends Telephone{
    Smartphone(){
        System.out.println("this is a smart phone class...");
    }
    void call(){
        System.out.println("calling...");
    }
}


public class C11AbstractInterface {
    public static void main(String[] args) {
        FountainPen a = new FountainPen();
        a.changeNib();
        a.refill();
        a.write();

        Human human = new Human();
        human.bite();
        human.eat();
        human.sleep();
        human.jump();

        Telephone t1 = new Smartphone();
        t1.disconnect();
        //t1.call();

        Monkey mon = new Human();
        mon.bite();
    }
}
