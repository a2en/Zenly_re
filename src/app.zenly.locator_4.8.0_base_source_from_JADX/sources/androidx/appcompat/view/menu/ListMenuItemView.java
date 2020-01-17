package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.SelectionBoundsAdjuster;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuView.ItemView;
import androidx.appcompat.widget.C0291z;
import androidx.core.view.ViewCompat;
import p214e.p215a.C7521a;
import p214e.p215a.C7526f;
import p214e.p215a.C7527g;
import p214e.p215a.C7530j;

public class ListMenuItemView extends LinearLayout implements ItemView, SelectionBoundsAdjuster {

    /* renamed from: e */
    private C0169i f527e;

    /* renamed from: f */
    private ImageView f528f;

    /* renamed from: g */
    private RadioButton f529g;

    /* renamed from: h */
    private TextView f530h;

    /* renamed from: i */
    private CheckBox f531i;

    /* renamed from: j */
    private TextView f532j;

    /* renamed from: k */
    private ImageView f533k;

    /* renamed from: l */
    private ImageView f534l;

    /* renamed from: m */
    private LinearLayout f535m;

    /* renamed from: n */
    private Drawable f536n;

    /* renamed from: o */
    private int f537o;

    /* renamed from: p */
    private Context f538p;

    /* renamed from: q */
    private boolean f539q;

    /* renamed from: r */
    private Drawable f540r;

    /* renamed from: s */
    private boolean f541s;

    /* renamed from: t */
    private LayoutInflater f542t;

    /* renamed from: u */
    private boolean f543u;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7521a.listMenuViewStyle);
    }

    /* renamed from: a */
    private void m550a(View view) {
        m551a(view, -1);
    }

    /* renamed from: b */
    private void m552b() {
        this.f528f = (ImageView) getInflater().inflate(C7527g.abc_list_menu_item_icon, this, false);
        m551a(this.f528f, 0);
    }

    /* renamed from: c */
    private void m553c() {
        this.f529g = (RadioButton) getInflater().inflate(C7527g.abc_list_menu_item_radio, this, false);
        m550a(this.f529g);
    }

    private LayoutInflater getInflater() {
        if (this.f542t == null) {
            this.f542t = LayoutInflater.from(getContext());
        }
        return this.f542t;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f533k;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f534l;
        if (imageView != null && imageView.getVisibility() == 0) {
            LayoutParams layoutParams = (LayoutParams) this.f534l.getLayoutParams();
            rect.top += this.f534l.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
        }
    }

    public C0169i getItemData() {
        return this.f527e;
    }

    public void initialize(C0169i iVar, int i) {
        this.f527e = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.mo911a((ItemView) this));
        setCheckable(iVar.isCheckable());
        setShortcut(iVar.mo946k(), iVar.mo918c());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        ViewCompat.m2822a((View) this, this.f536n);
        this.f530h = (TextView) findViewById(C7526f.title);
        int i = this.f537o;
        if (i != -1) {
            this.f530h.setTextAppearance(this.f538p, i);
        }
        this.f532j = (TextView) findViewById(C7526f.shortcut);
        this.f533k = (ImageView) findViewById(C7526f.submenuarrow);
        ImageView imageView = this.f533k;
        if (imageView != null) {
            imageView.setImageDrawable(this.f540r);
        }
        this.f534l = (ImageView) findViewById(C7526f.group_divider);
        this.f535m = (LinearLayout) findViewById(C7526f.content);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        if (this.f528f != null && this.f539q) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) this.f528f.getLayoutParams();
            if (layoutParams.height > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = layoutParams.height;
            }
        }
        super.onMeasure(i, i2);
    }

    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (z || this.f529g != null || this.f531i != null) {
            if (this.f527e.mo938h()) {
                if (this.f529g == null) {
                    m553c();
                }
                compoundButton2 = this.f529g;
                compoundButton = this.f531i;
            } else {
                if (this.f531i == null) {
                    m549a();
                }
                compoundButton2 = this.f531i;
                compoundButton = this.f529g;
            }
            if (z) {
                compoundButton2.setChecked(this.f527e.isChecked());
                if (compoundButton2.getVisibility() != 0) {
                    compoundButton2.setVisibility(0);
                }
                if (!(compoundButton == null || compoundButton.getVisibility() == 8)) {
                    compoundButton.setVisibility(8);
                }
            } else {
                CheckBox checkBox = this.f531i;
                if (checkBox != null) {
                    checkBox.setVisibility(8);
                }
                RadioButton radioButton = this.f529g;
                if (radioButton != null) {
                    radioButton.setVisibility(8);
                }
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f527e.mo938h()) {
            if (this.f529g == null) {
                m553c();
            }
            compoundButton = this.f529g;
        } else {
            if (this.f531i == null) {
                m549a();
            }
            compoundButton = this.f531i;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.f543u = z;
        this.f539q = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.f534l;
        if (imageView != null) {
            imageView.setVisibility((this.f541s || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f527e.mo945j() || this.f543u;
        if (!z && !this.f539q) {
            return;
        }
        if (this.f528f != null || drawable != null || this.f539q) {
            if (this.f528f == null) {
                m552b();
            }
            if (drawable != null || this.f539q) {
                ImageView imageView = this.f528f;
                if (!z) {
                    drawable = null;
                }
                imageView.setImageDrawable(drawable);
                if (this.f528f.getVisibility() != 0) {
                    this.f528f.setVisibility(0);
                }
            } else {
                this.f528f.setVisibility(8);
            }
        }
    }

    public void setShortcut(boolean z, char c) {
        int i = (!z || !this.f527e.mo946k()) ? 8 : 0;
        if (i == 0) {
            this.f532j.setText(this.f527e.mo920d());
        }
        if (this.f532j.getVisibility() != i) {
            this.f532j.setVisibility(i);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f530h.setText(charSequence);
            if (this.f530h.getVisibility() != 0) {
                this.f530h.setVisibility(0);
            }
        } else if (this.f530h.getVisibility() != 8) {
            this.f530h.setVisibility(8);
        }
    }

    public boolean showsIcon() {
        return this.f543u;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        C0291z a = C0291z.m1196a(getContext(), attributeSet, C7530j.MenuView, i, 0);
        this.f536n = a.mo2106b(C7530j.MenuView_android_itemBackground);
        this.f537o = a.mo2115g(C7530j.MenuView_android_itemTextAppearance, -1);
        this.f539q = a.mo2103a(C7530j.MenuView_preserveIconSpacing, false);
        this.f538p = context;
        this.f540r = a.mo2106b(C7530j.MenuView_subMenuArrow);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, C7521a.dropDownListViewStyle, 0);
        this.f541s = obtainStyledAttributes.hasValue(0);
        a.mo2102a();
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m551a(View view, int i) {
        LinearLayout linearLayout = this.f535m;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    /* renamed from: a */
    private void m549a() {
        this.f531i = (CheckBox) getInflater().inflate(C7527g.abc_list_menu_item_checkbox, this, false);
        m550a(this.f531i);
    }
}
