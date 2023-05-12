package potato.ball.ff14;

import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.attribute.AttributeModifier.Operation;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.inventory.meta.ItemMeta;

public class EventListener implements Listener {
	@EventHandler
	public void onInteract(PlayerInteractEvent e) {
		//プレイヤーがクリックしたり感圧版を踏んだりしたときのイベント。
		//ここから処理を書く

		e.getPlayer().sendMessage("PlayerInteractEventが発動！ Action:" + e.getAction());

		//ここまで処理を書く
	}
	
	@EventHandler
	public void onDamageByEntity(EntityDamageByEntityEvent e) {

		if (!(e.getDamager() instanceof Player)) {
			return;
		}
		
		Player player = (Player)e.getDamager();
		
		PlayerData playerData = PlayerData.get(player);
		
		PlayerStats playerStats = playerData.getStats();
		
		e.setDamage(playerStats.getAtk());
		//ここまで処理を書く
		
		
	}
	

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onDefUpdate(DefUpdateEvent e) {

		if(!(e.getPlayer().isOnline())){
			return;
		
		}
		
		PlayerInventory inventory = e.getPlayer().getPlayer().getInventory();
		
		ItemStack boots = inventory.getBoots();

		if (boots == null) {
			boots = new ItemStack(Material.LEATHER_BOOTS);
			inventory.setBoots(boots);
			
		}
		
		double armorValue = e.getTo()/10;
		
		ItemMeta bootsMeta = boots.getItemMeta();
		bootsMeta.setUnbreakable(true);
		bootsMeta.removeAttributeModifier(Attribute.GENERIC_ARMOR);
		bootsMeta.addAttributeModifier(Attribute.GENERIC_ARMOR,
					new AttributeModifier(UUID.randomUUID(),"Def",armorValue,Operation.ADD_NUMBER,EquipmentSlot.FEET));
	
		boots.setItemMeta(bootsMeta);
		
	}

	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onHpUpdate(HpUpdateEvent e) {

		if(!(e.getPlayer().isOnline())){
			return;
		
		}
		
		e.getPlayer().getPlayer().setMaxHealth(e.getTo()/50);

	}

	
	public static void main(String[] args) {
		
	}
}
