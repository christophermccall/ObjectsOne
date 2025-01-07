package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");
        Person person2 = new Person("Chris",30, 187);
        Chair fancyChair = new Chair("leather", "none",67,100,6 );

        System.out.println(fancyChair.getHeight());
    }

}
