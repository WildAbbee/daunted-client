/*
 * Daunted Client - the client for Daunt
 * Copyright (C) 2023  fwanchan and drifter16
 */

package io.github.dauntedclient.client.mod.impl.hud.timers;

import lombok.*;
import net.minecraft.item.ItemStack;

/**
 * TODO: Move to ClientApi.
 */
@Data
@RequiredArgsConstructor
public class Timer {

	private final String name;
	private final ItemStack renderItem;
	private long id;
	private long time;

	public Timer(String name, ItemStack renderItem, long startTime) {
		this(name, renderItem);
		time = startTime;
	}

	public void tick() {
		if (time > 0) {
			time--;
		}
	}

}
