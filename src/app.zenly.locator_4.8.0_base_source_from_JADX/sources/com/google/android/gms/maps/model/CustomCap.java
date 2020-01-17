package com.google.android.gms.maps.model;

public final class CustomCap extends Cap {

    /* renamed from: h */
    public final C10633a f27632h;

    /* renamed from: i */
    public final float f27633i;

    public final String toString() {
        String valueOf = String.valueOf(this.f27632h);
        float f = this.f27633i;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("[CustomCap: bitmapDescriptor=");
        sb.append(valueOf);
        sb.append(" refWidth=");
        sb.append(f);
        sb.append("]");
        return sb.toString();
    }
}
