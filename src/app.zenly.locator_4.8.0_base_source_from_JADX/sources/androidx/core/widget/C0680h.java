package androidx.core.widget;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build.VERSION;
import android.text.Editable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.core.p004os.C0563a;
import androidx.core.text.C0588d;
import androidx.core.text.C0588d.C0589a;
import androidx.core.text.C0588d.C0589a.C0590a;
import androidx.core.util.C0607i;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.widget.h */
public final class C0680h {

    /* renamed from: androidx.core.widget.h$a */
    private static class C0681a implements Callback {

        /* renamed from: a */
        private final Callback f2911a;

        /* renamed from: b */
        private final TextView f2912b;

        /* renamed from: c */
        private Class f2913c;

        /* renamed from: d */
        private Method f2914d;

        /* renamed from: e */
        private boolean f2915e;

        /* renamed from: f */
        private boolean f2916f = false;

        C0681a(Callback callback, TextView textView) {
            this.f2911a = callback;
            this.f2912b = textView;
        }

        /* renamed from: a */
        private void m3194a(Menu menu) {
            Method method;
            Context context = this.f2912b.getContext();
            PackageManager packageManager = context.getPackageManager();
            String str = "removeItemAt";
            if (!this.f2916f) {
                this.f2916f = true;
                try {
                    this.f2913c = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f2914d = this.f2913c.getDeclaredMethod(str, new Class[]{Integer.TYPE});
                    this.f2915e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f2913c = null;
                    this.f2914d = null;
                    this.f2915e = false;
                }
            }
            try {
                if (!this.f2915e || !this.f2913c.isInstance(menu)) {
                    method = menu.getClass().getDeclaredMethod(str, new Class[]{Integer.TYPE});
                } else {
                    method = this.f2914d;
                }
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        method.invoke(menu, new Object[]{Integer.valueOf(size)});
                    }
                }
                List a = m3193a(context, packageManager);
                for (int i = 0; i < a.size(); i++) {
                    ResolveInfo resolveInfo = (ResolveInfo) a.get(i);
                    menu.add(0, 0, i + 100, resolveInfo.loadLabel(packageManager)).setIntent(m3192a(resolveInfo, this.f2912b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f2911a.onActionItemClicked(actionMode, menuItem);
        }

        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f2911a.onCreateActionMode(actionMode, menu);
        }

        public void onDestroyActionMode(ActionMode actionMode) {
            this.f2911a.onDestroyActionMode(actionMode);
        }

        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            m3194a(menu);
            return this.f2911a.onPrepareActionMode(actionMode, menu);
        }

        /* renamed from: a */
        private List<ResolveInfo> m3193a(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (!(context instanceof Activity)) {
                return arrayList;
            }
            for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(m3191a(), 0)) {
                if (m3195a(resolveInfo, context)) {
                    arrayList.add(resolveInfo);
                }
            }
            return arrayList;
        }

        /* renamed from: a */
        private boolean m3195a(ResolveInfo resolveInfo, Context context) {
            boolean z = true;
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            if (!resolveInfo.activityInfo.exported) {
                return false;
            }
            String str = resolveInfo.activityInfo.permission;
            if (!(str == null || context.checkSelfPermission(str) == 0)) {
                z = false;
            }
            return z;
        }

        /* renamed from: a */
        private Intent m3192a(ResolveInfo resolveInfo, TextView textView) {
            return m3191a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !m3196a(textView)).setClassName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name);
        }

        /* renamed from: a */
        private boolean m3196a(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        /* renamed from: a */
        private Intent m3191a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }
    }

    /* renamed from: a */
    public static void m3180a(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        int i = VERSION.SDK_INT;
        if (i >= 18) {
            textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else if (i >= 17) {
            boolean z = true;
            if (textView.getLayoutDirection() != 1) {
                z = false;
            }
            Drawable drawable5 = z ? drawable3 : drawable;
            if (!z) {
                drawable = drawable3;
            }
            textView.setCompoundDrawables(drawable5, drawable2, drawable, drawable4);
        } else {
            textView.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        }
    }

    /* renamed from: b */
    public static void m3185b(TextView textView, int i) {
        int i2;
        C0607i.m2771a(i);
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    /* renamed from: c */
    public static int m3186c(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    /* renamed from: d */
    public static void m3189d(TextView textView, int i) {
        if (VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    /* renamed from: e */
    public static C0589a m3190e(TextView textView) {
        if (VERSION.SDK_INT >= 28) {
            return new C0589a(textView.getTextMetricsParams());
        }
        C0590a aVar = new C0590a(new TextPaint(textView.getPaint()));
        if (VERSION.SDK_INT >= 23) {
            aVar.mo3232a(textView.getBreakStrategy());
            aVar.mo3235b(textView.getHyphenationFrequency());
        }
        if (VERSION.SDK_INT >= 18) {
            aVar.mo3233a(m3188d(textView));
        }
        return aVar.mo3234a();
    }

    /* renamed from: c */
    public static void m3187c(TextView textView, int i) {
        C0607i.m2771a(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing((float) (i - fontMetricsInt), 1.0f);
        }
    }

    /* renamed from: d */
    private static TextDirectionHeuristic m3188d(TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z = false;
        if (VERSION.SDK_INT < 28 || (textView.getInputType() & 15) != 3) {
            if (textView.getLayoutDirection() == 1) {
                z = true;
            }
            switch (textView.getTextDirection()) {
                case 2:
                    return TextDirectionHeuristics.ANYRTL_LTR;
                case 3:
                    return TextDirectionHeuristics.LTR;
                case 4:
                    return TextDirectionHeuristics.RTL;
                case 5:
                    return TextDirectionHeuristics.LOCALE;
                case 6:
                    return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                case 7:
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                default:
                    if (z) {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                    } else {
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                    }
                    return textDirectionHeuristic;
            }
        } else {
            byte directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(textView.getTextLocale()).getDigitStrings()[0].codePointAt(0));
            if (directionality == 1 || directionality == 2) {
                return TextDirectionHeuristics.RTL;
            }
            return TextDirectionHeuristics.LTR;
        }
    }

    /* renamed from: a */
    public static Drawable[] m3183a(TextView textView) {
        int i = VERSION.SDK_INT;
        if (i >= 18) {
            return textView.getCompoundDrawablesRelative();
        }
        if (i < 17) {
            return textView.getCompoundDrawables();
        }
        boolean z = true;
        if (textView.getLayoutDirection() != 1) {
            z = false;
        }
        Drawable[] compoundDrawables = textView.getCompoundDrawables();
        if (z) {
            Drawable drawable = compoundDrawables[2];
            Drawable drawable2 = compoundDrawables[0];
            compoundDrawables[0] = drawable;
            compoundDrawables[2] = drawable2;
        }
        return compoundDrawables;
    }

    /* renamed from: b */
    public static int m3184b(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    /* renamed from: a */
    public static Callback m3176a(TextView textView, Callback callback) {
        int i = VERSION.SDK_INT;
        return (i < 26 || i > 27 || (callback instanceof C0681a)) ? callback : new C0681a(callback, textView);
    }

    /* renamed from: a */
    public static void m3177a(TextView textView, int i) {
        int i2;
        C0607i.m2771a(i);
        if (VERSION.SDK_INT >= 28) {
            textView.setFirstBaselineToTopHeight(i);
            return;
        }
        FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (VERSION.SDK_INT < 16 || textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i - (-i2), textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public static void m3181a(TextView textView, C0589a aVar) {
        if (VERSION.SDK_INT >= 18) {
            textView.setTextDirection(m3175a(aVar.mo3227c()));
        }
        if (VERSION.SDK_INT < 23) {
            float textScaleX = aVar.mo3228d().getTextScaleX();
            textView.getPaint().set(aVar.mo3228d());
            if (textScaleX == textView.getTextScaleX()) {
                textView.setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            textView.setTextScaleX(textScaleX);
            return;
        }
        textView.getPaint().set(aVar.mo3228d());
        textView.setBreakStrategy(aVar.mo3224a());
        textView.setHyphenationFrequency(aVar.mo3226b());
    }

    @SuppressLint({"NewApi"})
    /* renamed from: a */
    public static void m3182a(TextView textView, C0588d dVar) {
        if (C0563a.m2669a()) {
            textView.setText(dVar.mo3212b());
        } else if (m3190e(textView).mo3225a(dVar.mo3211a())) {
            textView.setText(dVar);
        } else {
            throw new IllegalArgumentException("Given text can not be applied to TextView.");
        }
    }

    /* renamed from: a */
    private static int m3175a(TextDirectionHeuristic textDirectionHeuristic) {
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            return 6;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
            return 7;
        }
        return 1;
    }

    /* renamed from: a */
    public static void m3178a(TextView textView, ColorStateList colorStateList) {
        C0607i.m2773a(textView);
        if (VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintList(colorStateList);
        } else if (textView instanceof TintableCompoundDrawablesView) {
            ((TintableCompoundDrawablesView) textView).setSupportCompoundDrawablesTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m3179a(TextView textView, Mode mode) {
        C0607i.m2773a(textView);
        if (VERSION.SDK_INT >= 23) {
            textView.setCompoundDrawableTintMode(mode);
        } else if (textView instanceof TintableCompoundDrawablesView) {
            ((TintableCompoundDrawablesView) textView).setSupportCompoundDrawablesTintMode(mode);
        }
    }
}
