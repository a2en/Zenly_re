package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.C0169i;
import androidx.appcompat.view.menu.C0171j;
import androidx.appcompat.widget.C0262m;
import androidx.appcompat.widget.C0291z;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.MenuItemCompat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p214e.p215a.C7530j;

/* renamed from: androidx.appcompat.view.e */
public class C0147e extends MenuInflater {

    /* renamed from: e */
    static final Class<?>[] f461e = {Context.class};

    /* renamed from: f */
    static final Class<?>[] f462f = f461e;

    /* renamed from: a */
    final Object[] f463a;

    /* renamed from: b */
    final Object[] f464b = this.f463a;

    /* renamed from: c */
    Context f465c;

    /* renamed from: d */
    private Object f466d;

    /* renamed from: androidx.appcompat.view.e$a */
    private static class C0148a implements OnMenuItemClickListener {

        /* renamed from: c */
        private static final Class<?>[] f467c = {MenuItem.class};

        /* renamed from: a */
        private Object f468a;

        /* renamed from: b */
        private Method f469b;

        public C0148a(Object obj, String str) {
            this.f468a = obj;
            Class cls = obj.getClass();
            try {
                this.f469b = cls.getMethod(str, f467c);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't resolve menu item onClick handler ");
                sb.append(str);
                sb.append(" in class ");
                sb.append(cls.getName());
                InflateException inflateException = new InflateException(sb.toString());
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f469b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f469b.invoke(this.f468a, new Object[]{menuItem})).booleanValue();
                }
                this.f469b.invoke(this.f468a, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: androidx.appcompat.view.e$b */
    private class C0149b {

        /* renamed from: A */
        ActionProvider f470A;

        /* renamed from: B */
        private CharSequence f471B;

        /* renamed from: C */
        private CharSequence f472C;

        /* renamed from: D */
        private ColorStateList f473D = null;

        /* renamed from: E */
        private Mode f474E = null;

        /* renamed from: a */
        private Menu f476a;

        /* renamed from: b */
        private int f477b;

        /* renamed from: c */
        private int f478c;

        /* renamed from: d */
        private int f479d;

        /* renamed from: e */
        private int f480e;

        /* renamed from: f */
        private boolean f481f;

        /* renamed from: g */
        private boolean f482g;

        /* renamed from: h */
        private boolean f483h;

        /* renamed from: i */
        private int f484i;

        /* renamed from: j */
        private int f485j;

        /* renamed from: k */
        private CharSequence f486k;

        /* renamed from: l */
        private CharSequence f487l;

        /* renamed from: m */
        private int f488m;

        /* renamed from: n */
        private char f489n;

        /* renamed from: o */
        private int f490o;

        /* renamed from: p */
        private char f491p;

        /* renamed from: q */
        private int f492q;

        /* renamed from: r */
        private int f493r;

        /* renamed from: s */
        private boolean f494s;

        /* renamed from: t */
        private boolean f495t;

        /* renamed from: u */
        private boolean f496u;

        /* renamed from: v */
        private int f497v;

        /* renamed from: w */
        private int f498w;

        /* renamed from: x */
        private String f499x;

        /* renamed from: y */
        private String f500y;

        /* renamed from: z */
        private String f501z;

        public C0149b(Menu menu) {
            this.f476a = menu;
            mo649d();
        }

        /* renamed from: a */
        public void mo645a(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = C0147e.this.f465c.obtainStyledAttributes(attributeSet, C7530j.MenuGroup);
            this.f477b = obtainStyledAttributes.getResourceId(C7530j.MenuGroup_android_id, 0);
            this.f478c = obtainStyledAttributes.getInt(C7530j.MenuGroup_android_menuCategory, 0);
            this.f479d = obtainStyledAttributes.getInt(C7530j.MenuGroup_android_orderInCategory, 0);
            this.f480e = obtainStyledAttributes.getInt(C7530j.MenuGroup_android_checkableBehavior, 0);
            this.f481f = obtainStyledAttributes.getBoolean(C7530j.MenuGroup_android_visible, true);
            this.f482g = obtainStyledAttributes.getBoolean(C7530j.MenuGroup_android_enabled, true);
            obtainStyledAttributes.recycle();
        }

        /* renamed from: b */
        public void mo647b(AttributeSet attributeSet) {
            C0291z a = C0291z.m1195a(C0147e.this.f465c, attributeSet, C7530j.MenuItem);
            this.f484i = a.mo2115g(C7530j.MenuItem_android_id, 0);
            this.f485j = (a.mo2109d(C7530j.MenuItem_android_menuCategory, this.f478c) & -65536) | (a.mo2109d(C7530j.MenuItem_android_orderInCategory, this.f479d) & 65535);
            this.f486k = a.mo2112e(C7530j.MenuItem_android_title);
            this.f487l = a.mo2112e(C7530j.MenuItem_android_titleCondensed);
            this.f488m = a.mo2115g(C7530j.MenuItem_android_icon, 0);
            this.f489n = m524a(a.mo2110d(C7530j.MenuItem_android_alphabeticShortcut));
            this.f490o = a.mo2109d(C7530j.MenuItem_alphabeticModifiers, 4096);
            this.f491p = m524a(a.mo2110d(C7530j.MenuItem_android_numericShortcut));
            this.f492q = a.mo2109d(C7530j.MenuItem_numericModifiers, 4096);
            if (a.mo2116g(C7530j.MenuItem_android_checkable)) {
                this.f493r = a.mo2103a(C7530j.MenuItem_android_checkable, false) ? 1 : 0;
            } else {
                this.f493r = this.f480e;
            }
            this.f494s = a.mo2103a(C7530j.MenuItem_android_checked, false);
            this.f495t = a.mo2103a(C7530j.MenuItem_android_visible, this.f481f);
            this.f496u = a.mo2103a(C7530j.MenuItem_android_enabled, this.f482g);
            this.f497v = a.mo2109d(C7530j.MenuItem_showAsAction, -1);
            this.f501z = a.mo2110d(C7530j.MenuItem_android_onClick);
            this.f498w = a.mo2115g(C7530j.MenuItem_actionLayout, 0);
            this.f499x = a.mo2110d(C7530j.MenuItem_actionViewClass);
            this.f500y = a.mo2110d(C7530j.MenuItem_actionProviderClass);
            boolean z = this.f500y != null;
            if (z && this.f498w == 0 && this.f499x == null) {
                this.f470A = (ActionProvider) m525a(this.f500y, C0147e.f462f, C0147e.this.f464b);
            } else {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.f470A = null;
            }
            this.f471B = a.mo2112e(C7530j.MenuItem_contentDescription);
            this.f472C = a.mo2112e(C7530j.MenuItem_tooltipText);
            if (a.mo2116g(C7530j.MenuItem_iconTintMode)) {
                this.f474E = C0262m.m1078a(a.mo2109d(C7530j.MenuItem_iconTintMode, -1), this.f474E);
            } else {
                this.f474E = null;
            }
            if (a.mo2116g(C7530j.MenuItem_iconTint)) {
                this.f473D = a.mo2100a(C7530j.MenuItem_iconTint);
            } else {
                this.f473D = null;
            }
            a.mo2102a();
            this.f483h = false;
        }

        /* renamed from: c */
        public boolean mo648c() {
            return this.f483h;
        }

        /* renamed from: d */
        public void mo649d() {
            this.f477b = 0;
            this.f478c = 0;
            this.f479d = 0;
            this.f480e = 0;
            this.f481f = true;
            this.f482g = true;
        }

        /* renamed from: a */
        private char m524a(String str) {
            if (str == null) {
                return 0;
            }
            return str.charAt(0);
        }

        /* renamed from: a */
        private void m526a(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.f494s).setVisible(this.f495t).setEnabled(this.f496u).setCheckable(this.f493r >= 1).setTitleCondensed(this.f487l).setIcon(this.f488m);
            int i = this.f497v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.f501z != null) {
                if (!C0147e.this.f465c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new C0148a(C0147e.this.mo641a(), this.f501z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            boolean z2 = menuItem instanceof C0169i;
            if (z2) {
                C0169i iVar = (C0169i) menuItem;
            }
            if (this.f493r >= 2) {
                if (z2) {
                    ((C0169i) menuItem).mo919c(true);
                } else if (menuItem instanceof C0171j) {
                    ((C0171j) menuItem).mo966a(true);
                }
            }
            String str = this.f499x;
            if (str != null) {
                menuItem.setActionView((View) m525a(str, C0147e.f461e, C0147e.this.f463a));
                z = true;
            }
            int i2 = this.f498w;
            if (i2 > 0) {
                if (!z) {
                    menuItem.setActionView(i2);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            ActionProvider actionProvider = this.f470A;
            if (actionProvider != null) {
                MenuItemCompat.m2794a(menuItem, actionProvider);
            }
            MenuItemCompat.m2798a(menuItem, this.f471B);
            MenuItemCompat.m2800b(menuItem, this.f472C);
            MenuItemCompat.m2795a(menuItem, this.f489n, this.f490o);
            MenuItemCompat.m2799b(menuItem, this.f491p, this.f492q);
            Mode mode = this.f474E;
            if (mode != null) {
                MenuItemCompat.m2797a(menuItem, mode);
            }
            ColorStateList colorStateList = this.f473D;
            if (colorStateList != null) {
                MenuItemCompat.m2796a(menuItem, colorStateList);
            }
        }

        /* renamed from: b */
        public SubMenu mo646b() {
            this.f483h = true;
            SubMenu addSubMenu = this.f476a.addSubMenu(this.f477b, this.f484i, this.f485j, this.f486k);
            m526a(addSubMenu.getItem());
            return addSubMenu;
        }

        /* renamed from: a */
        public void mo644a() {
            this.f483h = true;
            m526a(this.f476a.add(this.f477b, this.f484i, this.f485j, this.f486k));
        }

        /* renamed from: a */
        private <T> T m525a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor constructor = Class.forName(str, false, C0147e.this.f465c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot instantiate class: ");
                sb.append(str);
                Log.w("SupportMenuInflater", sb.toString(), e);
                return null;
            }
        }
    }

    public C0147e(Context context) {
        super(context);
        this.f465c = context;
        this.f463a = new Object[]{context};
    }

    /* renamed from: a */
    private void m522a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        String str;
        C0149b bVar = new C0149b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            str = "menu";
            if (eventType != 2) {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            } else {
                String name = xmlPullParser.getName();
                if (name.equals(str)) {
                    eventType = xmlPullParser.next();
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expecting menu, got ");
                    sb.append(name);
                    throw new RuntimeException(sb.toString());
                }
            }
        }
        int i = eventType;
        String str2 = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (i != 1) {
                String str3 = "item";
                String str4 = "group";
                if (i != 2) {
                    if (i == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str2)) {
                            str2 = null;
                            z2 = false;
                        } else if (name2.equals(str4)) {
                            bVar.mo649d();
                        } else if (name2.equals(str3)) {
                            if (!bVar.mo648c()) {
                                ActionProvider actionProvider = bVar.f470A;
                                if (actionProvider == null || !actionProvider.mo1022a()) {
                                    bVar.mo644a();
                                } else {
                                    bVar.mo646b();
                                }
                            }
                        } else if (name2.equals(str)) {
                            z = true;
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals(str4)) {
                        bVar.mo645a(attributeSet);
                    } else if (name3.equals(str3)) {
                        bVar.mo647b(attributeSet);
                    } else if (name3.equals(str)) {
                        m522a(xmlPullParser, attributeSet, bVar.mo646b());
                    } else {
                        str2 = name3;
                        z2 = true;
                    }
                }
                i = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        String str = "Error inflating menu XML";
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.f465c.getResources().getLayout(i);
            m522a(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        } catch (XmlPullParserException e) {
            throw new InflateException(str, e);
        } catch (IOException e2) {
            throw new InflateException(str, e2);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public Object mo641a() {
        if (this.f466d == null) {
            this.f466d = m521a(this.f465c);
        }
        return this.f466d;
    }

    /* renamed from: a */
    private Object m521a(Object obj) {
        if (obj instanceof Activity) {
            return obj;
        }
        if (obj instanceof ContextWrapper) {
            obj = m521a(((ContextWrapper) obj).getBaseContext());
        }
        return obj;
    }
}
