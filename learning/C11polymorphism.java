package learning;

interface camera{
    void capturephoto();
    void capturevideo();
}
interface music{
    void playmusic();
}

class Smartphone implements camera,music{
    public void capturephoto(){
        System.out.println("capturing photo");
    }
    public void capturevideo(){
        System.out.println("capturing video");
    }
    public void playmusic(){
        System.out.println("playing music");
    }
} 
public class C11polymorphism {
    public static void main(String[] args) {
        camera s1 = new Smartphone();
        s1.capturephoto();
        //s1.playmusic();  --> not allowed 
        
    }
}
