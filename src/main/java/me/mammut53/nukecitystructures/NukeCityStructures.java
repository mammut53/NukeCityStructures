package me.mammut53.nukecitystructures;

import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = NukeCityStructures.MOD_ID,
        name = NukeCityStructures.MOD_NAME,
        version = NukeCityStructures.VERSION
)
public class NukeCityStructures {

    public static final String MOD_ID = "nukecitystructures";
    public static final String MOD_NAME = "NukeCityStructures";
    public static final String VERSION = "0.0.1";

    @Mod.Instance(MOD_ID)
    public static NukeCityStructures INSTANCE;

}
