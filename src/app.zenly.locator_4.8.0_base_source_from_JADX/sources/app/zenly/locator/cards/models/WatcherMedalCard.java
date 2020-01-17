package app.zenly.locator.cards.models;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import app.zenly.locator.username.idcard.C6019a;
import kotlin.jvm.internal.C12932j;

@SuppressLint({"ParcelCreator"})
public final class WatcherMedalCard extends Card {
    public static final Creator CREATOR = new C1867a();

    /* renamed from: i */
    private final int f6133i;

    /* renamed from: j */
    private final int f6134j;

    /* renamed from: k */
    private final int f6135k;

    /* renamed from: l */
    private final int f6136l;

    /* renamed from: m */
    private final C1871b f6137m;

    /* renamed from: app.zenly.locator.cards.models.WatcherMedalCard$a */
    public static class C1867a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C12932j.m33818b(parcel, "in");
            WatcherMedalCard watcherMedalCard = new WatcherMedalCard(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (C1871b) Enum.valueOf(C1871b.class, parcel.readString()));
            return watcherMedalCard;
        }

        public final Object[] newArray(int i) {
            return new WatcherMedalCard[i];
        }
    }

    public WatcherMedalCard(int i, int i2, int i3, int i4, C1871b bVar) {
        C12932j.m33818b(bVar, "cardStyle");
        super(i, i2, true, C6019a.f15150h.mo13789b());
        this.f6133i = i;
        this.f6134j = i2;
        this.f6135k = i3;
        this.f6136l = i4;
        this.f6137m = bVar;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final C1871b mo7570e() {
        return this.f6137m;
    }

    /* renamed from: f */
    public final int mo7571f() {
        return this.f6136l;
    }

    /* renamed from: g */
    public final int mo7572g() {
        return this.f6135k;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12932j.m33818b(parcel, "parcel");
        parcel.writeInt(this.f6133i);
        parcel.writeInt(this.f6134j);
        parcel.writeInt(this.f6135k);
        parcel.writeInt(this.f6136l);
        parcel.writeString(this.f6137m.name());
    }
}
