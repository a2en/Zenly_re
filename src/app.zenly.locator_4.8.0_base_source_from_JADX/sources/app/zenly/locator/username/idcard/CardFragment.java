package app.zenly.locator.username.idcard;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0540a;
import app.zenly.android.feature.base.app.C1321b;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.cards.framework.Screenshotable;
import app.zenly.locator.cards.framework.Tiltable;
import app.zenly.locator.cards.framework.widget.CardBackgroundView;
import java.util.HashMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C12932j;
import kotlin.jvm.internal.C12934l;
import kotlin.jvm.internal.C12935m;
import kotlin.jvm.internal.C12946x;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import p250f.p251a.p252a.p253a.p255e.C7662d;
import p250f.p251a.p252a.p253a.p256f.p257a.C7674a;

public final class CardFragment extends C1321b {

    /* renamed from: m */
    static final /* synthetic */ KProperty[] f15061m;

    /* renamed from: n */
    public static final C5988a f15062n = new C5988a(null);

    /* renamed from: f */
    private final ReadWriteProperty f15063f = C7662d.m18671c();

    /* renamed from: g */
    private final ReadWriteProperty f15064g = C7662d.m18671c();

    /* renamed from: h */
    private final ReadWriteProperty f15065h = C7662d.m18661a(0, 1, (Object) null);

    /* renamed from: i */
    private C6027e f15066i;

    /* renamed from: j */
    private View f15067j;

    /* renamed from: k */
    private Callback f15068k;

    /* renamed from: l */
    private HashMap f15069l;

    public interface Callback {
        void onCardCreated(Tiltable tiltable);

        void onCardDestroyed(Tiltable tiltable);

        void onCardTapped(CardFragment cardFragment);

        void onCardTappedOutside();
    }

    /* renamed from: app.zenly.locator.username.idcard.CardFragment$a */
    public static final class C5988a {
        private C5988a() {
        }

        /* renamed from: a */
        public final CardFragment mo13750a(String str, String str2, int i) {
            C12932j.m33818b(str, "name");
            C12932j.m33818b(str2, "url");
            CardFragment cardFragment = new CardFragment();
            cardFragment.m16601a(str);
            cardFragment.m16604b(str2);
            cardFragment.m16602b(i);
            return cardFragment;
        }

        public /* synthetic */ C5988a(C12928f fVar) {
            this();
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardFragment$b */
    static final class C5989b implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CardFragment f15070e;

        C5989b(CardFragment cardFragment) {
            this.f15070e = cardFragment;
        }

        public final void onClick(View view) {
            Callback b = this.f15070e.mo6614b();
            if (b != null) {
                b.onCardTapped(this.f15070e);
            }
        }
    }

    /* renamed from: app.zenly.locator.username.idcard.CardFragment$c */
    static final class C5990c implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ CardFragment f15071e;

        C5990c(CardFragment cardFragment) {
            this.f15071e = cardFragment;
        }

        public final void onClick(View view) {
            Callback b = this.f15071e.mo6614b();
            if (b != null) {
                b.onCardTappedOutside();
            }
        }
    }

    static {
        C12935m mVar = new C12935m(C12946x.m33834a(CardFragment.class), "username", "getUsername()Ljava/lang/String;");
        C12946x.m33837a((C12934l) mVar);
        C12935m mVar2 = new C12935m(C12946x.m33834a(CardFragment.class), "usernameUrl", "getUsernameUrl()Ljava/lang/String;");
        C12946x.m33837a((C12934l) mVar2);
        C12935m mVar3 = new C12935m(C12946x.m33834a(CardFragment.class), "cardStyleInfoId", "getCardStyleInfoId()I");
        C12946x.m33837a((C12934l) mVar3);
        f15061m = new KProperty[]{mVar, mVar2, mVar3};
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m16601a(String str) {
        this.f15063f.setValue(this, f15061m[0], str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m16602b(int i) {
        this.f15065h.setValue(this, f15061m[2], Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m16604b(String str) {
        this.f15064g.setValue(this, f15061m[1], str);
    }

    /* renamed from: c */
    private final int m16605c() {
        return ((Number) this.f15065h.getValue(this, f15061m[2])).intValue();
    }

    /* renamed from: d */
    private final String m16606d() {
        return (String) this.f15063f.getValue(this, f15061m[0]);
    }

    /* renamed from: e */
    private final String m16607e() {
        return (String) this.f15064g.getValue(this, f15061m[1]);
    }

    /* renamed from: f */
    private final void m16608f() {
        TextView textView = (TextView) mo13743a(C3891l.main_text);
        C12932j.m33815a((Object) textView, "main_text");
        textView.setText(m16606d());
        TextView textView2 = (TextView) mo13743a(C3891l.main_text);
        C6027e eVar = this.f15066i;
        String str = "cardStyleInfo";
        if (eVar != null) {
            textView2.setTextColor(eVar.mo13807n());
            AppCompatTextView appCompatTextView = (AppCompatTextView) mo13743a(C3891l.url);
            String str2 = "url";
            C12932j.m33815a((Object) appCompatTextView, str2);
            appCompatTextView.setText(m16607e());
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) mo13743a(C3891l.url);
            C6027e eVar2 = this.f15066i;
            if (eVar2 != null) {
                appCompatTextView2.setTextColor(eVar2.mo13807n());
                AppCompatTextView appCompatTextView3 = (AppCompatTextView) mo13743a(C3891l.url);
                C12932j.m33815a((Object) appCompatTextView3, str2);
                C6027e eVar3 = this.f15066i;
                if (eVar3 != null) {
                    appCompatTextView3.setBackgroundTintList(ColorStateList.valueOf(eVar3.mo13813t()));
                    C6027e eVar4 = this.f15066i;
                    if (eVar4 != null) {
                        if (!(eVar4.mo13811r().length == 0)) {
                            TextView textView3 = (TextView) mo13743a(C3891l.shadow_0);
                            String str3 = "shadow_0";
                            C12932j.m33815a((Object) textView3, str3);
                            textView3.setText(m16606d());
                            TextView textView4 = (TextView) mo13743a(C3891l.shadow_0);
                            C6027e eVar5 = this.f15066i;
                            if (eVar5 != null) {
                                textView4.setTextColor(eVar5.mo13811r()[0]);
                                TextView textView5 = (TextView) mo13743a(C3891l.shadow_0);
                                C12932j.m33815a((Object) textView5, str3);
                                textView5.setVisibility(0);
                                Context context = getContext();
                                if (context != null) {
                                    C12932j.m33815a((Object) context, "context!!");
                                    float integer = (float) context.getResources().getInteger(R.integer.shadow_radius_large);
                                    TextView textView6 = (TextView) mo13743a(C3891l.shadow_0);
                                    C6027e eVar6 = this.f15066i;
                                    if (eVar6 != null) {
                                        textView6.setShadowLayer(integer, 0.0f, 0.0f, eVar6.mo13808o());
                                    } else {
                                        C12932j.m33820c(str);
                                        throw null;
                                    }
                                } else {
                                    C12932j.m33814a();
                                    throw null;
                                }
                            } else {
                                C12932j.m33820c(str);
                                throw null;
                            }
                        }
                        C6027e eVar7 = this.f15066i;
                        if (eVar7 != null) {
                            if (eVar7.mo13811r().length > 1) {
                                TextView textView7 = (TextView) mo13743a(C3891l.shadow_1);
                                String str4 = "shadow_1";
                                C12932j.m33815a((Object) textView7, str4);
                                textView7.setText(m16606d());
                                TextView textView8 = (TextView) mo13743a(C3891l.shadow_1);
                                C6027e eVar8 = this.f15066i;
                                if (eVar8 != null) {
                                    textView8.setTextColor(eVar8.mo13811r()[1]);
                                    TextView textView9 = (TextView) mo13743a(C3891l.shadow_1);
                                    C12932j.m33815a((Object) textView9, str4);
                                    textView9.setVisibility(0);
                                } else {
                                    C12932j.m33820c(str);
                                    throw null;
                                }
                            }
                            C6027e eVar9 = this.f15066i;
                            if (eVar9 != null) {
                                if (eVar9.mo13811r().length > 2) {
                                    TextView textView10 = (TextView) mo13743a(C3891l.shadow_2);
                                    String str5 = "shadow_2";
                                    C12932j.m33815a((Object) textView10, str5);
                                    textView10.setText(m16606d());
                                    TextView textView11 = (TextView) mo13743a(C3891l.shadow_2);
                                    C6027e eVar10 = this.f15066i;
                                    if (eVar10 != null) {
                                        textView11.setTextColor(eVar10.mo13811r()[2]);
                                        TextView textView12 = (TextView) mo13743a(C3891l.shadow_2);
                                        C12932j.m33815a((Object) textView12, str5);
                                        textView12.setVisibility(0);
                                    } else {
                                        C12932j.m33820c(str);
                                        throw null;
                                    }
                                }
                                C6027e eVar11 = this.f15066i;
                                if (eVar11 == null) {
                                    C12932j.m33820c(str);
                                    throw null;
                                } else if (eVar11.mo13811r().length > 3) {
                                    TextView textView13 = (TextView) mo13743a(C3891l.shadow_3);
                                    String str6 = "shadow_3";
                                    C12932j.m33815a((Object) textView13, str6);
                                    textView13.setText(m16606d());
                                    TextView textView14 = (TextView) mo13743a(C3891l.shadow_3);
                                    C6027e eVar12 = this.f15066i;
                                    if (eVar12 != null) {
                                        textView14.setTextColor(eVar12.mo13811r()[3]);
                                        TextView textView15 = (TextView) mo13743a(C3891l.shadow_3);
                                        C12932j.m33815a((Object) textView15, str6);
                                        textView15.setVisibility(0);
                                        return;
                                    }
                                    C12932j.m33820c(str);
                                    throw null;
                                }
                            } else {
                                C12932j.m33820c(str);
                                throw null;
                            }
                        } else {
                            C12932j.m33820c(str);
                            throw null;
                        }
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33820c(str);
            throw null;
        }
    }

    /* renamed from: a */
    public View mo13743a(int i) {
        if (this.f15069l == null) {
            this.f15069l = new HashMap();
        }
        View view = (View) this.f15069l.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f15069l.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public void mo6508a() {
        HashMap hashMap = this.f15069l;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f15066i = C6027e.f15164E.mo13814a(m16605c());
        if (bundle != null) {
            String str = "INSTANCE_USERNAME";
            if (bundle.containsKey(str)) {
                String string = bundle.getString(str);
                if (string != null) {
                    m16601a(string);
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            }
            String str2 = "INSTANCE_USERNAME_URL";
            if (bundle.containsKey(str2)) {
                String string2 = bundle.getString(str2);
                if (string2 != null) {
                    m16604b(string2);
                } else {
                    C12932j.m33814a();
                    throw null;
                }
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C12932j.m33818b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.fragment_card, viewGroup, false);
    }

    public void onDestroyView() {
        Callback callback = this.f15068k;
        if (callback != null) {
            View view = this.f15067j;
            if (view == null) {
                C12932j.m33820c("contentView");
                throw null;
            } else if (view != null) {
                callback.onCardDestroyed((Tiltable) view);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.framework.Tiltable");
            }
        }
        super.onDestroyView();
        mo6508a();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C12932j.m33818b(bundle, "outState");
        super.onSaveInstanceState(bundle);
        bundle.putString("INSTANCE_USERNAME", m16606d());
        bundle.putString("INSTANCE_USERNAME_URL", m16607e());
    }

    public void onViewCreated(View view, Bundle bundle) {
        C12932j.m33818b(view, "view");
        super.onViewCreated(view, bundle);
        this.f15067j = view;
        Context context = getContext();
        if (context != null) {
            C12932j.m33815a((Object) context, "context!!");
            View a = mo13743a(C3891l.card_shadow);
            C6027e eVar = this.f15066i;
            String str = "cardStyleInfo";
            if (eVar != null) {
                a.setBackgroundTintList(ColorStateList.valueOf(eVar.mo13803j()));
                C6027e eVar2 = this.f15066i;
                if (eVar2 != null) {
                    a.setAlpha(eVar2.mo13804k());
                    CardBackgroundView cardBackgroundView = (CardBackgroundView) mo13743a(C3891l.card_border);
                    cardBackgroundView.setShowShine(false);
                    C6027e eVar3 = this.f15066i;
                    if (eVar3 != null) {
                        int i = eVar3.mo13796c()[0];
                        C6027e eVar4 = this.f15066i;
                        if (eVar4 != null) {
                            cardBackgroundView.mo7436a(i, eVar4.mo13796c()[1]);
                            C6027e eVar5 = this.f15066i;
                            if (eVar5 != null) {
                                if (eVar5.mo13805l() != C7674a.f19294a) {
                                    C6027e eVar6 = this.f15066i;
                                    if (eVar6 != null) {
                                        cardBackgroundView.setThicknessTint(eVar6.mo13805l());
                                    } else {
                                        C12932j.m33820c(str);
                                        throw null;
                                    }
                                } else {
                                    cardBackgroundView.setThicknessEnabled(false);
                                }
                                C6027e eVar7 = this.f15066i;
                                if (eVar7 != null) {
                                    cardBackgroundView.setAlpha(eVar7.mo13797d());
                                    CardBackgroundView cardBackgroundView2 = (CardBackgroundView) mo13743a(C3891l.card_background);
                                    C6027e eVar8 = this.f15066i;
                                    if (eVar8 != null) {
                                        cardBackgroundView2.setPatternTint(eVar8.mo13802i());
                                        C6027e eVar9 = this.f15066i;
                                        if (eVar9 != null) {
                                            int i2 = eVar9.mo13799f()[0];
                                            C6027e eVar10 = this.f15066i;
                                            if (eVar10 != null) {
                                                cardBackgroundView2.mo7436a(i2, eVar10.mo13799f()[1]);
                                                C6027e eVar11 = this.f15066i;
                                                if (eVar11 != null) {
                                                    cardBackgroundView2.setThicknessTint(eVar11.mo13798e());
                                                    C6027e eVar12 = this.f15066i;
                                                    if (eVar12 != null) {
                                                        cardBackgroundView2.setShineTint(eVar12.mo13812s());
                                                        cardBackgroundView2.setOnClickListener(new C5989b(this));
                                                        C6027e eVar13 = this.f15066i;
                                                        if (eVar13 != null) {
                                                            if (eVar13.mo13801h() != C7674a.f19294a) {
                                                                View a2 = mo13743a(C3891l.card_border_overlay_thickness);
                                                                a2.setVisibility(0);
                                                                C6027e eVar14 = this.f15066i;
                                                                if (eVar14 != null) {
                                                                    a2.setBackground(C0540a.m2546c(context, eVar14.mo13801h()));
                                                                    C6027e eVar15 = this.f15066i;
                                                                    if (eVar15 != null) {
                                                                        a2.setBackgroundTintList(ColorStateList.valueOf(eVar15.mo13798e()));
                                                                        View a3 = mo13743a(C3891l.card_border_overlay);
                                                                        a3.setVisibility(0);
                                                                        C6027e eVar16 = this.f15066i;
                                                                        if (eVar16 != null) {
                                                                            a3.setBackground(C0540a.m2546c(context, eVar16.mo13801h()));
                                                                        } else {
                                                                            C12932j.m33820c(str);
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        C12932j.m33820c(str);
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    C12932j.m33820c(str);
                                                                    throw null;
                                                                }
                                                            }
                                                            C6027e eVar17 = this.f15066i;
                                                            if (eVar17 != null) {
                                                                if (eVar17.mo13800g() != C7674a.f19294a) {
                                                                    View a4 = mo13743a(C3891l.card_overlay);
                                                                    a4.setVisibility(0);
                                                                    C6027e eVar18 = this.f15066i;
                                                                    if (eVar18 != null) {
                                                                        a4.setBackground(C0540a.m2546c(context, eVar18.mo13800g()));
                                                                    } else {
                                                                        C12932j.m33820c(str);
                                                                        throw null;
                                                                    }
                                                                }
                                                                view.setOnClickListener(new C5990c(this));
                                                                m16608f();
                                                                Callback callback = this.f15068k;
                                                                if (callback != null) {
                                                                    View view2 = this.f15067j;
                                                                    if (view2 == null) {
                                                                        C12932j.m33820c("contentView");
                                                                        throw null;
                                                                    } else if (view2 != null) {
                                                                        callback.onCardCreated((Tiltable) view2);
                                                                    } else {
                                                                        throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.framework.Tiltable");
                                                                    }
                                                                }
                                                            } else {
                                                                C12932j.m33820c(str);
                                                                throw null;
                                                            }
                                                        } else {
                                                            C12932j.m33820c(str);
                                                            throw null;
                                                        }
                                                    } else {
                                                        C12932j.m33820c(str);
                                                        throw null;
                                                    }
                                                } else {
                                                    C12932j.m33820c(str);
                                                    throw null;
                                                }
                                            } else {
                                                C12932j.m33820c(str);
                                                throw null;
                                            }
                                        } else {
                                            C12932j.m33820c(str);
                                            throw null;
                                        }
                                    } else {
                                        C12932j.m33820c(str);
                                        throw null;
                                    }
                                } else {
                                    C12932j.m33820c(str);
                                    throw null;
                                }
                            } else {
                                C12932j.m33820c(str);
                                throw null;
                            }
                        } else {
                            C12932j.m33820c(str);
                            throw null;
                        }
                    } else {
                        C12932j.m33820c(str);
                        throw null;
                    }
                } else {
                    C12932j.m33820c(str);
                    throw null;
                }
            } else {
                C12932j.m33820c(str);
                throw null;
            }
        } else {
            C12932j.m33814a();
            throw null;
        }
    }

    /* renamed from: b */
    public final Callback mo6614b() {
        return this.f15068k;
    }

    /* renamed from: a */
    public final void mo13744a(Callback callback) {
        this.f15068k = callback;
    }

    /* renamed from: a */
    public final void mo13745a(String str, String str2) {
        C12932j.m33818b(str, "username");
        C12932j.m33818b(str2, "usernameUrl");
        m16601a(str);
        m16604b(str2);
        if (getView() != null) {
            m16608f();
        }
    }

    /* renamed from: a */
    public final Bitmap mo13742a(Config config, Drawable drawable) {
        C12932j.m33818b(config, "config");
        C12932j.m33818b(drawable, "background");
        View view = this.f15067j;
        String str = "contentView";
        if (view == null) {
            C12932j.m33820c(str);
            throw null;
        } else if (!(view instanceof Screenshotable)) {
            return null;
        } else {
            if (view == null) {
                C12932j.m33820c(str);
                throw null;
            } else if (view != null) {
                return ((Screenshotable) view).takeScreenshot(config, drawable);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type app.zenly.locator.cards.framework.Screenshotable");
            }
        }
    }
}
