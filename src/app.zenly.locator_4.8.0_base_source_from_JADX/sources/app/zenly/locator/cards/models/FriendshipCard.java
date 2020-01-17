package app.zenly.locator.cards.models;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import kotlin.jvm.internal.C12932j;

public abstract class FriendshipCard extends Card {

    @SuppressLint({"ParcelCreator"})
    public static final class Style implements Parcelable {
        public static final Creator CREATOR = new C1865a();

        /* renamed from: e */
        private final int[] f6118e;

        /* renamed from: f */
        private final int f6119f;

        /* renamed from: g */
        private final int f6120g;

        /* renamed from: h */
        private final int f6121h;

        /* renamed from: i */
        private final int f6122i;

        /* renamed from: j */
        private final int f6123j;

        /* renamed from: k */
        private final int f6124k;

        /* renamed from: l */
        private final int f6125l;

        /* renamed from: m */
        private final int f6126m;

        /* renamed from: n */
        private final int f6127n;

        /* renamed from: o */
        private final int f6128o;

        /* renamed from: p */
        private final int[] f6129p;

        /* renamed from: q */
        private final int f6130q;

        /* renamed from: app.zenly.locator.cards.models.FriendshipCard$Style$a */
        public static class C1865a implements Creator {
            public final Object createFromParcel(Parcel parcel) {
                C12932j.m33818b(parcel, "in");
                Style style = new Style(parcel.createIntArray(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createIntArray(), parcel.readInt());
                return style;
            }

            public final Object[] newArray(int i) {
                return new Style[i];
            }
        }

        public Style(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int[] iArr2, int i11) {
            C12932j.m33818b(iArr, "frontColor");
            C12932j.m33818b(iArr2, "particleColors");
            this.f6118e = iArr;
            this.f6119f = i;
            this.f6120g = i2;
            this.f6121h = i3;
            this.f6122i = i4;
            this.f6123j = i5;
            this.f6124k = i6;
            this.f6125l = i7;
            this.f6126m = i8;
            this.f6127n = i9;
            this.f6128o = i10;
            this.f6129p = iArr2;
            this.f6130q = i11;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C12932j.m33818b(parcel, "parcel");
            parcel.writeIntArray(this.f6118e);
            parcel.writeInt(this.f6119f);
            parcel.writeInt(this.f6120g);
            parcel.writeInt(this.f6121h);
            parcel.writeInt(this.f6122i);
            parcel.writeInt(this.f6123j);
            parcel.writeInt(this.f6124k);
            parcel.writeInt(this.f6125l);
            parcel.writeInt(this.f6126m);
            parcel.writeInt(this.f6127n);
            parcel.writeInt(this.f6128o);
            parcel.writeIntArray(this.f6129p);
            parcel.writeInt(this.f6130q);
        }
    }
}
