package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.MenuItem;
import androidx.core.internal.view.SupportMenuItem;

public final class MenuItemCompat {

    @Deprecated
    public interface OnActionExpandListener {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    /* renamed from: a */
    public static MenuItem m2794a(MenuItem menuItem, ActionProvider actionProvider) {
        if (menuItem instanceof SupportMenuItem) {
            return ((SupportMenuItem) menuItem).setSupportActionProvider(actionProvider);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    /* renamed from: b */
    public static void m2800b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setTooltipText(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m2798a(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setContentDescription(charSequence);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setContentDescription(charSequence);
        }
    }

    /* renamed from: b */
    public static void m2799b(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setNumericShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setNumericShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m2795a(MenuItem menuItem, char c, int i) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setAlphabeticShortcut(c, i);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setAlphabeticShortcut(c, i);
        }
    }

    /* renamed from: a */
    public static void m2796a(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintList(colorStateList);
        }
    }

    /* renamed from: a */
    public static void m2797a(MenuItem menuItem, Mode mode) {
        if (menuItem instanceof SupportMenuItem) {
            ((SupportMenuItem) menuItem).setIconTintMode(mode);
        } else if (VERSION.SDK_INT >= 26) {
            menuItem.setIconTintMode(mode);
        }
    }
}
