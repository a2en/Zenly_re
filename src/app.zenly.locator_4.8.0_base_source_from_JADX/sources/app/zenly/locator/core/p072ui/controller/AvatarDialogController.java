package app.zenly.locator.core.p072ui.controller;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1332b;
import app.zenly.android.feature.base.model.C1334a.C1335a;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.core.p072ui.controller.DraggableDialogController.C3094d;
import app.zenly.locator.p143s.C5343a;
import com.bluelinelabs.conductor.C8819d;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.core.ui.controller.AvatarDialogController */
public final class AvatarDialogController extends DraggableDialogController {

    /* renamed from: n0 */
    private AvatarDialogListener f8508n0;

    /* renamed from: app.zenly.locator.core.ui.controller.AvatarDialogController$AvatarDialogListener */
    public interface AvatarDialogListener {
        void onProfilePhotoChatWith(UserProto$User userProto$User);

        void showChangeMyAvatar();
    }

    /* renamed from: app.zenly.locator.core.ui.controller.AvatarDialogController$a */
    class C3089a extends C1332b {

        /* renamed from: a */
        final /* synthetic */ ProgressBar f8509a;

        /* renamed from: b */
        final /* synthetic */ Context f8510b;

        C3089a(AvatarDialogController avatarDialogController, ProgressBar progressBar, Context context) {
            this.f8509a = progressBar;
            this.f8510b = context;
        }

        /* renamed from: a */
        public void mo6544a(Bitmap bitmap) {
            super.mo6544a(bitmap);
            this.f8509a.setVisibility(8);
        }

        /* renamed from: b */
        public void mo6545b() {
            super.mo6545b();
            Toast.makeText(this.f8510b, R.string.commons_content_oopserror, 0).show();
            this.f8509a.setVisibility(8);
        }
    }

    /* renamed from: app.zenly.locator.core.ui.controller.AvatarDialogController$b */
    public static final class C3090b extends C3094d {
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final UserProto$User f8511c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public AvatarDialogListener f8512d;

        public C3090b(UserProto$User userProto$User) {
            this.f8511c = userProto$User;
        }

        /* renamed from: a */
        public DraggableDialogController mo9293a() {
            return new AvatarDialogController(this, null);
        }

        /* renamed from: a */
        public C3090b mo9292a(AvatarDialogListener avatarDialogListener) {
            this.f8512d = avatarDialogListener;
            return this;
        }
    }

    /* synthetic */ AvatarDialogController(C3090b bVar, C3089a aVar) {
        this(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo7054a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        View a = super.mo9295a((int) R.layout.controller_avatar_dialog, layoutInflater, viewGroup);
        this.f8508n0 = ((C3090b) this.f8535h0).f8512d;
        UserProto$User b = ((C3090b) this.f8535h0).f8511c;
        a.findViewById(R.id.change_photo).setOnClickListener(new C3097a(this));
        TextView textView = (TextView) a.findViewById(R.id.chat);
        textView.setText(context.getString(R.string.commons_button_chat_with, new Object[]{b.getName()}));
        textView.setOnClickListener(new C3098b(this, b));
        ImageView imageView = (ImageView) a.findViewById(R.id.avatar);
        new C2477e(context).load(C2884f.m9355a(b)).withCorners(new C1335a(context.getResources().getDimension(R.dimen.corner_radius_200))).into(imageView, new C3089a(this, (ProgressBar) a.findViewById(R.id.progress), context));
        C5343a.m15160U().mo12791F();
        return a;
    }

    /* renamed from: e */
    public /* synthetic */ void mo7061e(View view) {
        AvatarDialogListener avatarDialogListener = this.f8508n0;
        if (avatarDialogListener != null) {
            avatarDialogListener.showChangeMyAvatar();
            mo23946k().mo23997a((C8819d) this);
        }
        C5343a.m15160U().mo12789D();
    }

    public AvatarDialogController() {
    }

    private AvatarDialogController(C3090b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public /* synthetic */ void mo9289a(UserProto$User userProto$User, View view) {
        m9639a(userProto$User);
        C5343a.m15160U().mo12790E();
    }

    /* renamed from: a */
    private void m9639a(UserProto$User userProto$User) {
        AvatarDialogListener avatarDialogListener = this.f8508n0;
        if (avatarDialogListener != null) {
            avatarDialogListener.onProfilePhotoChatWith(userProto$User);
            mo23946k().mo23997a((C8819d) this);
        }
    }
}
