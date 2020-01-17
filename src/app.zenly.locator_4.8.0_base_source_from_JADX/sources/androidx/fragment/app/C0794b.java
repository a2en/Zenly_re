package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: androidx.fragment.app.b */
public class C0794b extends Fragment implements OnCancelListener, OnDismissListener {

    /* renamed from: e */
    private Handler f3244e;

    /* renamed from: f */
    private Runnable f3245f = new C0795a();

    /* renamed from: g */
    OnCancelListener f3246g = new C0796b();

    /* renamed from: h */
    OnDismissListener f3247h = new C0797c();

    /* renamed from: i */
    int f3248i = 0;

    /* renamed from: j */
    int f3249j = 0;

    /* renamed from: k */
    boolean f3250k = true;

    /* renamed from: l */
    boolean f3251l = true;

    /* renamed from: m */
    int f3252m = -1;

    /* renamed from: n */
    Dialog f3253n;

    /* renamed from: o */
    boolean f3254o;

    /* renamed from: p */
    boolean f3255p;

    /* renamed from: q */
    boolean f3256q;

    /* renamed from: androidx.fragment.app.b$a */
    class C0795a implements Runnable {
        C0795a() {
        }

        public void run() {
            C0794b bVar = C0794b.this;
            bVar.f3247h.onDismiss(bVar.f3253n);
        }
    }

    /* renamed from: androidx.fragment.app.b$b */
    class C0796b implements OnCancelListener {
        C0796b() {
        }

        public void onCancel(DialogInterface dialogInterface) {
            C0794b bVar = C0794b.this;
            Dialog dialog = bVar.f3253n;
            if (dialog != null) {
                bVar.onCancel(dialog);
            }
        }
    }

    /* renamed from: androidx.fragment.app.b$c */
    class C0797c implements OnDismissListener {
        C0797c() {
        }

        public void onDismiss(DialogInterface dialogInterface) {
            C0794b bVar = C0794b.this;
            Dialog dialog = bVar.f3253n;
            if (dialog != null) {
                bVar.onDismiss(dialog);
            }
        }
    }

    /* renamed from: a */
    public void mo4204a(FragmentManager fragmentManager, String str) {
        this.f3255p = false;
        this.f3256q = true;
        C0819o b = fragmentManager.mo4084b();
        b.mo4316a((Fragment) this, str);
        b.mo4176a();
    }

    /* renamed from: b */
    public Dialog mo4207b() {
        return this.f3253n;
    }

    /* renamed from: c */
    public int mo4208c() {
        return this.f3249j;
    }

    /* renamed from: d */
    public final Dialog mo4209d() {
        Dialog b = mo4207b();
        if (b != null) {
            return b;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("DialogFragment ");
        sb.append(this);
        sb.append(" does not have a Dialog.");
        throw new IllegalStateException(sb.toString());
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f3251l) {
            View view = getView();
            if (view != null) {
                if (view.getParent() == null) {
                    this.f3253n.setContentView(view);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.f3253n.setOwnerActivity(activity);
            }
            this.f3253n.setCancelable(this.f3250k);
            this.f3253n.setOnCancelListener(this.f3246g);
            this.f3253n.setOnDismissListener(this.f3247h);
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle("android:savedDialogState");
                if (bundle2 != null) {
                    this.f3253n.onRestoreInstanceState(bundle2);
                }
            }
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (!this.f3256q) {
            this.f3255p = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f3244e = new Handler();
        this.f3251l = this.mContainerId == 0;
        if (bundle != null) {
            this.f3248i = bundle.getInt("android:style", 0);
            this.f3249j = bundle.getInt("android:theme", 0);
            this.f3250k = bundle.getBoolean("android:cancelable", true);
            this.f3251l = bundle.getBoolean("android:showsDialog", this.f3251l);
            this.f3252m = bundle.getInt("android:backStackId", -1);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f3253n;
        if (dialog != null) {
            this.f3254o = true;
            dialog.setOnDismissListener(null);
            this.f3253n.dismiss();
            if (!this.f3255p) {
                onDismiss(this.f3253n);
            }
            this.f3253n = null;
        }
    }

    public void onDetach() {
        super.onDetach();
        if (!this.f3256q && !this.f3255p) {
            this.f3255p = true;
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f3254o) {
            mo4206a(true, true);
        }
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        if (!this.f3251l) {
            return super.onGetLayoutInflater(bundle);
        }
        this.f3253n = mo4201a(bundle);
        Dialog dialog = this.f3253n;
        String str = "layout_inflater";
        if (dialog == null) {
            return (LayoutInflater) this.mHost.mo4249c().getSystemService(str);
        }
        mo4203a(dialog, this.f3248i);
        return (LayoutInflater) this.f3253n.getContext().getSystemService(str);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f3253n;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            if (onSaveInstanceState != null) {
                bundle.putBundle("android:savedDialogState", onSaveInstanceState);
            }
        }
        int i = this.f3248i;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f3249j;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.f3250k;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.f3251l;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.f3252m;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public void onStart() {
        super.onStart();
        Dialog dialog = this.f3253n;
        if (dialog != null) {
            this.f3254o = false;
            dialog.show();
        }
    }

    public void onStop() {
        super.onStop();
        Dialog dialog = this.f3253n;
        if (dialog != null) {
            dialog.hide();
        }
    }

    /* renamed from: a */
    public void mo4202a() {
        mo4206a(false, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo4206a(boolean z, boolean z2) {
        if (!this.f3255p) {
            this.f3255p = true;
            this.f3256q = false;
            Dialog dialog = this.f3253n;
            if (dialog != null) {
                dialog.setOnDismissListener(null);
                this.f3253n.dismiss();
                if (!z2) {
                    if (Looper.myLooper() == this.f3244e.getLooper()) {
                        onDismiss(this.f3253n);
                    } else {
                        this.f3244e.post(this.f3245f);
                    }
                }
            }
            this.f3254o = true;
            if (this.f3252m >= 0) {
                getParentFragmentManager().mo4061a(this.f3252m, 1);
                this.f3252m = -1;
            } else {
                C0819o b = getParentFragmentManager().mo4084b();
                b.mo4193d(this);
                if (z) {
                    b.mo4185b();
                } else {
                    b.mo4176a();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo4205a(boolean z) {
        this.f3251l = z;
    }

    /* renamed from: a */
    public void mo4203a(Dialog dialog, int i) {
        if (!(i == 1 || i == 2)) {
            if (i == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    /* renamed from: a */
    public Dialog mo4201a(Bundle bundle) {
        return new Dialog(requireContext(), mo4208c());
    }
}
