package lesson1;

public class Person {
    private String personName;
    /* private int personCounter;是行不通的，这样personCounter属于每个实例，
    相当于它的值永远是1，而这无法记录person人数，如果想要记录人数，
    则要加上modifier static，将其变成class level的variable */
    private static int personCounter;  // int的default值是0

    // constructor
    public Person(String personName){
        // this.表示这个实例的
        this.personName = personName;
    }

    public Person(){
        personCounter++;
    }

    public String helloWorld(){
        return "Hello World";
    }

    public String hello(String name){
        return "Hello " + name;
    }

    // 返回值personCounter是static，function最好保持一致
    public static int numberOfPersons(){
        return personCounter;
    }
}
