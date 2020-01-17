package p213co.znly.cardgenerator;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaExtractor;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: co.znly.cardgenerator.CardGenerator */
public class CardGenerator {

    /* renamed from: a */
    Context f15903a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public int f15904b = 800;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f15905c = 600;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public int f15906d = 30;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public int f15907e = 4000000;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f15908f = 0;

    /* renamed from: co.znly.cardgenerator.CardGenerator$CardGeneratorProgress */
    public interface CardGeneratorProgress {
        void onError(Throwable th);

        void onFinish(File file);

        void onProgress(float f);
    }

    /* renamed from: co.znly.cardgenerator.CardGenerator$a */
    protected class C6349a extends AsyncTask<Void, Float, File> {

        /* renamed from: a */
        private Context f15909a;

        /* renamed from: b */
        private CardGeneratorProgress f15910b;

        /* renamed from: c */
        private final C6354c f15911c;

        /* renamed from: d */
        private Player f15912d;

        /* renamed from: e */
        private MagnumContext f15913e;

        /* renamed from: f */
        private String f15914f;

        /* renamed from: g */
        private String[][] f15915g;

        /* renamed from: h */
        private File f15916h;

        /* renamed from: i */
        private Throwable f15917i;

        public C6349a(Context context, String str, String str2, String[][] strArr, File file, CardGeneratorProgress cardGeneratorProgress) {
            this.f15909a = context;
            this.f15914f = str;
            this.f15915g = strArr;
            this.f15910b = cardGeneratorProgress;
            this.f15916h = file;
            C6354c cVar = new C6354c(CardGenerator.this.f15904b, CardGenerator.this.f15905c, this.f15916h.getAbsolutePath(), CardGenerator.this.f15906d, CardGenerator.this.f15907e);
            this.f15911c = cVar;
            if (str2 != null) {
                try {
                    AssetFileDescriptor openFd = this.f15909a.getAssets().openFd(str2);
                    MediaExtractor mediaExtractor = new MediaExtractor();
                    mediaExtractor.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                    this.f15911c.mo14227a().mo14220a(mediaExtractor);
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to load audio file: ");
                    sb.append(str2);
                    Log.e("CardGenerator", sb.toString(), e);
                }
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:55:0x0169 A[Catch:{ all -> 0x0146, all -> 0x0176, all -> 0x0153, all -> 0x0161, all -> 0x016f }] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:30:0x0123=Splitter:B:30:0x0123, B:52:0x0165=Splitter:B:52:0x0165} */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.io.File doInBackground(java.lang.Void... r21) {
            /*
                r20 = this;
                r1 = r20
                java.lang.String r2 = "Failed to dispose video encoder instance!"
                java.lang.String r3 = "Failed to dispose magnum context instance!"
                java.lang.String r4 = "Failed to dispose player instance!"
                java.lang.String r5 = "CardGenerator"
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.c r0 = r1.f15911c     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.b r0 = r0.mo14231e()     // Catch:{ all -> 0x0146 }
                r0.mo14223a()     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.MagnumContext r0 = new co.znly.cardgenerator.MagnumContext     // Catch:{ all -> 0x0146 }
                r0.<init>()     // Catch:{ all -> 0x0146 }
                r1.f15913e = r0     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.Player r0 = new co.znly.cardgenerator.Player     // Catch:{ all -> 0x0146 }
                android.content.Context r8 = r1.f15909a     // Catch:{ all -> 0x0146 }
                android.content.res.AssetManager r8 = r8.getAssets()     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.c r9 = r1.f15911c     // Catch:{ all -> 0x0146 }
                int r9 = r9.mo14232f()     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.c r10 = r1.f15911c     // Catch:{ all -> 0x0146 }
                int r10 = r10.mo14230d()     // Catch:{ all -> 0x0146 }
                r0.<init>(r8, r9, r10)     // Catch:{ all -> 0x0146 }
                r1.f15912d = r0     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.Player r0 = r1.f15912d     // Catch:{ all -> 0x0146 }
                java.lang.String r8 = r1.f15914f     // Catch:{ all -> 0x0146 }
                java.lang.String[][] r9 = r1.f15915g     // Catch:{ all -> 0x0146 }
                boolean r0 = r0.mo14217a(r8, r9)     // Catch:{ all -> 0x0146 }
                if (r0 == 0) goto L_0x012d
                co.znly.cardgenerator.Player r0 = r1.f15912d     // Catch:{ all -> 0x0146 }
                r8 = 0
                r0.mo14215a(r8)     // Catch:{ all -> 0x0146 }
                long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0146 }
                long r9 = r9 - r6
                java.lang.String r0 = "Background task load in %d ms"
                r6 = 1
                java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0146 }
                java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x0146 }
                r7[r8] = r9     // Catch:{ all -> 0x0146 }
                java.lang.String r0 = java.lang.String.format(r0, r7)     // Catch:{ all -> 0x0146 }
                android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.Player r0 = r1.f15912d     // Catch:{ all -> 0x0146 }
                long r9 = r0.mo14214a()     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.CardGenerator r0 = p213co.znly.cardgenerator.CardGenerator.this     // Catch:{ all -> 0x0146 }
                int r0 = r0.f15906d     // Catch:{ all -> 0x0146 }
                long r11 = (long) r0     // Catch:{ all -> 0x0146 }
                long r11 = r11 * r9
                r13 = 1000(0x3e8, double:4.94E-321)
                long r11 = r11 / r13
                co.znly.cardgenerator.CardGenerator r0 = p213co.znly.cardgenerator.CardGenerator.this     // Catch:{ all -> 0x0146 }
                long r13 = r0.f15908f     // Catch:{ all -> 0x0146 }
                r15 = 0
                int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
                if (r0 == 0) goto L_0x008a
                co.znly.cardgenerator.CardGenerator r0 = p213co.znly.cardgenerator.CardGenerator.this     // Catch:{ all -> 0x0146 }
                long r13 = r0.f15908f     // Catch:{ all -> 0x0146 }
                int r0 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
                if (r0 <= 0) goto L_0x008a
                r0 = 1
                goto L_0x008b
            L_0x008a:
                r0 = 0
            L_0x008b:
                if (r0 == 0) goto L_0x0097
                co.znly.cardgenerator.CardGenerator r0 = p213co.znly.cardgenerator.CardGenerator.this     // Catch:{ all -> 0x0146 }
                long r13 = r0.f15908f     // Catch:{ all -> 0x0146 }
                float r0 = (float) r13     // Catch:{ all -> 0x0146 }
                float r7 = (float) r9     // Catch:{ all -> 0x0146 }
                float r0 = r0 / r7
                goto L_0x0099
            L_0x0097:
                r0 = 1065353216(0x3f800000, float:1.0)
            L_0x0099:
                r7 = 1315859240(0x4e6e6b28, float:1.0E9)
                co.znly.cardgenerator.CardGenerator r9 = p213co.znly.cardgenerator.CardGenerator.this     // Catch:{ all -> 0x0146 }
                int r9 = r9.f15906d     // Catch:{ all -> 0x0146 }
                float r9 = (float) r9     // Catch:{ all -> 0x0146 }
                float r7 = r7 / r9
                float r7 = r7 * r0
                long r9 = (long) r7     // Catch:{ all -> 0x0146 }
                long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0146 }
                r0 = 0
                r18 = r9
                r8 = r15
                r15 = r18
            L_0x00b1:
                long r6 = (long) r0     // Catch:{ all -> 0x0146 }
                int r17 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
                if (r17 > 0) goto L_0x00e6
                co.znly.cardgenerator.Player r6 = r1.f15912d     // Catch:{ all -> 0x0146 }
                r6.mo14216a(r8)     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.c r6 = r1.f15911c     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.b r6 = r6.mo14231e()     // Catch:{ all -> 0x0146 }
                r6.mo14224a(r8)     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.c r6 = r1.f15911c     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.b r6 = r6.mo14231e()     // Catch:{ all -> 0x0146 }
                r6.mo14226c()     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.c r6 = r1.f15911c     // Catch:{ all -> 0x0146 }
                r6.mo14228b()     // Catch:{ all -> 0x0146 }
                r6 = 1
                java.lang.Float[] r7 = new java.lang.Float[r6]     // Catch:{ all -> 0x0146 }
                float r6 = (float) r0     // Catch:{ all -> 0x0146 }
                float r10 = (float) r11     // Catch:{ all -> 0x0146 }
                float r6 = r6 / r10
                java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ all -> 0x0146 }
                r10 = 0
                r7[r10] = r6     // Catch:{ all -> 0x0146 }
                r1.publishProgress(r7)     // Catch:{ all -> 0x0146 }
                long r8 = r8 + r15
                int r0 = r0 + 1
                goto L_0x00b1
            L_0x00e6:
                co.znly.cardgenerator.c r0 = r1.f15911c     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.a r0 = r0.mo14227a()     // Catch:{ all -> 0x0146 }
                r0.mo14221b()     // Catch:{ all -> 0x0146 }
                long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0146 }
                long r6 = r6 - r13
                java.lang.String r0 = "Background task done in %d ms"
                r8 = 1
                java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0146 }
                java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0146 }
                r7 = 0
                r8[r7] = r6     // Catch:{ all -> 0x0146 }
                java.lang.String r0 = java.lang.String.format(r0, r8)     // Catch:{ all -> 0x0146 }
                android.util.Log.d(r5, r0)     // Catch:{ all -> 0x0146 }
                co.znly.cardgenerator.Player r0 = r1.f15912d     // Catch:{ all -> 0x0111 }
                if (r0 == 0) goto L_0x0115
                co.znly.cardgenerator.Player r0 = r1.f15912d     // Catch:{ all -> 0x0111 }
                r0.mo14218b()     // Catch:{ all -> 0x0111 }
                goto L_0x0115
            L_0x0111:
                r0 = move-exception
                android.util.Log.e(r5, r4, r0)
            L_0x0115:
                co.znly.cardgenerator.MagnumContext r0 = r1.f15913e     // Catch:{ all -> 0x011f }
                if (r0 == 0) goto L_0x0123
                co.znly.cardgenerator.MagnumContext r0 = r1.f15913e     // Catch:{ all -> 0x011f }
                r0.mo14213a()     // Catch:{ all -> 0x011f }
                goto L_0x0123
            L_0x011f:
                r0 = move-exception
                android.util.Log.e(r5, r3, r0)
            L_0x0123:
                co.znly.cardgenerator.c r0 = r1.f15911c     // Catch:{ all -> 0x016f }
                if (r0 == 0) goto L_0x0173
                co.znly.cardgenerator.c r0 = r1.f15911c     // Catch:{ all -> 0x016f }
                r0.mo14229c()     // Catch:{ all -> 0x016f }
                goto L_0x0173
            L_0x012d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0146 }
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0146 }
                r6.<init>()     // Catch:{ all -> 0x0146 }
                java.lang.String r7 = "Failed to load model file: "
                r6.append(r7)     // Catch:{ all -> 0x0146 }
                java.lang.String r7 = r1.f15914f     // Catch:{ all -> 0x0146 }
                r6.append(r7)     // Catch:{ all -> 0x0146 }
                java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0146 }
                r0.<init>(r6)     // Catch:{ all -> 0x0146 }
                throw r0     // Catch:{ all -> 0x0146 }
            L_0x0146:
                r0 = move-exception
                r1.f15917i = r0     // Catch:{ all -> 0x0176 }
                co.znly.cardgenerator.Player r0 = r1.f15912d     // Catch:{ all -> 0x0153 }
                if (r0 == 0) goto L_0x0157
                co.znly.cardgenerator.Player r0 = r1.f15912d     // Catch:{ all -> 0x0153 }
                r0.mo14218b()     // Catch:{ all -> 0x0153 }
                goto L_0x0157
            L_0x0153:
                r0 = move-exception
                android.util.Log.e(r5, r4, r0)
            L_0x0157:
                co.znly.cardgenerator.MagnumContext r0 = r1.f15913e     // Catch:{ all -> 0x0161 }
                if (r0 == 0) goto L_0x0165
                co.znly.cardgenerator.MagnumContext r0 = r1.f15913e     // Catch:{ all -> 0x0161 }
                r0.mo14213a()     // Catch:{ all -> 0x0161 }
                goto L_0x0165
            L_0x0161:
                r0 = move-exception
                android.util.Log.e(r5, r3, r0)
            L_0x0165:
                co.znly.cardgenerator.c r0 = r1.f15911c     // Catch:{ all -> 0x016f }
                if (r0 == 0) goto L_0x0173
                co.znly.cardgenerator.c r0 = r1.f15911c     // Catch:{ all -> 0x016f }
                r0.mo14229c()     // Catch:{ all -> 0x016f }
                goto L_0x0173
            L_0x016f:
                r0 = move-exception
                android.util.Log.e(r5, r2, r0)
            L_0x0173:
                java.io.File r0 = r1.f15916h
                return r0
            L_0x0176:
                r0 = move-exception
                r6 = r0
                co.znly.cardgenerator.Player r0 = r1.f15912d     // Catch:{ all -> 0x0182 }
                if (r0 == 0) goto L_0x0186
                co.znly.cardgenerator.Player r0 = r1.f15912d     // Catch:{ all -> 0x0182 }
                r0.mo14218b()     // Catch:{ all -> 0x0182 }
                goto L_0x0186
            L_0x0182:
                r0 = move-exception
                android.util.Log.e(r5, r4, r0)
            L_0x0186:
                co.znly.cardgenerator.MagnumContext r0 = r1.f15913e     // Catch:{ all -> 0x0190 }
                if (r0 == 0) goto L_0x0194
                co.znly.cardgenerator.MagnumContext r0 = r1.f15913e     // Catch:{ all -> 0x0190 }
                r0.mo14213a()     // Catch:{ all -> 0x0190 }
                goto L_0x0194
            L_0x0190:
                r0 = move-exception
                android.util.Log.e(r5, r3, r0)
            L_0x0194:
                co.znly.cardgenerator.c r0 = r1.f15911c     // Catch:{ all -> 0x019e }
                if (r0 == 0) goto L_0x01a2
                co.znly.cardgenerator.c r0 = r1.f15911c     // Catch:{ all -> 0x019e }
                r0.mo14229c()     // Catch:{ all -> 0x019e }
                goto L_0x01a2
            L_0x019e:
                r0 = move-exception
                android.util.Log.e(r5, r2, r0)
            L_0x01a2:
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p213co.znly.cardgenerator.CardGenerator.C6349a.doInBackground(java.lang.Void[]):java.io.File");
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onProgressUpdate(Float... fArr) {
            this.f15910b.onProgress(fArr[0].floatValue());
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(File file) {
            Throwable th = this.f15917i;
            if (th != null) {
                this.f15910b.onError(th);
            } else {
                this.f15910b.onFinish(file);
            }
        }
    }

    static {
        try {
            System.loadLibrary("cardgenerator");
        } catch (UnsatisfiedLinkError unused) {
        }
    }

    public CardGenerator(Context context) {
        this.f15903a = context;
    }

    /* renamed from: a */
    public void mo14203a(int i, int i2) {
        this.f15904b = i;
        this.f15905c = i2;
    }

    /* renamed from: a */
    public void mo14204a(long j) {
        this.f15908f = j;
    }

    /* renamed from: a */
    public boolean mo14206a() {
        return Build.SUPPORTED_64_BIT_ABIS.length > 0;
    }

    /* renamed from: a */
    public void mo14205a(String str, String str2, String[][] strArr, File file, CardGeneratorProgress cardGeneratorProgress) {
        if (!mo14206a()) {
            cardGeneratorProgress.onError(new UnsupportedOperationException("Video generation is not supported on this device"));
            return;
        }
        C6349a aVar = new C6349a(this.f15903a, str, str2, strArr, file, cardGeneratorProgress);
        aVar.execute(new Void[0]);
    }
}
