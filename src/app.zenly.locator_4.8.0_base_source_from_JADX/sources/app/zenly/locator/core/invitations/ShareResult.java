package app.zenly.locator.core.invitations;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.C12932j;

public final class ShareResult implements Parcelable {
    public static final Creator CREATOR = new C2528b();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final ShareResult f7568h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final ShareResult f7569i;

    /* renamed from: j */
    public static final C2527a f7570j = new C2527a(null);

    /* renamed from: e */
    private boolean f7571e;

    /* renamed from: f */
    private String f7572f;

    /* renamed from: g */
    private int f7573g;

    /* renamed from: app.zenly.locator.core.invitations.ShareResult$a */
    public static final class C2527a {
        private C2527a() {
        }

        /* renamed from: a */
        public final ShareResult mo8636a() {
            return ShareResult.f7568h;
        }

        /* renamed from: b */
        public final ShareResult mo8637b() {
            return ShareResult.f7569i;
        }

        public /* synthetic */ C2527a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.invitations.ShareResult$b */
    public static class C2528b implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C12932j.m33818b(parcel, "in");
            return new ShareResult(parcel.readInt() != 0, parcel.readString(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new ShareResult[i];
        }
    }

    static {
        ShareResult shareResult = new ShareResult(false, null, 0, 6, null);
        f7568h = shareResult;
        ShareResult shareResult2 = new ShareResult(true, null, 0, 6, null);
        f7569i = shareResult2;
    }

    public ShareResult() {
        this(false, null, 0, 7, null);
    }

    public ShareResult(boolean z, String str, int i) {
        C12932j.m33818b(str, "appPackageName");
        this.f7571e = z;
        this.f7572f = str;
        this.f7573g = i;
    }

    /* renamed from: a */
    public final void mo8631a(boolean z) {
        this.f7571e = z;
    }

    /* renamed from: b */
    public final int mo8632b() {
        return this.f7573g;
    }

    /* renamed from: c */
    public final boolean mo8633c() {
        return this.f7571e;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12932j.m33818b(parcel, "parcel");
        parcel.writeInt(this.f7571e ? 1 : 0);
        parcel.writeString(this.f7572f);
        parcel.writeInt(this.f7573g);
    }

    public /* synthetic */ ShareResult(boolean z, String str, int i, int i2, C12928f fVar) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            str = "unknown";
        }
        if ((i2 & 4) != 0) {
            i = -1;
        }
        this(z, str, i);
    }

    /* renamed from: a */
    public final String mo8628a() {
        return this.f7572f;
    }

    /* renamed from: a */
    public final void mo8630a(String str) {
        C12932j.m33818b(str, "<set-?>");
        this.f7572f = str;
    }

    /* renamed from: a */
    public final void mo8629a(int i) {
        this.f7573g = i;
    }
}
