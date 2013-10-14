package im.wma.dev.wmafixes;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class WMAFixes extends JavaPlugin implements Listener {
	   
    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("WMAFixes Loaded");
    }
    
	public void onDisable(){
		getLogger().info("WMAFixes Disabled");
	}
   
}