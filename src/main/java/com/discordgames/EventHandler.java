package com.discordgames;

import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class EventHandler extends ListenerAdapter {
    // Group id of text channel group
    public static final String PLAYING_GROUP_ID = "550014421460713488";
    

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        // YODA style comparison to prevent NullPointerExceptions
        if (PLAYING_GROUP_ID.equals(event.getGroup().getId()))
            return; // Breaks out of method, doing nothing
    }
}