package com.bumptech.glide.load.p294h.p296e;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.C0143b;
import androidx.core.content.C0540a;
import androidx.core.content.res.C0554e;
import p214e.p215a.p216k.p217a.C7531a;

/* renamed from: com.bumptech.glide.load.h.e.a */
public final class C9021a {

    /* renamed from: a */
    private static volatile boolean f23556a = true;

    /* renamed from: a */
    public static Drawable m21682a(Context context, Context context2, int i) {
        return m21683a(context, context2, i, null);
    }

    /* renamed from: b */
    private static Drawable m21684b(Context context, int i, Theme theme) {
        return C0554e.m2609b(context.getResources(), i, theme);
    }

    /* renamed from: c */
    private static Drawable m21685c(Context context, int i, Theme theme) {
        if (theme != null) {
            context = new C0143b(context, theme);
        }
        return C7531a.m18133c(context, i);
    }

    /* renamed from: a */
    public static Drawable m21681a(Context context, int i, Theme theme) {
        return m21683a(context, context, i, theme);
    }

    /* renamed from: a */
    private static Drawable m21683a(Context context, Context context2, int i, Theme theme) {
        try {
            if (f23556a) {
                return m21685c(context2, i, theme);
            }
        } catch (NoClassDefFoundError unused) {
            f23556a = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return C0540a.m2546c(context2, i);
            }
            throw e;
        } catch (NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m21684b(context2, i, theme);
    }
}
