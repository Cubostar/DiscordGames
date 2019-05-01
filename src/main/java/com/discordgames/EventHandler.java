package com.discordgames;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.Category;
import net.dv8tion.jda.core.entities.Channel;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

public class EventHandler extends ListenerAdapter {
    // Group id of text channel group
    public static final String PLAYING_GROUP_ID = "572972111858106379";
    public static final String COMMAND_PREFIX = "!!";

    public Game game = new Game();

    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
        // YODA style comparison to prevent NullPointerExceptions
        if (PLAYING_GROUP_ID.equals(event.getGroup().getId()))
            return; // Breaks out of method, doing nothing

        JDA bot = event.getJDA();

        // Start Command
        if ((COMMAND_PREFIX + "start").equalsIgnoreCase(event.getMessage().getContentDisplay())) {
            game = new Game();
            Category category = event.getMessage().getCategory();
            for(Channel channel : category.getChannels()) {
                channel.delete();
            }
            for(Room room : game.getManager()) {
                category.createTextChannel(room.getName());
            }
        }
    }
}