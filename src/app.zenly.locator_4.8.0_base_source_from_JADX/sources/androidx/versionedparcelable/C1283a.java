package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p214e.p228e.C7571a;

/* renamed from: androidx.versionedparcelable.a */
class C1283a extends VersionedParcel {

    /* renamed from: d */
    private final SparseIntArray f4779d;

    /* renamed from: e */
    private final Parcel f4780e;

    /* renamed from: f */
    private final int f4781f;

    /* renamed from: g */
    private final int f4782g;

    /* renamed from: h */
    private final String f4783h;

    /* renamed from: i */
    private int f4784i;

    /* renamed from: j */
    private int f4785j;

    /* renamed from: k */
    private int f4786k;

    C1283a(Parcel parcel) {
        Parcel parcel2 = parcel;
        this(parcel2, parcel.dataPosition(), parcel.dataSize(), "", new C7571a(), new C7571a(), new C7571a());
    }

    /* renamed from: a */
    public boolean mo6301a(int i) {
        while (true) {
            boolean z = true;
            if (this.f4785j < this.f4782g) {
                int i2 = this.f4786k;
                if (i2 == i) {
                    return true;
                }
                if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                    return false;
                }
                this.f4780e.setDataPosition(this.f4785j);
                int readInt = this.f4780e.readInt();
                this.f4786k = this.f4780e.readInt();
                this.f4785j += readInt;
            } else {
                if (this.f4786k != i) {
                    z = false;
                }
                return z;
            }
        }
    }

    /* renamed from: b */
    public void mo6305b(int i) {
        mo6292a();
        this.f4784i = i;
        this.f4779d.put(i, this.f4780e.dataPosition());
        mo6313c(0);
        mo6313c(i);
    }

    /* renamed from: c */
    public void mo6313c(int i) {
        this.f4780e.writeInt(i);
    }

    /* renamed from: d */
    public boolean mo6315d() {
        return this.f4780e.readInt() != 0;
    }

    /* renamed from: e */
    public byte[] mo6316e() {
        int readInt = this.f4780e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f4780e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public CharSequence mo6317f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f4780e);
    }

    /* renamed from: g */
    public int mo6318g() {
        return this.f4780e.readInt();
    }

    /* renamed from: h */
    public <T extends Parcelable> T mo6319h() {
        return this.f4780e.readParcelable(C1283a.class.getClassLoader());
    }

    /* renamed from: i */
    public String mo6320i() {
        return this.f4780e.readString();
    }

    private C1283a(Parcel parcel, int i, int i2, String str, C7571a<String, Method> aVar, C7571a<String, Method> aVar2, C7571a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f4779d = new SparseIntArray();
        this.f4784i = -1;
        this.f4785j = 0;
        this.f4786k = -1;
        this.f4780e = parcel;
        this.f4781f = i;
        this.f4782g = i2;
        this.f4785j = this.f4781f;
        this.f4783h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public VersionedParcel mo6304b() {
        Parcel parcel = this.f4780e;
        int dataPosition = parcel.dataPosition();
        int i = this.f4785j;
        if (i == this.f4781f) {
            i = this.f4782g;
        }
        int i2 = i;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4783h);
        sb.append("  ");
        C1283a aVar = new C1283a(parcel, dataPosition, i2, sb.toString(), this.f4776a, this.f4777b, this.f4778c);
        return aVar;
    }

    /* renamed from: a */
    public void mo6292a() {
        int i = this.f4784i;
        if (i >= 0) {
            int i2 = this.f4779d.get(i);
            int dataPosition = this.f4780e.dataPosition();
            int i3 = dataPosition - i2;
            this.f4780e.setDataPosition(i2);
            this.f4780e.writeInt(i3);
            this.f4780e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: a */
    public void mo6300a(byte[] bArr) {
        if (bArr != null) {
            this.f4780e.writeInt(bArr.length);
            this.f4780e.writeByteArray(bArr);
            return;
        }
        this.f4780e.writeInt(-1);
    }

    /* renamed from: a */
    public void mo6297a(String str) {
        this.f4780e.writeString(str);
    }

    /* renamed from: a */
    public void mo6293a(Parcelable parcelable) {
        this.f4780e.writeParcelable(parcelable, 0);
    }

    /* renamed from: a */
    public void mo6298a(boolean z) {
        this.f4780e.writeInt(z ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo6296a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f4780e, 0);
    }
}
