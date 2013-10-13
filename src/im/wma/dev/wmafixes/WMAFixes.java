package im.wma.dev.wmafixes;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class WMAFixes extends JavaPlugin implements Listener {
	   
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("Blah 2");
    }
    
	public void onDisable(){
		getLogger().info("Blah 2");
	}
   
    @EventHandler
    public void onBlockFromTo(BlockFromToEvent event) {
      int id = event.getBlock().getTypeId();
      if(id == 8 || id == 9) {
    	  getLogger().info("a user placed water!");
        event.setCancelled(true);
      }
    }
}