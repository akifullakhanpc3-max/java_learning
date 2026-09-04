package learning;

class NewClass{
    private int id;// attributes
    private float a =10.00f ; 
    String name  = "akif";
    void add(){//methods
        System.out.println("name : " + name);
        System.out.println(a);
    }
}

class Employee{
    int id;
    String name;
    int sal;
    void getSalary(){
        System.out.println(sal);
    }
    void getDetails(){
        System.out.println("name "+name);
        System.out.println("id "+id);
        System.out.println("sal "+sal);
    }
    void getname(){
        System.out.println(name);
    }

}


public class Class {
    public static void main(String[] args) {
        //in one java file we have only one java public class
        NewClass obj1 = new NewClass(); //createing a new object here
        obj1.add();

        Employee harry = new Employee();
        Employee akif = new Employee();
        harry.id =11;
        harry.name="Harry";
        harry.sal =350;

        harry.getDetails();
        System.out.println();
        akif.id =12;
        akif.name="Akif";
        akif.sal =3500;

        akif.getDetails();
    }
}
