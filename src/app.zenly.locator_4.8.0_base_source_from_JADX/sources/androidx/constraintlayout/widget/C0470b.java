package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import com.appsflyer.share.Constants;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.constraintlayout.widget.b */
public class C0470b {

    /* renamed from: a */
    private final ConstraintLayout f2203a;

    /* renamed from: b */
    C0473c f2204b;

    /* renamed from: c */
    int f2205c = -1;

    /* renamed from: d */
    int f2206d = -1;

    /* renamed from: e */
    private SparseArray<C0471a> f2207e = new SparseArray<>();

    /* renamed from: f */
    private SparseArray<C0473c> f2208f = new SparseArray<>();

    /* renamed from: g */
    private C0479d f2209g = null;

    /* renamed from: androidx.constraintlayout.widget.b$a */
    static class C0471a {

        /* renamed from: a */
        int f2210a;

        /* renamed from: b */
        ArrayList<C0472b> f2211b = new ArrayList<>();

        /* renamed from: c */
        int f2212c = -1;

        /* renamed from: d */
        C0473c f2213d;

        public C0471a(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0481f.State);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0481f.State_android_id) {
                    this.f2210a = obtainStyledAttributes.getResourceId(index, this.f2210a);
                } else if (index == C0481f.State_constraints) {
                    this.f2212c = obtainStyledAttributes.getResourceId(index, this.f2212c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2212c);
                    context.getResources().getResourceName(this.f2212c);
                    if ("layout".equals(resourceTypeName)) {
                        this.f2213d = new C0473c();
                        this.f2213d.mo2767a(context, this.f2212c);
                    }
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo2760a(C0472b bVar) {
            this.f2211b.add(bVar);
        }

        /* renamed from: a */
        public int mo2759a(float f, float f2) {
            for (int i = 0; i < this.f2211b.size(); i++) {
                if (((C0472b) this.f2211b.get(i)).mo2761a(f, f2)) {
                    return i;
                }
            }
            return -1;
        }
    }

    /* renamed from: androidx.constraintlayout.widget.b$b */
    static class C0472b {

        /* renamed from: a */
        float f2214a = Float.NaN;

        /* renamed from: b */
        float f2215b = Float.NaN;

        /* renamed from: c */
        float f2216c = Float.NaN;

        /* renamed from: d */
        float f2217d = Float.NaN;

        /* renamed from: e */
        int f2218e = -1;

        /* renamed from: f */
        C0473c f2219f;

        public C0472b(Context context, XmlPullParser xmlPullParser) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), C0481f.Variant);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0481f.Variant_constraints) {
                    this.f2218e = obtainStyledAttributes.getResourceId(index, this.f2218e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f2218e);
                    context.getResources().getResourceName(this.f2218e);
                    if ("layout".equals(resourceTypeName)) {
                        this.f2219f = new C0473c();
                        this.f2219f.mo2767a(context, this.f2218e);
                    }
                } else if (index == C0481f.Variant_region_heightLessThan) {
                    this.f2217d = obtainStyledAttributes.getDimension(index, this.f2217d);
                } else if (index == C0481f.Variant_region_heightMoreThan) {
                    this.f2215b = obtainStyledAttributes.getDimension(index, this.f2215b);
                } else if (index == C0481f.Variant_region_widthLessThan) {
                    this.f2216c = obtainStyledAttributes.getDimension(index, this.f2216c);
                } else if (index == C0481f.Variant_region_widthMoreThan) {
                    this.f2214a = obtainStyledAttributes.getDimension(index, this.f2214a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            obtainStyledAttributes.recycle();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public boolean mo2761a(float f, float f2) {
            if (!Float.isNaN(this.f2214a) && f < this.f2214a) {
                return false;
            }
            if (!Float.isNaN(this.f2215b) && f2 < this.f2215b) {
                return false;
            }
            if (!Float.isNaN(this.f2216c) && f > this.f2216c) {
                return false;
            }
            if (Float.isNaN(this.f2217d) || f2 <= this.f2217d) {
                return true;
            }
            return false;
        }
    }

    C0470b(Context context, ConstraintLayout constraintLayout, int i) {
        this.f2203a = constraintLayout;
        m2204a(context, i);
    }

    /* renamed from: a */
    public void mo2757a(int i, float f, float f2) {
        C0473c cVar;
        int i2;
        C0471a aVar;
        C0473c cVar2;
        int i3;
        int i4 = this.f2205c;
        if (i4 == i) {
            if (i == -1) {
                aVar = (C0471a) this.f2207e.valueAt(0);
            } else {
                aVar = (C0471a) this.f2207e.get(i4);
            }
            int i5 = this.f2206d;
            if (i5 == -1 || !((C0472b) aVar.f2211b.get(i5)).mo2761a(f, f2)) {
                int a = aVar.mo2759a(f, f2);
                if (this.f2206d != a) {
                    if (a == -1) {
                        cVar2 = this.f2204b;
                    } else {
                        cVar2 = ((C0472b) aVar.f2211b.get(a)).f2219f;
                    }
                    if (a == -1) {
                        i3 = aVar.f2212c;
                    } else {
                        i3 = ((C0472b) aVar.f2211b.get(a)).f2218e;
                    }
                    if (cVar2 != null) {
                        this.f2206d = a;
                        C0479d dVar = this.f2209g;
                        if (dVar != null) {
                            dVar.mo2799b(-1, i3);
                        }
                        cVar2.mo2779b(this.f2203a);
                        C0479d dVar2 = this.f2209g;
                        if (dVar2 != null) {
                            dVar2.mo2798a(-1, i3);
                        }
                    }
                }
            }
        } else {
            this.f2205c = i;
            C0471a aVar2 = (C0471a) this.f2207e.get(this.f2205c);
            int a2 = aVar2.mo2759a(f, f2);
            if (a2 == -1) {
                cVar = aVar2.f2213d;
            } else {
                cVar = ((C0472b) aVar2.f2211b.get(a2)).f2219f;
            }
            if (a2 == -1) {
                i2 = aVar2.f2212c;
            } else {
                i2 = ((C0472b) aVar2.f2211b.get(a2)).f2218e;
            }
            if (cVar == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("NO Constraint set found ! id=");
                sb.append(i);
                sb.append(", dim =");
                sb.append(f);
                sb.append(", ");
                sb.append(f2);
                Log.v("ConstraintLayoutStates", sb.toString());
                return;
            }
            this.f2206d = a2;
            C0479d dVar3 = this.f2209g;
            if (dVar3 != null) {
                dVar3.mo2799b(i, i2);
            }
            cVar.mo2779b(this.f2203a);
            C0479d dVar4 = this.f2209g;
            if (dVar4 != null) {
                dVar4.mo2798a(i, i2);
            }
        }
    }

    /* renamed from: a */
    public void mo2758a(C0479d dVar) {
        this.f2209g = dVar;
    }

    /* renamed from: a */
    private void m2204a(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        C0471a aVar = null;
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    char c = 65535;
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
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
                            aVar = new C0471a(context, xml);
                            this.f2207e.put(aVar.f2210a, aVar);
                        } else if (c == 3) {
                            C0472b bVar = new C0472b(context, xml);
                            if (aVar != null) {
                                aVar.mo2760a(bVar);
                            }
                        } else if (c != 4) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("unknown tag ");
                            sb.append(name);
                            Log.v("ConstraintLayoutStates", sb.toString());
                        } else {
                            m2205a(context, (XmlPullParser) xml);
                        }
                    }
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    private void m2205a(Context context, XmlPullParser xmlPullParser) {
        int i;
        C0473c cVar = new C0473c();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i2 = 0; i2 < attributeCount; i2++) {
            String str = "mId";
            if (str.equals(xmlPullParser.getAttributeName(i2))) {
                String attributeValue = xmlPullParser.getAttributeValue(i2);
                if (attributeValue.contains(Constants.URL_PATH_DELIMITER)) {
                    i = context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), str, context.getPackageName());
                } else {
                    i = -1;
                }
                if (i == -1) {
                    if (attributeValue == null || attributeValue.length() <= 1) {
                        Log.e("ConstraintLayoutStates", "error in parsing mId");
                    } else {
                        i = Integer.parseInt(attributeValue.substring(1));
                    }
                }
                cVar.mo2768a(context, xmlPullParser);
                this.f2208f.put(i, cVar);
                return;
            }
        }
    }
}
