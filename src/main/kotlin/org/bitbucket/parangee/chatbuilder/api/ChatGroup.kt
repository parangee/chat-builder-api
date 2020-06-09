package org.bitbucket.parangee.chatbuilder.api

import org.bukkit.ChatColor

class ChatGroup(private val title:String) {
    private val items = ArrayList<String>()
    fun add(str:String) {
        items.add(str)
    }
    fun getResult() : String {
        var rs = trans("&c| &a- &f${title}")
        items.forEach {
            rs = trans("$rs\n&c| &f$it")
        }
        return rs
    }
    private fun trans(str:String) : String {
        return ChatColor.translateAlternateColorCodes('&', str)
    }
}