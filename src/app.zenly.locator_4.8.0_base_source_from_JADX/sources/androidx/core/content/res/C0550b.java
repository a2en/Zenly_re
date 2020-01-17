package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: androidx.core.content.res.b */
public final class C0550b {

    /* renamed from: a */
    private final Shader f2595a;

    /* renamed from: b */
    private final ColorStateList f2596b;

    /* renamed from: c */
    private int f2597c;

    private C0550b(Shader shader, ColorStateList colorStateList, int i) {
        this.f2595a = shader;
        this.f2596b = colorStateList;
        this.f2597c = i;
    }

    /* renamed from: a */
    static C0550b m2587a(Shader shader) {
        return new C0550b(shader, null, 0);
    }

    /* renamed from: b */
    static C0550b m2588b(int i) {
        return new C0550b(null, null, i);
    }

    /* renamed from: c */
    public boolean mo3096c() {
        return this.f2595a != null;
    }

    /* renamed from: d */
    public boolean mo3097d() {
        if (this.f2595a == null) {
            ColorStateList colorStateList = this.f2596b;
            if (colorStateList != null && colorStateList.isStateful()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public boolean mo3098e() {
        return mo3096c() || this.f2597c != 0;
    }

    /* renamed from: a */
    static C0550b m2585a(ColorStateList colorStateList) {
        return new C0550b(null, colorStateList, colorStateList.getDefaultColor());
    }

    /* renamed from: b */
    public Shader mo3095b() {
        return this.f2595a;
    }

    /* renamed from: b */
    public static C0550b m2589b(Resources resources, int i, Theme theme) {
        try {
            return m2586a(resources, i, theme);
        } catch (Exception e) {
            Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
            return null;
        }
    }

    /* renamed from: a */
    public int mo3092a() {
        return this.f2597c;
    }

    /* renamed from: a */
    public void mo3093a(int i) {
        this.f2597c = i;
    }

    /* renamed from: a */
    public boolean mo3094a(int[] iArr) {
        if (mo3097d()) {
            ColorStateList colorStateList = this.f2596b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f2597c) {
                this.f2597c = colorForState;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static C0550b m2586a(Resources resources, int i, Theme theme) throws IOException, XmlPullParserException {
        int next;
        XmlResourceParser xml = resources.getXml(i);
        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            String name = xml.getName();
            char c = 65535;
            int hashCode = name.hashCode();
            if (hashCode != 89650992) {
                if (hashCode == 1191572447 && name.equals("selector")) {
                    c = 0;
                }
            } else if (name.equals("gradient")) {
                c = 1;
            }
            if (c == 0) {
                return m2585a(C0549a.m2582a(resources, (XmlPullParser) xml, asAttributeSet, theme));
            }
            if (c == 1) {
                return m2587a(C0551c.m2598a(resources, xml, asAttributeSet, theme));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(xml.getPositionDescription());
            sb.append(": unsupported complex color tag ");
            sb.append(name);
            throw new XmlPullParserException(sb.toString());
        }
        throw new XmlPullParserException("No start tag found");
    }
}
