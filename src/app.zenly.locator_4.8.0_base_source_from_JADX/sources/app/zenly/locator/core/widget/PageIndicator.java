package app.zenly.locator.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.C0657l;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.locator.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

public final class PageIndicator extends LinearLayout {

    /* renamed from: v */
    private Adapter f9096v;

    /* renamed from: w */
    private OnItemClickListener f9097w;

    public interface Adapter {
        int getCount();

        int getIcon(int i);
    }

    public interface OnItemClickListener {
        void onItemClick(PageIndicator pageIndicator, int i);
    }

    /* renamed from: app.zenly.locator.core.widget.PageIndicator$a */
    public static final class C3256a {
        private C3256a() {
        }

        public /* synthetic */ C3256a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.core.widget.PageIndicator$b */
    public static final class C3257b implements Adapter {
        C3257b() {
        }

        public int getCount() {
            return 6;
        }

        public int getIcon(int i) {
            if (i == 0) {
                return 2131231408;
            }
            if (1 <= i && 3 >= i) {
                return R.drawable.icon_dot_size_24;
            }
            return 2131231501;
        }
    }

    /* renamed from: app.zenly.locator.core.widget.PageIndicator$c */
    static final class C3258c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ PageIndicator f9098e;

        /* renamed from: f */
        final /* synthetic */ int f9099f;

        C3258c(PageIndicator pageIndicator, int i) {
            this.f9098e = pageIndicator;
            this.f9099f = i;
        }

        public final void onClick(View view) {
            OnItemClickListener onItemClickListener = this.f9098e.getOnItemClickListener();
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(this.f9098e, this.f9099f);
            }
        }
    }

    static {
        new C3256a(null);
    }

    public PageIndicator(Context context) {
        this(context, null, 0, 6, null);
    }

    public PageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PageIndicator(Context context, AttributeSet attributeSet, int i, int i2, C12928f fVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: b */
    private final View m10358b() {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_page_indicator, this, false);
        addView(inflate);
        C12932j.m33815a((Object) inflate, "item");
        return inflate;
    }

    /* renamed from: c */
    private final void m10359c() {
        if (isInEditMode()) {
            setAdapter(new C3257b());
        }
    }

    /* renamed from: a */
    public final void mo6846a() {
        Adapter adapter = this.f9096v;
        int i = 0;
        if (adapter != null) {
            int count = adapter.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                View childAt = getChildAt(i2);
                if (childAt == null) {
                    childAt = m10358b();
                }
                m10357a(childAt, adapter, i2);
            }
        }
        Adapter adapter2 = this.f9096v;
        if (adapter2 != null) {
            i = adapter2.getCount();
        }
        int childCount = getChildCount() - 1;
        if (childCount >= i) {
            while (true) {
                if (childCount - i >= 4) {
                    removeView(C0657l.m3058a(this, childCount));
                } else {
                    C0657l.m3058a(this, childCount).setVisibility(8);
                }
                if (childCount != i) {
                    childCount--;
                } else {
                    return;
                }
            }
        }
    }

    public final Adapter getAdapter() {
        return this.f9096v;
    }

    public final OnItemClickListener getOnItemClickListener() {
        return this.f9097w;
    }

    public final void setAdapter(Adapter adapter) {
        this.f9096v = adapter;
        mo6846a();
    }

    public final void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.f9097w = onItemClickListener;
    }

    public final void setSelection(int i) {
        Adapter adapter = this.f9096v;
        if (adapter != null) {
            int count = adapter.getCount();
            if (i < 0 || count <= i) {
                i = -1;
            }
            int childCount = getChildCount();
            int i2 = 0;
            while (i2 < childCount) {
                View childAt = getChildAt(i2);
                C12932j.m33815a((Object) childAt, "getChildAt(index)");
                childAt.setSelected(i2 == i);
                i2++;
            }
        }
    }

    public PageIndicator(Context context, AttributeSet attributeSet, int i) {
        C12932j.m33818b(context, "context");
        super(context, attributeSet, i);
        setOrientation(0);
        m10359c();
    }

    /* renamed from: a */
    private final void m10357a(View view, Adapter adapter, int i) {
        view.setVisibility(0);
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ((LinearLayout.LayoutParams) layoutParams).f4917a = 1.0f;
            ImageView imageView = (ImageView) view.findViewById(R.id.item_page_indicator_image);
            C12932j.m33815a((Object) imageView, "imageView");
            LayoutParams layoutParams2 = imageView.getLayoutParams();
            if (layoutParams2 != null) {
                ((FrameLayout.LayoutParams) layoutParams2).gravity = getGravity();
                imageView.setImageResource(adapter.getIcon(i));
                view.setOnClickListener(new C3258c(this, i));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.android.base.widget.LinearLayout.LayoutParams");
    }
}
