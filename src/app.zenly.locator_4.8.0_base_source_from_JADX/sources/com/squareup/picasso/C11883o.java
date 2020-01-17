package com.squareup.picasso;

import android.graphics.Bitmap;
import android.net.NetworkInfo;
import com.squareup.picasso.C11893u.C11894a;
import com.squareup.picasso.Downloader.C11841a;
import com.squareup.picasso.Picasso.C11847d;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.squareup.picasso.o */
class C11883o extends C11893u {

    /* renamed from: a */
    private final Downloader f30795a;

    /* renamed from: b */
    private final C11896w f30796b;

    /* renamed from: com.squareup.picasso.o$a */
    static class C11884a extends IOException {
        public C11884a(String str) {
            super(str);
        }
    }

    public C11883o(Downloader downloader, C11896w wVar) {
        this.f30795a = downloader;
        this.f30796b = wVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public int mo35130a() {
        return 2;
    }

    /* renamed from: a */
    public boolean mo35069a(C11889s sVar) {
        String scheme = sVar.f30811d.getScheme();
        return "http".equals(scheme) || "https".equals(scheme);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public boolean mo35132b() {
        return true;
    }

    /* renamed from: a */
    public C11894a mo35068a(C11889s sVar, int i) throws IOException {
        C11841a load = this.f30795a.load(sVar.f30811d, sVar.f30810c);
        if (load == null) {
            return null;
        }
        C11847d dVar = load.f30654c ? C11847d.DISK : C11847d.NETWORK;
        Bitmap a = load.mo35022a();
        if (a != null) {
            return new C11894a(a, dVar);
        }
        InputStream c = load.mo35024c();
        if (c == null) {
            return null;
        }
        if (dVar == C11847d.DISK && load.mo35023b() == 0) {
            C11851a0.m31111a(c);
            throw new C11884a("Received response with 0 content-length header.");
        }
        if (dVar == C11847d.NETWORK && load.mo35023b() > 0) {
            this.f30796b.mo35170a(load.mo35023b());
        }
        return new C11894a(c, dVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo35131a(boolean z, NetworkInfo networkInfo) {
        return networkInfo == null || networkInfo.isConnected();
    }
}
