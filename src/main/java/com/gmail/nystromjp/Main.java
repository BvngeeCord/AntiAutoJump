package com.gmail.nystromjp;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.minecraft.client.MinecraftClient;

public class Main implements ModInitializer {
	@Override
	public void onInitialize() {

		System.out.println("Banning Auto-Jump...");

		ClientLifecycleEvents.CLIENT_STARTED.register(minecraftClient -> {
			MinecraftClient.getInstance().options.autoJump=false;
		});

	}
}
