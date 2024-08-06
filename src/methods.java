
class Obj {

    /*[access modifier] [return type] [name] ([parameters]) {
        statements;
    }*/
    public void create() {
        System.out.println("Object Created");
    }

    public String active(int n) {
        if (n > 10) {
            return "Object is active";
        } else {
            return "Object destroyed";
        }

    }
}

public class methods {

    //Used to perform operation and break up code into smaller re-uasable parts [Locaated in a class]
    public static void main(String[] args) {
        Obj a = new Obj();

        a.create();

        System.out.println(a.active(10));
    }
}
