package app.zenly.locator.cards.models;

import android.os.Parcelable;
import app.zenly.locator.username.idcard.C6019a;
import kotlin.jvm.internal.C12932j;

public abstract class Card implements Parcelable {

    /* renamed from: e */
    private int f6110e;

    /* renamed from: f */
    private int f6111f;

    /* renamed from: g */
    private final boolean f6112g;

    /* renamed from: h */
    private C6019a f6113h;

    public Card() {
        this(0, 0, false, null, 15, null);
    }

    public Card(int i, int i2, boolean z, C6019a aVar) {
        C12932j.m33818b(aVar, "bokehConfig");
        this.f6110e = i;
        this.f6111f = i2;
        this.f6112g = z;
        this.f6113h = aVar;
    }

    /* renamed from: a */
    public final C6019a mo7547a() {
        return this.f6113h;
    }

    /* renamed from: b */
    public final int mo7548b() {
        return this.f6111f;
    }

    /* renamed from: c */
    public final boolean mo7549c() {
        return this.f6112g;
    }

    /* renamed from: d */
    public final int mo7550d() {
        return this.f6110e;
    }

    public /* synthetic */ Card(int i, int i2, boolean z, C6019a aVar, int i3, C12928f fVar) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = true;
        }
        if ((i3 & 8) != 0) {
            aVar = C6019a.f15150h.mo13788a();
        }
        this(i, i2, z, aVar);
    }
}
