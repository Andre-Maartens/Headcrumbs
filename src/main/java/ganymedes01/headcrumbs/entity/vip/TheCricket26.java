package ganymedes01.headcrumbs.entity.vip;

import ganymedes01.headcrumbs.entity.EntityCelebrity;
import ganymedes01.headcrumbs.entity.VIPHandler;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class TheCricket26 extends VIPHandler {

	@Override
	public void onSpawn(EntityCelebrity entity) {
		ItemStack chisel = GameRegistry.findItemStack("chisel", "chisel", 1);
		if (chisel != null)
			entity.setCurrentItemOrArmor(0, chisel);
	}
}