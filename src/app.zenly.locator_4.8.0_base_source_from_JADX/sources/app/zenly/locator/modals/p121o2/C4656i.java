package app.zenly.locator.modals.p121o2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.android.base.widget.LinearLayout;
import app.zenly.android.feature.base.model.AvatarLoader.Request;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1331a;
import app.zenly.locator.C3891l;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.view.C3137b;
import app.zenly.locator.core.util.C3200e0;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C12932j;
import p213co.znly.models.UserProto$User;
import p250f.p251a.p252a.p253a.p256f.p257a.C7678c;

/* renamed from: app.zenly.locator.modals.o2.i */
public final class C4656i extends C4655h {

    /* renamed from: e */
    private AnimatorSet f12404e;

    /* renamed from: f */
    private final C2477e f12405f;

    /* renamed from: g */
    private HashMap f12406g;

    /* renamed from: app.zenly.locator.modals.o2.i$a */
    public static final class C4657a {
        private C4657a() {
        }

        public /* synthetic */ C4657a(C12928f fVar) {
            this();
        }
    }

    static {
        new C4657a(null);
    }

    public C4656i(Context context) {
        C12932j.m33818b(context, "context");
        super(context);
        this.f12405f = new C2477e(context);
        setBackgroundColor(C7678c.m18702a(context, (int) R.attr.zenlyColorBackground));
        View.inflate(getContext(), R.layout.modal_recommendation, this);
        TextView textView = (TextView) mo11868a(C3891l.mutual_friends);
        C12932j.m33815a((Object) textView, "mutual_friends");
        textView.setAlpha(0.0f);
        LinearLayout linearLayout = (LinearLayout) mo11868a(C3891l.mutual_friends_avatars);
        C12932j.m33815a((Object) linearLayout, "mutual_friends_avatars");
        linearLayout.setAlpha(0.0f);
        TextView textView2 = (TextView) mo11868a(C3891l.not_interested);
        C12932j.m33815a((Object) textView2, "not_interested");
        textView2.setAlpha(0.0f);
        Button button = (Button) mo11868a(C3891l.add_as_friend_button);
        C12932j.m33815a((Object) button, "add_as_friend_button");
        button.setAlpha(0.0f);
        ImageView imageView = (ImageView) mo11868a(C3891l.avatar_potential_match);
        String str = "avatar_potential_match";
        C12932j.m33815a((Object) imageView, str);
        imageView.setScaleX(0.0f);
        ImageView imageView2 = (ImageView) mo11868a(C3891l.avatar_potential_match);
        C12932j.m33815a((Object) imageView2, str);
        imageView2.setScaleY(0.0f);
    }

    /* renamed from: a */
    public View mo11868a(int i) {
        if (this.f12406g == null) {
            this.f12406g = new HashMap();
        }
        View view = (View) this.f12406g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f12406g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo11870a(String str, List<UserProto$User> list) {
        C12932j.m33818b(str, "description");
        C12932j.m33818b(list, "mutualFriends");
        TextView textView = (TextView) mo11868a(C3891l.mutual_friends);
        C12932j.m33815a((Object) textView, "mutual_friends");
        textView.setText(str);
        ((LinearLayout) mo11868a(C3891l.mutual_friends_avatars)).removeAllViews();
        LinearLayout linearLayout = (LinearLayout) mo11868a(C3891l.mutual_friends_avatars);
        C12932j.m33815a((Object) linearLayout, "mutual_friends_avatars");
        C3137b.m9865a(linearLayout, list);
    }

    /* renamed from: b */
    public final void mo11871b() {
        AnimatorSet animatorSet = this.f12404e;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final ImageView getAvatar() {
        return (ImageView) mo11868a(C3891l.avatar_potential_match);
    }

    public void setCloseButtonClickListener(OnClickListener onClickListener) {
        C12932j.m33818b(onClickListener, "listener");
        ((TextView) mo11868a(C3891l.not_interested)).setOnClickListener(onClickListener);
    }

    public final void setMatchMaker(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "matchMaker");
        Request a = C1331a.m6343a(this.f12405f.load(C2884f.m9355a(userProto$User)), R.dimen.spacing_100, 0, 2, null);
        ImageView imageView = (ImageView) mo11868a(C3891l.avatar_match_maker);
        C12932j.m33815a((Object) imageView, "avatar_match_maker");
        a.into(imageView);
        TextView textView = (TextView) mo11868a(C3891l.title_match_maker);
        C12932j.m33815a((Object) textView, "title_match_maker");
        textView.setText(getContext().getString(R.string.recommendation_receive_modal_title, new Object[]{userProto$User.getName()}));
    }

    public final void setPotentialMatch(UserProto$User userProto$User) {
        C12932j.m33818b(userProto$User, "potentialMatch");
        Request a = C1331a.m6343a(this.f12405f.load(C2884f.m9355a(userProto$User)), R.dimen.spacing_100, 0, 2, null);
        ImageView imageView = (ImageView) mo11868a(C3891l.avatar_potential_match);
        C12932j.m33815a((Object) imageView, "avatar_potential_match");
        a.into(imageView);
        TextView textView = (TextView) mo11868a(C3891l.name);
        C12932j.m33815a((Object) textView, "name");
        textView.setText(userProto$User.getName());
    }

    public void setPrimaryActionButtonClickListener(OnClickListener onClickListener) {
        C12932j.m33818b(onClickListener, "listener");
        ((Button) mo11868a(C3891l.add_as_friend_button)).setOnClickListener(onClickListener);
    }

    public void setSecondaryActionButtonClickListener(OnClickListener onClickListener) {
        C12932j.m33818b(onClickListener, "listener");
    }

    /* renamed from: a */
    public final void mo11869a() {
        PropertyValuesHolder ofFloat = PropertyValuesHolder.ofFloat(View.ALPHA, new float[]{0.0f, 1.0f});
        PropertyValuesHolder ofFloat2 = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{1.0f, 0.3f});
        PropertyValuesHolder ofFloat3 = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{1.0f, 0.3f});
        PropertyValuesHolder ofFloat4 = PropertyValuesHolder.ofFloat(View.SCALE_X, new float[]{0.0f, 1.0f});
        PropertyValuesHolder ofFloat5 = PropertyValuesHolder.ofFloat(View.SCALE_Y, new float[]{0.0f, 1.0f});
        TextView textView = (TextView) mo11868a(C3891l.mutual_friends);
        C12932j.m33815a((Object) textView, "mutual_friends");
        float a = (float) C3200e0.m10183a(textView.getContext(), 200);
        PropertyValuesHolder ofFloat6 = PropertyValuesHolder.ofFloat(View.TRANSLATION_Y, new float[]{a, 0.0f});
        Context context = getContext();
        C12932j.m33815a((Object) context, "context");
        float dimensionPixelSize = (float) context.getResources().getDimensionPixelSize(R.dimen.grid_size_750);
        ImageView imageView = (ImageView) mo11868a(C3891l.avatar_match_maker);
        String str = "avatar_match_maker";
        C12932j.m33815a((Object) imageView, str);
        float f = dimensionPixelSize * 0.9f;
        imageView.setPivotX(f);
        ImageView imageView2 = (ImageView) mo11868a(C3891l.avatar_match_maker);
        C12932j.m33815a((Object) imageView2, str);
        imageView2.setPivotY(f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ObjectAnimator.ofPropertyValuesHolder((Button) mo11868a(C3891l.add_as_friend_button), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((TextView) mo11868a(C3891l.mutual_friends), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((LinearLayout) mo11868a(C3891l.mutual_friends_avatars), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((TextView) mo11868a(C3891l.not_interested), new PropertyValuesHolder[]{ofFloat}), ObjectAnimator.ofPropertyValuesHolder((Button) mo11868a(C3891l.add_as_friend_button), new PropertyValuesHolder[]{ofFloat6}), ObjectAnimator.ofPropertyValuesHolder((TextView) mo11868a(C3891l.mutual_friends), new PropertyValuesHolder[]{ofFloat6}), ObjectAnimator.ofPropertyValuesHolder((LinearLayout) mo11868a(C3891l.mutual_friends_avatars), new PropertyValuesHolder[]{ofFloat6}), ObjectAnimator.ofPropertyValuesHolder((TextView) mo11868a(C3891l.not_interested), new PropertyValuesHolder[]{ofFloat6}), ObjectAnimator.ofPropertyValuesHolder((ImageView) mo11868a(C3891l.avatar_match_maker), new PropertyValuesHolder[]{ofFloat2}), ObjectAnimator.ofPropertyValuesHolder((ImageView) mo11868a(C3891l.avatar_match_maker), new PropertyValuesHolder[]{ofFloat3}), ObjectAnimator.ofPropertyValuesHolder((ImageView) mo11868a(C3891l.avatar_potential_match), new PropertyValuesHolder[]{ofFloat4}), ObjectAnimator.ofPropertyValuesHolder((ImageView) mo11868a(C3891l.avatar_potential_match), new PropertyValuesHolder[]{ofFloat5})});
        animatorSet.setStartDelay(2000);
        animatorSet.start();
        this.f12404e = animatorSet;
    }
}
