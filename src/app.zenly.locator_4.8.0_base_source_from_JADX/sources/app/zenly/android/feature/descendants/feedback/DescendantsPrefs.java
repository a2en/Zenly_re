package app.zenly.android.feature.descendants.feedback;

import p389io.reactivex.C12279e;
import p389io.reactivex.disposables.Disposable;

public interface DescendantsPrefs {

    /* renamed from: app.zenly.android.feature.descendants.feedback.DescendantsPrefs$a */
    public static final class C1379a {

        /* renamed from: a */
        private final int f5029a;

        /* renamed from: b */
        private final int f5030b;

        /* renamed from: c */
        private final int f5031c;

        /* renamed from: d */
        private final long f5032d;

        public C1379a() {
            this(0, 0, 0, 0, 15, null);
        }

        public C1379a(int i, int i2, int i3, long j) {
            this.f5029a = i;
            this.f5030b = i2;
            this.f5031c = i3;
            this.f5032d = j;
        }

        /* renamed from: a */
        public static /* synthetic */ C1379a m6420a(C1379a aVar, int i, int i2, int i3, long j, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = aVar.f5029a;
            }
            if ((i4 & 2) != 0) {
                i2 = aVar.f5030b;
            }
            int i5 = i2;
            if ((i4 & 4) != 0) {
                i3 = aVar.f5031c;
            }
            int i6 = i3;
            if ((i4 & 8) != 0) {
                j = aVar.f5032d;
            }
            return aVar.mo6639a(i, i5, i6, j);
        }

        /* renamed from: a */
        public final int mo6638a() {
            return this.f5029a;
        }

        /* renamed from: a */
        public final C1379a mo6639a(int i, int i2, int i3, long j) {
            C1379a aVar = new C1379a(i, i2, i3, j);
            return aVar;
        }

        /* renamed from: b */
        public final int mo6640b() {
            return this.f5030b;
        }

        /* renamed from: c */
        public final int mo6641c() {
            return this.f5031c;
        }

        /* renamed from: d */
        public final long mo6642d() {
            return this.f5032d;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof C1379a) {
                    C1379a aVar = (C1379a) obj;
                    if (this.f5029a == aVar.f5029a) {
                        if (this.f5030b == aVar.f5030b) {
                            if (this.f5031c == aVar.f5031c) {
                                if (this.f5032d == aVar.f5032d) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = ((((this.f5029a * 31) + this.f5030b) * 31) + this.f5031c) * 31;
            long j = this.f5032d;
            return i + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Preferences(count=");
            sb.append(this.f5029a);
            sb.append(", hintFlags=");
            sb.append(this.f5030b);
            sb.append(", lastSeenLevelThreshold=");
            sb.append(this.f5031c);
            sb.append(", newDescendantsLastSeenDate=");
            sb.append(this.f5032d);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ C1379a(int i, int i2, int i3, long j, int i4, C12928f fVar) {
            int i5 = 0;
            int i6 = (i4 & 1) != 0 ? 0 : i;
            int i7 = (i4 & 2) != 0 ? 0 : i2;
            if ((i4 & 4) == 0) {
                i5 = i3;
            }
            if ((i4 & 8) != 0) {
                j = 0;
            }
            this(i6, i7, i5, j);
        }
    }

    Disposable bind();

    C1379a getAllPreferences();

    C12279e<Integer> getNewDescendantsCount();

    C12279e<C1379a> observeAllPreferences();

    void setCount(int i, int i2);

    void setHintFlags(int i);

    void setLastSeenLevelThreshold(int i);

    void setNewDescendantsLastSeenDate(long j);
}
