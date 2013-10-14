package im.wma.dev.wmafixes;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.plugin.java.JavaPlugin;


public class LiquidStop extends JavaPlugin implements Listener {
	
	// Water and Lava
    @EventHandler
    public void onBlockFromTo(BlockFromToEvent event) {
      int id = event.getBlock().getTypeId();
      if(id == 8 || id == 9) {
    	  	getLogger().info("a user placed water");
    	  	event.setCancelled(true);
      } else if(id == 10 || id == 11) {
        	getLogger().info("a user placed lava");
        	event.setCancelled(true); 	
      }
    }      
}
