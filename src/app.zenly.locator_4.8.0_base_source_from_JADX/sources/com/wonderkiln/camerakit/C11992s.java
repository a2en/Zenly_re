package com.wonderkiln.camerakit;

import android.annotation.TargetApi;
import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import com.wonderkiln.camerakit.p332t.C11996a;
import com.wonderkiln.camerakit.p332t.C11997b;

/* renamed from: com.wonderkiln.camerakit.s */
public class C11992s extends C11989q {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public SurfaceViewContainer f31257f;

    /* renamed from: g */
    private SurfaceView f31258g = ((SurfaceView) this.f31257f.findViewById(C11996a.surface_view));

    /* renamed from: com.wonderkiln.camerakit.s$a */
    class C11993a implements OnLayoutChangeListener {
        C11993a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C11992s sVar = C11992s.this;
            sVar.mo35587a(sVar.f31257f.getWidth(), C11992s.this.f31257f.getHeight());
        }
    }

    /* renamed from: com.wonderkiln.camerakit.s$b */
    class C11994b implements Callback {
        C11994b() {
        }

        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            if (C11992s.this.mo35597i()) {
                C11992s.this.mo35585a();
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* renamed from: com.wonderkiln.camerakit.s$c */
    class C11995c implements Runnable {
        C11995c() {
        }

        public void run() {
            C11992s.this.mo35593e().setFixedSize(C11992s.this.mo35592d(), C11992s.this.mo35591c());
        }
    }

    C11992s(Context context, ViewGroup viewGroup) {
        this.f31257f = (SurfaceViewContainer) View.inflate(context, C11997b.surface_view, viewGroup).findViewById(C11996a.surface_view_container);
        this.f31257f.addOnLayoutChangeListener(new C11993a());
        this.f31258g.getHolder().addCallback(new C11994b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo35586a(int i) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public SurfaceHolder mo35593e() {
        return this.f31258g.getHolder();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public float mo35595g() {
        return this.f31257f.getChildAt(0).getX();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public float mo35596h() {
        return this.f31257f.getChildAt(0).getY();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public boolean mo35597i() {
        return (mo35592d() == 0 || mo35591c() == 0) ? false : true;
    }

    /* access modifiers changed from: 0000 */
    @TargetApi(15)
    /* renamed from: a */
    public void mo35588a(int i, int i2, int i3) {
        super.mo35588a(i, i2, i3);
        this.f31257f.setPreviewSize(new C11991r(i, i2));
        this.f31257f.post(new C11995c());
    }
}
