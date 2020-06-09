package org.bitbucket.parangee.chatbuilder.plugin

import org.bukkit.plugin.java.JavaPlugin

class ChatBuilderPlugin:JavaPlugin() {
    override fun onEnable() {
        logger.info("Chat Builder API enabled.")
    }
}