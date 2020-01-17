package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0166f;
import androidx.appcompat.view.menu.C0169i;
import androidx.appcompat.view.menu.ListMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.p */
public class C0269p extends ListPopupWindow implements MenuItemHoverListener {

    /* renamed from: N */
    private static Method f1234N;

    /* renamed from: M */
    private MenuItemHoverListener f1235M;

    /* renamed from: androidx.appcompat.widget.p$a */
    public static class C0270a extends C0263n {

        /* renamed from: s */
        final int f1236s;

        /* renamed from: t */
        final int f1237t;

        /* renamed from: u */
        private MenuItemHoverListener f1238u;

        /* renamed from: v */
        private MenuItem f1239v;

        public C0270a(Context context, boolean z) {
            super(context, z);
            Configuration configuration = context.getResources().getConfiguration();
            if (VERSION.SDK_INT < 17 || 1 != configuration.getLayoutDirection()) {
                this.f1236s = 22;
                this.f1237t = 21;
                return;
            }
            this.f1236s = 21;
            this.f1237t = 22;
        }

        public boolean onHoverEvent(MotionEvent motionEvent) {
            int i;
            C0166f fVar;
            if (this.f1238u != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i = headerViewListAdapter.getHeadersCount();
                    fVar = (C0166f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    i = 0;
                    fVar = (C0166f) adapter;
                }
                C0169i iVar = null;
                if (motionEvent.getAction() != 10) {
                    int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                    if (pointToPosition != -1) {
                        int i2 = pointToPosition - i;
                        if (i2 >= 0 && i2 < fVar.getCount()) {
                            iVar = fVar.getItem(i2);
                        }
                    }
                }
                MenuItem menuItem = this.f1239v;
                if (menuItem != iVar) {
                    MenuBuilder b = fVar.mo900b();
                    if (menuItem != null) {
                        this.f1238u.onItemHoverExit(b, menuItem);
                    }
                    this.f1239v = iVar;
                    if (iVar != null) {
                        this.f1238u.onItemHoverEnter(b, iVar);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        public boolean onKeyDown(int i, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i == this.f1236s) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            } else if (listMenuItemView == null || i != this.f1237t) {
                return super.onKeyDown(i, keyEvent);
            } else {
                setSelection(-1);
                ((C0166f) getAdapter()).mo900b().mo722a(false);
                return true;
            }
        }

        public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
            this.f1238u = menuItemHoverListener;
        }

        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            f1234N = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[]{Boolean.TYPE});
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public C0269p(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C0263n mo1558a(Context context, boolean z) {
        C0270a aVar = new C0270a(context, z);
        aVar.setHoverListener(this);
        return aVar;
    }

    /* renamed from: b */
    public void mo1989b(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f928I.setExitTransition((Transition) obj);
        }
    }

    /* renamed from: c */
    public void mo1990c(boolean z) {
        Method method = f1234N;
        if (method != null) {
            try {
                method.invoke(this.f928I, new Object[]{Boolean.valueOf(z)});
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    public void onItemHoverEnter(MenuBuilder menuBuilder, MenuItem menuItem) {
        MenuItemHoverListener menuItemHoverListener = this.f1235M;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.onItemHoverEnter(menuBuilder, menuItem);
        }
    }

    public void onItemHoverExit(MenuBuilder menuBuilder, MenuItem menuItem) {
        MenuItemHoverListener menuItemHoverListener = this.f1235M;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.onItemHoverExit(menuBuilder, menuItem);
        }
    }

    /* renamed from: a */
    public void mo1988a(Object obj) {
        if (VERSION.SDK_INT >= 23) {
            this.f928I.setEnterTransition((Transition) obj);
        }
    }

    /* renamed from: a */
    public void mo1987a(MenuItemHoverListener menuItemHoverListener) {
        this.f1235M = menuItemHoverListener;
    }
}
