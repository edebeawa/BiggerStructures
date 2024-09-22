package be.cloudns.edebe.bigstru.fabric.mixin;

import be.cloudns.edebe.bigstru.fabric.util.StructuresSizeUtil;
import net.minecraft.network.protocol.game.ServerboundSetStructureBlockPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ServerboundSetStructureBlockPacket.class)
public class ServerboundSetStructureBlockPacketMixin {
    @Redirect(method = "<init>(Lnet/minecraft/network/FriendlyByteBuf;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/util/Mth;clamp(III)I"))
    private int clamp(int value, int min, int max) {
        return StructuresSizeUtil.clamp(value, min, max);
    }
}