package androidx.palette.graphics;

public final class Palette {

    public interface Filter {
        boolean isAllowed(int i, float[] fArr);
    }

    public interface PaletteAsyncListener {
        void onGenerated(Palette palette);
    }

    /* renamed from: androidx.palette.graphics.Palette$a */
    static class C1045a implements Filter {
        C1045a() {
        }

        /* renamed from: a */
        private boolean m4671a(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        /* renamed from: b */
        private boolean m4672b(float[] fArr) {
            return fArr[0] >= 10.0f && fArr[0] <= 37.0f && fArr[1] <= 0.82f;
        }

        /* renamed from: c */
        private boolean m4673c(float[] fArr) {
            return fArr[2] >= 0.95f;
        }

        public boolean isAllowed(int i, float[] fArr) {
            return !m4673c(fArr) && !m4671a(fArr) && !m4672b(fArr);
        }
    }

    static {
        new C1045a();
    }
}
