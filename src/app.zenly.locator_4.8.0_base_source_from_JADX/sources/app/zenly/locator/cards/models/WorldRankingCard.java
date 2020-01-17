package app.zenly.locator.cards.models;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import app.zenly.locator.username.idcard.C6019a;
import kotlin.jvm.internal.C12932j;

public final class WorldRankingCard extends Card {
    public static final Creator CREATOR = new C1869b();

    /* renamed from: i */
    private final int f6138i;

    /* renamed from: j */
    private final String f6139j;

    /* renamed from: k */
    private final boolean f6140k;

    /* renamed from: app.zenly.locator.cards.models.WorldRankingCard$a */
    public static final class C1868a {
        private C1868a() {
        }

        public /* synthetic */ C1868a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.cards.models.WorldRankingCard$b */
    public static class C1869b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C12932j.m33818b(parcel, "in");
            return new WorldRankingCard(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new WorldRankingCard[i];
        }
    }

    static {
        new C1868a(null);
    }

    public WorldRankingCard(int i, String str, boolean z) {
        C12932j.m33818b(str, "userUuid");
        int i2 = (int) 4283786661L;
        super(i2, i2, true, C6019a.f15150h.mo13789b());
        this.f6138i = i;
        this.f6139j = str;
        this.f6140k = z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo7577e() {
        return this.f6138i;
    }

    /* renamed from: f */
    public final String mo7578f() {
        return this.f6139j;
    }

    /* renamed from: g */
    public final boolean mo7579g() {
        return this.f6138i >= 10;
    }

    /* renamed from: h */
    public final boolean mo7580h() {
        return this.f6140k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12932j.m33818b(parcel, "parcel");
        parcel.writeInt(this.f6138i);
        parcel.writeString(this.f6139j);
        parcel.writeInt(this.f6140k ? 1 : 0);
    }
}
