package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.C0862g.C0864b;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class BackStackState implements Parcelable {
    public static final Creator<BackStackState> CREATOR = new C0772a();

    /* renamed from: e */
    final int[] f3134e;

    /* renamed from: f */
    final ArrayList<String> f3135f;

    /* renamed from: g */
    final int[] f3136g;

    /* renamed from: h */
    final int[] f3137h;

    /* renamed from: i */
    final int f3138i;

    /* renamed from: j */
    final String f3139j;

    /* renamed from: k */
    final int f3140k;

    /* renamed from: l */
    final int f3141l;

    /* renamed from: m */
    final CharSequence f3142m;

    /* renamed from: n */
    final int f3143n;

    /* renamed from: o */
    final CharSequence f3144o;

    /* renamed from: p */
    final ArrayList<String> f3145p;

    /* renamed from: q */
    final ArrayList<String> f3146q;

    /* renamed from: r */
    final boolean f3147r;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    static class C0772a implements Creator<BackStackState> {
        C0772a() {
        }

        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        public BackStackState[] newArray(int i) {
            return new BackStackState[i];
        }
    }

    public BackStackState(C0793a aVar) {
        int size = aVar.f3309a.size();
        this.f3134e = new int[(size * 5)];
        if (aVar.f3315g) {
            this.f3135f = new ArrayList<>(size);
            this.f3136g = new int[size];
            this.f3137h = new int[size];
            int i = 0;
            int i2 = 0;
            while (i < size) {
                C0820a aVar2 = (C0820a) aVar.f3309a.get(i);
                int i3 = i2 + 1;
                this.f3134e[i2] = aVar2.f3326a;
                ArrayList<String> arrayList = this.f3135f;
                Fragment fragment = aVar2.f3327b;
                arrayList.add(fragment != null ? fragment.mWho : null);
                int[] iArr = this.f3134e;
                int i4 = i3 + 1;
                iArr[i3] = aVar2.f3328c;
                int i5 = i4 + 1;
                iArr[i4] = aVar2.f3329d;
                int i6 = i5 + 1;
                iArr[i5] = aVar2.f3330e;
                int i7 = i6 + 1;
                iArr[i6] = aVar2.f3331f;
                this.f3136g[i] = aVar2.f3332g.ordinal();
                this.f3137h[i] = aVar2.f3333h.ordinal();
                i++;
                i2 = i7;
            }
            this.f3138i = aVar.f3314f;
            this.f3139j = aVar.f3317i;
            this.f3140k = aVar.f3243t;
            this.f3141l = aVar.f3318j;
            this.f3142m = aVar.f3319k;
            this.f3143n = aVar.f3320l;
            this.f3144o = aVar.f3321m;
            this.f3145p = aVar.f3322n;
            this.f3146q = aVar.f3323o;
            this.f3147r = aVar.f3324p;
            return;
        }
        throw new IllegalStateException("Not on back stack");
    }

    /* renamed from: a */
    public C0793a mo3816a(FragmentManager fragmentManager) {
        C0793a aVar = new C0793a(fragmentManager);
        int i = 0;
        int i2 = 0;
        while (i < this.f3134e.length) {
            C0820a aVar2 = new C0820a();
            int i3 = i + 1;
            aVar2.f3326a = this.f3134e[i];
            if (FragmentManager.m3606d(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("Instantiate ");
                sb.append(aVar);
                sb.append(" op #");
                sb.append(i2);
                sb.append(" base fragment #");
                sb.append(this.f3134e[i3]);
                Log.v("FragmentManager", sb.toString());
            }
            String str = (String) this.f3135f.get(i2);
            if (str != null) {
                aVar2.f3327b = fragmentManager.mo4060a(str);
            } else {
                aVar2.f3327b = null;
            }
            aVar2.f3332g = C0864b.values()[this.f3136g[i2]];
            aVar2.f3333h = C0864b.values()[this.f3137h[i2]];
            int[] iArr = this.f3134e;
            int i4 = i3 + 1;
            aVar2.f3328c = iArr[i3];
            int i5 = i4 + 1;
            aVar2.f3329d = iArr[i4];
            int i6 = i5 + 1;
            aVar2.f3330e = iArr[i5];
            int i7 = i6 + 1;
            aVar2.f3331f = iArr[i6];
            aVar.f3310b = aVar2.f3328c;
            aVar.f3311c = aVar2.f3329d;
            aVar.f3312d = aVar2.f3330e;
            aVar.f3313e = aVar2.f3331f;
            aVar.mo4319a(aVar2);
            i2++;
            i = i7;
        }
        aVar.f3314f = this.f3138i;
        aVar.f3317i = this.f3139j;
        aVar.f3243t = this.f3140k;
        aVar.f3315g = true;
        aVar.f3318j = this.f3141l;
        aVar.f3319k = this.f3142m;
        aVar.f3320l = this.f3143n;
        aVar.f3321m = this.f3144o;
        aVar.f3322n = this.f3145p;
        aVar.f3323o = this.f3146q;
        aVar.f3324p = this.f3147r;
        aVar.mo4179a(1);
        return aVar;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f3134e);
        parcel.writeStringList(this.f3135f);
        parcel.writeIntArray(this.f3136g);
        parcel.writeIntArray(this.f3137h);
        parcel.writeInt(this.f3138i);
        parcel.writeString(this.f3139j);
        parcel.writeInt(this.f3140k);
        parcel.writeInt(this.f3141l);
        TextUtils.writeToParcel(this.f3142m, parcel, 0);
        parcel.writeInt(this.f3143n);
        TextUtils.writeToParcel(this.f3144o, parcel, 0);
        parcel.writeStringList(this.f3145p);
        parcel.writeStringList(this.f3146q);
        parcel.writeInt(this.f3147r ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f3134e = parcel.createIntArray();
        this.f3135f = parcel.createStringArrayList();
        this.f3136g = parcel.createIntArray();
        this.f3137h = parcel.createIntArray();
        this.f3138i = parcel.readInt();
        this.f3139j = parcel.readString();
        this.f3140k = parcel.readInt();
        this.f3141l = parcel.readInt();
        this.f3142m = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3143n = parcel.readInt();
        this.f3144o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3145p = parcel.createStringArrayList();
        this.f3146q = parcel.createStringArrayList();
        this.f3147r = parcel.readInt() != 0;
    }
}
