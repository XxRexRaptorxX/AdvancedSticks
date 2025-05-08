package xxrexraptorxx.advancedtools.registry;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.core.component.DataComponentType;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import xxrexraptorxx.advancedtools.main.References;

import java.util.List;

public class ModComponents {

    public static final DeferredRegister.DataComponents DATA_COMPONENT_TYPES = DeferredRegister.createDataComponents(Registries.DATA_COMPONENT_TYPE, References.MODID );

    public static void init(IEventBus bus) {
        DATA_COMPONENT_TYPES.register(bus);
    }



    public record SocketData(List<ItemStack> sockets) {
        public static final SocketData EMPTY = new SocketData(List.of());

        public static final Codec<SocketData> SOCKET_CODEC = RecordCodecBuilder.create(inst ->
                inst.group(Codec.list(ItemStack.CODEC)
                        .fieldOf("sockets")
                        .forGetter(SocketData::sockets)
                ).apply(inst, SocketData::new)
        );
    }



    public static final DeferredHolder<DataComponentType<?>, DataComponentType<SocketData>> SOCKET_COMPONENT = DATA_COMPONENT_TYPES.registerComponentType(
            "socket_data", builder -> builder.persistent(SocketData.SOCKET_CODEC)
    );

}
