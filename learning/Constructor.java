package learning;

class Constructor_employee {
    private int id;
    private String name;
    
    //auto invoke if any other value is not initialised it asign itself
    //it set default we can pass arug
    // public Constructor_employee(){
    //     id=45;
    //     name= "alkak";
    // }
    public Constructor_employee(String name, int id){
        this.name=name;
        this.id=id;
    }
    public void setname(String n) {
        name = n;
    }

    public void setId(int n) {
        id = n;
    }

    public int getId() {
        return id;
    }

    public String getname() {
        return name;
    }
}

public class Constructor {
    //construction is ued to initialised the value my using constructor methods it has same name as class
    //we can overload constructor alsoo
    public static void main(String[] args) {
        Constructor_employee harry = new Constructor_employee("akif",45);
        // harry.setId(25);
        // harry.setname("akif");
        System.out.println(harry.getId());
        System.out.println(harry.getname());

    }
}
