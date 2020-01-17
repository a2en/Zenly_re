package zendesk.belvedere;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import androidx.core.content.C0540a;
import androidx.core.graphics.drawable.C0559a;
import androidx.core.util.C0603e;
import androidx.core.view.C0661n;
import androidx.core.view.ViewCompat;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.p428s.C13533a;
import zendesk.belvedere.p428s.C13535c;
import zendesk.belvedere.p428s.C13537e;
import zendesk.belvedere.p428s.C13538f;
import zendesk.belvedere.p428s.C13539g;
import zendesk.belvedere.p428s.C13540h;
import zendesk.belvedere.p428s.C13541i;

public class FloatingActionMenu extends LinearLayout implements OnClickListener {

    /* renamed from: e */
    private FloatingActionButton f34933e;

    /* renamed from: f */
    private LayoutInflater f34934f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C0603e<FloatingActionButton, OnClickListener>> f34935g;

    /* renamed from: h */
    private boolean f34936h;

    /* renamed from: i */
    private int f34937i;

    /* renamed from: j */
    private int f34938j;

    /* renamed from: k */
    private int f34939k;

    /* renamed from: l */
    private C13475c f34940l = new C13474b();

    /* renamed from: zendesk.belvedere.FloatingActionMenu$a */
    class C13473a extends C13475c {

        /* renamed from: e */
        final /* synthetic */ C0603e f34941e;

        C13473a(FloatingActionMenu floatingActionMenu, C0603e eVar) {
            this.f34941e = eVar;
            super(floatingActionMenu, null);
        }

        public void onAnimationEnd(Animation animation) {
            ((FloatingActionButton) this.f34941e.f2729a).setVisibility(4);
        }
    }

    /* renamed from: zendesk.belvedere.FloatingActionMenu$b */
    class C13474b extends C13475c {
        C13474b() {
            super(FloatingActionMenu.this, null);
        }

        public void onAnimationEnd(Animation animation) {
            for (C0603e eVar : FloatingActionMenu.this.f34935g) {
                ((FloatingActionButton) eVar.f2729a).setVisibility(8);
            }
        }
    }

    /* renamed from: zendesk.belvedere.FloatingActionMenu$c */
    private abstract class C13475c implements AnimationListener {
        private C13475c(FloatingActionMenu floatingActionMenu) {
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }

        /* synthetic */ C13475c(FloatingActionMenu floatingActionMenu, C13473a aVar) {
            this(floatingActionMenu);
        }
    }

    public FloatingActionMenu(Context context) {
        super(context);
        m35657a(context);
    }

    /* renamed from: b */
    private void m35659b(boolean z) {
        long j = 0;
        if (z) {
            for (C0603e eVar : this.f34935g) {
                Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C13533a.belvedere_show_menu_item);
                loadAnimation.setRepeatMode(2);
                loadAnimation.setStartOffset(j);
                ((FloatingActionButton) eVar.f2729a).setVisibility(0);
                ((FloatingActionButton) eVar.f2729a).startAnimation(loadAnimation);
                j += (long) this.f34939k;
            }
            return;
        }
        Animation animation = null;
        int size = this.f34935g.size() - 1;
        while (size >= 0) {
            C0603e eVar2 = (C0603e) this.f34935g.get(size);
            Animation loadAnimation2 = AnimationUtils.loadAnimation(getContext(), C13533a.belvedere_hide_menu_item);
            loadAnimation2.setRepeatMode(2);
            loadAnimation2.setStartOffset(j);
            loadAnimation2.setAnimationListener(new C13473a(this, eVar2));
            ((FloatingActionButton) eVar2.f2729a).startAnimation(loadAnimation2);
            j += (long) this.f34939k;
            size--;
            animation = loadAnimation2;
        }
        if (animation != null) {
            animation.setAnimationListener(this.f34940l);
        }
    }

    public void onClick(View view) {
        if (this.f34935g.size() == 1) {
            C0603e eVar = (C0603e) this.f34935g.get(0);
            ((OnClickListener) eVar.f2730b).onClick((View) eVar.f2729a);
            return;
        }
        this.f34936h = !this.f34936h;
        m35659b(this.f34936h);
        m35658a(this.f34936h);
        if (this.f34936h) {
            this.f34933e.setContentDescription(getResources().getString(C13541i.belvedere_fam_desc_collapse_fam));
        } else {
            this.f34933e.setContentDescription(getResources().getString(C13541i.belvedere_fam_desc_expand_fam));
        }
    }

    /* renamed from: a */
    private void m35657a(Context context) {
        LinearLayout.inflate(context, C13540h.belvedere_floating_action_menu, this);
        if (!isInEditMode()) {
            setOrientation(1);
            setOnClickListener(this);
            this.f34933e = (FloatingActionButton) findViewById(C13538f.floating_action_menu_fab);
            this.f34934f = LayoutInflater.from(context);
            this.f34935g = new ArrayList();
            Resources resources = getResources();
            this.f34937i = resources.getInteger(C13539g.belvedere_fam_animation_duration);
            this.f34938j = resources.getInteger(C13539g.belvedere_fam_animation_rotation_angle);
            this.f34939k = getResources().getInteger(C13539g.belvedere_fam_animation_delay_subsequent_item);
        }
    }

    public FloatingActionMenu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m35657a(context);
    }

    public FloatingActionMenu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m35657a(context);
    }

    public FloatingActionMenu(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m35657a(context);
    }

    /* renamed from: a */
    private void m35658a(boolean z) {
        float f = z ? (float) this.f34938j : 0.0f;
        C0661n a = ViewCompat.m2813a(this.f34933e);
        a.mo3434b(f);
        a.mo3428a((long) this.f34937i);
        a.mo3437c();
    }

    /* renamed from: a */
    public void mo38762a(int i, int i2, int i3, OnClickListener onClickListener) {
        FloatingActionButton floatingActionButton = (FloatingActionButton) this.f34934f.inflate(C13540h.belvedere_floating_action_menu_item, this, false);
        floatingActionButton.setOnClickListener(onClickListener);
        floatingActionButton.setImageDrawable(m35655a(i, C13535c.belvedere_floating_action_menu_item_icon_color));
        floatingActionButton.setId(i2);
        floatingActionButton.setContentDescription(getResources().getString(i3));
        this.f34935g.add(C0603e.m2769a(floatingActionButton, onClickListener));
        if (this.f34935g.size() == 1) {
            this.f34933e.setImageDrawable(m35655a(i, C13535c.belvedere_floating_action_menu_icon_color));
            this.f34933e.setContentDescription(getResources().getString(i3));
        } else if (this.f34935g.size() == 2) {
            addView((View) ((C0603e) this.f34935g.get(0)).f2729a, 0);
            addView(floatingActionButton, 0);
            this.f34933e.setImageDrawable(m35655a(C13537e.belvedere_fam_icon_add, C13535c.belvedere_floating_action_menu_icon_color));
            this.f34933e.setContentDescription(getResources().getString(C13541i.belvedere_fam_desc_expand_fam));
        } else {
            addView(floatingActionButton, 0);
        }
        setVisibility(0);
    }

    /* renamed from: a */
    private Drawable m35655a(int i, int i2) {
        Context context = getContext();
        Drawable i3 = C0559a.m2657i(C0540a.m2546c(context, i));
        C0559a.m2650b(i3, C0540a.m2536a(context, i2));
        return i3;
    }
}
