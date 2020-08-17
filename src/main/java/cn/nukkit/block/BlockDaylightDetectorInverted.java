package cn.nukkit.block;

import cn.nukkit.Player;
import cn.nukkit.api.PowerNukkitDifference;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemBlock;

import javax.annotation.Nonnull;

/**
 * Created on 2015/11/22 by CreeperFace.
 * Package cn.nukkit.block in project Nukkit .
 */
@PowerNukkitDifference(since = "1.4.0.0-PN", info = "Implements BlockEntityHolder only in PowerNukkit")
public class BlockDaylightDetectorInverted extends BlockDaylightDetector {

    public BlockDaylightDetectorInverted() {}

    @Override
    public int getId() {
        return DAYLIGHT_DETECTOR_INVERTED;
    }

    @Override
    public String getName() {
        return "Daylight Detector Inverted";
    }

    @Override
    public Item toItem() {
        return new ItemBlock(Block.get(BlockID.DAYLIGHT_DETECTOR), 0);
    }

    @Override
    public boolean onActivate(@Nonnull Item item, Player player) {
        BlockDaylightDetector block = new BlockDaylightDetector();
        getLevel().setBlock(this, block, true, true);
        block.updatePower();
        return true;
    }

    @Override
    public boolean isInverted() {
        return true;
    }

}
