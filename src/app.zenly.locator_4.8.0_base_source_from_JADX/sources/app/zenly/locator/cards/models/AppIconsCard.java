package app.zenly.locator.cards.models;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import app.zenly.locator.username.idcard.C6019a;
import kotlin.jvm.internal.C12932j;

public final class AppIconsCard extends Card {
    public static final Creator CREATOR = new C1859a();

    /* renamed from: i */
    private final String f6083i;

    /* renamed from: app.zenly.locator.cards.models.AppIconsCard$a */
    public static class C1859a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C12932j.m33818b(parcel, "in");
            return new AppIconsCard(parcel.readString());
        }

        public final Object[] newArray(int i) {
            return new AppIconsCard[i];
        }
    }

    public AppIconsCard(String str) {
        C12932j.m33818b(str, "appIconsId");
        super((int) 4278323233L, (int) 4279051392L, true, C6019a.f15150h.mo13789b());
        this.f6083i = str;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo7513e() {
        return this.f6083i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12932j.m33818b(parcel, "parcel");
        parcel.writeString(this.f6083i);
    }
}
