package com.soapypaper1582.bighousemod;

import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.common.NeoForge;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(BigHouseMod.MOD_ID)
public class BigHouseMod {
    public static final String MOD_ID = "bighousemod";
    public static final Logger LOGGER = LogUtils.getLogger();


    public BigHouseMod(IEventBus modEventBus, ModContainer modContainer) {

        modEventBus.addListener(this::commonSetup);



        NeoForge.EVENT_BUS.register(this);



        modEventBus.addListener(this::addCreative);





    }

    private void commonSetup(FMLCommonSetupEvent event) {

    }



    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }



    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }
}
