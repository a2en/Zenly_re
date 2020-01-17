package com.google.android.gms.maps.model;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/* renamed from: com.google.android.gms.maps.model.j */
public abstract class C10648j implements TileProvider {

    /* renamed from: b */
    private final int f27730b;

    /* renamed from: c */
    private final int f27731c;

    public C10648j(int i, int i2) {
        this.f27730b = i;
        this.f27731c = i2;
    }

    /* renamed from: a */
    public abstract URL mo10643a(int i, int i2, int i3);

    public final Tile getTile(int i, int i2, int i3) {
        Tile tile;
        URL a = mo10643a(i, i2, i3);
        if (a == null) {
            return TileProvider.f27717a;
        }
        try {
            int i4 = this.f27730b;
            int i5 = this.f27731c;
            InputStream openStream = a.openStream();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[4096];
            while (true) {
                int read = openStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            tile = new Tile(i4, i5, byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            tile = null;
        }
        return tile;
    }
}
