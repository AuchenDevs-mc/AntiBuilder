package me.craciu25yt.AntiBuilder;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockPlace implements Listener {
    @EventHandler
    public void blockPlace(BlockPlaceEvent event) {
        Player player = event.getPlayer();
        String name = player.getName();
        if(player.hasPermission("antibuilder.build")){

        }else{
            player.sendMessage("§cHey §b" + name + "§c. Sorry but you can't place blocks.");
            event.setCancelled(true);
        }
    }
}
