/*
 * Daunted Client - the client for Daunt
 * Copyright (C) 2023  fwanchan and drifter16
 */

package io.github.dauntedclient.client.lib.penner.easing;

public class Quart {

	public static float easeIn(float t, float b, float c, float d) {
		return c * (t /= d) * t * t * t + b;
	}

	public static float easeOut(float t, float b, float c, float d) {
		return -c * ((t = t / d - 1) * t * t * t - 1) + b;
	}

	public static float easeInOut(float t, float b, float c, float d) {
		if ((t /= d / 2) < 1)
			return c / 2 * t * t * t * t + b;
		return -c / 2 * ((t -= 2) * t * t * t - 2) + b;
	}

}
