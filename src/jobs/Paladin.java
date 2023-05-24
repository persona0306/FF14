package jobs;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.persistence.PersistentDataType;
import org.bukkit.util.Vector;

import net.md_5.bungee.api.ChatColor;
import potato.ball.ff14.PlayerStats;

public class Paladin extends Job {
	private static final String jobName = ""+ChatColor.YELLOW+ChatColor.BOLD+"Paladin";
	
	private static final HashMap<Integer,ItemStack> inventoryContents =
													new HashMap<Integer,ItemStack>();
	
	static {
		
		
		ItemStack jobIcon = new ItemStack(Material.NAME_TAG);
		
		ItemMeta jobIconMeta = jobIcon.getItemMeta();
		
		ArrayList<String> jobIconLore = new ArrayList<String>();
		
		jobIconLore.add(""+ChatColor.GRAY+"パッシブ");
		jobIconLore.add(""+ChatColor.BLUE+ChatColor.BOLD+"恐れ知らず");
		jobIconLore.add(""+ChatColor.WHITE+"    パーティーのヘイトスコアを確認できる。");
		jobIconLore.add(""+ChatColor.WHITE+"    他ロールよりヘイトスコアの上昇値が高い。");
		jobIconLore.add(""+ChatColor.WHITE+"    わずかにノックバック耐性がある。");
		jobIconLore.add("");
		jobIconLore.add(""+ChatColor.GOLD+ChatColor.BOLD+"ロイヤルゲージ");
		jobIconLore.add(""+ChatColor.WHITE+"    ガード&チャージ実行中に敵から攻撃を受ける");
		jobIconLore.add(""+ChatColor.WHITE+"    ことでゲージを溜めることができる。");
		jobIconLore.add(""+ChatColor.WHITE+"    敵から受けたダメージに応じてゲージの獲得量");
		jobIconLore.add(""+ChatColor.WHITE+"    が変動する。");
		jobIconLore.add(""+ChatColor.WHITE+"    ゲージを消費して特定のアクションを実行する");
		jobIconLore.add(""+ChatColor.WHITE+"    ことができる。");
		
		jobIconMeta.setLore(jobIconLore);
		
		jobIconMeta.setCustomModelData(2);
		
		jobIconMeta.setDisplayName(""+ChatColor.BLUE+ChatColor.BOLD+"タンク"+
									ChatColor.WHITE+ChatColor.BOLD+" : "+
									ChatColor.YELLOW+ChatColor.BOLD+"聖騎士");
		
		jobIcon.setItemMeta(jobIconMeta);
		
		inventoryContents.put(22,jobIcon);
		
		
		
		ItemStack shield = new ItemStack(Material.SHIELD);
		
		ItemMeta shieldMeta = shield.getItemMeta();
		
		PersistentDataContainer shieldDataContainer = shieldMeta.getPersistentDataContainer();
		
		shieldDataContainer.set(NamespacedKey.fromString("action"), PersistentDataType.
								INTEGER, 0);
		
		ArrayList<String> shieldLore = new ArrayList<String>();
		
		shieldLore.add(""+ChatColor.GRAY+"ユニークスキル");
		shieldLore.add(""+ChatColor.AQUA+ChatColor.BOLD+"ガード");
		shieldLore.add(""+ChatColor.WHITE+"ガード実行時（右クリック）防御力が30%上昇する。");
		shieldLore.add(""+ChatColor.WHITE+"敵から攻撃を受けた際にチャージをする。");
		shieldLore.add("");
		shieldLore.add(""+ChatColor.AQUA+ChatColor.BOLD+"チャージ");
		shieldLore.add(""+ChatColor.WHITE+"敵から受けた攻撃力に応じてロイヤルゲージが上昇する。");
		
		shieldMeta.setLore(shieldLore);
		
		shieldMeta.setCustomModelData(1);
		
		shieldMeta.setDisplayName(""+ChatColor.GOLD+ChatColor.BOLD+"ガード＆チャージ");
		
		shield.setItemMeta(shieldMeta);
		
		inventoryContents.put(40,shield);

		
		
		
		ItemStack sword = new ItemStack(Material.BOOK);
		
		ItemMeta swordMeta =  sword.getItemMeta();
		
		PersistentDataContainer swordDataContainer = swordMeta.getPersistentDataContainer();
		
		swordDataContainer.set(NamespacedKey.fromString("action"), PersistentDataType.
								INTEGER, 1);
		
		ArrayList<String> swordLore = new ArrayList<String>();
		
		swordLore.add(""+ChatColor.GRAY+"ウェポンスキル");
		swordLore.add(""+ChatColor.AQUA+ChatColor.BOLD+"Cast Time  Recast Time");
		swordLore.add(""+			   ChatColor.WHITE+"   instant           3.5 s");
		swordLore.add("");
		swordLore.add(""+ChatColor.WHITE+"対象に物理攻撃。");
		swordLore.add(""+ChatColor.RED+"威力"+ChatColor.WHITE+" : 110");

		swordMeta.setLore(swordLore);
		
		swordMeta.setCustomModelData(1111);
		
		swordMeta.setDisplayName(""+ChatColor.RED+ChatColor.BOLD+"ナイトソード");
		
		sword.setItemMeta(swordMeta);
		
		inventoryContents.put(0,sword);
		
		
		
		ItemStack ac2 = new ItemStack(Material.BOOK);
		
		ItemMeta ac2Meta = ac2.getItemMeta();
		
		PersistentDataContainer ac2DataContainer = ac2Meta.getPersistentDataContainer();
		
		ac2DataContainer.set(NamespacedKey.fromString("action"), PersistentDataType.
								INTEGER, 2);
		
		ac2Meta.setCustomModelData(1112);
		
		ac2Meta.setDisplayName(""+ChatColor.BLUE+ChatColor.BOLD+"プロテクタリ");
		
		ArrayList<String> ac2Lore = new ArrayList<String>();
		
		ac2Lore.add(""+ChatColor.GRAY+"アビリティ");
		ac2Lore.add(""+ChatColor.AQUA+ChatColor.BOLD+"Cast Time  Recast Time");
		ac2Lore.add(""+			   ChatColor.WHITE+"   instant         120.0 s");
		ac2Lore.add("");
		ac2Lore.add(""+ChatColor.WHITE+"一定時間、"+
					ChatColor.GREEN+ChatColor.BOLD+"ガード＆チャージ"+
					ChatColor.WHITE+"実行中の");
		ac2Lore.add(ChatColor.WHITE+"自身の被ダメージを30％軽減させる。");
		ac2Lore.add(ChatColor.WHITE+"さらにチャージ量を2倍にする");
		ac2Lore.add(""+ChatColor.LIGHT_PURPLE+"効果時間"+ChatColor.WHITE+" : 15秒");

		ac2Meta.setLore(ac2Lore);
		
		ac2.setItemMeta(ac2Meta);
		
		inventoryContents.put(1,ac2);
		
		
		
		ItemStack ac3 = new ItemStack(Material.BOOK);
		
		ItemMeta ac3Meta = ac3.getItemMeta();
		
		PersistentDataContainer ac3DataContainer = ac3Meta.getPersistentDataContainer();
		
		ac3DataContainer.set(NamespacedKey.fromString("action"), PersistentDataType.
								INTEGER, 3);
		
		ac3Meta.setCustomModelData(1113);
		
		ac3Meta.setDisplayName(""+ChatColor.BLUE+ChatColor.BOLD+"アブソリュートアーマー");
		
		ArrayList<String> ac3Lore = new ArrayList<String>();
		
		ac3Lore.add(""+ChatColor.GRAY+"アビリティ");
		ac3Lore.add(""+ChatColor.AQUA+ChatColor.BOLD+"Cast Time  Recast Time");
		ac3Lore.add(""+			   ChatColor.WHITE+"   instant         400.0 s");
		ac3Lore.add("");
		ac3Lore.add(""+ChatColor.WHITE+"一定時間、自身への一部を除くすべての");
		ac3Lore.add(""+ChatColor.WHITE+"ダメージを無効化する。");
		ac3Lore.add(""+ChatColor.LIGHT_PURPLE+"効果時間"+ChatColor.WHITE+" : 10秒");

		ac3Meta.setLore(ac3Lore);
		
		ac3.setItemMeta(ac3Meta);
		
		inventoryContents.put(2,ac3);
		
		
		
		ItemStack ac4 = new ItemStack(Material.BOOK);
		
		ItemMeta ac4Meta = ac4.getItemMeta();
		
		PersistentDataContainer ac4DataContainer = ac4Meta.getPersistentDataContainer();
		
		ac4DataContainer.set(NamespacedKey.fromString("action"), PersistentDataType.
								INTEGER, 4);
		
		ac4Meta.setCustomModelData(1114);
		
		ac4Meta.setDisplayName(""+ChatColor.GOLD+ChatColor.BOLD+"まもる");
		
		ArrayList<String> ac4Lore = new ArrayList<String>();
		
		ac4Lore.add(""+ChatColor.GRAY+"アビリティ");
		ac4Lore.add(""+ChatColor.AQUA+ChatColor.BOLD+"Cast Time  Recast Time");
		ac4Lore.add(""+			   ChatColor.WHITE+"   instant          90.0 s");
		ac4Lore.add("");
		ac4Lore.add(""+ChatColor.WHITE+"対象のパーティメンバーが受ける攻撃を肩代わりする。");
		ac4Lore.add(""+ChatColor.WHITE+"ただし、一部の攻撃はかばうことができない。");
		ac4Lore.add(""+ChatColor.WHITE+"対象との距離が10ブロックより離れると効果が");
		ac4Lore.add(""+ChatColor.WHITE+"発揮されない。");
		ac4Lore.add(""+ChatColor.LIGHT_PURPLE+"効果時間"+ChatColor.WHITE+" : 10秒");

		ac4Meta.setLore(ac4Lore);
		
		ac4.setItemMeta(ac4Meta);
		
		inventoryContents.put(3,ac4);
		
		
		
		ItemStack ac5 = new ItemStack(Material.BOOK);
		
		ItemMeta ac5Meta = ac5.getItemMeta();
		
		PersistentDataContainer ac5DataContainer = ac5Meta.getPersistentDataContainer();
		
		ac5DataContainer.set(NamespacedKey.fromString("action"), PersistentDataType.
								INTEGER, 5);
		
		ac5Meta.setCustomModelData(1115);
		
		ac5Meta.setDisplayName(""+ChatColor.GOLD+ChatColor.BOLD+"ウィングス・オブ・ロイヤリティ");
		
		ArrayList<String> ac5Lore = new ArrayList<String>();
		
		ac5Lore.add(""+ChatColor.GRAY+"アビリティ");
		ac5Lore.add(""+ChatColor.AQUA+ChatColor.BOLD+"Cast Time  Recast Time");
		ac5Lore.add(""+			   ChatColor.WHITE+"   instant         160.0 s");
		ac5Lore.add("");
		ac5Lore.add(""+ChatColor.WHITE+"自身の後方扇範囲に被ダメージを軽減するシールドを生成する。");
		ac5Lore.add(""+ChatColor.WHITE+"効果時間中はチャージ状態になり、自身の防御力が25%アップする。");
		ac5Lore.add(""+ChatColor.WHITE+"さらに範囲内にいるパーティメンバーの被ダメージを15％軽減する。");
		ac5Lore.add(""+ChatColor.WHITE+"効果時間中にアクションの実行や移動を行うと、");
		ac5Lore.add(""+ChatColor.WHITE+"ウィングス・オブ・ロイヤリティは即座に解除される。");
		ac5Lore.add(""+ChatColor.LIGHT_PURPLE+"効果時間"+ChatColor.WHITE+" : 18秒");

		ac5Meta.setLore(ac5Lore);
		
		ac5.setItemMeta(ac5Meta);
		
		inventoryContents.put(4,ac5);
		
		
		
		ItemStack ac6 = new ItemStack(Material.BOOK);
		
		ItemMeta ac6Meta = ac6.getItemMeta();
		
		PersistentDataContainer ac6DataContainer = ac6Meta.getPersistentDataContainer();
		
		ac6DataContainer.set(NamespacedKey.fromString("action"), PersistentDataType.
								INTEGER, 6);
		
		ac6Meta.setCustomModelData(1116);
		
		ac6Meta.setDisplayName(""+ChatColor.GOLD+ChatColor.BOLD+"パラディンズ"+
								ChatColor.WHITE+"・"+
								ChatColor.RED+ChatColor.BOLD+"ソード");
		
		ArrayList<String> ac6Lore = new ArrayList<String>();
		
		ac6Lore.add(""+ChatColor.GRAY+"ウェポンスキル");
		ac6Lore.add(""+ChatColor.AQUA+ChatColor.BOLD+"Cast Time  Recast Time");
		ac6Lore.add(""+			   ChatColor.WHITE+"   instant          20.0 s");
		ac6Lore.add("");
		ac6Lore.add(""+ChatColor.WHITE+"対象に物理攻撃");
		ac6Lore.add(""+ChatColor.RED+"威力"+ChatColor.WHITE+" : 310");
		ac6Lore.add(""+ChatColor.GOLD+"追加効果"+ChatColor.WHITE+": 対象に継続ダメージを付与する");
		ac6Lore.add(""+ChatColor.RED+"威力"+ChatColor.WHITE+" : 30");
		ac6Lore.add(""+ChatColor.LIGHT_PURPLE+"効果時間"+ChatColor.WHITE+" : 30秒");
		ac6Lore.add(""+ChatColor.AQUA+"発動条件"+ChatColor.WHITE+": 「ロイヤル」30");

		ac6Meta.setLore(ac6Lore);
		
		ac6.setItemMeta(ac6Meta);
		
		inventoryContents.put(5,ac6);
		
		
		
		ItemStack ac7 = new ItemStack(Material.BOOK);
		
		ItemMeta ac7Meta = ac7.getItemMeta();
		
		PersistentDataContainer ac7DataContainer = ac7Meta.getPersistentDataContainer();
		
		ac7DataContainer.set(NamespacedKey.fromString("action"), PersistentDataType.
								INTEGER, 7);
		
		ac7Meta.setCustomModelData(1117);
		
		ac7Meta.setDisplayName(""+ChatColor.GOLD+ChatColor.BOLD+"パラディンズ"+
								ChatColor.WHITE+"・"+
								ChatColor.YELLOW+ChatColor.BOLD+"エキシズ");
		
		ArrayList<String> ac7Lore = new ArrayList<String>();
		
		ac7Lore.add(""+ChatColor.GRAY+"ウェポンスキル");
		ac7Lore.add(""+ChatColor.AQUA+ChatColor.BOLD+"Cast Time  Recast Time");
		ac7Lore.add(""+			   ChatColor.WHITE+"     2.5s           40.0 s");
		ac7Lore.add("");
		ac7Lore.add(""+ChatColor.WHITE+"自身の攻撃速度を10%上昇させる");
		ac7Lore.add(""+ChatColor.WHITE+"さらに自身と周囲のパーティーメンバーの");
		ac7Lore.add(""+ChatColor.WHITE+"攻撃力を一定期間、2%上昇させる。");
		ac7Lore.add(""+ChatColor.LIGHT_PURPLE+"効果時間"+ChatColor.WHITE+" : 50秒");
		ac7Lore.add(""+ChatColor.AQUA+"発動条件"+ChatColor.WHITE+": 「ロイヤル」60");

		ac7Meta.setLore(ac7Lore);
		
		ac7.setItemMeta(ac7Meta);
		
		inventoryContents.put(6,ac7);
		
		
		
		ItemStack ac8 = new ItemStack(Material.BOOK);
		
		ItemMeta ac8Meta = ac8.getItemMeta();
		
		PersistentDataContainer ac8DataContainer = ac8Meta.getPersistentDataContainer();
		
		ac8DataContainer.set(NamespacedKey.fromString("action"), PersistentDataType.
								INTEGER, 8);
		
		ac8Meta.setCustomModelData(1118);
		
		ac8Meta.setDisplayName(""+ChatColor.GOLD+ChatColor.BOLD+"パラディンズ"+
								ChatColor.WHITE+"・"+
								ChatColor.BLUE+ChatColor.BOLD+"プロテマ");
		
		ArrayList<String> ac8Lore = new ArrayList<String>();
		
		ac8Lore.add(""+ChatColor.GRAY+"ウェポンスキル");
		ac8Lore.add(""+ChatColor.AQUA+ChatColor.BOLD+"Cast Time  Recast Time");
		ac8Lore.add(""+			   ChatColor.WHITE+"     3.0s          120.0 s");
		ac8Lore.add("");
		ac8Lore.add(""+ChatColor.WHITE+"自身と周囲のパーティーメンバーに");
		ac8Lore.add(""+ChatColor.WHITE+"一定量のダメージを防ぐバリアを張る。");
		ac8Lore.add(""+ChatColor.WHITE+"このバリアは自身の現在HPの20%分の");
		ac8Lore.add(""+ChatColor.WHITE+"ダメージを軽減する。");
		ac8Lore.add(""+ChatColor.LIGHT_PURPLE+"効果時間"+ChatColor.WHITE+" : 30秒");
		ac8Lore.add(""+ChatColor.AQUA+"発動条件"+ChatColor.WHITE+": 「ロイヤル」60");

		ac8Meta.setLore(ac8Lore);
		
		ac8.setItemMeta(ac8Meta);
		
		inventoryContents.put(7,ac8);
		
	}

	public Paladin(OfflinePlayer player) {
		super(player);
	}

	@Override
	public PlayerStats getBaseStats() {
		PlayerStats playerStats = new PlayerStats(getPlayer(),12000, 50, 70, 40, 30, 50);
		return playerStats;
	}

	public String getName() {
		return jobName;
	
	}

	@Override
	protected HashMap<Integer,ItemStack> getInventoryContents() {
		
		return inventoryContents;
	}

	@Override
	public void action(int actionNumber) {
		
		if (!getPlayer().isOnline()) return;
		
		Player player = getPlayer().getPlayer();
		
		if(actionNumber == 1) {
			TNTPrimed tnt = (TNTPrimed) player.getWorld().spawnEntity(player.getEyeLocation(), EntityType.PRIMED_TNT);
			
			Vector velocity = player.getLocation().getDirection();
			
			tnt.setVelocity(velocity.multiply(3));
				
		}
		
		if(actionNumber == 2) {
			
		
		}
	}
}
