package cyan735.shorterjoinquitmessages;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class ShorterJoinQuitMessages extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // Register event listeners
        getServer().getPluginManager().registerEvents(this, this);
    }

    //Set join Message
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent playerJoinEvent) {
        playerJoinEvent.setJoinMessage(ChatColor.GREEN + ">>> " + ChatColor.WHITE + playerJoinEvent.getPlayer().getName());
    }

    //Set quit message
    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent playerQuitEvent) {
        playerQuitEvent.setQuitMessage(ChatColor.RED + "<<< " + ChatColor.WHITE + playerQuitEvent.getPlayer().getName());
    }
}
