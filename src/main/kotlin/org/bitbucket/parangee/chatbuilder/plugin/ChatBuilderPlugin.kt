package org.bitbucket.parangee.chatbuilder.plugin

import org.bitbucket.parangee.chatbuilder.api.ChatBuilder
import org.bitbucket.parangee.chatbuilder.api.ChatGroup
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin

class ChatBuilderPlugin:JavaPlugin() {
    override fun onEnable() {
        logger.info("Chat Builder API enabled.")
    }
}