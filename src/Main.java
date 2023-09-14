
class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) {
        this.obj = obj;
    } // constructor
    public T getObject()
    {
        return this.obj;
    }
}
/*

 Java program to show multiple
 type parameters in Java Generics

 */
class Test2<para1, para2>{
    para1 p1;
    para2 p2;
    Test2(para1 p1, para2 p2){
        this.p1 =  p1;
        this.p2 = p2;
    }
    void print_parameters(){
        System.out.println("parameter 1 = "+ p1 +"\nparameter 2 = "+p2);
    }
}

/*

Generic function

 */

class Test3{
    <para3> void display(para3 p3){
        System.out.println(p3.getClass().getName() + " = "+p3);

    }
}

class water<w>{
    String oj1;
    water(String obj1){
        this.oj1 = obj1;
    }
}
class glass<g>{
    String oj2;
    glass(String obj2){
        this.oj2 = obj2;
    }
}
class Test4<water,glass>{
    water obj1;
    glass obj2;

    void display(){
        System.out.println(obj1.getClass().getName() + " = "+obj1);
        System.out.println(obj2.getClass().getName() + " = "+obj2);
    }
}


class First {
    public static void main(String[] args) {

        Test2<String, Integer> obj1 = new Test2<>("1", 2);
        obj1.print_parameters();

        Test3 obj3 = new Test3();
        obj3.display("Hi iam string");
        obj3.display(34);

        Test4<String, String> obj4 = new Test4<>();
        obj4.obj1 = "value of string 1";
        obj4.obj2 = "value of string 2";
        obj4.display();

    }
}



/*
 --> Also note that generics do not work with primitive data types but we can use wrapper classes like
     Integer, String, Arraylist etc..

 --> We can write a method/class/interface once and use it for any type we want.
 --> Type Safety: Generics make errors to appear compile time than at run time
        (It’s always better to know problems in your code at compile time rather
         than making your code fail at run time).
 */

