package app.zenly.locator.cards.models;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import app.zenly.locator.username.idcard.C6019a;
import kotlin.jvm.internal.C12932j;

@SuppressLint({"ParcelCreator"})
public final class DescendantsCard extends Card {
    public static final Creator CREATOR = new C1864a();

    /* renamed from: i */
    private final int f6114i;

    /* renamed from: j */
    private final int f6115j;

    /* renamed from: k */
    private final String f6116k;

    /* renamed from: l */
    private final boolean f6117l;

    /* renamed from: app.zenly.locator.cards.models.DescendantsCard$a */
    public static class C1864a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C12932j.m33818b(parcel, "in");
            return new DescendantsCard(parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        public final Object[] newArray(int i) {
            return new DescendantsCard[i];
        }
    }

    public DescendantsCard(int i, int i2, String str, boolean z) {
        C12932j.m33818b(str, "subtitle");
        int i3 = (int) 4283786661L;
        super(i3, i3, true, C6019a.f15150h.mo13789b());
        this.f6114i = i;
        this.f6115j = i2;
        this.f6116k = str;
        this.f6117l = z;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final int mo7552e() {
        return this.f6114i;
    }

    /* renamed from: f */
    public final int mo7553f() {
        return this.f6115j;
    }

    /* renamed from: g */
    public final String mo7554g() {
        return this.f6116k;
    }

    /* renamed from: h */
    public final boolean mo7555h() {
        return this.f6117l;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12932j.m33818b(parcel, "parcel");
        parcel.writeInt(this.f6114i);
        parcel.writeInt(this.f6115j);
        parcel.writeString(this.f6116k);
        parcel.writeInt(this.f6117l ? 1 : 0);
    }
}
