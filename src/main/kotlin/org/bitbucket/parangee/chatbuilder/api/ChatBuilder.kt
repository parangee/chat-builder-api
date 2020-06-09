package org.bitbucket.parangee.chatbuilder.api

import org.bukkit.ChatColor

class ChatBuilder(private val name:String) {
    private val items = ArrayList<ChatGroup>()
    fun getResult() : String {
        var rs = trans("&c========== &a[ &f$name &a] &c==========&f")
        items.forEach {
            rs = "$rs\n${it.getResult()}"
        }
        return rs
    }
    fun add(group:ChatGroup) {
        items.add(group)
    }
    private fun trans(str:String) : String {
        return ChatColor.translateAlternateColorCodes('&', str)
    }
}