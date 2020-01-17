package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import androidx.core.provider.C0574a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p214e.p234h.C7613d;

public class FontResourcesParserCompat {

    public interface FamilyResourceEntry {
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$a */
    public static final class C0546a implements FamilyResourceEntry {

        /* renamed from: a */
        private final C0547b[] f2585a;

        public C0546a(C0547b[] bVarArr) {
            this.f2585a = bVarArr;
        }

        /* renamed from: a */
        public C0547b[] mo3082a() {
            return this.f2585a;
        }
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$b */
    public static final class C0547b {

        /* renamed from: a */
        private final String f2586a;

        /* renamed from: b */
        private int f2587b;

        /* renamed from: c */
        private boolean f2588c;

        /* renamed from: d */
        private String f2589d;

        /* renamed from: e */
        private int f2590e;

        /* renamed from: f */
        private int f2591f;

        public C0547b(String str, int i, boolean z, String str2, int i2, int i3) {
            this.f2586a = str;
            this.f2587b = i;
            this.f2588c = z;
            this.f2589d = str2;
            this.f2590e = i2;
            this.f2591f = i3;
        }

        /* renamed from: a */
        public String mo3083a() {
            return this.f2586a;
        }

        /* renamed from: b */
        public int mo3084b() {
            return this.f2591f;
        }

        /* renamed from: c */
        public int mo3085c() {
            return this.f2590e;
        }

        /* renamed from: d */
        public String mo3086d() {
            return this.f2589d;
        }

        /* renamed from: e */
        public int mo3087e() {
            return this.f2587b;
        }

        /* renamed from: f */
        public boolean mo3088f() {
            return this.f2588c;
        }
    }

    /* renamed from: androidx.core.content.res.FontResourcesParserCompat$c */
    public static final class C0548c implements FamilyResourceEntry {

        /* renamed from: a */
        private final C0574a f2592a;

        /* renamed from: b */
        private final int f2593b;

        /* renamed from: c */
        private final int f2594c;

        public C0548c(C0574a aVar, int i, int i2) {
            this.f2592a = aVar;
            this.f2594c = i;
            this.f2593b = i2;
        }

        /* renamed from: a */
        public int mo3089a() {
            return this.f2594c;
        }

        /* renamed from: b */
        public C0574a mo3090b() {
            return this.f2592a;
        }

        /* renamed from: c */
        public int mo3091c() {
            return this.f2593b;
        }
    }

    /* renamed from: a */
    public static FamilyResourceEntry m2562a(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m2566b(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* renamed from: b */
    private static FamilyResourceEntry m2566b(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        String str = "font-family";
        xmlPullParser.require(2, null, str);
        if (xmlPullParser.getName().equals(str)) {
            return m2567c(xmlPullParser, resources);
        }
        m2565a(xmlPullParser);
        return null;
    }

    /* renamed from: c */
    private static FamilyResourceEntry m2567c(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7613d.FontFamily);
        String string = obtainAttributes.getString(C7613d.FontFamily_fontProviderAuthority);
        String string2 = obtainAttributes.getString(C7613d.FontFamily_fontProviderPackage);
        String string3 = obtainAttributes.getString(C7613d.FontFamily_fontProviderQuery);
        int resourceId = obtainAttributes.getResourceId(C7613d.FontFamily_fontProviderCerts, 0);
        int integer = obtainAttributes.getInteger(C7613d.FontFamily_fontProviderFetchStrategy, 1);
        int integer2 = obtainAttributes.getInteger(C7613d.FontFamily_fontProviderFetchTimeout, 500);
        obtainAttributes.recycle();
        if (string == null || string2 == null || string3 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(m2568d(xmlPullParser, resources));
                    } else {
                        m2565a(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new C0546a((C0547b[]) arrayList.toArray(new C0547b[arrayList.size()]));
        }
        while (xmlPullParser.next() != 3) {
            m2565a(xmlPullParser);
        }
        return new C0548c(new C0574a(string, string2, string3, m2563a(resources, resourceId)), integer, integer2);
    }

    /* renamed from: d */
    private static C0547b m2568d(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), C7613d.FontFamilyFont);
        int i = obtainAttributes.getInt(obtainAttributes.hasValue(C7613d.FontFamilyFont_fontWeight) ? C7613d.FontFamilyFont_fontWeight : C7613d.FontFamilyFont_android_fontWeight, 400);
        boolean z = 1 == obtainAttributes.getInt(obtainAttributes.hasValue(C7613d.FontFamilyFont_fontStyle) ? C7613d.FontFamilyFont_fontStyle : C7613d.FontFamilyFont_android_fontStyle, 0);
        int i2 = obtainAttributes.hasValue(C7613d.FontFamilyFont_ttcIndex) ? C7613d.FontFamilyFont_ttcIndex : C7613d.FontFamilyFont_android_ttcIndex;
        String string = obtainAttributes.getString(obtainAttributes.hasValue(C7613d.FontFamilyFont_fontVariationSettings) ? C7613d.FontFamilyFont_fontVariationSettings : C7613d.FontFamilyFont_android_fontVariationSettings);
        int i3 = obtainAttributes.getInt(i2, 0);
        int i4 = obtainAttributes.hasValue(C7613d.FontFamilyFont_font) ? C7613d.FontFamilyFont_font : C7613d.FontFamilyFont_android_font;
        int resourceId = obtainAttributes.getResourceId(i4, 0);
        String string2 = obtainAttributes.getString(i4);
        obtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            m2565a(xmlPullParser);
        }
        C0547b bVar = new C0547b(string2, i, z, string, i3, resourceId);
        return bVar;
    }

    /* renamed from: a */
    private static int m2561a(TypedArray typedArray, int i) {
        if (VERSION.SDK_INT >= 21) {
            return typedArray.getType(i);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i, typedValue);
        return typedValue.type;
    }

    /* renamed from: a */
    public static List<List<byte[]>> m2563a(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (m2561a(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        arrayList.add(m2564a(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(m2564a(resources.getStringArray(i)));
            }
            obtainTypedArray.recycle();
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    /* renamed from: a */
    private static List<byte[]> m2564a(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String decode : strArr) {
            arrayList.add(Base64.decode(decode, 0));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m2565a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i = 1;
        while (i > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }
}
