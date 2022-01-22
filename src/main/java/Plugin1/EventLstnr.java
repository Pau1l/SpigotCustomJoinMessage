package Plugin1;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;


public class EventLstnr implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        Player player = event.getPlayer();

        switch (player.getName()){
            case "YourNicknameHere":
                event.setJoinMessage(ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.WHITE + " has joined " + ChatColor.AQUA + "YourServerNameHere");
                break;
            case "YourNicknameHere2":
                event.setJoinMessage(ChatColor.LIGHT_PURPLE + player.getName() + ChatColor.WHITE + " has joined " + ChatColor.GREEN + "YourServerNameHere");
                break;
            default:
                event.setJoinMessage(ChatColor.DARK_GRAY + player.getName() + ChatColor.WHITE + " has joined " + ChatColor.DARK_GRAY + "YourServerNameHere");
                break;
        }
    }
}