package learning;
class Base{
    int x;
    public void printMe(){
        System.out.println("i am a functio`n");
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Derived d1 = new Derived();
        System.out.println(d1.getX());
    }
}
