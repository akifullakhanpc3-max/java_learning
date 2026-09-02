package learning;

class Method {
    int logic(int x, int y) {
        //System.out.println(x+y);
        return x + y;
    }

    public static void main(String[] args) {
        // datatype == return type
        Method a = new Method();
        int b = a.logic(10, 20);
        a.logic(10, 20);
        // System.out.println(b);
    }
}