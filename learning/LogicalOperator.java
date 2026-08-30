package learning;
class LogicalOperator{
    public static void main(String[] args) {
        // this file consists of both learning of relational and logical operator
        int age =10 ;
         // now using relational operator 
        //== != < <= >=  >
        
        //&& || !
        // for logical and
        boolean a = true, b= false;
        if (a && b) {
            System.out.println("yes ");
        }else{
            System.out.println("noo");
        }
        // for logical or
        if (a || b) {
            System.out.println("Logical OR :yes");
        }
        else{
            System.out.println(" logical OR : noo");
        }
        if(!a){
            System.out.println(!a);
        }else{
            System.out.println(!b);
        }
        
    }
}