/*
 * Daunted Client - the client for Daunt
 * Copyright (C) 2023  fwanchan and drifter16
 */

package io.github.dauntedclient.client.event.impl;

import io.github.dauntedclient.client.util.ForgeCompat;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PreGameOverlayRenderEvent {

	public final float partialTicks;
	public final GameOverlayElement type;
	public boolean cancelled;

	@Deprecated
	@ForgeCompat
	public void setCanceled(boolean cancelled) {
		this.cancelled = cancelled;
	}

}
