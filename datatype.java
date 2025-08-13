import java.util.ArrayDeque;
import java.util.Arrays;

public class datatype {
public static void main(String[] args) {
    // in java data type are divided into two 
    // i.primitive and ii. non -primitive
    //byte
    byte byteVal=10;
    System.out.println(byteVal);
    //short
    short shortVal=10000;
    System.out.println(shortVal);
    //int
    int intVal=123345;
    System.out.println(intVal);
    //long
    long longVal=12345678899L;
    System.out.println(longVal);
    //float
    float floatVal=1234f;
    System.out.println(floatVal);
    //double
    double doubleVal=123456;
    System.out.println(doubleVal);

    //boolean 
    boolean boolVal=true;
    System.out.println(boolVal);
    //char
    char chars='s';
    System.out.println(chars);
    

    //non primitive
    // String
    String str="Subham";
    System.out.println(str);

    //array
    int arr[]={10,20,30,40};
    for (int i : arr) {
        System.out.println(i);
    }

    //Class
    Aiml student1=new Aiml("Subham", 51);
    System.out.println("name:"+student1.name+" Uni roll:"+student1.uni_roll);
  //wrapper class

  Float float1=Float.valueOf(100);
  System.out.println("Float:"+float1);

// object fron std library
StringBuilder sb=new StringBuilder("Java");
System.out.println(sb);
sb.append("is a programming language");
System.out.println(sb);


}    
}
 class Aiml{
    String name;
    int uni_roll;
    Aiml(String name ,int uni_roll){
        this.uni_roll=uni_roll;
        this.name=name;

    }
}


//For more visit to:
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
