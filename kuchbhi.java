public class kuchbhi {
    public static void main(String[] args){
        Mridula mridu = new Mridula();   // make object mridu who can use Mridula class structure
        mridu.name="raneem";
        mridu.age="24";
         System.out.println(mridu.name + " " + mridu.age);  // access mridu object properties
         mridu.eat(); // access mridu object behaviour

    }
}

class Mridula{   // class is just a blueprint , a container of objects, their properties, and behaviour(method). 
    String name;  // object properties ( not behaviour)
    String age;

    void eat(){                                // method inside class shows behaviour that objects can replicate.
        System.out.println("let's eat");
    }

}