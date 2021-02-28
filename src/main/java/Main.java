import net.dv8tion.jda.api.GatewayEncoding;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.internal.JDAImpl;

import javax.security.auth.login.LoginException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static JDA jda;

    public static void main(String[] args) throws Exception {
        String part1 ="NzgyMTYzNjUxMzY3Nzk2NzQ3.";
        String part2 ="X8IMqg.iuDL6L-5UxfJoMRiiCeQORzv_AA";

        jda = JDABuilder.createDefault(part1+part2)
                .addEventListeners(new Listener())
                .build();

        jda.awaitReady().getCategories().get(0).getTextChannels().get(0).sendMessage("Соси хуй").tts(true)
                .submit();
    }
}
