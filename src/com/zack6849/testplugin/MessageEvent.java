package com.zack6849.testplugin;

import org.kitteh.irc.client.library.event.channel.ChannelMessageEvent;
import org.kitteh.irc.lib.net.engio.mbassy.listener.Handler;

/**
 * Created by zack6849 on 11/29/2015.
 */
public class MessageEvent {
    @Handler
    public void onChannelMessage(ChannelMessageEvent event){
        event.getChannel().sendMessage("Hello World!");
    }
}
