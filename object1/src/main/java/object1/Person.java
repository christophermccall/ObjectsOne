package object1;

class Person {
    // instance variables
    String name;
    int age = 0;
    int height = 0; // units = centimeters
    //constructor
    public Person(String name, int age, int height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args){
        Person person1 = new Person("Chris", 30, 187);
    }
}