package p214e.p229f.p232b;

import java.util.Arrays;

/* renamed from: e.f.b.i */
public class C7605i {

    /* renamed from: k */
    private static int f19169k = 1;

    /* renamed from: a */
    private String f19170a;

    /* renamed from: b */
    public int f19171b = -1;

    /* renamed from: c */
    int f19172c = -1;

    /* renamed from: d */
    public int f19173d = 0;

    /* renamed from: e */
    public float f19174e;

    /* renamed from: f */
    float[] f19175f = new float[7];

    /* renamed from: g */
    C7606a f19176g;

    /* renamed from: h */
    C7597b[] f19177h = new C7597b[8];

    /* renamed from: i */
    int f19178i = 0;

    /* renamed from: j */
    public int f19179j = 0;

    /* renamed from: e.f.b.i$a */
    public enum C7606a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public C7605i(C7606a aVar, String str) {
        this.f19176g = aVar;
    }

    /* renamed from: b */
    static void m18484b() {
        f19169k++;
    }

    /* renamed from: a */
    public final void mo19723a(C7597b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.f19178i;
            if (i >= i2) {
                C7597b[] bVarArr = this.f19177h;
                if (i2 >= bVarArr.length) {
                    this.f19177h = (C7597b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                C7597b[] bVarArr2 = this.f19177h;
                int i3 = this.f19178i;
                bVarArr2[i3] = bVar;
                this.f19178i = i3 + 1;
                return;
            } else if (this.f19177h[i] != bVar) {
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo19726c(C7597b bVar) {
        int i = this.f19178i;
        for (int i2 = 0; i2 < i; i2++) {
            C7597b[] bVarArr = this.f19177h;
            bVarArr[i2].f19115d.mo19662a(bVarArr[i2], bVar, false);
        }
        this.f19178i = 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(this.f19170a);
        return sb.toString();
    }

    /* renamed from: b */
    public final void mo19725b(C7597b bVar) {
        int i = this.f19178i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.f19177h[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    C7597b[] bVarArr = this.f19177h;
                    int i4 = i2 + i3;
                    bVarArr[i4] = bVarArr[i4 + 1];
                }
                this.f19178i--;
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo19722a() {
        this.f19170a = null;
        this.f19176g = C7606a.UNKNOWN;
        this.f19173d = 0;
        this.f19171b = -1;
        this.f19172c = -1;
        this.f19174e = 0.0f;
        this.f19178i = 0;
        this.f19179j = 0;
    }

    /* renamed from: a */
    public void mo19724a(C7606a aVar, String str) {
        this.f19176g = aVar;
    }
}
