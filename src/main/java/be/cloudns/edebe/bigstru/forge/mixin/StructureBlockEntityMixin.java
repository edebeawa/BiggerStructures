package be.cloudns.edebe.bigstru.forge.mixin;

import be.cloudns.edebe.bigstru.forge.util.StructuresSizeUtil;
import net.minecraft.world.level.block.entity.StructureBlockEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(StructureBlockEntity.class)
public class StructureBlockEntityMixin {
    @Redirect(method = "load", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Mth;clamp(III)I"))
    private int clamp(int value, int min, int max) {
        return StructuresSizeUtil.clamp(value, min, max);
    }
}