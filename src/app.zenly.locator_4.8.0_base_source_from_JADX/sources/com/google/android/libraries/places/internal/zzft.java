package com.google.android.libraries.places.internal;

public abstract class zzft {
    protected zzft() {
    }

    public static zzft zza(char c) {
        return new zzfv('.');
    }

    /* access modifiers changed from: private */
    public static String zzd(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public abstract boolean zzb(char c);

    public int zza(CharSequence charSequence, int i) {
        int length = charSequence.length();
        zzgg.zza(i, length, "index");
        while (i < length) {
            if (zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
