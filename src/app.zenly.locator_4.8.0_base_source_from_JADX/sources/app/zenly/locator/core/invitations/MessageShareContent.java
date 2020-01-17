package app.zenly.locator.core.invitations;

import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import app.zenly.locator.core.util.C3236s;
import app.zenly.locator.experimental.referrer.C3746a;
import kotlin.jvm.internal.C12932j;

public final class MessageShareContent extends ShareContent {
    public static final Creator CREATOR = new C2525a();

    /* renamed from: e */
    private final String f7566e;

    /* renamed from: f */
    private final int f7567f;

    /* renamed from: app.zenly.locator.core.invitations.MessageShareContent$a */
    public static class C2525a implements Creator {
        public final Object createFromParcel(Parcel parcel) {
            C12932j.m33818b(parcel, "in");
            return new MessageShareContent(parcel.readString(), parcel.readInt());
        }

        public final Object[] newArray(int i) {
            return new MessageShareContent[i];
        }
    }

    public MessageShareContent(String str, int i) {
        super(null);
        this.f7566e = str;
        this.f7567f = i;
    }

    /* renamed from: a */
    public final String mo8620a() {
        return this.f7566e;
    }

    /* renamed from: b */
    public final int mo8621b() {
        return this.f7567f;
    }

    /* renamed from: c */
    public Intent mo8623c(Context context, String str) {
        C12932j.m33818b(context, "context");
        String str2 = this.f7566e;
        if (str2 == null) {
            return ShareContent.m8815a(this, context, null, 2, null);
        }
        Intent putExtra = C3236s.m10253a(str2, C3746a.f10026e.mo10297a(context).mo10296a(this.f7567f, str)).putExtra("app.zenly.locator.extra.REFERRER_ORIGIN", this.f7567f);
        if (str != null) {
            putExtra.setPackage(str);
        }
        C12932j.m33815a((Object) putExtra, "PackageUtils.getSmsInten…      }\n                }");
        return putExtra;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C12932j.m33818b(parcel, "parcel");
        parcel.writeString(this.f7566e);
        parcel.writeInt(this.f7567f);
    }

    /* renamed from: a */
    public Intent mo8619a(Context context, String str) {
        C12932j.m33818b(context, "context");
        Intent putExtra = C3236s.m10262b(C3746a.f10026e.mo10297a(context).mo10296a(this.f7567f, str)).putExtra("app.zenly.locator.extra.REFERRER_ORIGIN", this.f7567f);
        if (str != null) {
            putExtra.setPackage(str);
        }
        C12932j.m33815a((Object) putExtra, "PackageUtils.getShareInt…          }\n            }");
        return putExtra;
    }

    /* renamed from: b */
    public Intent mo8622b(Context context, String str) {
        C12932j.m33818b(context, "context");
        Intent putExtra = C3236s.m10252a(C3746a.f10026e.mo10297a(context).mo10296a(this.f7567f, str)).putExtra("app.zenly.locator.extra.REFERRER_ORIGIN", this.f7567f);
        if (str != null) {
            putExtra.setPackage(str);
        }
        C12932j.m33815a((Object) putExtra, "PackageUtils.getMailInte…          }\n            }");
        return putExtra;
    }
}
