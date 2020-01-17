package com.google.android.libraries.places.internal;

import android.graphics.Color;

public final class zzfe {
    public static int zza(int i, int i2, int i3) {
        double zza = zza(i);
        double zza2 = zza(zza(i2), zza);
        return (zza2 <= 3.0d && zza2 <= zza(zza(i3), zza)) ? i3 : i2;
    }

    private static double zza(double d, double d2) {
        return ((double) Math.round(((Math.max(d, d2) + 0.05d) / (Math.min(d, d2) + 0.05d)) * 100.0d)) / 100.0d;
    }

    private static double zza(int i) {
        return (zza(((double) Color.red(i)) / 255.0d) * 0.2126d) + (zza(((double) Color.green(i)) / 255.0d) * 0.7152d) + (zza(((double) Color.blue(i)) / 255.0d) * 0.0722d);
    }

    private static double zza(double d) {
        return d <= 0.03928d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }
}
