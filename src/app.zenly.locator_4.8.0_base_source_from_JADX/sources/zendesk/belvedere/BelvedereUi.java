package zendesk.belvedere;

import android.app.Activity;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C0819o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;
import java.util.List;
import zendesk.belvedere.MediaIntent.C13484c;
import zendesk.belvedere.p428s.C13541i;

public class BelvedereUi {

    public static class UiConfig implements Parcelable {
        public static final Creator<UiConfig> CREATOR = new C13465a();

        /* renamed from: e */
        private final List<MediaIntent> f34899e;

        /* renamed from: f */
        private final List<MediaResult> f34900f;

        /* renamed from: g */
        private final List<MediaResult> f34901g;

        /* renamed from: h */
        private final List<Integer> f34902h;

        /* renamed from: i */
        private final boolean f34903i;

        /* renamed from: j */
        private final long f34904j;

        /* renamed from: k */
        private final boolean f34905k;

        /* renamed from: zendesk.belvedere.BelvedereUi$UiConfig$a */
        static class C13465a implements Creator<UiConfig> {
            C13465a() {
            }

            public UiConfig createFromParcel(Parcel parcel) {
                return new UiConfig(parcel);
            }

            public UiConfig[] newArray(int i) {
                return new UiConfig[i];
            }
        }

        UiConfig() {
            this.f34899e = new ArrayList();
            this.f34900f = new ArrayList();
            this.f34901g = new ArrayList();
            this.f34902h = new ArrayList();
            this.f34903i = true;
            this.f34904j = -1;
            this.f34905k = false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public List<MediaResult> mo38735a() {
            return this.f34901g;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public List<MediaIntent> mo38736b() {
            return this.f34899e;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public long mo38737c() {
            return this.f34904j;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public List<MediaResult> mo38738d() {
            return this.f34900f;
        }

        public int describeContents() {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public List<Integer> mo38740e() {
            return this.f34902h;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: f */
        public boolean mo38741f() {
            return this.f34905k;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeTypedList(this.f34899e);
            parcel.writeTypedList(this.f34900f);
            parcel.writeTypedList(this.f34901g);
            parcel.writeList(this.f34902h);
            parcel.writeInt(this.f34903i ? 1 : 0);
            parcel.writeLong(this.f34904j);
            parcel.writeInt(this.f34905k ? 1 : 0);
        }

        UiConfig(List<MediaIntent> list, List<MediaResult> list2, List<MediaResult> list3, boolean z, List<Integer> list4, long j, boolean z2) {
            this.f34899e = list;
            this.f34900f = list2;
            this.f34901g = list3;
            this.f34903i = z;
            this.f34902h = list4;
            this.f34904j = j;
            this.f34905k = z2;
        }

        UiConfig(Parcel parcel) {
            this.f34899e = parcel.createTypedArrayList(MediaIntent.CREATOR);
            this.f34900f = parcel.createTypedArrayList(MediaResult.CREATOR);
            this.f34901g = parcel.createTypedArrayList(MediaResult.CREATOR);
            this.f34902h = new ArrayList();
            parcel.readList(this.f34902h, Integer.class.getClassLoader());
            boolean z = false;
            this.f34903i = parcel.readInt() == 1;
            this.f34904j = parcel.readLong();
            if (parcel.readInt() == 1) {
                z = true;
            }
            this.f34905k = z;
        }
    }

    /* renamed from: zendesk.belvedere.BelvedereUi$b */
    public static class C13467b {

        /* renamed from: a */
        private final Context f34906a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f34907b;

        /* renamed from: c */
        private List<MediaIntent> f34908c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public List<MediaResult> f34909d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public List<MediaResult> f34910e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public List<Integer> f34911f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public long f34912g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f34913h;

        /* renamed from: zendesk.belvedere.BelvedereUi$b$a */
        class C13468a implements C13525d {

            /* renamed from: a */
            final /* synthetic */ ImageStream f34914a;

            /* renamed from: zendesk.belvedere.BelvedereUi$b$a$a */
            class C13469a implements Runnable {

                /* renamed from: e */
                final /* synthetic */ List f34916e;

                /* renamed from: f */
                final /* synthetic */ Activity f34917f;

                /* renamed from: g */
                final /* synthetic */ ViewGroup f34918g;

                C13469a(List list, Activity activity, ViewGroup viewGroup) {
                    this.f34916e = list;
                    this.f34917f = activity;
                    this.f34918g = viewGroup;
                }

                public void run() {
                    UiConfig uiConfig = new UiConfig(this.f34916e, C13467b.this.f34909d, C13467b.this.f34910e, C13467b.this.f34907b, C13467b.this.f34911f, C13467b.this.f34912g, C13467b.this.f34913h);
                    C13468a.this.f34914a.mo38775a(C13512i.m35782a(this.f34917f, this.f34918g, C13468a.this.f34914a, uiConfig), uiConfig);
                }
            }

            C13468a(ImageStream imageStream) {
                this.f34914a = imageStream;
            }

            /* renamed from: a */
            public void mo38754a(List<MediaIntent> list) {
                FragmentActivity activity = this.f34914a.getActivity();
                if (activity != null && !activity.isChangingConfigurations()) {
                    ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
                    viewGroup.post(new C13469a(list, activity, viewGroup));
                }
            }

            /* renamed from: a */
            public void mo38753a() {
                FragmentActivity activity = this.f34914a.getActivity();
                if (activity != null) {
                    Toast.makeText(activity, C13541i.belvedere_permissions_denied, 0).show();
                }
            }
        }

        private C13467b(Context context) {
            this.f34907b = true;
            this.f34908c = new ArrayList();
            this.f34909d = new ArrayList();
            this.f34910e = new ArrayList();
            this.f34911f = new ArrayList();
            this.f34912g = -1;
            this.f34913h = false;
            this.f34906a = context;
        }

        /* renamed from: a */
        public C13467b mo38745a() {
            this.f34908c.add(C13489a.m35734a(this.f34906a).mo38863a().mo38835a());
            return this;
        }

        /* renamed from: b */
        public C13467b mo38752b(List<MediaResult> list) {
            this.f34909d = new ArrayList(list);
            return this;
        }

        /* renamed from: a */
        public C13467b mo38747a(String str, boolean z) {
            C13484c b = C13489a.m35734a(this.f34906a).mo38868b();
            b.mo38837a(z);
            b.mo38836a(str);
            this.f34908c.add(b.mo38838a());
            return this;
        }

        /* renamed from: a */
        public C13467b mo38748a(List<MediaResult> list) {
            this.f34910e = new ArrayList(list);
            return this;
        }

        /* renamed from: a */
        public C13467b mo38750a(int... iArr) {
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int valueOf : iArr) {
                arrayList.add(Integer.valueOf(valueOf));
            }
            this.f34911f = arrayList;
            return this;
        }

        /* renamed from: a */
        public C13467b mo38746a(long j) {
            this.f34912g = j;
            return this;
        }

        /* renamed from: a */
        public C13467b mo38749a(boolean z) {
            this.f34913h = z;
            return this;
        }

        /* renamed from: a */
        public void mo38751a(AppCompatActivity appCompatActivity) {
            ImageStream a = BelvedereUi.m35621a(appCompatActivity);
            a.mo38771a(this.f34908c, (C13525d) new C13468a(a));
        }
    }

    /* renamed from: a */
    public static C13467b m35620a(Context context) {
        return new C13467b(context);
    }

    /* renamed from: a */
    public static ImageStream m35621a(AppCompatActivity appCompatActivity) {
        ImageStream imageStream;
        FragmentManager supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        String str = "belvedere_image_stream";
        Fragment b = supportFragmentManager.mo4083b(str);
        if (b instanceof ImageStream) {
            imageStream = (ImageStream) b;
        } else {
            imageStream = new ImageStream();
            C0819o b2 = supportFragmentManager.mo4084b();
            b2.mo4316a((Fragment) imageStream, str);
            b2.mo4176a();
        }
        imageStream.mo38774a(KeyboardHelper.m35687c((Activity) appCompatActivity));
        return imageStream;
    }
}
