////burayı ellemeyin eşşekler
import Events.*;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;

import javax.security.auth.login.LoginException;
//////////bot durumu burası birader
public class Main {
    public static void main(String[] args) throws LoginException {
        JDABuilder jda = JDABuilder.createDefault("dnd");
        jda.setActivity(Activity.watching("Bot Durumu"));
        ///burda event ekliyonuz ok?
        jda.addEventListeners(new Help());
        jda.addEventListeners(new PingPong());
        jda.addEventListeners(new Clear());
        jda.addEventListeners(new Welcome());

        jda.build();

    }
}
