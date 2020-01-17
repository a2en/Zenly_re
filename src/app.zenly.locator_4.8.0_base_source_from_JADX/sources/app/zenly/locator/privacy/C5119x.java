package app.zenly.locator.privacy;

import android.content.Context;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import app.zenly.android.feature.base.model.AvatarLoader.Request.C1333c;
import app.zenly.locator.R;
import app.zenly.locator.core.glide.C2477e;
import app.zenly.locator.core.models.C2884f;
import app.zenly.locator.p143s.p148l.C5448c;
import app.zenly.locator.privacy.model.C5081c;
import app.zenly.locator.privacy.model.C5082d;
import app.zenly.locator.privacy.p134z.C5128b;
import app.zenly.locator.privacy.view.ContactHiddenCountdownView;
import java.util.List;
import p213co.znly.models.C6980c3;
import p213co.znly.models.C6980c3.C6981a;
import p213co.znly.models.UserProto$User;

/* renamed from: app.zenly.locator.privacy.x */
public class C5119x extends ArrayAdapter<Pair<UserProto$User, C6981a>> {

    /* renamed from: e */
    private final C2477e f13268e;

    public C5119x(Context context, List<Pair<UserProto$User, C6981a>> list) {
        super(context, 0, list);
        this.f13268e = new C2477e(context);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.view_contactsprivacy_item, viewGroup, false);
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.avatar);
        ContactHiddenCountdownView contactHiddenCountdownView = (ContactHiddenCountdownView) view.findViewById(R.id.overlay);
        TextView textView = (TextView) view.findViewById(R.id.title);
        Pair pair = i >= getCount() ? null : (Pair) getItem(i);
        if (pair != null) {
            if (pair.equals(view.getTag())) {
                if (C5128b.m14615a((UserProto$User) pair.first, (C6980c3) ((C6981a) pair.second).build()) == C5082d.Frozen) {
                    long seconds = (((C6981a) pair.second).getGhostedUntil().getSeconds() * 1000) - C5448c.m15478a().timeNow().getTime();
                    if (!C5081c.m14491b(seconds)) {
                        contactHiddenCountdownView.setRemainingTime(seconds / 1000);
                    } else {
                        contactHiddenCountdownView.setText(getContext().getString(R.string.settings_ghost_button_forever));
                    }
                }
                return view;
            }
            imageView.setVisibility(0);
            this.f13268e.load(C2884f.m9355a((UserProto$User) pair.first)).withPlaceholderStrategy(C1333c.DisplayName).into(imageView);
            if (C5128b.m14615a((UserProto$User) pair.first, (C6980c3) ((C6981a) pair.second).build()) == C5082d.Frozen) {
                long seconds2 = (((C6981a) pair.second).getGhostedUntil().getSeconds() * 1000) - C5448c.m15478a().timeNow().getTime();
                if (!C5081c.m14491b(seconds2)) {
                    contactHiddenCountdownView.setRemainingTime(seconds2 / 1000);
                } else {
                    contactHiddenCountdownView.setText(getContext().getString(R.string.settings_ghost_button_forever));
                }
                contactHiddenCountdownView.setVisibility(0);
            } else {
                contactHiddenCountdownView.setVisibility(8);
            }
            view.setTag(pair);
        }
        return view;
    }
}
