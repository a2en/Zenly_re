package com.google.android.gms.maps.model;

import com.google.android.gms.internal.maps.C10536f;

/* renamed from: com.google.android.gms.maps.model.d0 */
final class C10640d0 extends C10536f {

    /* renamed from: a */
    private final /* synthetic */ TileProvider f27727a;

    C10640d0(TileOverlayOptions tileOverlayOptions, TileProvider tileProvider) {
        this.f27727a = tileProvider;
    }

    public final Tile getTile(int i, int i2, int i3) {
        return this.f27727a.getTile(i, i2, i3);
    }
}
