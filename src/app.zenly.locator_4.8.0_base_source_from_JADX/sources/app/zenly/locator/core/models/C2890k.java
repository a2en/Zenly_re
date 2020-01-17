package app.zenly.locator.core.models;

import android.graphics.Bitmap;
import app.zenly.locator.core.util.C3200e0;
import java.util.Objects;
import p213co.znly.models.bubble.C6971b;

/* renamed from: app.zenly.locator.core.models.k */
public class C2890k {

    /* renamed from: c */
    public static final int f8177c = C3200e0.m10182a(56);

    /* renamed from: a */
    private final C6971b f8178a;

    /* renamed from: b */
    private Bitmap f8179b;

    public C2890k(C6971b bVar) {
        this.f8178a = bVar;
    }

    /* renamed from: a */
    public Bitmap mo8961a() {
        return this.f8179b;
    }

    /* renamed from: b */
    public C6971b mo8962b() {
        return this.f8178a;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if ((obj instanceof C2890k) && obj != null) {
            C6971b bVar = ((C2890k) obj).f8178a;
            C6971b bVar2 = this.f8178a;
            if (bVar2 == bVar) {
                return true;
            }
            String str = null;
            if (Objects.equals(bVar2 != null ? bVar2.getBubbleId() : null, bVar != null ? bVar.getBubbleId() : null)) {
                C6971b bVar3 = this.f8178a;
                Object bubbleName = bVar3 != null ? bVar3.getBubbleName() : null;
                if (bVar != null) {
                    str = bVar.getBubbleName();
                }
                if (Objects.equals(bubbleName, str)) {
                    z = true;
                }
            }
        }
        return z;
    }

    public C2890k(C6971b bVar, Bitmap bitmap) {
        this.f8178a = bVar;
        this.f8179b = bitmap;
    }
}
