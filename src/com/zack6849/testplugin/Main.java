package com.zack6849.testplugin;

import co.foxdev.foxbotng.FoxBotNG;
import co.foxdev.foxbotng.api.Plugin;
import co.foxdev.foxbotng.listeners.MessageListener;
import org.kitteh.irc.client.library.Client;

/**
 * Created by zack6849 on 11/29/2015.
 */
@Plugin(name = "Test Plugin", author = "zack6849", version = "1.0", description = "Hello World!")
public class Main {

    public Main(){
        FoxBotNG bot = FoxBotNG.getInstance();
        for(Client client : bot.getClientManager().getClients()){
            client.getEventManager().registerEventListener(new MessageEvent());
        }
    }

}
s