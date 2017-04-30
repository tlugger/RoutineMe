package spring.controllers;
import java.util.UUID;

/**
 * Created by josecanizares on 4/29/17.
 */
public class GenerateUUID {
    public static final void main(String... aArgs){
        //generate random UUIDs
        UUID idOne = UUID.randomUUID();
        UUID idTwo = UUID.randomUUID();
        log("UUID One: " + idOne);
        log("UUID Two: " + idTwo);
    }

    private static void log(Object aObject) {
        System.out.println(String.valueOf(aObject));
    }
}
