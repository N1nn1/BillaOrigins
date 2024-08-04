package codyhuh.billaorigins.registry;

import codyhuh.billaorigins.BillaOrigins;
import codyhuh.billaorigins.content.power.SinkBoatPower;
import io.github.edwinmindcraft.apoli.api.power.factory.PowerFactory;
import io.github.edwinmindcraft.origins.common.registry.OriginRegisters;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class PowerRegistry {
    public static final DeferredRegister<PowerFactory<?>> POWERS = DeferredRegister.create(OriginRegisters.POWER_FACTORIES.getRegistryName(), BillaOrigins.MOD_ID);

    public static final RegistryObject<SinkBoatPower> SINK_BOAT_POWER = POWERS.register("sink_boat", SinkBoatPower::new);
}
