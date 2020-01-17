package app.zenly.locator.cards.framework;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.locator.R;
import app.zenly.locator.cards.C1809h;
import app.zenly.locator.cards.models.Card;
import app.zenly.locator.username.idcard.BokehView;
import app.zenly.locator.username.idcard.C6019a;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;

public abstract class CardFragment extends C1321b {

    /* renamed from: f */
    private boolean f5941f;

    /* renamed from: g */
    private View f5942g;

    /* renamed from: h */
    protected Card f5943h;

    /* renamed from: i */
    private CardHandler f5944i;

    /* renamed from: j */
    private boolean f5945j;

    /* renamed from: k */
    private HashMap f5946k;

    public interface ActionHandler {
        void onUserSelected(String str);
    }

    public interface CardHandler {
        void onCardCreated(Tiltable tiltable);

        void onCardDestroyed(Tiltable tiltable);

        void onCardTappedOutside();

        void onMeasured(int i);
    }

    public interface ModelListener {
        void onModelChanged(Card card);
    }

    /* renamed from: app.zenly.locator.cards.framework.CardFragment$a */
    public static final class C1804a {
        private C1804a() {
        }

        public /* synthetic */ C1804a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.cards.framework.CardFragment$b */
    static final class C1805b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CardFragment f5947e;

        C1805b(CardFragment cardFragment) {
            this.f5947e = cardFragment;
        }

        public final void onClick(View view) {
            CardHandler b = this.f5947e.mo6614b();
            if (b != null) {
                b.onCardTappedOutside();
            }
        }
    }

    static {
        new C1804a(null);
    }

    /* renamed from: e */
    private final void m7233e() {
        if (!this.f5941f && isResumed() && !this.f5945j) {
            this.f5941f = true;
            mo7415a(true);
        } else if (!this.f5941f) {
        } else {
            if (!isResumed() || this.f5945j) {
                this.f5941f = false;
                mo7415a(false);
            }
        }
    }

    /* renamed from: f */
    private final void m7234f() {
        View view = this.f5942g;
        if (view instanceof CardLayout) {
            String str = "null cannot be cast to non-null type app.zenly.locator.cards.framework.CardLayout";
            if (view != null) {
                ((CardLayout) view).setCardHandler(this.f5944i);
                CardHandler cardHandler = this.f5944i;
                if (cardHandler != null) {
                    View view2 = this.f5942g;
                    if (view2 != null) {
                        cardHandler.onCardCreated((CardLayout) view2);
                        return;
                    }
                    throw new TypeCastException(str);
                }
                return;
            }
            throw new TypeCastException(str);
        }
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f5946k;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    /* renamed from: a */
    public final void mo7410a(ActionHandler actionHandler) {
    }

    /* renamed from: a */
    public final void mo7411a(CardHandler cardHandler) {
        this.f5944i = cardHandler;
        m7234f();
    }

    /* renamed from: a */
    public final void mo7412a(ModelListener modelListener) {
    }

    /* renamed from: a */
    public abstract void mo7413a(C1809h hVar);

    /* renamed from: b */
    public final CardHandler mo6614b() {
        return this.f5944i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final Card mo7417c() {
        Card card = this.f5943h;
        if (card != null) {
            return card;
        }
        C12932j.m33820c("model");
        throw null;
    }

    /* renamed from: d */
    public final boolean mo7418d() {
        return this.f5941f;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            Parcelable parcelable = arguments.getParcelable("arg:model");
            if (parcelable != null) {
                this.f5943h = (Card) parcelable;
                mo7416b(bundle != null ? bundle.getBoolean("state:isFrozen") : this.f5945j);
                return;
            }
            C12932j.m33814a();
            throw null;
        }
        C12932j.m33814a();
        throw null;
    }

    public void onDestroyView() {
        CardHandler cardHandler = this.f5944i;
        if (cardHandler != null) {
            View view = this.f5942g;
            if (view != null) {
                cardHandler.onCardDestroyed((Tiltable) view);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.framework.Tiltable");
            }
        }
        super.onDestroyView();
        mo6508a();
    }

    public void onPause() {
        m7233e();
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        m7233e();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C12932j.m33818b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("state:isFrozen", this.f5945j);
    }

    public void onViewCreated(View view, Bundle bundle) {
        View view2;
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        if (view instanceof CardLayout) {
            view2 = view;
        } else {
            view2 = view.findViewById(R.id.card_layout);
        }
        this.f5942g = view2;
        view.setOnClickListener(new C1805b(this));
        m7234f();
    }

    /* renamed from: b */
    public final void mo7416b(boolean z) {
        this.f5945j = z;
        m7233e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Bundle mo7406a(Card card) {
        C12932j.m33818b(card, "model");
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg:model", card);
        return bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo7415a(boolean z) {
        if (z) {
            View view = this.f5942g;
            if (!(view instanceof CardLayout)) {
                return;
            }
            if (view != null) {
                ((CardLayout) view).mo2248a();
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.framework.CardLayout");
        }
    }

    /* renamed from: a */
    public final Bitmap mo7405a(Config config, Drawable drawable) {
        C12932j.m33818b(config, "config");
        C12932j.m33818b(drawable, "background");
        View view = this.f5942g;
        if (!(view instanceof Screenshotable)) {
            return null;
        }
        if (view != null) {
            return ((Screenshotable) view).takeScreenshot(config, drawable);
        }
        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.framework.Screenshotable");
    }

    /* renamed from: a */
    public void mo7408a(TextView textView) {
        C12932j.m33818b(textView, "title");
        textView.setVisibility(8);
        textView.setText(null);
    }

    /* renamed from: a */
    public void mo7409a(TextView textView, TextView textView2) {
        C12932j.m33818b(textView, "actionButton");
        C12932j.m33818b(textView2, "actionButtonBadge");
        textView.setVisibility(8);
        textView2.setVisibility(4);
    }

    /* renamed from: a */
    public void mo7407a(ImageButton imageButton) {
        C12932j.m33818b(imageButton, "settings");
        imageButton.setVisibility(8);
    }

    /* renamed from: a */
    public void mo7414a(BokehView bokehView, BokehView bokehView2) {
        C12932j.m33818b(bokehView, "backgroundBokehView");
        C12932j.m33818b(bokehView2, "foregroundBokehView");
        Card card = this.f5943h;
        String str = "model";
        if (card != null) {
            if (C12932j.m33817a((Object) card.mo7547a(), (Object) C6019a.f15150h.mo13789b())) {
                bokehView.setVisibility(8);
            } else {
                bokehView.setVisibility(0);
                Card card2 = this.f5943h;
                if (card2 != null) {
                    bokehView.mo13728a(card2.mo7547a());
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            }
            bokehView2.setVisibility(8);
            return;
        }
        C12932j.m33820c(str);
        throw null;
    }
}
