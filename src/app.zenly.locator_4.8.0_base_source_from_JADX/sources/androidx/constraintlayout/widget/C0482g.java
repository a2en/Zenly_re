package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.g */
public class C0482g {

    /* renamed from: a */
    int f2322a = -1;

    /* renamed from: b */
    int f2323b = -1;

    /* renamed from: c */
    int f2324c = -1;

    /* renamed from: d */
    private SparseArray<C0483a> f2325d = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.g$a */
    static class C0483a {

        /* renamed from: a */
        int f2326a;

        /* renamed from: b */
        ArrayList<C0484b> f2327b = new ArrayList<>();

        /* renamed from: c */
        int f2328c = -1;

        public C0483a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0481f.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0481f.State_android_id) {
                    this.f2326a = obtainStyledAttributes.getResourceId(index, this.f2326a);
                } else if (index == C0481f.State_constraints) {
                    this.f2328c = obtainStyledAttributes.getResourceId(index, this.f2328c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2328c);
                    context.getResources().getResourceName(this.f2328c);
                    boolean equals = "layout".equals(resourceTypeName);
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2804a(C0484b bVar) {
            this.f2327b.add(bVar);
        }

        /* renamed from: a */
        public int mo2803a(float f, float f2) {
            for (int i = 0; i < this.f2327b.size(); i++) {
                if (((C0484b) this.f2327b.get(i)).mo2805a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.g$b */
    static class C0484b {

        /* renamed from: a */
        float f2329a = Float.NaN;

        /* renamed from: b */
        float f2330b = Float.NaN;

        /* renamed from: c */
        float f2331c = Float.NaN;

        /* renamed from: d */
        float f2332d = Float.NaN;

        /* renamed from: e */
        int f2333e = -1;

        public C0484b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0481f.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0481f.Variant_constraints) {
                    this.f2333e = obtainStyledAttributes.getResourceId(index, this.f2333e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2333e);
                    context.getResources().getResourceName(this.f2333e);
                    boolean equals = "layout".equals(resourceTypeName);
                } else if (index == C0481f.Variant_region_heightLessThan) {
                    this.f2332d = obtainStyledAttributes.getDimension(index, this.f2332d);
                } else if (index == C0481f.Variant_region_heightMoreThan) {
                    this.f2330b = obtainStyledAttributes.getDimension(index, this.f2330b);
                } else if (index == C0481f.Variant_region_widthLessThan) {
                    this.f2331c = obtainStyledAttributes.getDimension(index, this.f2331c);
                } else if (index == C0481f.Variant_region_widthMoreThan) {
                    this.f2329a = obtainStyledAttributes.getDimension(index, this.f2329a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2805a(float f, float f2) {
            if (!Float.isNaN(this.f2329a) && f < this.f2329a) {
                return false;
            }
            if (!Float.isNaN(this.f2330b) && f2 < this.f2330b) {
                return false;
            }
            if (!Float.isNaN(this.f2331c) && f > this.f2331c) {
                return false;
            }
            if (Float.isNaN(this.f2332d) || f2 <= this.f2332d) {
                return true;
            }
            return false;
        }
    }

    public C0482g(Context context, XmlPullParser xmlPullParser) {
        new SparseArray();
        m2262a(context, xmlPullParser);
    }

    /* renamed from: a */
    private void m2262a(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0481f.StateSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C0481f.StateSet_defaultState) {
                this.f2322a = obtainStyledAttributes.getResourceId(index, this.f2322a);
            }
        }
        C0483a aVar = null;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType != 0) {
                    String str = "StateSet";
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        char c = 65535;
                        switch (name.hashCode()) {
                            case 80204913:
                                if (name.equals("State")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 1301459538:
                                if (name.equals("LayoutDescription")) {
                                    c = 0;
                                    break;
                                }
                                break;
                            case 1382829617:
                                if (name.equals(str)) {
                                    c = 1;
                                    break;
                                }
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c = 3;
                                    break;
                                }
                                break;
                        }
                        if (!(c == 0 || c == 1)) {
                            if (c == 2) {
                                aVar = new C0483a(context, xmlPullParser);
                                this.f2325d.put(aVar.f2326a, aVar);
                            } else if (c != 3) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("unknown tag ");
                                sb.append(name);
                                Log.v("ConstraintLayoutStates", sb.toString());
                            } else {
                                C0484b bVar = new C0484b(context, xmlPullParser);
                                if (aVar != null) {
                                    aVar.mo2804a(bVar);
                                }
                            }
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else if (str.equals(xmlPullParser.getName())) {
                        return;
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public int mo2802b(int i, int i2, float f, float f2) {
        C0483a aVar;
        if (i == i2) {
            if (i2 == -1) {
                aVar = (C0483a) this.f2325d.valueAt(0);
            } else {
                aVar = (C0483a) this.f2325d.get(this.f2323b);
            }
            if (aVar == null) {
                return -1;
            }
            if (this.f2324c != -1 && ((C0484b) aVar.f2327b.get(i)).mo2805a(f, f2)) {
                return i;
            }
            int a = aVar.mo2803a(f, f2);
            if (i == a) {
                return i;
            }
            return a == -1 ? aVar.f2328c : ((C0484b) aVar.f2327b.get(a)).f2333e;
        }
        C0483a aVar2 = (C0483a) this.f2325d.get(i2);
        if (aVar2 == null) {
            return -1;
        }
        int a2 = aVar2.mo2803a(f, f2);
        return a2 == -1 ? aVar2.f2328c : ((C0484b) aVar2.f2327b.get(a2)).f2333e;
    }

    /* renamed from: a */
    public int mo2801a(int i, int i2, int i3) {
        return mo2802b(-1, i, (float) i2, (float) i3);
    }

    /* renamed from: a */
    public int mo2800a(int i, int i2, float f, float f2) {
        C0483a aVar = (C0483a) this.f2325d.get(i2);
        if (f != -1.0f && f2 != -1.0f) {
            C0484b bVar = null;
            Iterator it = aVar.f2327b.iterator();
            while (it.hasNext()) {
                C0484b bVar2 = (C0484b) it.next();
                if (bVar2.mo2805a(f, f2)) {
                    if (i == bVar2.f2333e) {
                        return i;
                    }
                    bVar = bVar2;
                }
            }
            if (bVar != null) {
                return bVar.f2333e;
            }
            return aVar.f2328c;
        } else if (aVar.f2328c == i) {
            return i;
        } else {
            Iterator it2 = aVar.f2327b.iterator();
            while (it2.hasNext()) {
                if (i == ((C0484b) it2.next()).f2333e) {
                    return i;
                }
            }
            return aVar.f2328c;
        }
    }
}
