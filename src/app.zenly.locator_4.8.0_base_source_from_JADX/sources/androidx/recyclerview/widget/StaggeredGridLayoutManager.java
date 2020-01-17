package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.accessibility.C0628c;
import androidx.core.view.accessibility.C0628c.C0631c;
import androidx.recyclerview.widget.RecyclerView.C1079p;
import androidx.recyclerview.widget.RecyclerView.C1082s;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager.C1060c;
import androidx.recyclerview.widget.RecyclerView.LayoutManager.LayoutPrefetchRegistry;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller;
import androidx.recyclerview.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends LayoutManager implements ScrollVectorProvider {

    /* renamed from: A */
    boolean f4133A = false;

    /* renamed from: B */
    private BitSet f4134B;

    /* renamed from: C */
    int f4135C = -1;

    /* renamed from: D */
    int f4136D = Integer.MIN_VALUE;

    /* renamed from: E */
    LazySpanLookup f4137E = new LazySpanLookup();

    /* renamed from: F */
    private int f4138F = 2;

    /* renamed from: G */
    private boolean f4139G;

    /* renamed from: H */
    private boolean f4140H;

    /* renamed from: I */
    private SavedState f4141I;

    /* renamed from: J */
    private int f4142J;

    /* renamed from: K */
    private final Rect f4143K = new Rect();

    /* renamed from: L */
    private final C1089b f4144L = new C1089b();

    /* renamed from: M */
    private boolean f4145M = false;

    /* renamed from: N */
    private boolean f4146N = true;

    /* renamed from: O */
    private int[] f4147O;

    /* renamed from: P */
    private final Runnable f4148P = new C1088a();

    /* renamed from: s */
    private int f4149s = -1;

    /* renamed from: t */
    C1090c[] f4150t;

    /* renamed from: u */
    C1136o f4151u;

    /* renamed from: v */
    C1136o f4152v;

    /* renamed from: w */
    private int f4153w;

    /* renamed from: x */
    private int f4154x;

    /* renamed from: y */
    private final C1130k f4155y;

    /* renamed from: z */
    boolean f4156z = false;

    public static class LayoutParams extends androidx.recyclerview.widget.RecyclerView.LayoutParams {

        /* renamed from: e */
        C1090c f4157e;

        /* renamed from: f */
        boolean f4158f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        /* renamed from: e */
        public final int mo5555e() {
            C1090c cVar = this.f4157e;
            if (cVar == null) {
                return -1;
            }
            return cVar.f4187e;
        }

        /* renamed from: f */
        public boolean mo5556f() {
            return this.f4158f;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    static class LazySpanLookup {

        /* renamed from: a */
        int[] f4159a;

        /* renamed from: b */
        List<FullSpanItem> f4160b;

        @SuppressLint({"BanParcelableUsage"})
        static class FullSpanItem implements Parcelable {
            public static final Creator<FullSpanItem> CREATOR = new C1086a();

            /* renamed from: e */
            int f4161e;

            /* renamed from: f */
            int f4162f;

            /* renamed from: g */
            int[] f4163g;

            /* renamed from: h */
            boolean f4164h;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            static class C1086a implements Creator<FullSpanItem> {
                C1086a() {
                }

                public FullSpanItem createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public FullSpanItem[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            FullSpanItem(Parcel parcel) {
                this.f4161e = parcel.readInt();
                this.f4162f = parcel.readInt();
                boolean z = true;
                if (parcel.readInt() != 1) {
                    z = false;
                }
                this.f4164h = z;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    this.f4163g = new int[readInt];
                    parcel.readIntArray(this.f4163g);
                }
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public int mo5569a(int i) {
                int[] iArr = this.f4163g;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("FullSpanItem{mPosition=");
                sb.append(this.f4161e);
                sb.append(", mGapDir=");
                sb.append(this.f4162f);
                sb.append(", mHasUnwantedGapAfter=");
                sb.append(this.f4164h);
                sb.append(", mGapPerSpan=");
                sb.append(Arrays.toString(this.f4163g));
                sb.append('}');
                return sb.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4161e);
                parcel.writeInt(this.f4162f);
                parcel.writeInt(this.f4164h ? 1 : 0);
                int[] iArr = this.f4163g;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f4163g);
            }

            FullSpanItem() {
            }
        }

        LazySpanLookup() {
        }

        /* renamed from: c */
        private void m5344c(int i, int i2) {
            List<FullSpanItem> list = this.f4160b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f4160b.get(size);
                    int i3 = fullSpanItem.f4161e;
                    if (i3 >= i) {
                        fullSpanItem.f4161e = i3 + i2;
                    }
                }
            }
        }

        /* renamed from: g */
        private int m5346g(int i) {
            if (this.f4160b == null) {
                return -1;
            }
            FullSpanItem c = mo5565c(i);
            if (c != null) {
                this.f4160b.remove(c);
            }
            int size = this.f4160b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (((FullSpanItem) this.f4160b.get(i2)).f4161e >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            FullSpanItem fullSpanItem = (FullSpanItem) this.f4160b.get(i2);
            this.f4160b.remove(i2);
            return fullSpanItem.f4161e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5561a(int i, C1090c cVar) {
            mo5559a(i);
            this.f4159a[i] = cVar.f4187e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo5563b(int i) {
            List<FullSpanItem> list = this.f4160b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (((FullSpanItem) this.f4160b.get(size)).f4161e >= i) {
                        this.f4160b.remove(size);
                    }
                }
            }
            return mo5567e(i);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public int mo5566d(int i) {
            int[] iArr = this.f4159a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public int mo5567e(int i) {
            int[] iArr = this.f4159a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            int g = m5346g(i);
            if (g == -1) {
                int[] iArr2 = this.f4159a;
                Arrays.fill(iArr2, i, iArr2.length, -1);
                return this.f4159a.length;
            }
            int i2 = g + 1;
            Arrays.fill(this.f4159a, i, i2, -1);
            return i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public int mo5568f(int i) {
            int length = this.f4159a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }

        /* renamed from: d */
        private void m5345d(int i, int i2) {
            List<FullSpanItem> list = this.f4160b;
            if (list != null) {
                int i3 = i + i2;
                for (int size = list.size() - 1; size >= 0; size--) {
                    FullSpanItem fullSpanItem = (FullSpanItem) this.f4160b.get(size);
                    int i4 = fullSpanItem.f4161e;
                    if (i4 >= i) {
                        if (i4 < i3) {
                            this.f4160b.remove(size);
                        } else {
                            fullSpanItem.f4161e = i4 - i2;
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5559a(int i) {
            int[] iArr = this.f4159a;
            if (iArr == null) {
                this.f4159a = new int[(Math.max(i, 10) + 1)];
                Arrays.fill(this.f4159a, -1);
            } else if (i >= iArr.length) {
                this.f4159a = new int[mo5568f(i)];
                System.arraycopy(iArr, 0, this.f4159a, 0, iArr.length);
                int[] iArr2 = this.f4159a;
                Arrays.fill(iArr2, iArr.length, iArr2.length, -1);
            }
        }

        /* renamed from: c */
        public FullSpanItem mo5565c(int i) {
            List<FullSpanItem> list = this.f4160b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f4160b.get(size);
                if (fullSpanItem.f4161e == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5564b(int i, int i2) {
            int[] iArr = this.f4159a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo5559a(i3);
                int[] iArr2 = this.f4159a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f4159a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                m5345d(i, i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5558a() {
            int[] iArr = this.f4159a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4160b = null;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5560a(int i, int i2) {
            int[] iArr = this.f4159a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo5559a(i3);
                int[] iArr2 = this.f4159a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f4159a, i, i3, -1);
                m5344c(i, i2);
            }
        }

        /* renamed from: a */
        public void mo5562a(FullSpanItem fullSpanItem) {
            if (this.f4160b == null) {
                this.f4160b = new ArrayList();
            }
            int size = this.f4160b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = (FullSpanItem) this.f4160b.get(i);
                if (fullSpanItem2.f4161e == fullSpanItem.f4161e) {
                    this.f4160b.remove(i);
                }
                if (fullSpanItem2.f4161e >= fullSpanItem.f4161e) {
                    this.f4160b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f4160b.add(fullSpanItem);
        }

        /* renamed from: a */
        public FullSpanItem mo5557a(int i, int i2, int i3, boolean z) {
            List<FullSpanItem> list = this.f4160b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = (FullSpanItem) this.f4160b.get(i4);
                int i5 = fullSpanItem.f4161e;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f4162f == i3 || (z && fullSpanItem.f4164h))) {
                    return fullSpanItem;
                }
            }
            return null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Creator<SavedState> CREATOR = new C1087a();

        /* renamed from: e */
        int f4165e;

        /* renamed from: f */
        int f4166f;

        /* renamed from: g */
        int f4167g;

        /* renamed from: h */
        int[] f4168h;

        /* renamed from: i */
        int f4169i;

        /* renamed from: j */
        int[] f4170j;

        /* renamed from: k */
        List<FullSpanItem> f4171k;

        /* renamed from: l */
        boolean f4172l;

        /* renamed from: m */
        boolean f4173m;

        /* renamed from: n */
        boolean f4174n;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        static class C1087a implements Creator<SavedState> {
            C1087a() {
            }

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5575a() {
            this.f4168h = null;
            this.f4167g = 0;
            this.f4165e = -1;
            this.f4166f = -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5576b() {
            this.f4168h = null;
            this.f4167g = 0;
            this.f4169i = 0;
            this.f4170j = null;
            this.f4171k = null;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4165e);
            parcel.writeInt(this.f4166f);
            parcel.writeInt(this.f4167g);
            if (this.f4167g > 0) {
                parcel.writeIntArray(this.f4168h);
            }
            parcel.writeInt(this.f4169i);
            if (this.f4169i > 0) {
                parcel.writeIntArray(this.f4170j);
            }
            parcel.writeInt(this.f4172l ? 1 : 0);
            parcel.writeInt(this.f4173m ? 1 : 0);
            parcel.writeInt(this.f4174n ? 1 : 0);
            parcel.writeList(this.f4171k);
        }

        SavedState(Parcel parcel) {
            this.f4165e = parcel.readInt();
            this.f4166f = parcel.readInt();
            this.f4167g = parcel.readInt();
            int i = this.f4167g;
            if (i > 0) {
                this.f4168h = new int[i];
                parcel.readIntArray(this.f4168h);
            }
            this.f4169i = parcel.readInt();
            int i2 = this.f4169i;
            if (i2 > 0) {
                this.f4170j = new int[i2];
                parcel.readIntArray(this.f4170j);
            }
            boolean z = false;
            this.f4172l = parcel.readInt() == 1;
            this.f4173m = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f4174n = z;
            this.f4171k = parcel.readArrayList(FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f4167g = savedState.f4167g;
            this.f4165e = savedState.f4165e;
            this.f4166f = savedState.f4166f;
            this.f4168h = savedState.f4168h;
            this.f4169i = savedState.f4169i;
            this.f4170j = savedState.f4170j;
            this.f4172l = savedState.f4172l;
            this.f4173m = savedState.f4173m;
            this.f4174n = savedState.f4174n;
            this.f4171k = savedState.f4171k;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    class C1088a implements Runnable {
        C1088a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.mo5538I();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    class C1089b {

        /* renamed from: a */
        int f4176a;

        /* renamed from: b */
        int f4177b;

        /* renamed from: c */
        boolean f4178c;

        /* renamed from: d */
        boolean f4179d;

        /* renamed from: e */
        boolean f4180e;

        /* renamed from: f */
        int[] f4181f;

        C1089b() {
            mo5585b();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5584a(C1090c[] cVarArr) {
            int length = cVarArr.length;
            int[] iArr = this.f4181f;
            if (iArr == null || iArr.length < length) {
                this.f4181f = new int[StaggeredGridLayoutManager.this.f4150t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f4181f[i] = cVarArr[i].mo5593b(Integer.MIN_VALUE);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5585b() {
            this.f4176a = -1;
            this.f4177b = Integer.MIN_VALUE;
            this.f4178c = false;
            this.f4179d = false;
            this.f4180e = false;
            int[] iArr = this.f4181f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5582a() {
            int i;
            if (this.f4178c) {
                i = StaggeredGridLayoutManager.this.f4151u.mo5748b();
            } else {
                i = StaggeredGridLayoutManager.this.f4151u.mo5756f();
            }
            this.f4177b = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5583a(int i) {
            if (this.f4178c) {
                this.f4177b = StaggeredGridLayoutManager.this.f4151u.mo5748b() - i;
            } else {
                this.f4177b = StaggeredGridLayoutManager.this.f4151u.mo5756f() + i;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    class C1090c {

        /* renamed from: a */
        ArrayList<View> f4183a = new ArrayList<>();

        /* renamed from: b */
        int f4184b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f4185c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f4186d = 0;

        /* renamed from: e */
        final int f4187e;

        C1090c(int i) {
            this.f4187e = i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo5586a(int i) {
            int i2 = this.f4185c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4183a.size() == 0) {
                return i;
            }
            mo5590a();
            return this.f4185c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo5593b(int i) {
            int i2 = this.f4184b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4183a.size() == 0) {
                return i;
            }
            mo5595b();
            return this.f4184b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5598c(View view) {
            LayoutParams b = mo5594b(view);
            b.f4157e = this;
            this.f4183a.add(0, view);
            this.f4184b = Integer.MIN_VALUE;
            if (this.f4183a.size() == 1) {
                this.f4185c = Integer.MIN_VALUE;
            }
            if (b.mo5323c() || b.mo5322b()) {
                this.f4186d += StaggeredGridLayoutManager.this.f4151u.mo5749b(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public void mo5600d(int i) {
            this.f4184b = i;
            this.f4185c = i;
        }

        /* renamed from: e */
        public int mo5601e() {
            if (StaggeredGridLayoutManager.this.f4156z) {
                return mo5587a(0, this.f4183a.size(), true);
            }
            return mo5587a(this.f4183a.size() - 1, -1, true);
        }

        /* renamed from: f */
        public int mo5602f() {
            return this.f4186d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: g */
        public int mo5603g() {
            int i = this.f4185c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5590a();
            return this.f4185c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: h */
        public int mo5604h() {
            int i = this.f4184b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            mo5595b();
            return this.f4184b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: i */
        public void mo5605i() {
            this.f4184b = Integer.MIN_VALUE;
            this.f4185c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: j */
        public void mo5606j() {
            int size = this.f4183a.size();
            View view = (View) this.f4183a.remove(size - 1);
            LayoutParams b = mo5594b(view);
            b.f4157e = null;
            if (b.mo5323c() || b.mo5322b()) {
                this.f4186d -= StaggeredGridLayoutManager.this.f4151u.mo5749b(view);
            }
            if (size == 1) {
                this.f4184b = Integer.MIN_VALUE;
            }
            this.f4185c = Integer.MIN_VALUE;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: k */
        public void mo5607k() {
            View view = (View) this.f4183a.remove(0);
            LayoutParams b = mo5594b(view);
            b.f4157e = null;
            if (this.f4183a.size() == 0) {
                this.f4185c = Integer.MIN_VALUE;
            }
            if (b.mo5323c() || b.mo5322b()) {
                this.f4186d -= StaggeredGridLayoutManager.this.f4151u.mo5749b(view);
            }
            this.f4184b = Integer.MIN_VALUE;
        }

        /* renamed from: d */
        public int mo5599d() {
            if (StaggeredGridLayoutManager.this.f4156z) {
                return mo5587a(this.f4183a.size() - 1, -1, true);
            }
            return mo5587a(0, this.f4183a.size(), true);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5590a() {
            ArrayList<View> arrayList = this.f4183a;
            View view = (View) arrayList.get(arrayList.size() - 1);
            LayoutParams b = mo5594b(view);
            this.f4185c = StaggeredGridLayoutManager.this.f4151u.mo5746a(view);
            if (b.f4158f) {
                FullSpanItem c = StaggeredGridLayoutManager.this.f4137E.mo5565c(b.mo5321a());
                if (c != null && c.f4162f == 1) {
                    this.f4185c += c.mo5569a(this.f4187e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public void mo5595b() {
            View view = (View) this.f4183a.get(0);
            LayoutParams b = mo5594b(view);
            this.f4184b = StaggeredGridLayoutManager.this.f4151u.mo5753d(view);
            if (b.f4158f) {
                FullSpanItem c = StaggeredGridLayoutManager.this.f4137E.mo5565c(b.mo5321a());
                if (c != null && c.f4162f == -1) {
                    this.f4184b -= c.mo5569a(this.f4187e);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5596c() {
            this.f4183a.clear();
            mo5605i();
            this.f4186d = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public void mo5597c(int i) {
            int i2 = this.f4184b;
            if (i2 != Integer.MIN_VALUE) {
                this.f4184b = i2 + i;
            }
            int i3 = this.f4185c;
            if (i3 != Integer.MIN_VALUE) {
                this.f4185c = i3 + i;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5591a(View view) {
            LayoutParams b = mo5594b(view);
            b.f4157e = this;
            this.f4183a.add(view);
            this.f4185c = Integer.MIN_VALUE;
            if (this.f4183a.size() == 1) {
                this.f4184b = Integer.MIN_VALUE;
            }
            if (b.mo5323c() || b.mo5322b()) {
                this.f4186d += StaggeredGridLayoutManager.this.f4151u.mo5749b(view);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public LayoutParams mo5594b(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo5592a(boolean z, int i) {
            int i2;
            if (z) {
                i2 = mo5586a(Integer.MIN_VALUE);
            } else {
                i2 = mo5593b(Integer.MIN_VALUE);
            }
            mo5596c();
            if (i2 != Integer.MIN_VALUE) {
                if ((!z || i2 >= StaggeredGridLayoutManager.this.f4151u.mo5748b()) && (z || i2 <= StaggeredGridLayoutManager.this.f4151u.mo5756f())) {
                    if (i != Integer.MIN_VALUE) {
                        i2 += i;
                    }
                    this.f4185c = i2;
                    this.f4184b = i2;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo5588a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int f = StaggeredGridLayoutManager.this.f4151u.mo5756f();
            int b = StaggeredGridLayoutManager.this.f4151u.mo5748b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = (View) this.f4183a.get(i);
                int d = StaggeredGridLayoutManager.this.f4151u.mo5753d(view);
                int a = StaggeredGridLayoutManager.this.f4151u.mo5746a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d < b : d <= b;
                if (!z3 ? a > f : a >= f) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (z2) {
                            return StaggeredGridLayoutManager.this.mo5298l(view);
                        }
                        if (d < f || a > b) {
                            return StaggeredGridLayoutManager.this.mo5298l(view);
                        }
                    } else if (d >= f && a <= b) {
                        return StaggeredGridLayoutManager.this.mo5298l(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public int mo5587a(int i, int i2, boolean z) {
            return mo5588a(i, i2, false, false, z);
        }

        /* renamed from: a */
        public View mo5589a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f4183a.size() - 1;
                while (size >= 0) {
                    View view2 = (View) this.f4183a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4156z && staggeredGridLayoutManager.mo5298l(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4156z && staggeredGridLayoutManager2.mo5298l(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4183a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = (View) this.f4183a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4156z && staggeredGridLayoutManager3.mo5298l(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4156z && staggeredGridLayoutManager4.mo5298l(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        C1060c a = LayoutManager.m4969a(context, attributeSet, i, i2);
        mo5552i(a.f4071a);
        mo5553j(a.f4072b);
        mo5551d(a.f4073c);
        this.f4155y = new C1130k();
        m5245P();
    }

    /* renamed from: P */
    private void m5245P() {
        this.f4151u = C1136o.m5539a(this, this.f4153w);
        this.f4152v = C1136o.m5539a(this, 1 - this.f4153w);
    }

    /* renamed from: Q */
    private void m5246Q() {
        if (this.f4152v.mo5752d() != 1073741824) {
            int e = mo5278e();
            float f = 0.0f;
            for (int i = 0; i < e; i++) {
                View c = mo5265c(i);
                float b = (float) this.f4152v.mo5749b(c);
                if (b >= f) {
                    if (((LayoutParams) c.getLayoutParams()).mo5556f()) {
                        b = (b * 1.0f) / ((float) this.f4149s);
                    }
                    f = Math.max(f, b);
                }
            }
            int i2 = this.f4154x;
            int round = Math.round(f * ((float) this.f4149s));
            if (this.f4152v.mo5752d() == Integer.MIN_VALUE) {
                round = Math.min(round, this.f4152v.mo5758g());
            }
            mo5554k(round);
            if (this.f4154x != i2) {
                for (int i3 = 0; i3 < e; i3++) {
                    View c2 = mo5265c(i3);
                    LayoutParams layoutParams = (LayoutParams) c2.getLayoutParams();
                    if (!layoutParams.f4158f) {
                        if (!mo5544O() || this.f4153w != 1) {
                            int i4 = layoutParams.f4157e.f4187e;
                            int i5 = this.f4154x * i4;
                            int i6 = i4 * i2;
                            if (this.f4153w == 1) {
                                c2.offsetLeftAndRight(i5 - i6);
                            } else {
                                c2.offsetTopAndBottom(i5 - i6);
                            }
                        } else {
                            int i7 = this.f4149s;
                            int i8 = i7 - 1;
                            int i9 = layoutParams.f4157e.f4187e;
                            c2.offsetLeftAndRight(((-(i8 - i9)) * this.f4154x) - ((-((i7 - 1) - i9)) * i2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: R */
    private void m5247R() {
        if (this.f4153w == 1 || !mo5544O()) {
            this.f4133A = this.f4156z;
        } else {
            this.f4133A = !this.f4156z;
        }
    }

    /* renamed from: a */
    private boolean m5258a(C1090c cVar) {
        if (this.f4133A) {
            if (cVar.mo5603g() < this.f4151u.mo5748b()) {
                ArrayList<View> arrayList = cVar.f4183a;
                return !cVar.mo5594b((View) arrayList.get(arrayList.size() - 1)).f4158f;
            }
        } else if (cVar.mo5604h() > this.f4151u.mo5756f()) {
            return !cVar.mo5594b((View) cVar.f4183a.get(0)).f4158f;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0157, code lost:
        if (mo5538I() != false) goto L_0x015b;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5264c(androidx.recyclerview.widget.RecyclerView.C1079p r9, androidx.recyclerview.widget.RecyclerView.C1082s r10, boolean r11) {
        /*
            r8 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r8.f4144L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f4141I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r8.f4135C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r10.mo5482a()
            if (r1 != 0) goto L_0x0018
            r8.mo5261b(r9)
            r0.mo5585b()
            return
        L_0x0018:
            boolean r1 = r0.f4180e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r8.f4135C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r8.f4141I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            if (r1 == 0) goto L_0x0043
            r0.mo5585b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f4141I
            if (r5 == 0) goto L_0x0037
            r8.m5256a(r0)
            goto L_0x003e
        L_0x0037:
            r8.m5247R()
            boolean r5 = r8.f4133A
            r0.f4178c = r5
        L_0x003e:
            r8.mo5548b(r10, r0)
            r0.f4180e = r4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f4141I
            if (r5 != 0) goto L_0x0060
            int r5 = r8.f4135C
            if (r5 != r2) goto L_0x0060
            boolean r5 = r0.f4178c
            boolean r6 = r8.f4139G
            if (r5 != r6) goto L_0x0059
            boolean r5 = r8.mo5544O()
            boolean r6 = r8.f4140H
            if (r5 == r6) goto L_0x0060
        L_0x0059:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r8.f4137E
            r5.mo5558a()
            r0.f4179d = r4
        L_0x0060:
            int r5 = r8.mo5278e()
            if (r5 <= 0) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r5 = r8.f4141I
            if (r5 == 0) goto L_0x006e
            int r5 = r5.f4167g
            if (r5 >= r4) goto L_0x00c9
        L_0x006e:
            boolean r5 = r0.f4179d
            if (r5 == 0) goto L_0x008e
            r1 = 0
        L_0x0073:
            int r5 = r8.f4149s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f4150t
            r5 = r5[r1]
            r5.mo5596c()
            int r5 = r0.f4177b
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L_0x008b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r8.f4150t
            r6 = r6[r1]
            r6.mo5600d(r5)
        L_0x008b:
            int r1 = r1 + 1
            goto L_0x0073
        L_0x008e:
            if (r1 != 0) goto L_0x00af
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f4144L
            int[] r1 = r1.f4181f
            if (r1 != 0) goto L_0x0097
            goto L_0x00af
        L_0x0097:
            r1 = 0
        L_0x0098:
            int r5 = r8.f4149s
            if (r1 >= r5) goto L_0x00c9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f4150t
            r5 = r5[r1]
            r5.mo5596c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r6 = r8.f4144L
            int[] r6 = r6.f4181f
            r6 = r6[r1]
            r5.mo5600d(r6)
            int r1 = r1 + 1
            goto L_0x0098
        L_0x00af:
            r1 = 0
        L_0x00b0:
            int r5 = r8.f4149s
            if (r1 >= r5) goto L_0x00c2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f4150t
            r5 = r5[r1]
            boolean r6 = r8.f4133A
            int r7 = r0.f4177b
            r5.mo5592a(r6, r7)
            int r1 = r1 + 1
            goto L_0x00b0
        L_0x00c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r8.f4144L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r8.f4150t
            r1.mo5584a(r5)
        L_0x00c9:
            r8.mo5235a(r9)
            androidx.recyclerview.widget.k r1 = r8.f4155y
            r1.f4334a = r3
            r8.f4145M = r3
            androidx.recyclerview.widget.o r1 = r8.f4152v
            int r1 = r1.mo5758g()
            r8.mo5554k(r1)
            int r1 = r0.f4176a
            r8.m5260b(r1, r10)
            boolean r1 = r0.f4178c
            if (r1 == 0) goto L_0x00fc
            r8.m5283w(r2)
            androidx.recyclerview.widget.k r1 = r8.f4155y
            r8.m5248a(r9, r1, r10)
            r8.m5283w(r4)
            androidx.recyclerview.widget.k r1 = r8.f4155y
            int r2 = r0.f4176a
            int r5 = r1.f4337d
            int r2 = r2 + r5
            r1.f4336c = r2
            r8.m5248a(r9, r1, r10)
            goto L_0x0113
        L_0x00fc:
            r8.m5283w(r4)
            androidx.recyclerview.widget.k r1 = r8.f4155y
            r8.m5248a(r9, r1, r10)
            r8.m5283w(r2)
            androidx.recyclerview.widget.k r1 = r8.f4155y
            int r2 = r0.f4176a
            int r5 = r1.f4337d
            int r2 = r2 + r5
            r1.f4336c = r2
            r8.m5248a(r9, r1, r10)
        L_0x0113:
            r8.m5246Q()
            int r1 = r8.mo5278e()
            if (r1 <= 0) goto L_0x012d
            boolean r1 = r8.f4133A
            if (r1 == 0) goto L_0x0127
            r8.m5254a(r9, r10, r4)
            r8.m5262b(r9, r10, r3)
            goto L_0x012d
        L_0x0127:
            r8.m5262b(r9, r10, r4)
            r8.m5254a(r9, r10, r3)
        L_0x012d:
            if (r11 == 0) goto L_0x015a
            boolean r11 = r10.mo5487d()
            if (r11 != 0) goto L_0x015a
            int r11 = r8.f4138F
            if (r11 == 0) goto L_0x014b
            int r11 = r8.mo5278e()
            if (r11 <= 0) goto L_0x014b
            boolean r11 = r8.f4145M
            if (r11 != 0) goto L_0x0149
            android.view.View r11 = r8.mo5542M()
            if (r11 == 0) goto L_0x014b
        L_0x0149:
            r11 = 1
            goto L_0x014c
        L_0x014b:
            r11 = 0
        L_0x014c:
            if (r11 == 0) goto L_0x015a
            java.lang.Runnable r11 = r8.f4148P
            r8.mo5253a(r11)
            boolean r11 = r8.mo5538I()
            if (r11 == 0) goto L_0x015a
            goto L_0x015b
        L_0x015a:
            r4 = 0
        L_0x015b:
            boolean r11 = r10.mo5487d()
            if (r11 == 0) goto L_0x0166
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f4144L
            r11.mo5585b()
        L_0x0166:
            boolean r11 = r0.f4178c
            r8.f4139G = r11
            boolean r11 = r8.mo5544O()
            r8.f4140H = r11
            if (r4 == 0) goto L_0x017a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r11 = r8.f4144L
            r11.mo5585b()
            r8.m5264c(r9, r10, r3)
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5264c(androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.RecyclerView$s, boolean):void");
    }

    /* renamed from: h */
    private int m5267h(C1082s sVar) {
        if (mo5278e() == 0) {
            return 0;
        }
        return C1143r.m5603a(sVar, this.f4151u, mo5550c(!this.f4146N), mo5547b(!this.f4146N), this, this.f4146N);
    }

    /* renamed from: l */
    private int m5270l(int i) {
        int i2 = -1;
        if (mo5278e() == 0) {
            if (this.f4133A) {
                i2 = 1;
            }
            return i2;
        }
        if ((i < mo5540K()) == this.f4133A) {
            i2 = 1;
        }
        return i2;
    }

    /* renamed from: m */
    private int m5271m(int i) {
        int i2 = -1;
        int i3 = 1;
        if (i == 1) {
            return (this.f4153w != 1 && mo5544O()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f4153w != 1 && mo5544O()) ? -1 : 1;
        }
        if (i == 17) {
            if (this.f4153w != 0) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 33) {
            if (this.f4153w != 1) {
                i2 = Integer.MIN_VALUE;
            }
            return i2;
        } else if (i == 66) {
            if (this.f4153w != 0) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        } else if (i != 130) {
            return Integer.MIN_VALUE;
        } else {
            if (this.f4153w != 1) {
                i3 = Integer.MIN_VALUE;
            }
            return i3;
        }
    }

    /* renamed from: n */
    private FullSpanItem m5272n(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f4163g = new int[this.f4149s];
        for (int i2 = 0; i2 < this.f4149s; i2++) {
            fullSpanItem.f4163g[i2] = i - this.f4150t[i2].mo5586a(i);
        }
        return fullSpanItem;
    }

    /* renamed from: o */
    private FullSpanItem m5273o(int i) {
        FullSpanItem fullSpanItem = new FullSpanItem();
        fullSpanItem.f4163g = new int[this.f4149s];
        for (int i2 = 0; i2 < this.f4149s; i2++) {
            fullSpanItem.f4163g[i2] = this.f4150t[i2].mo5593b(i) - i;
        }
        return fullSpanItem;
    }

    /* renamed from: p */
    private void m5275p(View view) {
        for (int i = this.f4149s - 1; i >= 0; i--) {
            this.f4150t[i].mo5591a(view);
        }
    }

    /* renamed from: q */
    private void m5277q(View view) {
        for (int i = this.f4149s - 1; i >= 0; i--) {
            this.f4150t[i].mo5598c(view);
        }
    }

    /* renamed from: r */
    private int m5278r(int i) {
        int a = this.f4150t[0].mo5586a(i);
        for (int i2 = 1; i2 < this.f4149s; i2++) {
            int a2 = this.f4150t[i2].mo5586a(i);
            if (a2 > a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: s */
    private int m5279s(int i) {
        int b = this.f4150t[0].mo5593b(i);
        for (int i2 = 1; i2 < this.f4149s; i2++) {
            int b2 = this.f4150t[i2].mo5593b(i);
            if (b2 > b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: t */
    private int m5280t(int i) {
        int a = this.f4150t[0].mo5586a(i);
        for (int i2 = 1; i2 < this.f4149s; i2++) {
            int a2 = this.f4150t[i2].mo5586a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    /* renamed from: u */
    private int m5281u(int i) {
        int b = this.f4150t[0].mo5593b(i);
        for (int i2 = 1; i2 < this.f4149s; i2++) {
            int b2 = this.f4150t[i2].mo5593b(i);
            if (b2 < b) {
                b = b2;
            }
        }
        return b;
    }

    /* renamed from: v */
    private boolean m5282v(int i) {
        boolean z = true;
        if (this.f4153w == 0) {
            if ((i == -1) == this.f4133A) {
                z = false;
            }
            return z;
        }
        if (((i == -1) == this.f4133A) != mo5544O()) {
            z = false;
        }
        return z;
    }

    /* renamed from: w */
    private void m5283w(int i) {
        C1130k kVar = this.f4155y;
        kVar.f4338e = i;
        int i2 = 1;
        if (this.f4133A != (i == -1)) {
            i2 = -1;
        }
        kVar.f4337d = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Parcelable mo4971A() {
        /*
            r4 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = r4.f4141I
            if (r0 == 0) goto L_0x000a
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            r1.<init>(r0)
            return r1
        L_0x000a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r0 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            r0.<init>()
            boolean r1 = r4.f4156z
            r0.f4172l = r1
            boolean r1 = r4.f4139G
            r0.f4173m = r1
            boolean r1 = r4.f4140H
            r0.f4174n = r1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r4.f4137E
            r2 = 0
            if (r1 == 0) goto L_0x0030
            int[] r3 = r1.f4159a
            if (r3 == 0) goto L_0x0030
            r0.f4170j = r3
            int[] r3 = r0.f4170j
            int r3 = r3.length
            r0.f4169i = r3
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r1 = r1.f4160b
            r0.f4171k = r1
            goto L_0x0032
        L_0x0030:
            r0.f4169i = r2
        L_0x0032:
            int r1 = r4.mo5278e()
            if (r1 <= 0) goto L_0x0088
            boolean r1 = r4.f4139G
            if (r1 == 0) goto L_0x0041
            int r1 = r4.mo5541L()
            goto L_0x0045
        L_0x0041:
            int r1 = r4.mo5540K()
        L_0x0045:
            r0.f4165e = r1
            int r1 = r4.mo5539J()
            r0.f4166f = r1
            int r1 = r4.f4149s
            r0.f4167g = r1
            int[] r1 = new int[r1]
            r0.f4168h = r1
        L_0x0055:
            int r1 = r4.f4149s
            if (r2 >= r1) goto L_0x008f
            boolean r1 = r4.f4139G
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0070
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r1 = r4.f4150t
            r1 = r1[r2]
            int r1 = r1.mo5586a(r3)
            if (r1 == r3) goto L_0x0081
            androidx.recyclerview.widget.o r3 = r4.f4151u
            int r3 = r3.mo5748b()
            goto L_0x0080
        L_0x0070:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r1 = r4.f4150t
            r1 = r1[r2]
            int r1 = r1.mo5593b(r3)
            if (r1 == r3) goto L_0x0081
            androidx.recyclerview.widget.o r3 = r4.f4151u
            int r3 = r3.mo5756f()
        L_0x0080:
            int r1 = r1 - r3
        L_0x0081:
            int[] r3 = r0.f4168h
            r3[r2] = r1
            int r2 = r2 + 1
            goto L_0x0055
        L_0x0088:
            r1 = -1
            r0.f4165e = r1
            r0.f4166f = r1
            r0.f4167g = r2
        L_0x008f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4971A():android.os.Parcelable");
    }

    /* renamed from: F */
    public boolean mo4927F() {
        return this.f4141I == null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: G */
    public boolean mo5536G() {
        int a = this.f4150t[0].mo5586a(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4149s; i++) {
            if (this.f4150t[i].mo5586a(Integer.MIN_VALUE) != a) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: H */
    public boolean mo5537H() {
        int b = this.f4150t[0].mo5593b(Integer.MIN_VALUE);
        for (int i = 1; i < this.f4149s; i++) {
            if (this.f4150t[i].mo5593b(Integer.MIN_VALUE) != b) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: I */
    public boolean mo5538I() {
        int i;
        int i2;
        if (mo5278e() == 0 || this.f4138F == 0 || !mo5312w()) {
            return false;
        }
        if (this.f4133A) {
            i2 = mo5541L();
            i = mo5540K();
        } else {
            i2 = mo5540K();
            i = mo5541L();
        }
        if (i2 == 0 && mo5542M() != null) {
            this.f4137E.mo5558a();
            mo5218C();
            mo5217B();
            return true;
        } else if (!this.f4145M) {
            return false;
        } else {
            int i3 = this.f4133A ? -1 : 1;
            int i4 = i + 1;
            FullSpanItem a = this.f4137E.mo5557a(i2, i4, i3, true);
            if (a == null) {
                this.f4145M = false;
                this.f4137E.mo5563b(i4);
                return false;
            }
            FullSpanItem a2 = this.f4137E.mo5557a(i2, a.f4161e, i3 * -1, true);
            if (a2 == null) {
                this.f4137E.mo5563b(a.f4161e);
            } else {
                this.f4137E.mo5563b(a2.f4161e + 1);
            }
            mo5218C();
            mo5217B();
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: J */
    public int mo5539J() {
        View view;
        if (this.f4133A) {
            view = mo5547b(true);
        } else {
            view = mo5550c(true);
        }
        if (view == null) {
            return -1;
        }
        return mo5298l(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: K */
    public int mo5540K() {
        if (mo5278e() == 0) {
            return 0;
        }
        return mo5298l(mo5265c(0));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: L */
    public int mo5541L() {
        int e = mo5278e();
        if (e == 0) {
            return 0;
        }
        return mo5298l(mo5265c(e - 1));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0074, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        if (r10 == r11) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008a, code lost:
        r10 = false;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo5542M() {
        /*
            r12 = this;
            int r0 = r12.mo5278e()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4149s
            r2.<init>(r3)
            int r3 = r12.f4149s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4153w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r12.mo5544O()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r12.f4133A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x00ab
            android.view.View r7 = r12.mo5265c(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f4157e
            int r9 = r9.f4187e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x0054
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f4157e
            boolean r9 = r12.m5258a(r9)
            if (r9 == 0) goto L_0x004d
            return r7
        L_0x004d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f4157e
            int r9 = r9.f4187e
            r2.clear(r9)
        L_0x0054:
            boolean r9 = r8.f4158f
            if (r9 == 0) goto L_0x0059
            goto L_0x00a9
        L_0x0059:
            int r9 = r0 + r5
            if (r9 == r6) goto L_0x00a9
            android.view.View r9 = r12.mo5265c(r9)
            boolean r10 = r12.f4133A
            if (r10 == 0) goto L_0x0077
            androidx.recyclerview.widget.o r10 = r12.f4151u
            int r10 = r10.mo5746a(r7)
            androidx.recyclerview.widget.o r11 = r12.f4151u
            int r11 = r11.mo5746a(r9)
            if (r10 >= r11) goto L_0x0074
            return r7
        L_0x0074:
            if (r10 != r11) goto L_0x008a
            goto L_0x0088
        L_0x0077:
            androidx.recyclerview.widget.o r10 = r12.f4151u
            int r10 = r10.mo5753d(r7)
            androidx.recyclerview.widget.o r11 = r12.f4151u
            int r11 = r11.mo5753d(r9)
            if (r10 <= r11) goto L_0x0086
            return r7
        L_0x0086:
            if (r10 != r11) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x008b
        L_0x008a:
            r10 = 0
        L_0x008b:
            if (r10 == 0) goto L_0x00a9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = r8.f4157e
            int r8 = r8.f4187e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.f4157e
            int r9 = r9.f4187e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00a0
            r8 = 1
            goto L_0x00a1
        L_0x00a0:
            r8 = 0
        L_0x00a1:
            if (r3 >= 0) goto L_0x00a5
            r9 = 1
            goto L_0x00a6
        L_0x00a5:
            r9 = 0
        L_0x00a6:
            if (r8 == r9) goto L_0x00a9
            return r7
        L_0x00a9:
            int r0 = r0 + r5
            goto L_0x002e
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo5542M():android.view.View");
    }

    /* renamed from: N */
    public void mo5543N() {
        this.f4137E.mo5558a();
        mo5217B();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: O */
    public boolean mo5544O() {
        return mo5295k() == 1;
    }

    /* renamed from: b */
    public void mo4997b(RecyclerView recyclerView, C1079p pVar) {
        super.mo4997b(recyclerView, pVar);
        mo5253a(this.f4148P);
        for (int i = 0; i < this.f4149s; i++) {
            this.f4150t[i].mo5596c();
        }
        recyclerView.requestLayout();
    }

    public PointF computeScrollVectorForPosition(int i) {
        int l = m5270l(i);
        PointF pointF = new PointF();
        if (l == 0) {
            return null;
        }
        if (this.f4153w == 0) {
            pointF.x = (float) l;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) l;
        }
        return pointF;
    }

    /* renamed from: d */
    public void mo5551d(boolean z) {
        mo4993a((String) null);
        SavedState savedState = this.f4141I;
        if (!(savedState == null || savedState.f4172l == z)) {
            savedState.f4172l = z;
        }
        this.f4156z = z;
        mo5217B();
    }

    /* renamed from: e */
    public void mo4952e(C1079p pVar, C1082s sVar) {
        m5264c(pVar, sVar, true);
    }

    /* renamed from: f */
    public void mo5283f(int i) {
        if (i == 0) {
            mo5538I();
        }
    }

    /* renamed from: g */
    public void mo4955g(C1082s sVar) {
        super.mo4955g(sVar);
        this.f4135C = -1;
        this.f4136D = Integer.MIN_VALUE;
        this.f4141I = null;
        this.f4144L.mo5585b();
    }

    /* renamed from: i */
    public void mo5552i(int i) {
        if (i == 0 || i == 1) {
            mo4993a((String) null);
            if (i != this.f4153w) {
                this.f4153w = i;
                C1136o oVar = this.f4151u;
                this.f4151u = this.f4152v;
                this.f4152v = oVar;
                mo5217B();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: j */
    public void mo5553j(int i) {
        mo4993a((String) null);
        if (i != this.f4149s) {
            mo5543N();
            this.f4149s = i;
            this.f4134B = new BitSet(this.f4149s);
            this.f4150t = new C1090c[this.f4149s];
            for (int i2 = 0; i2 < this.f4149s; i2++) {
                this.f4150t[i2] = new C1090c(i2);
            }
            mo5217B();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public void mo5554k(int i) {
        this.f4154x = i / this.f4149s;
        this.f4142J = MeasureSpec.makeMeasureSpec(i, this.f4152v.mo5752d());
    }

    /* renamed from: x */
    public boolean mo5009x() {
        return this.f4138F != 0;
    }

    /* renamed from: e */
    public int mo4951e(C1082s sVar) {
        return m5268i(sVar);
    }

    /* renamed from: f */
    public int mo4953f(C1082s sVar) {
        return m5269j(sVar);
    }

    /* renamed from: p */
    private int m5274p(int i) {
        int e = mo5278e();
        for (int i2 = 0; i2 < e; i2++) {
            int l = mo5298l(mo5265c(i2));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    /* renamed from: q */
    private int m5276q(int i) {
        for (int e = mo5278e() - 1; e >= 0; e--) {
            int l = mo5298l(mo5265c(e));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    /* renamed from: e */
    public void mo5280e(int i) {
        super.mo5280e(i);
        for (int i2 = 0; i2 < this.f4149s; i2++) {
            this.f4150t[i2].mo5597c(i);
        }
    }

    /* renamed from: e */
    private void m5266e(int i, int i2) {
        for (int i3 = 0; i3 < this.f4149s; i3++) {
            if (!this.f4150t[i3].f4183a.isEmpty()) {
                m5257a(this.f4150t[i3], i, i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo5548b(C1082s sVar, C1089b bVar) {
        if (!mo5546a(sVar, bVar) && !m5265c(sVar, bVar)) {
            bVar.mo5582a();
            bVar.f4176a = 0;
        }
    }

    /* renamed from: d */
    public int mo5002d(C1082s sVar) {
        return m5267h(sVar);
    }

    /* renamed from: h */
    public void mo5006h(int i) {
        SavedState savedState = this.f4141I;
        if (!(savedState == null || savedState.f4165e == i)) {
            savedState.mo5575a();
        }
        this.f4135C = i;
        this.f4136D = Integer.MIN_VALUE;
        mo5217B();
    }

    /* renamed from: d */
    public void mo5275d(int i) {
        super.mo5275d(i);
        for (int i2 = 0; i2 < this.f4149s; i2++) {
            this.f4150t[i2].mo5597c(i);
        }
    }

    /* renamed from: i */
    private int m5268i(C1082s sVar) {
        if (mo5278e() == 0) {
            return 0;
        }
        return C1143r.m5604a(sVar, this.f4151u, mo5550c(!this.f4146N), mo5547b(!this.f4146N), this, this.f4146N, this.f4133A);
    }

    /* renamed from: j */
    private int m5269j(C1082s sVar) {
        if (mo5278e() == 0) {
            return 0;
        }
        return C1143r.m5605b(sVar, this.f4151u, mo5550c(!this.f4146N), mo5547b(!this.f4146N), this, this.f4146N);
    }

    /* renamed from: a */
    public void mo4993a(String str) {
        if (this.f4141I == null) {
            super.mo4993a(str);
        }
    }

    /* renamed from: b */
    public int mo4945b(C1082s sVar) {
        return m5268i(sVar);
    }

    /* renamed from: d */
    public void mo4950d(RecyclerView recyclerView) {
        this.f4137E.mo5558a();
        mo5217B();
    }

    /* renamed from: b */
    public int mo4944b(C1079p pVar, C1082s sVar) {
        if (this.f4153w == 0) {
            return this.f4149s;
        }
        return super.mo4944b(pVar, sVar);
    }

    /* renamed from: a */
    public void mo4935a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int p = mo5305p() + mo5306q();
        int s = mo5308s() + mo5301n();
        if (this.f4153w == 1) {
            i4 = LayoutManager.m4967a(i2, rect.height() + s, mo5297l());
            i3 = LayoutManager.m4967a(i, (this.f4154x * this.f4149s) + p, mo5299m());
        } else {
            i3 = LayoutManager.m4967a(i, rect.width() + p, mo5299m());
            i4 = LayoutManager.m4967a(i2, (this.f4154x * this.f4149s) + s, mo5297l());
        }
        mo5267c(i3, i4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public View mo5547b(boolean z) {
        int f = this.f4151u.mo5756f();
        int b = this.f4151u.mo5748b();
        View view = null;
        for (int e = mo5278e() - 1; e >= 0; e--) {
            View c = mo5265c(e);
            int d = this.f4151u.mo5753d(c);
            int a = this.f4151u.mo5746a(c);
            if (a > f && d < b) {
                if (a <= b || !z) {
                    return c;
                }
                if (view == null) {
                    view = c;
                }
            }
        }
        return view;
    }

    public StaggeredGridLayoutManager(int i, int i2) {
        this.f4153w = i2;
        mo5553j(i);
        this.f4155y = new C1130k();
        m5245P();
    }

    /* renamed from: b */
    private void m5262b(C1079p pVar, C1082s sVar, boolean z) {
        int u = m5281u(Integer.MAX_VALUE);
        if (u != Integer.MAX_VALUE) {
            int f = u - this.f4151u.mo5756f();
            if (f > 0) {
                int c = f - mo5549c(f, pVar, sVar);
                if (z && c > 0) {
                    this.f4151u.mo5747a(-c);
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5260b(int r5, androidx.recyclerview.widget.RecyclerView.C1082s r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.k r0 = r4.f4155y
            r1 = 0
            r0.f4335b = r1
            r0.f4336c = r5
            boolean r0 = r4.mo5314z()
            r2 = 1
            if (r0 == 0) goto L_0x002e
            int r6 = r6.mo5485b()
            r0 = -1
            if (r6 == r0) goto L_0x002e
            boolean r0 = r4.f4133A
            if (r6 >= r5) goto L_0x001b
            r5 = 1
            goto L_0x001c
        L_0x001b:
            r5 = 0
        L_0x001c:
            if (r0 != r5) goto L_0x0025
            androidx.recyclerview.widget.o r5 = r4.f4151u
            int r5 = r5.mo5758g()
            goto L_0x002f
        L_0x0025:
            androidx.recyclerview.widget.o r5 = r4.f4151u
            int r5 = r5.mo5758g()
            r6 = r5
            r5 = 0
            goto L_0x0030
        L_0x002e:
            r5 = 0
        L_0x002f:
            r6 = 0
        L_0x0030:
            boolean r0 = r4.mo5285f()
            if (r0 == 0) goto L_0x004d
            androidx.recyclerview.widget.k r0 = r4.f4155y
            androidx.recyclerview.widget.o r3 = r4.f4151u
            int r3 = r3.mo5756f()
            int r3 = r3 - r6
            r0.f4339f = r3
            androidx.recyclerview.widget.k r6 = r4.f4155y
            androidx.recyclerview.widget.o r0 = r4.f4151u
            int r0 = r0.mo5748b()
            int r0 = r0 + r5
            r6.f4340g = r0
            goto L_0x005d
        L_0x004d:
            androidx.recyclerview.widget.k r0 = r4.f4155y
            androidx.recyclerview.widget.o r3 = r4.f4151u
            int r3 = r3.mo5745a()
            int r3 = r3 + r5
            r0.f4340g = r3
            androidx.recyclerview.widget.k r5 = r4.f4155y
            int r6 = -r6
            r5.f4339f = r6
        L_0x005d:
            androidx.recyclerview.widget.k r5 = r4.f4155y
            r5.f4341h = r1
            r5.f4334a = r2
            androidx.recyclerview.widget.o r6 = r4.f4151u
            int r6 = r6.mo5752d()
            if (r6 != 0) goto L_0x0074
            androidx.recyclerview.widget.o r6 = r4.f4151u
            int r6 = r6.mo5745a()
            if (r6 != 0) goto L_0x0074
            r1 = 1
        L_0x0074:
            r5.f4342i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5260b(int, androidx.recyclerview.widget.RecyclerView$s):void");
    }

    /* renamed from: a */
    private void m5256a(C1089b bVar) {
        int i;
        SavedState savedState = this.f4141I;
        int i2 = savedState.f4167g;
        if (i2 > 0) {
            if (i2 == this.f4149s) {
                for (int i3 = 0; i3 < this.f4149s; i3++) {
                    this.f4150t[i3].mo5596c();
                    SavedState savedState2 = this.f4141I;
                    int i4 = savedState2.f4168h[i3];
                    if (i4 != Integer.MIN_VALUE) {
                        if (savedState2.f4173m) {
                            i = this.f4151u.mo5748b();
                        } else {
                            i = this.f4151u.mo5756f();
                        }
                        i4 += i;
                    }
                    this.f4150t[i3].mo5600d(i4);
                }
            } else {
                savedState.mo5576b();
                SavedState savedState3 = this.f4141I;
                savedState3.f4165e = savedState3.f4166f;
            }
        }
        SavedState savedState4 = this.f4141I;
        this.f4140H = savedState4.f4174n;
        mo5551d(savedState4.f4172l);
        m5247R();
        SavedState savedState5 = this.f4141I;
        int i5 = savedState5.f4165e;
        if (i5 != -1) {
            this.f4135C = i5;
            bVar.f4178c = savedState5.f4173m;
        } else {
            bVar.f4178c = this.f4133A;
        }
        SavedState savedState6 = this.f4141I;
        if (savedState6.f4169i > 1) {
            LazySpanLookup lazySpanLookup = this.f4137E;
            lazySpanLookup.f4159a = savedState6.f4170j;
            lazySpanLookup.f4160b = savedState6.f4171k;
        }
    }

    /* renamed from: b */
    public void mo4946b(RecyclerView recyclerView, int i, int i2) {
        m5259b(i, i2, 2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0045 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5259b(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4133A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo5541L()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo5540K()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001b
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001d
        L_0x0016:
            int r2 = r7 + 1
            r3 = r2
            r2 = r8
            goto L_0x001f
        L_0x001b:
            int r2 = r7 + r8
        L_0x001d:
            r3 = r2
            r2 = r7
        L_0x001f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f4137E
            r4.mo5567e(r2)
            r4 = 1
            if (r9 == r4) goto L_0x003e
            r5 = 2
            if (r9 == r5) goto L_0x0038
            if (r9 == r1) goto L_0x002d
            goto L_0x0043
        L_0x002d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4137E
            r9.mo5564b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f4137E
            r7.mo5560a(r8, r4)
            goto L_0x0043
        L_0x0038:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4137E
            r9.mo5564b(r7, r8)
            goto L_0x0043
        L_0x003e:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4137E
            r9.mo5560a(r7, r8)
        L_0x0043:
            if (r3 > r0) goto L_0x0046
            return
        L_0x0046:
            boolean r7 = r6.f4133A
            if (r7 == 0) goto L_0x004f
            int r7 = r6.mo5540K()
            goto L_0x0053
        L_0x004f:
            int r7 = r6.mo5541L()
        L_0x0053:
            if (r2 > r7) goto L_0x0058
            r6.mo5217B()
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5259b(int, int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo5546a(C1082s sVar, C1089b bVar) {
        int i;
        int i2;
        boolean z = false;
        if (!sVar.mo5487d()) {
            int i3 = this.f4135C;
            if (i3 != -1) {
                if (i3 < 0 || i3 >= sVar.mo5482a()) {
                    this.f4135C = -1;
                    this.f4136D = Integer.MIN_VALUE;
                } else {
                    SavedState savedState = this.f4141I;
                    if (savedState == null || savedState.f4165e == -1 || savedState.f4167g < 1) {
                        View b = mo4995b(this.f4135C);
                        if (b != null) {
                            if (this.f4133A) {
                                i = mo5541L();
                            } else {
                                i = mo5540K();
                            }
                            bVar.f4176a = i;
                            if (this.f4136D != Integer.MIN_VALUE) {
                                if (bVar.f4178c) {
                                    bVar.f4177b = (this.f4151u.mo5748b() - this.f4136D) - this.f4151u.mo5746a(b);
                                } else {
                                    bVar.f4177b = (this.f4151u.mo5756f() + this.f4136D) - this.f4151u.mo5753d(b);
                                }
                                return true;
                            } else if (this.f4151u.mo5749b(b) > this.f4151u.mo5758g()) {
                                if (bVar.f4178c) {
                                    i2 = this.f4151u.mo5748b();
                                } else {
                                    i2 = this.f4151u.mo5756f();
                                }
                                bVar.f4177b = i2;
                                return true;
                            } else {
                                int d = this.f4151u.mo5753d(b) - this.f4151u.mo5756f();
                                if (d < 0) {
                                    bVar.f4177b = -d;
                                    return true;
                                }
                                int b2 = this.f4151u.mo5748b() - this.f4151u.mo5746a(b);
                                if (b2 < 0) {
                                    bVar.f4177b = b2;
                                    return true;
                                }
                                bVar.f4177b = Integer.MIN_VALUE;
                            }
                        } else {
                            bVar.f4176a = this.f4135C;
                            int i4 = this.f4136D;
                            if (i4 == Integer.MIN_VALUE) {
                                if (m5270l(bVar.f4176a) == 1) {
                                    z = true;
                                }
                                bVar.f4178c = z;
                                bVar.mo5582a();
                            } else {
                                bVar.mo5583a(i4);
                            }
                            bVar.f4179d = true;
                        }
                    } else {
                        bVar.f4177b = Integer.MIN_VALUE;
                        bVar.f4176a = this.f4135C;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m5261b(C1079p pVar, int i) {
        while (mo5278e() > 0) {
            View c = mo5265c(0);
            if (this.f4151u.mo5746a(c) > i || this.f4151u.mo5755e(c) > i) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
            if (layoutParams.f4158f) {
                int i2 = 0;
                while (i2 < this.f4149s) {
                    if (this.f4150t[i2].f4183a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f4149s; i3++) {
                    this.f4150t[i3].mo5607k();
                }
            } else if (layoutParams.f4157e.f4183a.size() != 1) {
                layoutParams.f4157e.mo5607k();
            } else {
                return;
            }
            mo5259b(c, pVar);
        }
    }

    /* renamed from: b */
    public boolean mo4999b() {
        return this.f4153w == 1;
    }

    /* renamed from: b */
    public int mo4943b(int i, C1079p pVar, C1082s sVar) {
        return mo5549c(i, pVar, sVar);
    }

    /* renamed from: c */
    private boolean m5265c(C1082s sVar, C1089b bVar) {
        int i;
        if (this.f4139G) {
            i = m5276q(sVar.mo5482a());
        } else {
            i = m5274p(sVar.mo5482a());
        }
        bVar.f4176a = i;
        bVar.f4177b = Integer.MIN_VALUE;
        return true;
    }

    /* renamed from: c */
    public int mo4947c(C1082s sVar) {
        return m5269j(sVar);
    }

    /* renamed from: c */
    private int m5263c(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return MeasureSpec.makeMeasureSpec(Math.max(0, (MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public View mo5550c(boolean z) {
        int f = this.f4151u.mo5756f();
        int b = this.f4151u.mo5748b();
        int e = mo5278e();
        View view = null;
        for (int i = 0; i < e; i++) {
            View c = mo5265c(i);
            int d = this.f4151u.mo5753d(c);
            if (this.f4151u.mo5746a(c) > f && d < b) {
                if (d >= f || !z) {
                    return c;
                }
                if (view == null) {
                    view = c;
                }
            }
        }
        return view;
    }

    /* renamed from: a */
    public int mo4984a(C1082s sVar) {
        return m5267h(sVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public int mo5549c(int i, C1079p pVar, C1082s sVar) {
        if (mo5278e() == 0 || i == 0) {
            return 0;
        }
        mo5545a(i, sVar);
        int a = m5248a(pVar, this.f4155y, sVar);
        if (this.f4155y.f4335b >= a) {
            i = i < 0 ? -a : a;
        }
        this.f4151u.mo5747a(-i);
        this.f4139G = this.f4133A;
        C1130k kVar = this.f4155y;
        kVar.f4335b = 0;
        m5255a(pVar, kVar);
        return i;
    }

    /* renamed from: a */
    private void m5252a(View view, LayoutParams layoutParams, boolean z) {
        if (layoutParams.f4158f) {
            if (this.f4153w == 1) {
                m5250a(view, this.f4142J, LayoutManager.m4968a(mo5289h(), mo5291i(), mo5308s() + mo5301n(), layoutParams.height, true), z);
            } else {
                m5250a(view, LayoutManager.m4968a(mo5309t(), mo5310u(), mo5305p() + mo5306q(), layoutParams.width, true), this.f4142J, z);
            }
        } else if (this.f4153w == 1) {
            m5250a(view, LayoutManager.m4968a(this.f4154x, mo5310u(), 0, layoutParams.width, false), LayoutManager.m4968a(mo5289h(), mo5291i(), mo5308s() + mo5301n(), layoutParams.height, true), z);
        } else {
            m5250a(view, LayoutManager.m4968a(mo5309t(), mo5310u(), mo5305p() + mo5306q(), layoutParams.width, true), LayoutManager.m4968a(this.f4154x, mo5291i(), 0, layoutParams.height, false), z);
        }
    }

    /* renamed from: c */
    public androidx.recyclerview.widget.RecyclerView.LayoutParams mo4948c() {
        if (this.f4153w == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    /* renamed from: a */
    private void m5250a(View view, int i, int i2, boolean z) {
        boolean z2;
        mo5228a(view, this.f4143K);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        Rect rect = this.f4143K;
        int c = m5263c(i, i3 + rect.left, layoutParams.rightMargin + rect.right);
        int i4 = layoutParams.topMargin;
        Rect rect2 = this.f4143K;
        int c2 = m5263c(i2, i4 + rect2.top, layoutParams.bottomMargin + rect2.bottom);
        if (z) {
            z2 = mo5263b(view, c, c2, layoutParams);
        } else {
            z2 = mo5243a(view, c, c2, (androidx.recyclerview.widget.RecyclerView.LayoutParams) layoutParams);
        }
        if (z2) {
            view.measure(c, c2);
        }
    }

    /* renamed from: a */
    public void mo4989a(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.f4141I = (SavedState) parcelable;
            mo5217B();
        }
    }

    /* renamed from: a */
    public void mo4936a(C1079p pVar, C1082s sVar, View view, C0628c cVar) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            super.mo5229a(view, cVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        if (this.f4153w == 0) {
            cVar.mo3331b((Object) C0631c.m2982a(layoutParams2.mo5555e(), layoutParams2.f4158f ? this.f4149s : 1, -1, -1, false, false));
        } else {
            cVar.mo3331b((Object) C0631c.m2982a(-1, -1, layoutParams2.mo5555e(), layoutParams2.f4158f ? this.f4149s : 1, false, false));
        }
    }

    /* renamed from: a */
    public void mo4990a(AccessibilityEvent accessibilityEvent) {
        super.mo4990a(accessibilityEvent);
        if (mo5278e() > 0) {
            View c = mo5550c(false);
            View b = mo5547b(false);
            if (c != null && b != null) {
                int l = mo5298l(c);
                int l2 = mo5298l(b);
                if (l < l2) {
                    accessibilityEvent.setFromIndex(l);
                    accessibilityEvent.setToIndex(l2);
                    return;
                }
                accessibilityEvent.setFromIndex(l2);
                accessibilityEvent.setToIndex(l);
            }
        }
    }

    /* renamed from: a */
    public int mo4930a(C1079p pVar, C1082s sVar) {
        if (this.f4153w == 1) {
            return this.f4149s;
        }
        return super.mo4930a(pVar, sVar);
    }

    /* renamed from: a */
    private void m5254a(C1079p pVar, C1082s sVar, boolean z) {
        int r = m5278r(Integer.MIN_VALUE);
        if (r != Integer.MIN_VALUE) {
            int b = this.f4151u.mo5748b() - r;
            if (b > 0) {
                int i = b - (-mo5549c(-b, pVar, sVar));
                if (z && i > 0) {
                    this.f4151u.mo5747a(i);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4939a(RecyclerView recyclerView, int i, int i2) {
        m5259b(i, i2, 1);
    }

    /* renamed from: a */
    public void mo4940a(RecyclerView recyclerView, int i, int i2, int i3) {
        m5259b(i, i2, 8);
    }

    /* renamed from: a */
    public void mo4941a(RecyclerView recyclerView, int i, int i2, Object obj) {
        m5259b(i, i2, 4);
    }

    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: type inference failed for: r9v10 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r9v1, types: [boolean, int]
      assigns: []
      uses: [boolean, int, ?[int, short, byte, char]]
      mth insns count: 222
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m5248a(androidx.recyclerview.widget.RecyclerView.C1079p r17, androidx.recyclerview.widget.C1130k r18, androidx.recyclerview.widget.RecyclerView.C1082s r19) {
        /*
            r16 = this;
            r6 = r16
            r7 = r17
            r8 = r18
            java.util.BitSet r0 = r6.f4134B
            int r1 = r6.f4149s
            r9 = 0
            r10 = 1
            r0.set(r9, r1, r10)
            androidx.recyclerview.widget.k r0 = r6.f4155y
            boolean r0 = r0.f4342i
            if (r0 == 0) goto L_0x0025
            int r0 = r8.f4338e
            if (r0 != r10) goto L_0x0020
            r0 = 2147483647(0x7fffffff, float:NaN)
            r11 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0035
        L_0x0020:
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0035
        L_0x0025:
            int r0 = r8.f4338e
            if (r0 != r10) goto L_0x002f
            int r0 = r8.f4340g
            int r1 = r8.f4335b
            int r0 = r0 + r1
            goto L_0x0034
        L_0x002f:
            int r0 = r8.f4339f
            int r1 = r8.f4335b
            int r0 = r0 - r1
        L_0x0034:
            r11 = r0
        L_0x0035:
            int r0 = r8.f4338e
            r6.m5266e(r0, r11)
            boolean r0 = r6.f4133A
            if (r0 == 0) goto L_0x0045
            androidx.recyclerview.widget.o r0 = r6.f4151u
            int r0 = r0.mo5748b()
            goto L_0x004b
        L_0x0045:
            androidx.recyclerview.widget.o r0 = r6.f4151u
            int r0 = r0.mo5756f()
        L_0x004b:
            r12 = r0
            r0 = 0
        L_0x004d:
            boolean r1 = r18.mo5728a(r19)
            r2 = -1
            if (r1 == 0) goto L_0x01ce
            androidx.recyclerview.widget.k r1 = r6.f4155y
            boolean r1 = r1.f4342i
            if (r1 != 0) goto L_0x0062
            java.util.BitSet r1 = r6.f4134B
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x01ce
        L_0x0062:
            android.view.View r13 = r8.mo5727a(r7)
            android.view.ViewGroup$LayoutParams r0 = r13.getLayoutParams()
            r14 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r14 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r14
            int r0 = r14.mo5321a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.f4137E
            int r1 = r1.mo5566d(r0)
            if (r1 != r2) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 0
        L_0x007c:
            if (r3 == 0) goto L_0x0091
            boolean r1 = r14.f4158f
            if (r1 == 0) goto L_0x0087
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r1 = r6.f4150t
            r1 = r1[r9]
            goto L_0x008b
        L_0x0087:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r1 = r6.m5249a(r8)
        L_0x008b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f4137E
            r4.mo5561a(r0, r1)
            goto L_0x0095
        L_0x0091:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r4 = r6.f4150t
            r1 = r4[r1]
        L_0x0095:
            r15 = r1
            r14.f4157e = r15
            int r1 = r8.f4338e
            if (r1 != r10) goto L_0x00a0
            r6.mo5255b(r13)
            goto L_0x00a3
        L_0x00a0:
            r6.mo5256b(r13, r9)
        L_0x00a3:
            r6.m5252a(r13, r14, r9)
            int r1 = r8.f4338e
            if (r1 != r10) goto L_0x00d4
            boolean r1 = r14.f4158f
            if (r1 == 0) goto L_0x00b3
            int r1 = r6.m5278r(r12)
            goto L_0x00b7
        L_0x00b3:
            int r1 = r15.mo5586a(r12)
        L_0x00b7:
            androidx.recyclerview.widget.o r4 = r6.f4151u
            int r4 = r4.mo5749b(r13)
            int r4 = r4 + r1
            if (r3 == 0) goto L_0x00d1
            boolean r5 = r14.f4158f
            if (r5 == 0) goto L_0x00d1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r6.m5272n(r1)
            r5.f4162f = r2
            r5.f4161e = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4137E
            r9.mo5562a(r5)
        L_0x00d1:
            r5 = r4
            r4 = r1
            goto L_0x00fd
        L_0x00d4:
            boolean r1 = r14.f4158f
            if (r1 == 0) goto L_0x00dd
            int r1 = r6.m5281u(r12)
            goto L_0x00e1
        L_0x00dd:
            int r1 = r15.mo5593b(r12)
        L_0x00e1:
            androidx.recyclerview.widget.o r4 = r6.f4151u
            int r4 = r4.mo5749b(r13)
            int r4 = r1 - r4
            if (r3 == 0) goto L_0x00fc
            boolean r5 = r14.f4158f
            if (r5 == 0) goto L_0x00fc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r6.m5273o(r1)
            r5.f4162f = r10
            r5.f4161e = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4137E
            r9.mo5562a(r5)
        L_0x00fc:
            r5 = r1
        L_0x00fd:
            boolean r1 = r14.f4158f
            if (r1 == 0) goto L_0x0126
            int r1 = r8.f4337d
            if (r1 != r2) goto L_0x0126
            if (r3 == 0) goto L_0x010a
            r6.f4145M = r10
            goto L_0x0126
        L_0x010a:
            int r1 = r8.f4338e
            if (r1 != r10) goto L_0x0113
            boolean r1 = r16.mo5536G()
            goto L_0x0117
        L_0x0113:
            boolean r1 = r16.mo5537H()
        L_0x0117:
            r1 = r1 ^ r10
            if (r1 == 0) goto L_0x0126
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r1 = r6.f4137E
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r1.mo5565c(r0)
            if (r0 == 0) goto L_0x0124
            r0.f4164h = r10
        L_0x0124:
            r6.f4145M = r10
        L_0x0126:
            r6.m5251a(r13, r14, r8)
            boolean r0 = r16.mo5544O()
            if (r0 == 0) goto L_0x015a
            int r0 = r6.f4153w
            if (r0 != r10) goto L_0x015a
            boolean r0 = r14.f4158f
            if (r0 == 0) goto L_0x013e
            androidx.recyclerview.widget.o r0 = r6.f4152v
            int r0 = r0.mo5748b()
            goto L_0x014f
        L_0x013e:
            androidx.recyclerview.widget.o r0 = r6.f4152v
            int r0 = r0.mo5748b()
            int r1 = r6.f4149s
            int r1 = r1 - r10
            int r2 = r15.f4187e
            int r1 = r1 - r2
            int r2 = r6.f4154x
            int r1 = r1 * r2
            int r0 = r0 - r1
        L_0x014f:
            androidx.recyclerview.widget.o r1 = r6.f4152v
            int r1 = r1.mo5749b(r13)
            int r1 = r0 - r1
            r9 = r0
            r3 = r1
            goto L_0x017b
        L_0x015a:
            boolean r0 = r14.f4158f
            if (r0 == 0) goto L_0x0165
            androidx.recyclerview.widget.o r0 = r6.f4152v
            int r0 = r0.mo5756f()
            goto L_0x0172
        L_0x0165:
            int r0 = r15.f4187e
            int r1 = r6.f4154x
            int r0 = r0 * r1
            androidx.recyclerview.widget.o r1 = r6.f4152v
            int r1 = r1.mo5756f()
            int r0 = r0 + r1
        L_0x0172:
            androidx.recyclerview.widget.o r1 = r6.f4152v
            int r1 = r1.mo5749b(r13)
            int r1 = r1 + r0
            r3 = r0
            r9 = r1
        L_0x017b:
            int r0 = r6.f4153w
            if (r0 != r10) goto L_0x0189
            r0 = r16
            r1 = r13
            r2 = r3
            r3 = r4
            r4 = r9
            r0.mo5257b(r1, r2, r3, r4, r5)
            goto L_0x0192
        L_0x0189:
            r0 = r16
            r1 = r13
            r2 = r4
            r4 = r5
            r5 = r9
            r0.mo5257b(r1, r2, r3, r4, r5)
        L_0x0192:
            boolean r0 = r14.f4158f
            if (r0 == 0) goto L_0x019e
            androidx.recyclerview.widget.k r0 = r6.f4155y
            int r0 = r0.f4338e
            r6.m5266e(r0, r11)
            goto L_0x01a5
        L_0x019e:
            androidx.recyclerview.widget.k r0 = r6.f4155y
            int r0 = r0.f4338e
            r6.m5257a(r15, r0, r11)
        L_0x01a5:
            androidx.recyclerview.widget.k r0 = r6.f4155y
            r6.m5255a(r7, r0)
            androidx.recyclerview.widget.k r0 = r6.f4155y
            boolean r0 = r0.f4341h
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r13.hasFocusable()
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r14.f4158f
            if (r0 == 0) goto L_0x01c0
            java.util.BitSet r0 = r6.f4134B
            r0.clear()
            goto L_0x01c9
        L_0x01c0:
            java.util.BitSet r0 = r6.f4134B
            int r1 = r15.f4187e
            r3 = 0
            r0.set(r1, r3)
            goto L_0x01ca
        L_0x01c9:
            r3 = 0
        L_0x01ca:
            r0 = 1
            r9 = 0
            goto L_0x004d
        L_0x01ce:
            r3 = 0
            if (r0 != 0) goto L_0x01d6
            androidx.recyclerview.widget.k r0 = r6.f4155y
            r6.m5255a(r7, r0)
        L_0x01d6:
            androidx.recyclerview.widget.k r0 = r6.f4155y
            int r0 = r0.f4338e
            if (r0 != r2) goto L_0x01ee
            androidx.recyclerview.widget.o r0 = r6.f4151u
            int r0 = r0.mo5756f()
            int r0 = r6.m5281u(r0)
            androidx.recyclerview.widget.o r1 = r6.f4151u
            int r1 = r1.mo5756f()
            int r1 = r1 - r0
            goto L_0x0200
        L_0x01ee:
            androidx.recyclerview.widget.o r0 = r6.f4151u
            int r0 = r0.mo5748b()
            int r0 = r6.m5278r(r0)
            androidx.recyclerview.widget.o r1 = r6.f4151u
            int r1 = r1.mo5748b()
            int r1 = r0 - r1
        L_0x0200:
            if (r1 <= 0) goto L_0x0209
            int r0 = r8.f4335b
            int r9 = java.lang.Math.min(r0, r1)
            r3 = r9
        L_0x0209:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.m5248a(androidx.recyclerview.widget.RecyclerView$p, androidx.recyclerview.widget.k, androidx.recyclerview.widget.RecyclerView$s):int");
    }

    /* renamed from: a */
    private void m5251a(View view, LayoutParams layoutParams, C1130k kVar) {
        if (kVar.f4338e == 1) {
            if (layoutParams.f4158f) {
                m5275p(view);
            } else {
                layoutParams.f4157e.mo5591a(view);
            }
        } else if (layoutParams.f4158f) {
            m5277q(view);
        } else {
            layoutParams.f4157e.mo5598c(view);
        }
    }

    /* renamed from: a */
    private void m5255a(C1079p pVar, C1130k kVar) {
        int i;
        int i2;
        if (kVar.f4334a && !kVar.f4342i) {
            if (kVar.f4335b == 0) {
                if (kVar.f4338e == -1) {
                    m5253a(pVar, kVar.f4340g);
                } else {
                    m5261b(pVar, kVar.f4339f);
                }
            } else if (kVar.f4338e == -1) {
                int i3 = kVar.f4339f;
                int s = i3 - m5279s(i3);
                if (s < 0) {
                    i2 = kVar.f4340g;
                } else {
                    i2 = kVar.f4340g - Math.min(s, kVar.f4335b);
                }
                m5253a(pVar, i2);
            } else {
                int t = m5280t(kVar.f4340g) - kVar.f4340g;
                if (t < 0) {
                    i = kVar.f4339f;
                } else {
                    i = Math.min(t, kVar.f4335b) + kVar.f4339f;
                }
                m5261b(pVar, i);
            }
        }
    }

    /* renamed from: a */
    private void m5257a(C1090c cVar, int i, int i2) {
        int f = cVar.mo5602f();
        if (i == -1) {
            if (cVar.mo5604h() + f <= i2) {
                this.f4134B.set(cVar.f4187e, false);
            }
        } else if (cVar.mo5603g() - f >= i2) {
            this.f4134B.set(cVar.f4187e, false);
        }
    }

    /* renamed from: a */
    private void m5253a(C1079p pVar, int i) {
        for (int e = mo5278e() - 1; e >= 0; e--) {
            View c = mo5265c(e);
            if (this.f4151u.mo5753d(c) < i || this.f4151u.mo5757f(c) < i) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
            if (layoutParams.f4158f) {
                int i2 = 0;
                while (i2 < this.f4149s) {
                    if (this.f4150t[i2].f4183a.size() != 1) {
                        i2++;
                    } else {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.f4149s; i3++) {
                    this.f4150t[i3].mo5606j();
                }
            } else if (layoutParams.f4157e.f4183a.size() != 1) {
                layoutParams.f4157e.mo5606j();
            } else {
                return;
            }
            mo5259b(c, pVar);
        }
    }

    /* renamed from: a */
    private C1090c m5249a(C1130k kVar) {
        int i;
        int i2;
        int i3 = -1;
        if (m5282v(kVar.f4338e)) {
            i2 = this.f4149s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.f4149s;
            i = 1;
        }
        C1090c cVar = null;
        if (kVar.f4338e == 1) {
            int i4 = Integer.MAX_VALUE;
            int f = this.f4151u.mo5756f();
            while (i2 != i3) {
                C1090c cVar2 = this.f4150t[i2];
                int a = cVar2.mo5586a(f);
                if (a < i4) {
                    cVar = cVar2;
                    i4 = a;
                }
                i2 += i;
            }
            return cVar;
        }
        int i5 = Integer.MIN_VALUE;
        int b = this.f4151u.mo5748b();
        while (i2 != i3) {
            C1090c cVar3 = this.f4150t[i2];
            int b2 = cVar3.mo5593b(b);
            if (b2 > i5) {
                cVar = cVar3;
                i5 = b2;
            }
            i2 += i;
        }
        return cVar;
    }

    /* renamed from: a */
    public boolean mo4994a() {
        return this.f4153w == 0;
    }

    /* renamed from: a */
    public int mo4929a(int i, C1079p pVar, C1082s sVar) {
        return mo5549c(i, pVar, sVar);
    }

    /* renamed from: a */
    public void mo4992a(RecyclerView recyclerView, C1082s sVar, int i) {
        C1131l lVar = new C1131l(recyclerView.getContext());
        lVar.setTargetPosition(i);
        mo5260b((SmoothScroller) lVar);
    }

    /* renamed from: a */
    public void mo4987a(int i, int i2, C1082s sVar, LayoutPrefetchRegistry layoutPrefetchRegistry) {
        int i3;
        int i4;
        if (this.f4153w != 0) {
            i = i2;
        }
        if (mo5278e() != 0 && i != 0) {
            mo5545a(i, sVar);
            int[] iArr = this.f4147O;
            if (iArr == null || iArr.length < this.f4149s) {
                this.f4147O = new int[this.f4149s];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f4149s; i6++) {
                C1130k kVar = this.f4155y;
                if (kVar.f4337d == -1) {
                    i4 = kVar.f4339f;
                    i3 = this.f4150t[i6].mo5593b(i4);
                } else {
                    i4 = this.f4150t[i6].mo5586a(kVar.f4340g);
                    i3 = this.f4155y.f4340g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f4147O[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f4147O, 0, i5);
            for (int i8 = 0; i8 < i5 && this.f4155y.mo5728a(sVar); i8++) {
                layoutPrefetchRegistry.addPosition(this.f4155y.f4336c, this.f4147O[i8]);
                C1130k kVar2 = this.f4155y;
                kVar2.f4336c += kVar2.f4337d;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo5545a(int i, C1082s sVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo5541L();
            i2 = 1;
        } else {
            i3 = mo5540K();
            i2 = -1;
        }
        this.f4155y.f4334a = true;
        m5260b(i3, sVar);
        m5283w(i2);
        C1130k kVar = this.f4155y;
        kVar.f4336c = i3 + kVar.f4337d;
        kVar.f4335b = Math.abs(i);
    }

    /* renamed from: a */
    public androidx.recyclerview.widget.RecyclerView.LayoutParams mo4933a(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: a */
    public androidx.recyclerview.widget.RecyclerView.LayoutParams mo4934a(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof MarginLayoutParams) {
            return new LayoutParams((MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    /* renamed from: a */
    public boolean mo4942a(androidx.recyclerview.widget.RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: a */
    public View mo4931a(View view, int i, C1079p pVar, C1082s sVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (mo5278e() == 0) {
            return null;
        }
        View c = mo5266c(view);
        if (c == null) {
            return null;
        }
        m5247R();
        int m = m5271m(i);
        if (m == Integer.MIN_VALUE) {
            return null;
        }
        LayoutParams layoutParams = (LayoutParams) c.getLayoutParams();
        boolean z = layoutParams.f4158f;
        C1090c cVar = layoutParams.f4157e;
        if (m == 1) {
            i2 = mo5541L();
        } else {
            i2 = mo5540K();
        }
        m5260b(i2, sVar);
        m5283w(m);
        C1130k kVar = this.f4155y;
        kVar.f4336c = kVar.f4337d + i2;
        kVar.f4335b = (int) (((float) this.f4151u.mo5758g()) * 0.33333334f);
        C1130k kVar2 = this.f4155y;
        kVar2.f4341h = true;
        kVar2.f4334a = false;
        m5248a(pVar, kVar2, sVar);
        this.f4139G = this.f4133A;
        if (!z) {
            View a = cVar.mo5589a(i2, m);
            if (!(a == null || a == c)) {
                return a;
            }
        }
        if (m5282v(m)) {
            for (int i6 = this.f4149s - 1; i6 >= 0; i6--) {
                View a2 = this.f4150t[i6].mo5589a(i2, m);
                if (a2 != null && a2 != c) {
                    return a2;
                }
            }
        } else {
            for (int i7 = 0; i7 < this.f4149s; i7++) {
                View a3 = this.f4150t[i7].mo5589a(i2, m);
                if (a3 != null && a3 != c) {
                    return a3;
                }
            }
        }
        boolean z2 = (this.f4156z ^ true) == (m == -1);
        if (!z) {
            if (z2) {
                i5 = cVar.mo5599d();
            } else {
                i5 = cVar.mo5601e();
            }
            View b = mo4995b(i5);
            if (!(b == null || b == c)) {
                return b;
            }
        }
        if (m5282v(m)) {
            for (int i8 = this.f4149s - 1; i8 >= 0; i8--) {
                if (i8 != cVar.f4187e) {
                    if (z2) {
                        i4 = this.f4150t[i8].mo5599d();
                    } else {
                        i4 = this.f4150t[i8].mo5601e();
                    }
                    View b2 = mo4995b(i4);
                    if (!(b2 == null || b2 == c)) {
                        return b2;
                    }
                }
            }
        } else {
            for (int i9 = 0; i9 < this.f4149s; i9++) {
                if (z2) {
                    i3 = this.f4150t[i9].mo5599d();
                } else {
                    i3 = this.f4150t[i9].mo5601e();
                }
                View b3 = mo4995b(i3);
                if (b3 != null && b3 != c) {
                    return b3;
                }
            }
        }
        return null;
    }
}
