package gay.ampflower.plymouth.antixray.transformers;

import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.network.packet.s2c.play.PlayerActionResponseS2CPacket;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkSection;
import net.minecraft.world.chunk.WorldChunk;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

/**
 * Provider stub for {@link GudAsmTransformer} to read.
 * <p>
 * This class is to never be loaded for use.
 *
 * @author Ampflower
 * @since ${version}
 * @deprecated Not to be used directly. Deprecation only for warning purposes.
 **/
@Deprecated(forRemoval = true)
class Stub {
    // TODO: Automate this with a recursive check for BlockView inheritance.
    @MethodNameTo("plymouth$getShadowBlock")
    BlockState world(BlockView world, BlockPos pos) {
        return world.getBlockState(pos);
    }

    @MethodNameTo("plymouth$getShadowBlockEntity")
    BlockEntity worldBE(BlockView world, BlockPos pos) {
        return world.getBlockEntity(pos);
    }

    @MethodNameTo("plymouth$getShadowBlock")
    BlockState world(World world, BlockPos pos) {
        return world.getBlockState(pos);
    }

    @MethodNameTo("plymouth$getShadowBlockEntity")
    BlockEntity worldBE(World world, BlockPos pos) {
        return world.getBlockEntity(pos);
    }

    @MethodNameTo("plymouth$getShadowBlock")
    BlockState world(ServerWorld world, BlockPos pos) {
        return world.getBlockState(pos);
    }

    @MethodNameTo("plymouth$getShadowBlockEntity")
    BlockEntity chunkBE(ServerWorld world, BlockPos pos) {
        return world.getBlockEntity(pos);
    }

    @MethodNameTo("plymouth$getShadowBlock")
    BlockState chunk(WorldChunk chunk, BlockPos pos) {
        return chunk.getBlockState(pos);
    }

    @MethodNameTo("plymouth$getShadowBlockEntity")
    BlockEntity chunkBE(WorldChunk chunk, BlockPos pos) {
        return chunk.getBlockEntity(pos);
    }

    @MethodNameTo("plymouth$getShadowBlockEntities")
    Map<BlockPos, BlockEntity> chunkBEM(WorldChunk chunk) {
        return chunk.getBlockEntities();
    }

    @MethodNameTo("plymouth$getShadowSections")
    ChunkSection[] chunkCS(WorldChunk chunk) {
        return chunk.getSectionArray();
    }

    /**
     * @deprecated Transformers will now look for constructors that contain BlockState, BlockEntity and ChunkSection[]
     * based on <code>asm/PacketTransformer.sys</code>
     */
    @Deprecated(forRemoval = true)
    PlayerActionResponseS2CPacket actionResponse(BlockPos pos) {
        return new PlayerActionResponseS2CPacket(pos, null, null, false, null);
    }

    static {
        //noinspection ConstantConditions
        if (true) throw new AssertionError("This class should never load.");
    }

    @Retention(RetentionPolicy.CLASS)
    @interface MethodNameTo {
        String value();
    }

    @Retention(RetentionPolicy.CLASS)
    @interface InjectAtUsage {
        String value();
    }
}
