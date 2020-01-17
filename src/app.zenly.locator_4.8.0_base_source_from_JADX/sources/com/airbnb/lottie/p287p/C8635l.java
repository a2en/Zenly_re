package com.airbnb.lottie.p287p;

import android.graphics.Color;
import com.airbnb.lottie.model.content.C8559b;
import com.airbnb.lottie.p287p.p288k0.C8630c;
import com.airbnb.lottie.p287p.p288k0.C8630c.C8632b;
import com.airbnb.lottie.p289q.C8657g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.p.l */
public class C8635l implements C8626j0<C8559b> {

    /* renamed from: a */
    private int f22189a;

    public C8635l(int i) {
        this.f22189a = i;
    }

    /* renamed from: a */
    public C8559b m20109a(C8630c cVar, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = cVar.peek() == C8632b.BEGIN_ARRAY;
        if (z) {
            cVar.mo23227a();
        }
        while (cVar.mo23233f()) {
            arrayList.add(Float.valueOf((float) cVar.mo23235h()));
        }
        if (z) {
            cVar.mo23230c();
        }
        if (this.f22189a == -1) {
            this.f22189a = arrayList.size() / 4;
        }
        int i = this.f22189a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f22189a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = (double) ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        C8559b bVar = new C8559b(fArr, iArr);
        m20107a(bVar, (List<Float>) arrayList);
        return bVar;
    }

    /* renamed from: a */
    private void m20107a(C8559b bVar, List<Float> list) {
        int i = this.f22189a * 4;
        if (list.size() > i) {
            int size = (list.size() - i) / 2;
            double[] dArr = new double[size];
            double[] dArr2 = new double[size];
            int i2 = 0;
            while (i < list.size()) {
                if (i % 2 == 0) {
                    dArr[i2] = (double) ((Float) list.get(i)).floatValue();
                } else {
                    dArr2[i2] = (double) ((Float) list.get(i)).floatValue();
                    i2++;
                }
                i++;
            }
            for (int i3 = 0; i3 < bVar.mo23072c(); i3++) {
                int i4 = bVar.mo23070a()[i3];
                bVar.mo23070a()[i3] = Color.argb(m20106a((double) bVar.mo23071b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
            }
        }
    }

    /* renamed from: a */
    private int m20106a(double d, double[] dArr, double[] dArr2) {
        double d2;
        double[] dArr3 = dArr;
        double[] dArr4 = dArr2;
        int i = 1;
        while (true) {
            if (i >= dArr3.length) {
                d2 = dArr4[dArr4.length - 1];
                break;
            }
            int i2 = i - 1;
            double d3 = dArr3[i2];
            double d4 = dArr3[i];
            if (dArr3[i] >= d) {
                d2 = C8657g.m20180a(dArr4[i2], dArr4[i], (d - d3) / (d4 - d3));
                break;
            }
            i++;
        }
        return (int) (d2 * 255.0d);
    }
}
