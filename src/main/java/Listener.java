import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class Listener extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        String str = event.getMessage().getContentDisplay();
        System.out.println(str);
       /* try {
            Main.jda.awaitReady().getCategories().get(0).getTextChannels().get(0).sendMessage(str);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
    }
}
