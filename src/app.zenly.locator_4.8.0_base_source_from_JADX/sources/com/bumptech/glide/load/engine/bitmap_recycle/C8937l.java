package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.os.Build.VERSION;
import com.bumptech.glide.p301o.C9217k;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.l */
public class C8937l implements C8935j {

    /* renamed from: d */
    private static final Config[] f23277d;

    /* renamed from: e */
    private static final Config[] f23278e = f23277d;

    /* renamed from: f */
    private static final Config[] f23279f = {Config.RGB_565};

    /* renamed from: g */
    private static final Config[] f23280g = {Config.ARGB_4444};

    /* renamed from: h */
    private static final Config[] f23281h = {Config.ALPHA_8};

    /* renamed from: a */
    private final C8940c f23282a = new C8940c();

    /* renamed from: b */
    private final C8926f<C8939b, Bitmap> f23283b = new C8926f<>();

    /* renamed from: c */
    private final Map<Config, NavigableMap<Integer, Integer>> f23284c = new HashMap();

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.l$a */
    static /* synthetic */ class C8938a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23285a = new int[Config.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f23285a = r0
                int[] r0 = f23285a     // Catch:{ NoSuchFieldError -> 0x0014 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f23285a     // Catch:{ NoSuchFieldError -> 0x001f }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f23285a     // Catch:{ NoSuchFieldError -> 0x002a }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f23285a     // Catch:{ NoSuchFieldError -> 0x0035 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.bitmap_recycle.C8937l.C8938a.<clinit>():void");
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.l$b */
    static final class C8939b implements C8936k {

        /* renamed from: a */
        private final C8940c f23286a;

        /* renamed from: b */
        int f23287b;

        /* renamed from: c */
        private Config f23288c;

        public C8939b(C8940c cVar) {
            this.f23286a = cVar;
        }

        /* renamed from: a */
        public void mo24359a(int i, Config config) {
            this.f23287b = i;
            this.f23288c = config;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C8939b)) {
                return false;
            }
            C8939b bVar = (C8939b) obj;
            if (this.f23287b != bVar.f23287b || !C9217k.m22105b((Object) this.f23288c, (Object) bVar.f23288c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i = this.f23287b * 31;
            Config config = this.f23288c;
            return i + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return C8937l.m21476b(this.f23287b, this.f23288c);
        }

        /* renamed from: a */
        public void mo24333a() {
            this.f23286a.mo24340a(this);
        }
    }

    /* renamed from: com.bumptech.glide.load.engine.bitmap_recycle.l$c */
    static class C8940c extends C8923c<C8939b> {
        C8940c() {
        }

        /* renamed from: a */
        public C8939b mo24363a(int i, Config config) {
            C8939b bVar = (C8939b) mo24341b();
            bVar.mo24359a(i, config);
            return bVar;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C8939b m21484a() {
            return new C8939b(this);
        }
    }

    static {
        Config[] configArr = {Config.ARGB_8888, null};
        if (VERSION.SDK_INT >= 26) {
            configArr = (Config[]) Arrays.copyOf(configArr, configArr.length + 1);
            configArr[configArr.length - 1] = Config.RGBA_F16;
        }
        f23277d = configArr;
    }

    /* renamed from: a */
    private C8939b m21473a(int i, Config config) {
        C8939b a = this.f23282a.mo24363a(i, config);
        Config[] a2 = m21475a(config);
        int length = a2.length;
        int i2 = 0;
        while (i2 < length) {
            Config config2 = a2[i2];
            Integer num = (Integer) m21477b(config2).ceilingKey(Integer.valueOf(i));
            if (num == null || num.intValue() > i * 8) {
                i2++;
            } else {
                if (num.intValue() == i) {
                    if (config2 == null) {
                        if (config == null) {
                            return a;
                        }
                    } else if (config2.equals(config)) {
                        return a;
                    }
                }
                this.f23282a.mo24340a(a);
                return this.f23282a.mo24363a(num.intValue(), config2);
            }
        }
        return a;
    }

    /* renamed from: b */
    private NavigableMap<Integer, Integer> m21477b(Config config) {
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) this.f23284c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f23284c.put(config, treeMap);
        return treeMap;
    }

    public Bitmap get(int i, int i2, Config config) {
        C8939b a = m21473a(C9217k.m22091a(i, i2, config), config);
        Bitmap bitmap = (Bitmap) this.f23283b.mo24344a(a);
        if (bitmap != null) {
            m21474a(Integer.valueOf(a.f23287b), bitmap);
            bitmap.reconfigure(i, i2, config);
        }
        return bitmap;
    }

    public void put(Bitmap bitmap) {
        C8939b a = this.f23282a.mo24363a(C9217k.m22093a(bitmap), bitmap.getConfig());
        this.f23283b.mo24345a(a, bitmap);
        NavigableMap b = m21477b(bitmap.getConfig());
        Integer num = (Integer) b.get(Integer.valueOf(a.f23287b));
        Integer valueOf = Integer.valueOf(a.f23287b);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        b.put(valueOf, Integer.valueOf(i));
    }

    public Bitmap removeLast() {
        Bitmap bitmap = (Bitmap) this.f23283b.mo24343a();
        if (bitmap != null) {
            m21474a(Integer.valueOf(C9217k.m22093a(bitmap)), bitmap);
        }
        return bitmap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.f23283b);
        sb.append(", sortedSizes=(");
        for (Entry entry : this.f23284c.entrySet()) {
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!this.f23284c.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }

    /* renamed from: b */
    public int mo24328b(Bitmap bitmap) {
        return C9217k.m22093a(bitmap);
    }

    /* renamed from: b */
    static String m21476b(int i, Config config) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(i);
        sb.append("](");
        sb.append(config);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: a */
    private void m21474a(Integer num, Bitmap bitmap) {
        NavigableMap b = m21477b(bitmap.getConfig());
        Integer num2 = (Integer) b.get(num);
        if (num2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tried to decrement empty size, size: ");
            sb.append(num);
            sb.append(", removed: ");
            sb.append(mo24327a(bitmap));
            sb.append(", this: ");
            sb.append(this);
            throw new NullPointerException(sb.toString());
        } else if (num2.intValue() == 1) {
            b.remove(num);
        } else {
            b.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    /* renamed from: a */
    public String mo24327a(Bitmap bitmap) {
        return m21476b(C9217k.m22093a(bitmap), bitmap.getConfig());
    }

    /* renamed from: a */
    public String mo24326a(int i, int i2, Config config) {
        return m21476b(C9217k.m22091a(i, i2, config), config);
    }

    /* renamed from: a */
    private static Config[] m21475a(Config config) {
        if (VERSION.SDK_INT >= 26 && Config.RGBA_F16.equals(config)) {
            return f23278e;
        }
        int i = C8938a.f23285a[config.ordinal()];
        if (i == 1) {
            return f23277d;
        }
        if (i == 2) {
            return f23279f;
        }
        if (i == 3) {
            return f23280g;
        }
        if (i == 4) {
            return f23281h;
        }
        return new Config[]{config};
    }
}
