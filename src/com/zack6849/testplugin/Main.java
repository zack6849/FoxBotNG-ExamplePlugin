package com.zack6849.testplugin;

import co.foxdev.foxbotng.api.Plugin;
import co.foxdev.foxbotng.api.PluginBase;
import org.kitteh.irc.client.library.Client;
import org.kitteh.irc.client.library.event.channel.ChannelMessageEvent;
import org.kitteh.irc.lib.net.engio.mbassy.listener.Handler;
import org.slf4j.Logger;

/**
 * Created by zack6849 on 11/29/2015.
 */

@Plugin(name = "Test Plugin", author = "zack6849", version = "1.0", description = "Hello World!")
public class Main extends PluginBase {

    @Override
    public void onEnable(){
        Logger log = getLogger();
        log.info("Hello World!");
        for(Client client : getBot().getClientManager().getClients()){
            client.getEventManager().registerEventListener(new MessageEvent());
        }
    }

    @Override
    public void onDisable(){

    }

    private class MessageEvent{
        //just an example, obviously having nested classes like this isn't smart, but it gets the point across.
        @Handler
        public void onChannelMessage(ChannelMessageEvent event){
            event.getChannel().sendMessage("Hello World!");
        }
    }
}