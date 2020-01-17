package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.navigation.C0953f.C0954a;
import androidx.navigation.C0976o.C0977a;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.navigation.n */
public final class C0975n {

    /* renamed from: c */
    private static final ThreadLocal<TypedValue> f3724c = new ThreadLocal<>();

    /* renamed from: a */
    private Context f3725a;

    /* renamed from: b */
    private C0996r f3726b;

    public C0975n(Context context, C0996r rVar) {
        this.f3725a = context;
        this.f3726b = rVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0049 A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[Catch:{ Exception -> 0x0053, all -> 0x0051 }] */
    @android.annotation.SuppressLint({"ResourceType"})
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.navigation.C0971k mo4752a(int r7) {
        /*
            r6 = this;
            android.content.Context r0 = r6.f3725a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.XmlResourceParser r1 = r0.getXml(r7)
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r1)
        L_0x000e:
            int r3 = r1.next()     // Catch:{ Exception -> 0x0053 }
            r4 = 2
            if (r3 == r4) goto L_0x0019
            r5 = 1
            if (r3 == r5) goto L_0x0019
            goto L_0x000e
        L_0x0019:
            if (r3 != r4) goto L_0x0049
            java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x0053 }
            androidx.navigation.j r2 = r6.m4365a(r0, r1, r2, r7)     // Catch:{ Exception -> 0x0053 }
            boolean r4 = r2 instanceof androidx.navigation.C0971k     // Catch:{ Exception -> 0x0053 }
            if (r4 == 0) goto L_0x002d
            androidx.navigation.k r2 = (androidx.navigation.C0971k) r2     // Catch:{ Exception -> 0x0053 }
            r1.close()
            return r2
        L_0x002d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0053 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0053 }
            r4.<init>()     // Catch:{ Exception -> 0x0053 }
            java.lang.String r5 = "Root element <"
            r4.append(r5)     // Catch:{ Exception -> 0x0053 }
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "> did not inflate into a NavGraph"
            r4.append(r3)     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x0053 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0049:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ Exception -> 0x0053 }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053 }
            throw r2     // Catch:{ Exception -> 0x0053 }
        L_0x0051:
            r7 = move-exception
            goto L_0x007b
        L_0x0053:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch:{ all -> 0x0051 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0051 }
            r4.<init>()     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = "Exception inflating "
            r4.append(r5)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r0.getResourceName(r7)     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = " line "
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            int r7 = r1.getLineNumber()     // Catch:{ all -> 0x0051 }
            r4.append(r7)     // Catch:{ all -> 0x0051 }
            java.lang.String r7 = r4.toString()     // Catch:{ all -> 0x0051 }
            r3.<init>(r7, r2)     // Catch:{ all -> 0x0051 }
            throw r3     // Catch:{ all -> 0x0051 }
        L_0x007b:
            r1.close()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.C0975n.mo4752a(int):androidx.navigation.k");
    }

    /* renamed from: a */
    private C0969j m4365a(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, int i) throws XmlPullParserException, IOException {
        C0969j a = this.f3726b.mo4797a(xmlResourceParser.getName()).mo4653a();
        a.mo4664a(this.f3725a, attributeSet);
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                break;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            } else if (next == 2 && depth2 <= depth) {
                String name = xmlResourceParser.getName();
                if ("argument".equals(name)) {
                    m4369a(resources, a, attributeSet, i);
                } else if ("deepLink".equals(name)) {
                    m4368a(resources, a, attributeSet);
                } else if ("action".equals(name)) {
                    m4370a(resources, a, attributeSet, xmlResourceParser, i);
                } else if ("include".equals(name) && (a instanceof C0971k)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0998t.NavInclude);
                    ((C0971k) a).mo4742a((C0969j) mo4752a(obtainAttributes.getResourceId(C0998t.NavInclude_graph, 0)));
                    obtainAttributes.recycle();
                } else if (a instanceof C0971k) {
                    ((C0971k) a).mo4742a(m4365a(resources, xmlResourceParser, attributeSet, i));
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    private void m4369a(Resources resources, C0969j jVar, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0998t.NavArgument);
        String string = obtainAttributes.getString(C0998t.NavArgument_android_name);
        if (string != null) {
            jVar.mo4729a(string, m4364a(obtainAttributes, resources, i));
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    /* renamed from: a */
    private void m4367a(Resources resources, Bundle bundle, AttributeSet attributeSet, int i) throws XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0998t.NavArgument);
        String string = obtainAttributes.getString(C0998t.NavArgument_android_name);
        if (string != null) {
            C0953f a = m4364a(obtainAttributes, resources, i);
            if (a.mo4688c()) {
                a.mo4685a(string, bundle);
            }
            obtainAttributes.recycle();
            return;
        }
        throw new XmlPullParserException("Arguments must have a name");
    }

    /* renamed from: a */
    private C0953f m4364a(TypedArray typedArray, Resources resources, int i) throws XmlPullParserException {
        C0954a aVar = new C0954a();
        boolean z = false;
        aVar.mo4694a(typedArray.getBoolean(C0998t.NavArgument_nullable, false));
        TypedValue typedValue = (TypedValue) f3724c.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            f3724c.set(typedValue);
        }
        String string = typedArray.getString(C0998t.NavArgument_argType);
        Object obj = null;
        C0978p a = string != null ? C0978p.m4387a(string, resources.getResourcePackageName(i)) : null;
        if (typedArray.getValue(C0998t.NavArgument_android_defaultValue, typedValue)) {
            C0978p<Integer> pVar = C0978p.f3742c;
            String str = "' for ";
            String str2 = "unsupported value '";
            if (a == pVar) {
                int i2 = typedValue.resourceId;
                if (i2 != 0) {
                    obj = Integer.valueOf(i2);
                } else if (typedValue.type == 16 && typedValue.data == 0) {
                    obj = Integer.valueOf(0);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(typedValue.string);
                    sb.append(str);
                    sb.append(a.mo4770a());
                    sb.append(". Must be a reference to a resource.");
                    throw new XmlPullParserException(sb.toString());
                }
            } else {
                int i3 = typedValue.resourceId;
                if (i3 != 0) {
                    if (a == null) {
                        a = pVar;
                        obj = Integer.valueOf(i3);
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append(typedValue.string);
                        sb2.append(str);
                        sb2.append(a.mo4770a());
                        sb2.append(". You must use a \"");
                        sb2.append(C0978p.f3742c.mo4770a());
                        sb2.append("\" type to reference other resources.");
                        throw new XmlPullParserException(sb2.toString());
                    }
                } else if (a == C0978p.f3750k) {
                    obj = typedArray.getString(C0998t.NavArgument_android_defaultValue);
                } else {
                    int i4 = typedValue.type;
                    if (i4 == 3) {
                        String charSequence = typedValue.string.toString();
                        if (a == null) {
                            a = C0978p.m4388b(charSequence);
                        }
                        obj = a.mo4769a(charSequence);
                    } else if (i4 == 4) {
                        a = m4366a(typedValue, a, (C0978p) C0978p.f3746g, string, "float");
                        obj = Float.valueOf(typedValue.getFloat());
                    } else if (i4 == 5) {
                        a = m4366a(typedValue, a, (C0978p) C0978p.f3741b, string, "dimension");
                        obj = Integer.valueOf((int) typedValue.getDimension(resources.getDisplayMetrics()));
                    } else if (i4 == 18) {
                        a = m4366a(typedValue, a, (C0978p) C0978p.f3748i, string, "boolean");
                        if (typedValue.data != 0) {
                            z = true;
                        }
                        obj = Boolean.valueOf(z);
                    } else if (i4 < 16 || i4 > 31) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append("unsupported argument type ");
                        sb3.append(typedValue.type);
                        throw new XmlPullParserException(sb3.toString());
                    } else {
                        a = m4366a(typedValue, a, (C0978p) C0978p.f3741b, string, "integer");
                        obj = Integer.valueOf(typedValue.data);
                    }
                }
            }
        }
        if (obj != null) {
            aVar.mo4693a(obj);
        }
        if (a != null) {
            aVar.mo4692a(a);
        }
        return aVar.mo4695a();
    }

    /* renamed from: a */
    private static C0978p m4366a(TypedValue typedValue, C0978p pVar, C0978p pVar2, String str, String str2) throws XmlPullParserException {
        if (pVar == null || pVar == pVar2) {
            return pVar != null ? pVar : pVar2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Type is ");
        sb.append(str);
        sb.append(" but found ");
        sb.append(str2);
        sb.append(": ");
        sb.append(typedValue.data);
        throw new XmlPullParserException(sb.toString());
    }

    /* renamed from: a */
    private void m4368a(Resources resources, C0969j jVar, AttributeSet attributeSet) {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0998t.NavDeepLink);
        String string = obtainAttributes.getString(C0998t.NavDeepLink_uri);
        if (!TextUtils.isEmpty(string)) {
            jVar.mo4728a(string.replace("${applicationId}", this.f3725a.getPackageName()));
            obtainAttributes.recycle();
            return;
        }
        throw new IllegalArgumentException("Every <deepLink> must include an app:uri");
    }

    /* renamed from: a */
    private void m4370a(Resources resources, C0969j jVar, AttributeSet attributeSet, XmlResourceParser xmlResourceParser, int i) throws IOException, XmlPullParserException {
        TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C0998t.NavAction);
        int resourceId = obtainAttributes.getResourceId(C0998t.NavAction_android_id, 0);
        C0950c cVar = new C0950c(obtainAttributes.getResourceId(C0998t.NavAction_destination, 0));
        C0977a aVar = new C0977a();
        aVar.mo4762a(obtainAttributes.getBoolean(C0998t.NavAction_launchSingleTop, false));
        aVar.mo4761a(obtainAttributes.getResourceId(C0998t.NavAction_popUpTo, -1), obtainAttributes.getBoolean(C0998t.NavAction_popUpToInclusive, false));
        aVar.mo4760a(obtainAttributes.getResourceId(C0998t.NavAction_enterAnim, -1));
        aVar.mo4764b(obtainAttributes.getResourceId(C0998t.NavAction_exitAnim, -1));
        aVar.mo4765c(obtainAttributes.getResourceId(C0998t.NavAction_popEnterAnim, -1));
        aVar.mo4766d(obtainAttributes.getResourceId(C0998t.NavAction_popExitAnim, -1));
        cVar.mo4679a(aVar.mo4763a());
        Bundle bundle = new Bundle();
        int depth = xmlResourceParser.getDepth() + 1;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == 1) {
                break;
            }
            int depth2 = xmlResourceParser.getDepth();
            if (depth2 < depth && next == 3) {
                break;
            } else if (next == 2 && depth2 <= depth) {
                if ("argument".equals(xmlResourceParser.getName())) {
                    m4367a(resources, bundle, attributeSet, i);
                }
            }
        }
        if (!bundle.isEmpty()) {
            cVar.mo4678a(bundle);
        }
        jVar.mo4725a(resourceId, cVar);
        obtainAttributes.recycle();
    }
}
