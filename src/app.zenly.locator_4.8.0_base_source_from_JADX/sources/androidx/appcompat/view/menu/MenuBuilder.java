package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyCharacterMap.KeyData;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0540a;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ActionProvider;
import androidx.core.view.C0655j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MenuBuilder implements SupportMenu {

    /* renamed from: A */
    private static final int[] f544A = {1, 4, 5, 3, 2, 0};

    /* renamed from: a */
    private final Context f545a;

    /* renamed from: b */
    private final Resources f546b;

    /* renamed from: c */
    private boolean f547c;

    /* renamed from: d */
    private boolean f548d;

    /* renamed from: e */
    private Callback f549e;

    /* renamed from: f */
    private ArrayList<C0169i> f550f;

    /* renamed from: g */
    private ArrayList<C0169i> f551g;

    /* renamed from: h */
    private boolean f552h;

    /* renamed from: i */
    private ArrayList<C0169i> f553i;

    /* renamed from: j */
    private ArrayList<C0169i> f554j;

    /* renamed from: k */
    private boolean f555k;

    /* renamed from: l */
    private int f556l = 0;

    /* renamed from: m */
    private ContextMenuInfo f557m;

    /* renamed from: n */
    CharSequence f558n;

    /* renamed from: o */
    Drawable f559o;

    /* renamed from: p */
    View f560p;

    /* renamed from: q */
    private boolean f561q = false;

    /* renamed from: r */
    private boolean f562r = false;

    /* renamed from: s */
    private boolean f563s = false;

    /* renamed from: t */
    private boolean f564t = false;

    /* renamed from: u */
    private boolean f565u = false;

    /* renamed from: v */
    private ArrayList<C0169i> f566v = new ArrayList<>();

    /* renamed from: w */
    private CopyOnWriteArrayList<WeakReference<MenuPresenter>> f567w = new CopyOnWriteArrayList<>();

    /* renamed from: x */
    private C0169i f568x;

    /* renamed from: y */
    private boolean f569y = false;

    /* renamed from: z */
    private boolean f570z;

    public interface Callback {
        boolean onMenuItemSelected(MenuBuilder menuBuilder, MenuItem menuItem);

        void onMenuModeChange(MenuBuilder menuBuilder);
    }

    public interface ItemInvoker {
        boolean invokeItem(C0169i iVar);
    }

    public MenuBuilder(Context context) {
        this.f545a = context;
        this.f546b = context.getResources();
        this.f550f = new ArrayList<>();
        this.f551g = new ArrayList<>();
        this.f552h = true;
        this.f553i = new ArrayList<>();
        this.f554j = new ArrayList<>();
        this.f555k = true;
        m560e(true);
    }

    /* renamed from: d */
    private void m559d(boolean z) {
        if (!this.f567w.isEmpty()) {
            mo775s();
            Iterator it = this.f567w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    this.f567w.remove(weakReference);
                } else {
                    menuPresenter.updateMenuView(z);
                }
            }
            mo772r();
        }
    }

    /* renamed from: e */
    private void m560e(boolean z) {
        boolean z2 = true;
        if (!z || this.f546b.getConfiguration().keyboard == 1 || !C0655j.m3056d(ViewConfiguration.get(this.f545a), this.f545a)) {
            z2 = false;
        }
        this.f548d = z2;
    }

    /* renamed from: f */
    private static int m561f(int i) {
        int i2 = (-65536 & i) >> 16;
        if (i2 >= 0) {
            int[] iArr = f544A;
            if (i2 < iArr.length) {
                return (i & 65535) | (iArr[i2] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    /* renamed from: a */
    public void mo719a(MenuPresenter menuPresenter) {
        mo720a(menuPresenter, this.f545a);
    }

    public MenuItem add(CharSequence charSequence) {
        return mo710a(0, 0, 0, charSequence);
    }

    public int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        PackageManager packageManager = this.f545a.getPackageManager();
        List queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i5 = 0; i5 < size; i5++) {
            ResolveInfo resolveInfo = (ResolveInfo) queryIntentActivityOptions.get(i5);
            int i6 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i6 < 0 ? intent : intentArr[i6]);
            intent2.setComponent(new ComponentName(resolveInfo.activityInfo.applicationInfo.packageName, resolveInfo.activityInfo.name));
            MenuItem intent3 = add(i, i2, i3, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null) {
                int i7 = resolveInfo.specificIndex;
                if (i7 >= 0) {
                    menuItemArr[i7] = intent3;
                }
            }
        }
        return size;
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    /* renamed from: b */
    public void mo739b(MenuPresenter menuPresenter) {
        Iterator it = this.f567w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
            if (menuPresenter2 == null || menuPresenter2 == menuPresenter) {
                this.f567w.remove(weakReference);
            }
        }
    }

    /* renamed from: c */
    public MenuBuilder mo742c(int i) {
        this.f556l = i;
        return this;
    }

    public void clear() {
        C0169i iVar = this.f568x;
        if (iVar != null) {
            mo726a(iVar);
        }
        this.f550f.clear();
        mo740b(true);
    }

    public void clearHeader() {
        this.f559o = null;
        this.f558n = null;
        this.f560p = null;
        mo740b(false);
    }

    public void close() {
        mo722a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo750d() {
        return "android:menu:actionviewstates";
    }

    public MenuItem findItem(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            C0169i iVar = (C0169i) this.f550f.get(i2);
            if (iVar.getItemId() == i) {
                return iVar;
            }
            if (iVar.hasSubMenu()) {
                MenuItem findItem = iVar.getSubMenu().findItem(i);
                if (findItem != null) {
                    return findItem;
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public Drawable mo756g() {
        return this.f559o;
    }

    public MenuItem getItem(int i) {
        return (MenuItem) this.f550f.get(i);
    }

    /* renamed from: h */
    public CharSequence mo758h() {
        return this.f558n;
    }

    public boolean hasVisibleItems() {
        if (this.f570z) {
            return true;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (((C0169i) this.f550f.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public View mo760i() {
        return this.f560p;
    }

    public boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return mo714a(i, keyEvent) != null;
    }

    /* renamed from: j */
    public ArrayList<C0169i> mo762j() {
        mo737b();
        return this.f554j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public boolean mo763k() {
        return this.f564t;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public Resources mo764l() {
        return this.f546b;
    }

    /* renamed from: m */
    public MenuBuilder mo765m() {
        return this;
    }

    /* renamed from: n */
    public ArrayList<C0169i> mo766n() {
        if (!this.f552h) {
            return this.f551g;
        }
        this.f551g.clear();
        int size = this.f550f.size();
        for (int i = 0; i < size; i++) {
            C0169i iVar = (C0169i) this.f550f.get(i);
            if (iVar.isVisible()) {
                this.f551g.add(iVar);
            }
        }
        this.f552h = false;
        this.f555k = true;
        return this.f551g;
    }

    /* renamed from: o */
    public boolean mo767o() {
        return this.f569y;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public boolean mo768p() {
        return this.f547c;
    }

    public boolean performIdentifierAction(int i, int i2) {
        return mo723a(findItem(i), i2);
    }

    public boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        C0169i a = mo714a(i, keyEvent);
        boolean a2 = a != null ? mo723a((MenuItem) a, i2) : false;
        if ((i2 & 2) != 0) {
            mo722a(true);
        }
        return a2;
    }

    /* renamed from: q */
    public boolean mo771q() {
        return this.f548d;
    }

    /* renamed from: r */
    public void mo772r() {
        this.f561q = false;
        if (this.f562r) {
            this.f562r = false;
            mo740b(this.f563s);
        }
    }

    public void removeGroup(int i) {
        int a = mo708a(i);
        if (a >= 0) {
            int size = this.f550f.size() - a;
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                if (i2 >= size || ((C0169i) this.f550f.get(a)).getGroupId() != i) {
                    mo740b(true);
                } else {
                    m557a(a, false);
                    i2 = i3;
                }
            }
            mo740b(true);
        }
    }

    public void removeItem(int i) {
        m557a(mo736b(i), true);
    }

    /* renamed from: s */
    public void mo775s() {
        if (!this.f561q) {
            this.f561q = true;
            this.f562r = false;
            this.f563s = false;
        }
    }

    public void setGroupCheckable(int i, boolean z, boolean z2) {
        int size = this.f550f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0169i iVar = (C0169i) this.f550f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.mo919c(z2);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.f569y = z;
    }

    public void setGroupEnabled(int i, boolean z) {
        int size = this.f550f.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0169i iVar = (C0169i) this.f550f.get(i2);
            if (iVar.getGroupId() == i) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i, boolean z) {
        int size = this.f550f.size();
        boolean z2 = false;
        for (int i2 = 0; i2 < size; i2++) {
            C0169i iVar = (C0169i) this.f550f.get(i2);
            if (iVar.getGroupId() == i && iVar.mo923e(z)) {
                z2 = true;
            }
        }
        if (z2) {
            mo740b(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.f547c = z;
        mo740b(false);
    }

    public int size() {
        return this.f550f.size();
    }

    /* renamed from: a */
    public void mo720a(MenuPresenter menuPresenter, Context context) {
        this.f567w.add(new WeakReference(menuPresenter));
        menuPresenter.initForMenu(context, this);
        this.f555k = true;
    }

    public MenuItem add(int i) {
        return mo710a(0, 0, 0, this.f546b.getString(i));
    }

    public SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, (CharSequence) this.f546b.getString(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo744c(C0169i iVar) {
        this.f555k = true;
        mo740b(true);
    }

    public MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return mo710a(i, i2, i3, charSequence);
    }

    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0169i iVar = (C0169i) mo710a(i, i2, i3, charSequence);
        C0184o oVar = new C0184o(this.f545a, this, iVar);
        iVar.mo914a(oVar);
        return oVar;
    }

    public MenuItem add(int i, int i2, int i3, int i4) {
        return mo710a(i, i2, i3, this.f546b.getString(i4));
    }

    /* renamed from: b */
    public void mo738b(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((C0184o) item.getSubMenu()).mo738b(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(mo750d(), sparseArray);
        }
    }

    /* renamed from: c */
    public ArrayList<C0169i> mo743c() {
        mo737b();
        return this.f553i;
    }

    /* renamed from: f */
    public C0169i mo754f() {
        return this.f568x;
    }

    /* renamed from: a */
    private boolean m558a(C0184o oVar, MenuPresenter menuPresenter) {
        boolean z = false;
        if (this.f567w.isEmpty()) {
            return false;
        }
        if (menuPresenter != null) {
            z = menuPresenter.onSubMenuSelected(oVar);
        }
        Iterator it = this.f567w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter2 = (MenuPresenter) weakReference.get();
            if (menuPresenter2 == null) {
                this.f567w.remove(weakReference);
            } else if (!z) {
                z = menuPresenter2.onSubMenuSelected(oVar);
            }
        }
        return z;
    }

    /* renamed from: e */
    public Context mo752e() {
        return this.f545a;
    }

    public SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, (CharSequence) this.f546b.getString(i4));
    }

    /* renamed from: c */
    public void mo745c(boolean z) {
        this.f570z = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public MenuBuilder mo753e(int i) {
        m556a(i, null, 0, null, null);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public void mo751d(C0169i iVar) {
        this.f552h = true;
        mo740b(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public MenuBuilder mo749d(int i) {
        m556a(0, null, i, null, null);
        return this;
    }

    /* renamed from: a */
    public void mo716a(Bundle bundle) {
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(mo750d());
            int size = size();
            for (int i = 0; i < size; i++) {
                MenuItem item = getItem(i);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((C0184o) item.getSubMenu()).mo716a(bundle);
                }
            }
            int i2 = bundle.getInt("android:menu:expandedactionview");
            if (i2 > 0) {
                MenuItem findItem = findItem(i2);
                if (findItem != null) {
                    findItem.expandActionView();
                }
            }
        }
    }

    /* renamed from: b */
    public int mo736b(int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0169i) this.f550f.get(i2)).getItemId() == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public void mo740b(boolean z) {
        if (!this.f561q) {
            if (z) {
                this.f552h = true;
                this.f555k = true;
            }
            m559d(z);
            return;
        }
        this.f562r = true;
        if (z) {
            this.f563s = true;
        }
    }

    /* renamed from: a */
    public void mo718a(Callback callback) {
        this.f549e = callback;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuItem mo710a(int i, int i2, int i3, CharSequence charSequence) {
        int f = m561f(i3);
        C0169i a = m555a(i, i2, i3, f, charSequence, this.f556l);
        ContextMenuInfo contextMenuInfo = this.f557m;
        if (contextMenuInfo != null) {
            a.mo913a(contextMenuInfo);
        }
        ArrayList<C0169i> arrayList = this.f550f;
        arrayList.add(m554a(arrayList, f), a);
        mo740b(true);
        return a;
    }

    /* renamed from: b */
    public void mo737b() {
        ArrayList n = mo766n();
        if (this.f555k) {
            Iterator it = this.f567w.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    this.f567w.remove(weakReference);
                } else {
                    z |= menuPresenter.flagActionItems();
                }
            }
            if (z) {
                this.f553i.clear();
                this.f554j.clear();
                int size = n.size();
                for (int i = 0; i < size; i++) {
                    C0169i iVar = (C0169i) n.get(i);
                    if (iVar.mo925g()) {
                        this.f553i.add(iVar);
                    } else {
                        this.f554j.add(iVar);
                    }
                }
            } else {
                this.f553i.clear();
                this.f554j.clear();
                this.f554j.addAll(mo766n());
            }
            this.f555k = false;
        }
    }

    /* renamed from: a */
    private C0169i m555a(int i, int i2, int i3, int i4, CharSequence charSequence, int i5) {
        C0169i iVar = new C0169i(this, i, i2, i3, i4, charSequence, i5);
        return iVar;
    }

    /* renamed from: a */
    private void m557a(int i, boolean z) {
        if (i >= 0 && i < this.f550f.size()) {
            this.f550f.remove(i);
            if (z) {
                mo740b(true);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo717a(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f550f.size();
        mo775s();
        for (int i = 0; i < size; i++) {
            C0169i iVar = (C0169i) this.f550f.get(i);
            if (iVar.getGroupId() == groupId && iVar.mo938h() && iVar.isCheckable()) {
                iVar.mo917b(iVar == menuItem);
            }
        }
        mo772r();
    }

    /* renamed from: b */
    public boolean mo741b(C0169i iVar) {
        boolean z = false;
        if (this.f567w.isEmpty()) {
            return false;
        }
        mo775s();
        Iterator it = this.f567w.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
            if (menuPresenter == null) {
                this.f567w.remove(weakReference);
            } else {
                z = menuPresenter.expandItemActionView(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        mo772r();
        if (z) {
            this.f568x = iVar;
        }
        return z;
    }

    /* renamed from: a */
    public int mo708a(int i) {
        return mo709a(i, 0);
    }

    /* renamed from: a */
    public int mo709a(int i, int i2) {
        int size = size();
        if (i2 < 0) {
            i2 = 0;
        }
        while (i2 < size) {
            if (((C0169i) this.f550f.get(i2)).getGroupId() == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo725a(MenuBuilder menuBuilder, MenuItem menuItem) {
        Callback callback = this.f549e;
        return callback != null && callback.onMenuItemSelected(menuBuilder, menuItem);
    }

    /* renamed from: a */
    public void mo715a() {
        Callback callback = this.f549e;
        if (callback != null) {
            callback.onMenuModeChange(this);
        }
    }

    /* renamed from: a */
    private static int m554a(ArrayList<C0169i> arrayList, int i) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((C0169i) arrayList.get(size)).mo916b() <= i) {
                return size + 1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo721a(List<C0169i> list, int i, KeyEvent keyEvent) {
        boolean p = mo768p();
        int modifiers = keyEvent.getModifiers();
        KeyData keyData = new KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            int size = this.f550f.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0169i iVar = (C0169i) this.f550f.get(i2);
                if (iVar.hasSubMenu()) {
                    ((MenuBuilder) iVar.getSubMenu()).mo721a(list, i, keyEvent);
                }
                char alphabeticShortcut = p ? iVar.getAlphabeticShortcut() : iVar.getNumericShortcut();
                if (((modifiers & 69647) == ((p ? iVar.getAlphabeticModifiers() : iVar.getNumericModifiers()) & 69647)) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (p && alphabeticShortcut == 8 && i == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0169i mo714a(int i, KeyEvent keyEvent) {
        char c;
        ArrayList<C0169i> arrayList = this.f566v;
        arrayList.clear();
        mo721a((List<C0169i>) arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyData keyData = new KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0169i) arrayList.get(0);
        }
        boolean p = mo768p();
        for (int i2 = 0; i2 < size; i2++) {
            C0169i iVar = (C0169i) arrayList.get(i2);
            if (p) {
                c = iVar.getAlphabeticShortcut();
            } else {
                c = iVar.getNumericShortcut();
            }
            if ((c == keyData.meta[0] && (metaState & 2) == 0) || ((c == keyData.meta[2] && (metaState & 2) != 0) || (p && c == 8 && i == 67))) {
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean mo723a(MenuItem menuItem, int i) {
        return mo724a(menuItem, (MenuPresenter) null, i);
    }

    /* renamed from: a */
    public boolean mo724a(MenuItem menuItem, MenuPresenter menuPresenter, int i) {
        C0169i iVar = (C0169i) menuItem;
        if (iVar == null || !iVar.isEnabled()) {
            return false;
        }
        boolean f = iVar.mo924f();
        ActionProvider supportActionProvider = iVar.getSupportActionProvider();
        boolean z = supportActionProvider != null && supportActionProvider.mo1022a();
        if (iVar.mo922e()) {
            f |= iVar.expandActionView();
            if (f) {
                mo722a(true);
            }
        } else if (iVar.hasSubMenu() || z) {
            if ((i & 4) == 0) {
                mo722a(false);
            }
            if (!iVar.hasSubMenu()) {
                iVar.mo914a(new C0184o(mo752e(), this, iVar));
            }
            C0184o oVar = (C0184o) iVar.getSubMenu();
            if (z) {
                supportActionProvider.mo1021a((SubMenu) oVar);
            }
            f |= m558a(oVar, menuPresenter);
            if (!f) {
                mo722a(true);
            }
        } else if ((i & 1) == 0) {
            mo722a(true);
        }
        return f;
    }

    /* renamed from: a */
    public final void mo722a(boolean z) {
        if (!this.f565u) {
            this.f565u = true;
            Iterator it = this.f567w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    this.f567w.remove(weakReference);
                } else {
                    menuPresenter.onCloseMenu(this, z);
                }
            }
            this.f565u = false;
        }
    }

    /* renamed from: a */
    private void m556a(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        Resources l = mo764l();
        if (view != null) {
            this.f560p = view;
            this.f558n = null;
            this.f559o = null;
        } else {
            if (i > 0) {
                this.f558n = l.getText(i);
            } else if (charSequence != null) {
                this.f558n = charSequence;
            }
            if (i2 > 0) {
                this.f559o = C0540a.m2546c(mo752e(), i2);
            } else if (drawable != null) {
                this.f559o = drawable;
            }
            this.f560p = null;
        }
        mo740b(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuBuilder mo713a(CharSequence charSequence) {
        m556a(0, charSequence, 0, null, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuBuilder mo711a(Drawable drawable) {
        m556a(0, null, 0, drawable, null);
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public MenuBuilder mo712a(View view) {
        m556a(0, null, 0, null, view);
        return this;
    }

    /* renamed from: a */
    public boolean mo726a(C0169i iVar) {
        boolean z = false;
        if (!this.f567w.isEmpty() && this.f568x == iVar) {
            mo775s();
            Iterator it = this.f567w.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                MenuPresenter menuPresenter = (MenuPresenter) weakReference.get();
                if (menuPresenter == null) {
                    this.f567w.remove(weakReference);
                } else {
                    z = menuPresenter.collapseItemActionView(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            mo772r();
            if (z) {
                this.f568x = null;
            }
        }
        return z;
    }
}
