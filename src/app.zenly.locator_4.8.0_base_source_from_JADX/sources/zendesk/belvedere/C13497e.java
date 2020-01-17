package zendesk.belvedere;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import zendesk.belvedere.p428s.C13537e;
import zendesk.belvedere.p428s.C13538f;
import zendesk.belvedere.p428s.C13540h;
import zendesk.belvedere.p428s.C13541i;

/* renamed from: zendesk.belvedere.e */
class C13497e {

    /* renamed from: a */
    private static final int f35003a = C13537e.belvedere_ic_camera_black;

    /* renamed from: b */
    private static final int f35004b = C13540h.belvedere_stream_list_item_square_static;

    /* renamed from: zendesk.belvedere.e$a */
    static class C13498a implements OnClickListener {

        /* renamed from: e */
        final /* synthetic */ C13496b f35005e;

        C13498a(C13496b bVar) {
            this.f35005e = bVar;
        }

        public void onClick(View view) {
            this.f35005e.mo38875a();
        }
    }

    /* renamed from: zendesk.belvedere.e$b */
    static abstract class C13499b {

        /* renamed from: a */
        private final int f35006a;

        /* renamed from: b */
        private final long f35007b = ((long) UUID.randomUUID().hashCode());

        /* renamed from: c */
        private final MediaResult f35008c;

        /* renamed from: d */
        private boolean f35009d = false;

        C13499b(int i, MediaResult mediaResult) {
            this.f35006a = i;
            this.f35008c = mediaResult;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public long mo38878a() {
            return this.f35007b;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract void mo38879a(View view);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public int mo38881b() {
            return this.f35006a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public MediaResult mo38882c() {
            return this.f35008c;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public boolean mo38883d() {
            return this.f35009d;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38880a(boolean z) {
            this.f35009d = z;
        }
    }

    /* renamed from: zendesk.belvedere.e$c */
    static class C13500c extends C13499b {

        /* renamed from: e */
        private final int f35010e;

        /* renamed from: f */
        private final OnClickListener f35011f;

        /* synthetic */ C13500c(int i, int i2, OnClickListener onClickListener, C13498a aVar) {
            this(i, i2, onClickListener);
        }

        /* renamed from: a */
        public void mo38879a(View view) {
            ((ImageView) view.findViewById(C13538f.list_item_static_image)).setImageResource(this.f35010e);
            view.findViewById(C13538f.list_item_static_click_area).setOnClickListener(this.f35011f);
        }

        private C13500c(int i, int i2, OnClickListener onClickListener) {
            super(i, null);
            this.f35010e = i2;
            this.f35011f = onClickListener;
        }
    }

    /* renamed from: zendesk.belvedere.e$d */
    static class C13501d extends C13499b {

        /* renamed from: e */
        private final MediaResult f35012e;

        /* renamed from: f */
        private final ResolveInfo f35013f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final C13496b f35014g;

        /* renamed from: zendesk.belvedere.e$d$a */
        class C13502a implements C13488c {
            C13502a() {
            }

            /* renamed from: a */
            public boolean mo38861a(boolean z) {
                return C13501d.this.f35014g.mo38876a(C13501d.this);
            }
        }

        C13501d(C13496b bVar, MediaResult mediaResult, Context context) {
            super(C13540h.belvedere_stream_list_item_genric_file, mediaResult);
            this.f35012e = mediaResult;
            this.f35013f = m35759a(mediaResult.mo38844d(), context);
            this.f35014g = bVar;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public void mo38879a(View view) {
            Context context = view.getContext();
            ImageView imageView = (ImageView) view.findViewById(C13538f.list_item_file_icon);
            TextView textView = (TextView) view.findViewById(C13538f.list_item_file_title);
            TextView textView2 = (TextView) view.findViewById(C13538f.list_item_file_label);
            SelectableView selectableView = (SelectableView) view.findViewById(C13538f.list_item_file_holder);
            selectableView.mo38855a(context.getString(C13541i.belvedere_stream_item_unselect_file_desc, new Object[]{this.f35012e.mo38844d()}), context.getString(C13541i.belvedere_stream_item_select_file_desc, new Object[]{this.f35012e.mo38844d()}));
            textView.setText(this.f35012e.mo38844d());
            if (this.f35013f != null) {
                PackageManager packageManager = context.getPackageManager();
                textView2.setText(this.f35013f.loadLabel(packageManager));
                imageView.setImageDrawable(this.f35013f.loadIcon(packageManager));
            } else {
                textView2.setText(C13541i.belvedere_image_stream_unknown_app);
                imageView.setImageResource(17301651);
            }
            selectableView.setSelected(mo38883d());
            selectableView.setSelectionListener(new C13502a());
        }

        /* renamed from: a */
        private ResolveInfo m35759a(String str, Context context) {
            PackageManager packageManager = context.getPackageManager();
            MediaResult a = C13489a.m35734a(context).mo38864a("tmp", str);
            if (a == null) {
                return null;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(a.mo38849g());
            List queryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (queryIntentActivities == null || queryIntentActivities.size() <= 0) {
                return null;
            }
            return (ResolveInfo) queryIntentActivities.get(0);
        }
    }

    /* renamed from: zendesk.belvedere.e$e */
    static class C13503e extends C13499b {

        /* renamed from: e */
        private final MediaResult f35016e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final C13496b f35017f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C13471b f35018g;

        /* renamed from: zendesk.belvedere.e$e$a */
        class C13504a implements C13472c {
            C13504a() {
            }

            /* renamed from: a */
            public void mo38761a(C13471b bVar) {
                C13503e.this.f35018g = bVar;
            }
        }

        /* renamed from: zendesk.belvedere.e$e$b */
        class C13505b implements C13488c {
            C13505b() {
            }

            /* renamed from: a */
            public boolean mo38861a(boolean z) {
                return C13503e.this.f35017f.mo38876a(C13503e.this);
            }
        }

        C13503e(C13496b bVar, MediaResult mediaResult) {
            super(C13540h.belvedere_stream_list_item, mediaResult);
            this.f35017f = bVar;
            this.f35016e = mediaResult;
        }

        /* renamed from: a */
        public void mo38879a(View view) {
            Context context = view.getContext();
            FixedWidthImageView fixedWidthImageView = (FixedWidthImageView) view.findViewById(C13538f.list_item_image);
            SelectableView selectableView = (SelectableView) view.findViewById(C13538f.list_item_selectable);
            selectableView.mo38855a(context.getString(C13541i.belvedere_stream_item_unselect_image_desc, new Object[]{this.f35016e.mo38844d()}), context.getString(C13541i.belvedere_stream_item_select_image_desc, new Object[]{this.f35016e.mo38844d()}));
            if (this.f35018g != null) {
                fixedWidthImageView.mo38758a(Picasso.m31064a(context), this.f35016e.mo38846e(), this.f35018g);
            } else {
                fixedWidthImageView.mo38757a(Picasso.m31064a(context), this.f35016e.mo38846e(), this.f35016e.mo38850h(), this.f35016e.mo38841b(), (C13472c) new C13504a());
            }
            selectableView.setSelected(mo38883d());
            selectableView.setSelectionListener(new C13505b());
        }
    }

    /* renamed from: a */
    static List<C13499b> m35750a(List<MediaResult> list, C13496b bVar, Context context) {
        ArrayList arrayList = new ArrayList(list.size());
        for (MediaResult mediaResult : list) {
            if (mediaResult.mo38842c() == null || !mediaResult.mo38842c().startsWith("image")) {
                arrayList.add(new C13501d(bVar, mediaResult, context));
            } else {
                arrayList.add(new C13503e(bVar, mediaResult));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static C13500c m35751a(C13496b bVar) {
        return new C13500c(f35004b, f35003a, new C13498a(bVar), null);
    }
}
