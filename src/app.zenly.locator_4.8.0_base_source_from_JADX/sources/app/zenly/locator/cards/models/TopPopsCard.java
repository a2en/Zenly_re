package app.zenly.locator.cards.models;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import app.zenly.locator.username.idcard.C6019a;
import kotlin.jvm.internal.C12932j;

public final class TopPopsCard extends Card {
    public static final Creator CREATOR = new C1866a();

    /* renamed from: i */
    private final String f6131i;

    /* renamed from: j */
    private final boolean f6132j;

    /* renamed from: app.zenly.locator.cards.models.TopPopsCard$a */
    public static class C1866a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C12932j.m33818b(parcel, "in");
            return new TopPopsCard(parcel.readString(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new TopPopsCard[i];
        }
    }

    public TopPopsCard(String str, boolean z) {
        C12932j.m33818b(str, "targetUuid");
        int i = (int) 4283786661L;
        super(i, i, true, C6019a.f15150h.mo13789b());
        this.f6131i = str;
        this.f6132j = z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo7564e() {
        return this.f6132j;
    }

    /* renamed from: f */
    public final String mo7565f() {
        return this.f6131i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12932j.m33818b(parcel, "parcel");
        parcel.writeString(this.f6131i);
        parcel.writeInt(this.f6132j ? 1 : 0);
    }
}
