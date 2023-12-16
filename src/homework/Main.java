package homework;

import logger.Log;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main{
    private static final Logger log = Log.log(dip1.Main.class.getName());

    public static void main(String[] args){
        log.log(Level.INFO, "just for me, to try");
        User user = new User("Bob");
        Persister persister = new Persister();
        UserReport userReport = new UserReport();
        userReport.report(user);
        persister.save(user);
    }
}