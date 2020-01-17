package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import androidx.constraintlayout.widget.C0481f;
import java.util.HashMap;
import p214e.p229f.p230a.p231a.C7590c;

/* renamed from: androidx.constraintlayout.motion.widget.h */
public class C0351h extends C0353i {

    /* renamed from: g */
    String f1534g = null;

    /* renamed from: h */
    int f1535h = C0328c.f1473e;

    /* renamed from: i */
    int f1536i = 0;

    /* renamed from: j */
    float f1537j = Float.NaN;

    /* renamed from: k */
    float f1538k = Float.NaN;

    /* renamed from: l */
    float f1539l = Float.NaN;

    /* renamed from: m */
    float f1540m = Float.NaN;

    /* renamed from: n */
    float f1541n = Float.NaN;

    /* renamed from: o */
    float f1542o = Float.NaN;

    /* renamed from: p */
    int f1543p = 0;

    /* renamed from: androidx.constraintlayout.motion.widget.h$a */
    private static class C0352a {

        /* renamed from: a */
        private static SparseIntArray f1544a = new SparseIntArray();

        static {
            f1544a.append(C0481f.KeyPosition_motionTarget, 1);
            f1544a.append(C0481f.KeyPosition_framePosition, 2);
            f1544a.append(C0481f.KeyPosition_transitionEasing, 3);
            f1544a.append(C0481f.KeyPosition_curveFit, 4);
            f1544a.append(C0481f.KeyPosition_drawPath, 5);
            f1544a.append(C0481f.KeyPosition_percentX, 6);
            f1544a.append(C0481f.KeyPosition_percentY, 7);
            f1544a.append(C0481f.KeyPosition_keyPositionType, 9);
            f1544a.append(C0481f.KeyPosition_sizePercent, 8);
            f1544a.append(C0481f.KeyPosition_percentWidth, 11);
            f1544a.append(C0481f.KeyPosition_percentHeight, 12);
            f1544a.append(C0481f.KeyPosition_pathMotionArc, 10);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static void m1522b(C0351h hVar, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            int i = 0;
            while (true) {
                String str = "KeyPosition";
                if (i < indexCount) {
                    int index = typedArray.getIndex(i);
                    switch (f1544a.get(index)) {
                        case 1:
                            if (typedArray.peekValue(index).type != 3) {
                                hVar.f1475b = typedArray.getResourceId(index, hVar.f1475b);
                                break;
                            } else {
                                hVar.f1476c = typedArray.getString(index);
                                break;
                            }
                        case 2:
                            hVar.f1474a = typedArray.getInt(index, hVar.f1474a);
                            break;
                        case 3:
                            if (typedArray.peekValue(index).type != 3) {
                                hVar.f1534g = C7590c.f19070c[typedArray.getInteger(index, 0)];
                                break;
                            } else {
                                hVar.f1534g = typedArray.getString(index);
                                break;
                            }
                        case 4:
                            hVar.f1545f = typedArray.getInteger(index, hVar.f1545f);
                            break;
                        case 5:
                            hVar.f1536i = typedArray.getInt(index, hVar.f1536i);
                            break;
                        case 6:
                            hVar.f1539l = typedArray.getFloat(index, hVar.f1539l);
                            break;
                        case 7:
                            hVar.f1540m = typedArray.getFloat(index, hVar.f1540m);
                            break;
                        case 8:
                            float f = typedArray.getFloat(index, hVar.f1538k);
                            hVar.f1537j = f;
                            hVar.f1538k = f;
                            break;
                        case 9:
                            hVar.f1543p = typedArray.getInt(index, hVar.f1543p);
                            break;
                        case 10:
                            hVar.f1535h = typedArray.getInt(index, hVar.f1535h);
                            break;
                        case 11:
                            hVar.f1537j = typedArray.getFloat(index, hVar.f1537j);
                            break;
                        case 12:
                            hVar.f1538k = typedArray.getFloat(index, hVar.f1538k);
                            break;
                        default:
                            StringBuilder sb = new StringBuilder();
                            sb.append("unused attribute 0x");
                            sb.append(Integer.toHexString(index));
                            sb.append("   ");
                            sb.append(f1544a.get(index));
                            Log.e(str, sb.toString());
                            break;
                    }
                    i++;
                } else if (hVar.f1474a == -1) {
                    Log.e(str, "no frame position");
                    return;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public void mo2306a(Context context, AttributeSet attributeSet) {
        C0352a.m1522b(this, context.obtainStyledAttributes(attributeSet, C0481f.KeyPosition));
    }

    /* renamed from: a */
    public void mo2307a(HashMap<String, C0369s> hashMap) {
    }
}
