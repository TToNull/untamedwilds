package untamedwilds.init;

import net.minecraft.block.Block;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;
import untamedwilds.UntamedWilds;

public class ModTags {
    public static class EntityTags {
        // The CAGE_BLACKLIST is provided for mod packs and/or data pack makers, nothing is there by default (players are hard-blacklisted since they will crash the game)
        //public static final ITag.INamedTag<EntityType<?>> CAGE_BLACKLIST = EntityTags.createTag("cage_trap_blacklist");
        public static final ResourceLocation CAGE_BLACKLIST = new ResourceLocation(UntamedWilds.MOD_ID, "cage_trap_blacklist");
    }

    public static class BlockTags {
        public static final ITag.INamedTag<Block> REEDS_PLANTABLE_ON = net.minecraft.tags.BlockTags.makeWrapperTag(UntamedWilds.MOD_ID + ":reeds_plantable_on");
    }
}
