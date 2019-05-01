package com.discordgames;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws LoginException
    {
        // Token Stored as a Environment Variable
        final String TOKEN = System.getenv("BoogalooToken");        
        JDA bot = new JDABuilder(TOKEN)
            .addEventListener(new EventHandler())
            .build(); // Builds builder into a JDA

        // Wait for bot to ready
        try {
            bot.awaitReady();
            System.out.println("JDA Bot " + bot.toString() + " has Loaded");
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
