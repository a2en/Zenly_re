package com.google.android.gms.maps.model;

import android.os.RemoteException;
import com.google.android.gms.internal.maps.zzaf;

/* renamed from: com.google.android.gms.maps.model.c0 */
final class C10638c0 implements TileProvider {

    /* renamed from: b */
    private final zzaf f27725b = this.f27726c.f27711e;

    /* renamed from: c */
    private final /* synthetic */ TileOverlayOptions f27726c;

    C10638c0(TileOverlayOptions tileOverlayOptions) {
        this.f27726c = tileOverlayOptions;
    }

    public final Tile getTile(int i, int i2, int i3) {
        try {
            return this.f27725b.getTile(i, i2, i3);
        } catch (RemoteException unused) {
            return null;
        }
    }
}
