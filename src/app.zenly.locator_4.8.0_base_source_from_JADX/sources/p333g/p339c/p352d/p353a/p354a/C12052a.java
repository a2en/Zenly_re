package p333g.p339c.p352d.p353a.p354a;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import java.util.Arrays;

/* renamed from: g.c.d.a.a.a */
public class C12052a {
    /* renamed from: a */
    public void mo35767a(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            if (iArr[i] < 11) {
                iArr[i] = 100;
            }
        }
    }

    /* renamed from: b */
    public int[] mo35768b(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = i;
            i += iArr[i2];
        }
        return iArr2;
    }

    /* renamed from: c */
    public int mo35769c(int[] iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    /* renamed from: a */
    public int mo35766a(int[] iArr, int i) {
        int binarySearch = Arrays.binarySearch(iArr, i);
        return binarySearch < 0 ? ((-binarySearch) - 1) - 1 : binarySearch;
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public int mo35765a(Bitmap bitmap) {
        int i = VERSION.SDK_INT;
        if (i >= 19) {
            return bitmap.getAllocationByteCount();
        }
        if (i >= 12) {
            return bitmap.getByteCount();
        }
        return bitmap.getWidth() * bitmap.getHeight() * 4;
    }
}
