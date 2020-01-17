package app.zenly.locator.core.invitations;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.C12932j;

public final class FriendRequestTrackingInfo implements Parcelable {
    public static final Creator CREATOR = new C2524a();

    /* renamed from: e */
    private final boolean f7559e;

    /* renamed from: f */
    private final C2587f0 f7560f;

    /* renamed from: g */
    private final boolean f7561g;

    /* renamed from: h */
    private final Boolean f7562h;

    /* renamed from: i */
    private final boolean f7563i;

    /* renamed from: j */
    private final Integer f7564j;

    /* renamed from: k */
    private final boolean f7565k;

    /* renamed from: app.zenly.locator.core.invitations.FriendRequestTrackingInfo$a */
    public static class C2524a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            Boolean bool;
            C12932j.m33818b(parcel, "in");
            boolean z = parcel.readInt() != 0;
            C2587f0 f0Var = (C2587f0) Enum.valueOf(C2587f0.class, parcel.readString());
            boolean z2 = parcel.readInt() != 0;
            Integer num = null;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                num = Integer.valueOf(parcel.readInt());
            }
            FriendRequestTrackingInfo friendRequestTrackingInfo = new FriendRequestTrackingInfo(z, f0Var, z2, bool, z3, num, parcel.readInt() != 0);
            return friendRequestTrackingInfo;
        }

        public final Object[] newArray(int i) {
            return new FriendRequestTrackingInfo[i];
        }
    }

    public FriendRequestTrackingInfo(boolean z, C2587f0 f0Var, boolean z2, Boolean bool, boolean z3, Integer num, boolean z4) {
        C12932j.m33818b(f0Var, "source");
        this.f7559e = z;
        this.f7560f = f0Var;
        this.f7561g = z2;
        this.f7562h = bool;
        this.f7563i = z3;
        this.f7564j = num;
        this.f7565k = z4;
    }

    /* renamed from: a */
    public final boolean mo8608a() {
        return this.f7565k;
    }

    /* renamed from: b */
    public final Integer mo8609b() {
        return this.f7564j;
    }

    /* renamed from: c */
    public final boolean mo8610c() {
        return this.f7563i;
    }

    /* renamed from: d */
    public final C2587f0 mo8611d() {
        return this.f7560f;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final boolean mo8613e() {
        return this.f7561g;
    }

    /* renamed from: f */
    public final boolean mo8614f() {
        return this.f7559e;
    }

    /* renamed from: g */
    public final Boolean mo8615g() {
        return this.f7562h;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12932j.m33818b(parcel, "parcel");
        parcel.writeInt(this.f7559e ? 1 : 0);
        parcel.writeString(this.f7560f.name());
        parcel.writeInt(this.f7561g ? 1 : 0);
        Boolean bool = this.f7562h;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f7563i ? 1 : 0);
        Integer num = this.f7564j;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.f7565k ? 1 : 0);
    }
}
