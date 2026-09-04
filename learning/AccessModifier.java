package learning;

class myEmp{
    private int id;
    private String name;

    public void setname(String n){
        name =n;
    }
    public void setId(int n){
        id= n;
    }
    public int getId(){
        return id;
    }
    public String getname(){
        return name;
    }
}

public class AccessModifier {
    public static void main(String[] args) {
        myEmp harry=new myEmp();
        harry.setId(25);
        harry.setname("akif");
        System.out.println(harry.getId());
        System.out.println(harry.getname());

    }
}
