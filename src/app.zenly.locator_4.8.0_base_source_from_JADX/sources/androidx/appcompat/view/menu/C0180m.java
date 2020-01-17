package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenu;

/* renamed from: androidx.appcompat.view.menu.m */
public class C0180m extends C0157c implements Menu {

    /* renamed from: d */
    private final SupportMenu f717d;

    public C0180m(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu != null) {
            this.f717d = supportMenu;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public MenuItem add(CharSequence charSequence) {
        return mo865a(this.f717d.add(charSequence));
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.f717d.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = mo865a(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return mo866a(this.f717d.addSubMenu(charSequence));
    }

    public void clear() {
        mo867a();
        this.f717d.clear();
    }

    public void close() {
        this.f717d.close();
    }

    public MenuItem findItem(int i) {
        return mo865a(this.f717d.findItem(i));
    }

    public MenuItem getItem(int i) {
        return mo865a(this.f717d.getItem(i));
    }

    public boolean hasVisibleItems() {
        return this.f717d.hasVisibleItems();
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f717d.isShortcutKey(i, keyEvent);
    }

    public boolean performIdentifierAction(int i, int i2) {
        return this.f717d.performIdentifierAction(i, i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f717d.performShortcut(i, keyEvent, i2);
    }

    public void removeGroup(int i) {
        mo868a(i);
        this.f717d.removeGroup(i);
    }

    public void removeItem(int i) {
        mo869b(i);
        this.f717d.removeItem(i);
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f717d.setGroupCheckable(i, z, z2);
    }

    public void setGroupEnabled(int i, boolean z) {
        this.f717d.setGroupEnabled(i, z);
    }

    public void setGroupVisible(int i, boolean z) {
        this.f717d.setGroupVisible(i, z);
    }

    public void setQwertyMode(boolean z) {
        this.f717d.setQwertyMode(z);
    }

    public int size() {
        return this.f717d.size();
    }

    public MenuItem add(int i) {
        return mo865a(this.f717d.add(i));
    }

    public SubMenu addSubMenu(int i) {
        return mo866a(this.f717d.addSubMenu(i));
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo865a(this.f717d.add(i, i2, i3, charSequence));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return mo866a(this.f717d.addSubMenu(i, i2, i3, charSequence));
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo865a(this.f717d.add(i, i2, i3, i4));
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return mo866a(this.f717d.addSubMenu(i, i2, i3, i4));
    }
}
