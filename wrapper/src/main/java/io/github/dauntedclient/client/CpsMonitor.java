/*
 * Daunted Client - the client for Daunt
 * Copyright (C) 2023  fwanchan and drifter16
 */

package io.github.dauntedclient.client;

import java.util.*;

import io.github.dauntedclient.client.event.EventHandler;
import io.github.dauntedclient.client.event.impl.*;

public class CpsMonitor {

	public static final CpsMonitor LMB = new CpsMonitor(0);
	public static final CpsMonitor RMB = new CpsMonitor(1);

	public static void forceInit() {
	}

	private int button;
	private List<Long> presses = new ArrayList<Long>();

	public CpsMonitor(int button) {
		this.button = button;
		Client.INSTANCE.getEvents().register(this);
	}

	@EventHandler
	public void onMouseClickEvent(MouseClickEvent event) {
		if (event.button == button) {
			click();
		}
	}

	public void click() {
		presses.add(System.currentTimeMillis());
	}

	@EventHandler
	public void tick(PostTickEvent event) {
		presses.removeIf(t -> System.currentTimeMillis() - t > 1000);
	}

	public int getCps() {
		return presses.size();
	}

}
