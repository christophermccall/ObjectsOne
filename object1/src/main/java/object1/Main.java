package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");


        Person person1 = new Person("Jill", 37, 160);
        Person person2 = new Person("Chris",40, 187);

        Person[] residents = new Person[2];
        residents[0] = person1;
        residents[1] = person2;


        Chair fancyChair = new Chair("leather", "none",67,100,6 );
        Chair casualChair = new Chair("linen", "checkered",49,80,4 );


        Chair[] livingRoomChairs = new Chair[2];
        livingRoomChairs[0] = fancyChair;
        livingRoomChairs[1] = casualChair;



        for(int x = 0; x < 2; x++){
            System.out.println("Name: " + residents[x].name);
            System.out.println("Favorite Furniture: " + livingRoomChairs[x].getMaterial() + " Chair");
            System.out.println(" ");
        }

    }

}
