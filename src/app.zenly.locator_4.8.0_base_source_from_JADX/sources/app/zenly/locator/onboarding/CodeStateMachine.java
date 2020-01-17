package app.zenly.locator.onboarding;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import app.zenly.locator.p143s.p148l.C5448c;
import com.android.volley.toolbox.C8733j;
import p213co.znly.models.C6952b1.C6956c;
import p213co.znly.models.services.C8275s4;
import p213co.znly.models.services.C8275s4.C8277b;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo;
import p213co.znly.models.verify.VerifyInfoProto$VerifyInfo.C8445d;
import p387h.p388a.C12143a;

public class CodeStateMachine implements C4886q3, Parcelable {
    public static final Creator<CodeStateMachine> CREATOR = new C4740a();

    /* renamed from: e */
    private boolean f12524e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C4746g f12525f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Handler f12526g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseArray<C4744e> f12527h;

    /* renamed from: i */
    private C4744e f12528i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f12529j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public long f12530k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f12531l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public long f12532m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public long f12533n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public String f12534o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f12535p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final Runnable f12536q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Runnable f12537r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public final Runnable f12538s;

    /* renamed from: app.zenly.locator.onboarding.CodeStateMachine$a */
    static class C4740a implements Creator<CodeStateMachine> {
        C4740a() {
        }

        public CodeStateMachine createFromParcel(Parcel parcel) {
            return new CodeStateMachine(parcel, null);
        }

        public CodeStateMachine[] newArray(int i) {
            return new CodeStateMachine[i];
        }
    }

    /* renamed from: app.zenly.locator.onboarding.CodeStateMachine$b */
    class C4741b implements Runnable {
        C4741b() {
        }

        public void run() {
            long f = (CodeStateMachine.this.mo11954f() + 1000) / 1000;
            if (f > 0) {
                if (CodeStateMachine.this.f12525f != null) {
                    CodeStateMachine.this.f12525f.mo11984a((int) f);
                }
                CodeStateMachine.this.f12526g.postDelayed(CodeStateMachine.this.f12536q, 1000);
                return;
            }
            CodeStateMachine.this.mo11940a();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.CodeStateMachine$c */
    class C4742c implements Runnable {
        C4742c() {
        }

        public void run() {
            long h = (CodeStateMachine.this.mo11956h() + 1000) / 1000;
            if (h > 0) {
                if (CodeStateMachine.this.f12525f != null) {
                    CodeStateMachine.this.f12525f.mo11989b((int) h);
                }
                CodeStateMachine.this.f12526g.postDelayed(CodeStateMachine.this.f12537r, 1000);
                return;
            }
            CodeStateMachine.this.mo11962m();
        }
    }

    /* renamed from: app.zenly.locator.onboarding.CodeStateMachine$d */
    static /* synthetic */ class C4743d {

        /* renamed from: a */
        static final /* synthetic */ int[] f12541a = new int[C8445d.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                co.znly.models.verify.VerifyInfoProto$VerifyInfo$d[] r0 = p213co.znly.models.verify.VerifyInfoProto$VerifyInfo.C8445d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12541a = r0
                int[] r0 = f12541a     // Catch:{ NoSuchFieldError -> 0x0014 }
                co.znly.models.verify.VerifyInfoProto$VerifyInfo$d r1 = p213co.znly.models.verify.VerifyInfoProto$VerifyInfo.C8445d.VERIFICATION_MODE_ANDROID_AUTOMATIC_VALIDATION     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f12541a     // Catch:{ NoSuchFieldError -> 0x001f }
                co.znly.models.verify.VerifyInfoProto$VerifyInfo$d r1 = p213co.znly.models.verify.VerifyInfoProto$VerifyInfo.C8445d.VERIFICATION_MODE_DEFAULT     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f12541a     // Catch:{ NoSuchFieldError -> 0x002a }
                co.znly.models.verify.VerifyInfoProto$VerifyInfo$d r1 = p213co.znly.models.verify.VerifyInfoProto$VerifyInfo.C8445d.VERIFICATION_MODE_UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: app.zenly.locator.onboarding.CodeStateMachine.C4743d.<clinit>():void");
        }
    }

    /* renamed from: app.zenly.locator.onboarding.CodeStateMachine$e */
    abstract class C4744e implements C4886q3 {

        /* renamed from: e */
        final int f12542e;

        public C4744e(int i) {
            this.f12542e = i;
        }

        /* renamed from: a */
        public void mo11971a() {
            m13823b("autoVerifyOver()");
        }

        /* renamed from: b */
        public void mo11978b(VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo) {
            m13823b("waitForCode(VerifyInfoProto.VerifyInfo)");
        }

        /* renamed from: c */
        public void mo11979c() {
            m13823b("gotoManual()");
        }

        /* renamed from: d */
        public void mo11980d() {
            m13823b("nextActionAllowed()");
        }

        /* renamed from: e */
        public void mo11981e() {
        }

        /* renamed from: f */
        public void mo11982f() {
        }

        /* renamed from: a */
        public void mo11974a(String str) {
            m13823b("codeReceived(String)");
        }

        /* renamed from: b */
        public void mo11977b() {
            if (CodeStateMachine.this.f12525f != null) {
                CodeStateMachine.this.f12525f.mo11988b();
            }
        }

        /* renamed from: b */
        private void m13823b(String str) {
            C12143a.m32030b("invalid transition %s.%s", getClass().getSimpleName(), str);
        }

        /* renamed from: a */
        public void mo11976a(boolean z) {
            m13823b("codeValidated(boolean)");
        }

        /* renamed from: a */
        public void mo11975a(Throwable th) {
            m13823b("codeNotValidated(Throwable)");
        }

        /* renamed from: a */
        public void mo11972a(C8275s4 s4Var) {
            m13823b("invalidSession(ZenlyProto.SessionVerifyError)");
        }

        /* renamed from: a */
        public void mo11973a(VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo) {
            m13823b("gotoManual(VerifyInfoProto.VerifyInfo)");
        }
    }

    /* renamed from: app.zenly.locator.onboarding.CodeStateMachine$f */
    private class C4745f extends C4744e {
        public C4745f() {
            super(0);
        }

        /* renamed from: a */
        public void mo11973a(VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo) {
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.f12529j = codeStateMachine.mo11952e();
            if (verifyInfoProto$VerifyInfo == null || verifyInfoProto$VerifyInfo.getNumberOfActionAvailable() <= 0) {
                C12143a.m32035d("missing session info", new Object[0]);
                CodeStateMachine.this.f12530k = -1;
                CodeStateMachine.this.f12531l = -1;
                CodeStateMachine.this.f12532m = -1;
            } else {
                CodeStateMachine.this.f12530k = -1;
                CodeStateMachine codeStateMachine2 = CodeStateMachine.this;
                codeStateMachine2.f12531l = codeStateMachine2.f12529j + ((long) (verifyInfoProto$VerifyInfo.getNextEventTimer().getNanos() * C8733j.DEFAULT_IMAGE_TIMEOUT_MS));
                CodeStateMachine.this.f12532m = verifyInfoProto$VerifyInfo.getExpireAt().getSeconds() * 1000;
            }
            CodeStateMachine codeStateMachine3 = CodeStateMachine.this;
            codeStateMachine3.m13777a((C4744e) codeStateMachine3.f12527h.get(4));
        }

        /* renamed from: b */
        public void mo11978b(VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo) {
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.f12529j = codeStateMachine.mo11952e();
            if (verifyInfoProto$VerifyInfo == null || verifyInfoProto$VerifyInfo.getNumberOfActionAvailable() <= 0) {
                CodeStateMachine.this.f12530k = -1;
                CodeStateMachine.this.f12531l = -1;
                CodeStateMachine.this.f12532m = -1;
                CodeStateMachine codeStateMachine2 = CodeStateMachine.this;
                codeStateMachine2.m13777a((C4744e) codeStateMachine2.f12527h.get(4));
                return;
            }
            CodeStateMachine codeStateMachine3 = CodeStateMachine.this;
            codeStateMachine3.f12531l = codeStateMachine3.f12529j + ((long) (verifyInfoProto$VerifyInfo.getNextEventTimer().getNanos() * C8733j.DEFAULT_IMAGE_TIMEOUT_MS));
            CodeStateMachine.this.f12532m = verifyInfoProto$VerifyInfo.getExpireAt().getSeconds() * 1000;
            if (CodeStateMachine.this.f12532m <= CodeStateMachine.this.f12529j) {
                CodeStateMachine.this.m13799q();
            } else if (C4743d.f12541a[verifyInfoProto$VerifyInfo.getVerificationMode().ordinal()] != 1) {
                CodeStateMachine codeStateMachine4 = CodeStateMachine.this;
                codeStateMachine4.m13777a((C4744e) codeStateMachine4.f12527h.get(4));
            } else {
                CodeStateMachine codeStateMachine5 = CodeStateMachine.this;
                codeStateMachine5.f12530k = codeStateMachine5.f12529j + 25000;
                CodeStateMachine codeStateMachine6 = CodeStateMachine.this;
                codeStateMachine6.m13777a((C4744e) codeStateMachine6.f12527h.get(1));
            }
        }
    }

    /* renamed from: app.zenly.locator.onboarding.CodeStateMachine$g */
    interface C4746g {
        /* renamed from: a */
        void mo11983a();

        /* renamed from: a */
        void mo11984a(int i);

        /* renamed from: a */
        void mo11985a(int i, int i2);

        /* renamed from: a */
        void mo11986a(Throwable th);

        /* renamed from: a */
        void mo11987a(boolean z);

        /* renamed from: b */
        void mo11988b();

        /* renamed from: b */
        void mo11989b(int i);
    }

    /* renamed from: app.zenly.locator.onboarding.CodeStateMachine$h */
    private class C4747h extends C4744e {
        public C4747h() {
            super(4);
        }

        /* renamed from: a */
        public void mo11976a(boolean z) {
            CodeStateMachine.this.f12535p = z;
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.m13777a((C4744e) codeStateMachine.f12527h.get(5));
        }

        /* renamed from: b */
        public void mo11978b(VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo) {
            if (verifyInfoProto$VerifyInfo == null || verifyInfoProto$VerifyInfo.getNumberOfActionAvailable() <= 0) {
                C12143a.m32035d("missing session info", new Object[0]);
                CodeStateMachine.this.f12532m = -1;
                CodeStateMachine.this.f12531l = -1;
                CodeStateMachine codeStateMachine = CodeStateMachine.this;
                codeStateMachine.m13787b(codeStateMachine.f12537r);
                CodeStateMachine codeStateMachine2 = CodeStateMachine.this;
                codeStateMachine2.m13787b(codeStateMachine2.f12538s);
                return;
            }
            CodeStateMachine.this.f12532m = verifyInfoProto$VerifyInfo.getExpireAt().getSeconds() * 1000;
            CodeStateMachine codeStateMachine3 = CodeStateMachine.this;
            codeStateMachine3.m13782a(codeStateMachine3.f12538s, CodeStateMachine.this.mo11955g());
            if (verifyInfoProto$VerifyInfo.getNumberOfActionAvailable() > 0) {
                CodeStateMachine codeStateMachine4 = CodeStateMachine.this;
                codeStateMachine4.f12531l = codeStateMachine4.mo11952e() + ((long) (verifyInfoProto$VerifyInfo.getNextEventTimer().getNanos() * C8733j.DEFAULT_IMAGE_TIMEOUT_MS));
                CodeStateMachine codeStateMachine5 = CodeStateMachine.this;
                codeStateMachine5.m13781a(codeStateMachine5.f12537r);
            }
        }

        /* renamed from: d */
        public void mo11980d() {
            if (CodeStateMachine.this.f12525f != null) {
                CodeStateMachine.this.f12525f.mo11983a();
            }
        }

        /* renamed from: e */
        public void mo11981e() {
            if (CodeStateMachine.this.f12532m != -1) {
                CodeStateMachine codeStateMachine = CodeStateMachine.this;
                codeStateMachine.m13782a(codeStateMachine.f12538s, CodeStateMachine.this.mo11955g());
            }
            if (CodeStateMachine.this.f12531l != -1) {
                CodeStateMachine codeStateMachine2 = CodeStateMachine.this;
                codeStateMachine2.m13781a(codeStateMachine2.f12537r);
            }
        }

        /* renamed from: f */
        public void mo11982f() {
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.m13787b(codeStateMachine.f12537r);
            CodeStateMachine codeStateMachine2 = CodeStateMachine.this;
            codeStateMachine2.m13787b(codeStateMachine2.f12538s);
        }

        /* renamed from: a */
        public void mo11975a(Throwable th) {
            if (CodeStateMachine.this.f12525f != null) {
                CodeStateMachine.this.f12525f.mo11986a(th);
            }
        }

        /* renamed from: a */
        public void mo11972a(C8275s4 s4Var) {
            if (s4Var.getCode() == C8277b.CODE_IN_PROBATION && s4Var.getPhoneNumberProbation().getType() == C6956c.TYPE_UNKNOWN) {
                CodeStateMachine codeStateMachine = CodeStateMachine.this;
                codeStateMachine.m13777a((C4744e) codeStateMachine.f12527h.get(3));
                return;
            }
            CodeStateMachine codeStateMachine2 = CodeStateMachine.this;
            codeStateMachine2.m13777a((C4744e) codeStateMachine2.f12527h.get(5));
        }
    }

    /* renamed from: app.zenly.locator.onboarding.CodeStateMachine$i */
    private class C4748i extends C4744e {
        public C4748i() {
            super(2);
        }

        /* renamed from: a */
        public void mo11976a(boolean z) {
            CodeStateMachine.this.f12535p = z;
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.m13777a((C4744e) codeStateMachine.f12527h.get(5));
        }

        /* renamed from: e */
        public void mo11981e() {
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.m13782a(codeStateMachine.f12538s, CodeStateMachine.this.mo11955g());
        }

        /* renamed from: f */
        public void mo11982f() {
            if (CodeStateMachine.this.f12525f != null) {
                CodeStateMachine.this.f12525f.mo11987a(false);
            }
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.m13787b(codeStateMachine.f12538s);
        }

        /* renamed from: a */
        public void mo11975a(Throwable th) {
            if (CodeStateMachine.this.f12525f != null) {
                CodeStateMachine.this.f12525f.mo11987a(true);
            }
        }

        /* renamed from: a */
        public void mo11972a(C8275s4 s4Var) {
            if (s4Var.getCode() == C8277b.CODE_IN_PROBATION && s4Var.getPhoneNumberProbation().getType() == C6956c.TYPE_UNKNOWN) {
                CodeStateMachine codeStateMachine = CodeStateMachine.this;
                codeStateMachine.m13777a((C4744e) codeStateMachine.f12527h.get(3));
                return;
            }
            CodeStateMachine codeStateMachine2 = CodeStateMachine.this;
            codeStateMachine2.m13777a((C4744e) codeStateMachine2.f12527h.get(5));
        }
    }

    /* renamed from: app.zenly.locator.onboarding.CodeStateMachine$j */
    private class C4749j extends C4744e {
        public C4749j(CodeStateMachine codeStateMachine) {
            super(5);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.CodeStateMachine$k */
    private class C4750k extends C4744e {
        public C4750k() {
            super(3);
        }

        /* renamed from: c */
        public void mo11979c() {
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.m13777a((C4744e) codeStateMachine.f12527h.get(4));
        }

        /* renamed from: e */
        public void mo11981e() {
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.m13782a(codeStateMachine.f12538s, CodeStateMachine.this.mo11955g());
        }

        /* renamed from: f */
        public void mo11982f() {
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.m13787b(codeStateMachine.f12538s);
        }
    }

    /* renamed from: app.zenly.locator.onboarding.CodeStateMachine$l */
    private class C4751l extends C4744e {
        public C4751l() {
            super(1);
        }

        /* renamed from: a */
        public void mo11971a() {
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.m13777a((C4744e) codeStateMachine.f12527h.get(3));
        }

        /* renamed from: e */
        public void mo11981e() {
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.m13781a(codeStateMachine.f12536q);
            CodeStateMachine codeStateMachine2 = CodeStateMachine.this;
            codeStateMachine2.m13782a(codeStateMachine2.f12538s, CodeStateMachine.this.mo11955g());
            if (CodeStateMachine.this.f12525f != null) {
                CodeStateMachine.this.f12525f.mo11987a(true);
            }
        }

        /* renamed from: f */
        public void mo11982f() {
            if (CodeStateMachine.this.f12525f != null) {
                CodeStateMachine.this.f12525f.mo11987a(false);
            }
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.m13787b(codeStateMachine.f12538s);
            CodeStateMachine codeStateMachine2 = CodeStateMachine.this;
            codeStateMachine2.m13787b(codeStateMachine2.f12536q);
        }

        /* renamed from: a */
        public void mo11974a(String str) {
            CodeStateMachine.this.f12534o = str;
            CodeStateMachine codeStateMachine = CodeStateMachine.this;
            codeStateMachine.f12533n = codeStateMachine.mo11952e();
            CodeStateMachine codeStateMachine2 = CodeStateMachine.this;
            codeStateMachine2.m13777a((C4744e) codeStateMachine2.f12527h.get(2));
        }
    }

    /* synthetic */ CodeStateMachine(Parcel parcel, C4740a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public void m13799q() {
        if (this.f12524e) {
            C12143a.m32033c("aborting", new Object[0]);
        }
        this.f12528i.mo11982f();
        C4746g gVar = this.f12525f;
        if (gVar != null) {
            gVar.mo11988b();
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof CodeStateMachine)) {
            return false;
        }
        CodeStateMachine codeStateMachine = (CodeStateMachine) obj;
        if (this.f12529j != codeStateMachine.f12529j || this.f12530k != codeStateMachine.f12530k || this.f12531l != codeStateMachine.f12531l || this.f12532m != codeStateMachine.f12532m || this.f12533n != codeStateMachine.f12533n || this.f12528i.f12542e != codeStateMachine.f12528i.f12542e) {
            return false;
        }
        String str = this.f12534o;
        String str2 = codeStateMachine.f12534o;
        if (str != null) {
            z = str.equals(str2);
        } else if (str2 != null) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = this.f12528i.hashCode() * 31;
        long j = this.f12529j;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f12530k;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f12531l;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f12532m;
        int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.f12533n;
        int i5 = (i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        int i6 = this.f12528i.f12542e;
        int i7 = (i5 + (i6 ^ (i6 >>> 32))) * 31;
        String str = this.f12534o;
        return i7 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: k */
    public void mo11960k() {
        if (this.f12524e) {
            C12143a.m32033c("event: gotoManual", new Object[0]);
        }
        this.f12528i.mo11979c();
    }

    /* renamed from: l */
    public boolean mo11961l() {
        return mo11956h() < 0;
    }

    /* renamed from: m */
    public void mo11962m() {
        if (this.f12524e) {
            C12143a.m32033c("event: nextActionAllowed", new Object[0]);
        }
        this.f12528i.mo11980d();
    }

    /* renamed from: n */
    public void mo11963n() {
        if (this.f12524e) {
            C12143a.m32033c("pausing", new Object[0]);
        }
        this.f12528i.mo11982f();
    }

    /* renamed from: o */
    public void mo11964o() {
        this.f12529j = -1;
        this.f12530k = -1;
        this.f12531l = -1;
        this.f12532m = -1;
        this.f12533n = -1;
        this.f12534o = null;
        this.f12528i = (C4744e) this.f12527h.get(0);
    }

    /* renamed from: p */
    public void mo11965p() {
        if (this.f12524e) {
            C12143a.m32033c("resuming", new Object[0]);
        }
        this.f12528i.mo11981e();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f12528i.f12542e);
        parcel.writeLong(this.f12529j);
        parcel.writeLong(this.f12530k);
        parcel.writeLong(this.f12531l);
        parcel.writeLong(this.f12532m);
        parcel.writeLong(this.f12533n);
        parcel.writeString(this.f12534o);
    }

    CodeStateMachine() {
        this.f12524e = true;
        this.f12526g = new Handler(Looper.getMainLooper());
        this.f12527h = new SparseArray<>();
        this.f12536q = new C4741b();
        this.f12537r = new C4742c();
        this.f12538s = new C4925v2(this);
        this.f12527h.put(0, new C4745f());
        this.f12527h.put(1, new C4751l());
        this.f12527h.put(2, new C4748i());
        this.f12527h.put(3, new C4750k());
        this.f12527h.put(4, new C4747h());
        this.f12527h.put(5, new C4749j(this));
        mo11964o();
    }

    /* renamed from: f */
    public long mo11954f() {
        return this.f12530k - mo11952e();
    }

    /* renamed from: g */
    public long mo11955g() {
        return this.f12532m - mo11952e();
    }

    /* renamed from: h */
    public long mo11956h() {
        return this.f12531l - mo11952e();
    }

    /* renamed from: i */
    public long mo11958i() {
        return mo11952e() - this.f12529j;
    }

    /* renamed from: j */
    public long mo11959j() {
        return mo11952e() - this.f12533n;
    }

    /* renamed from: c */
    public int mo11949c() {
        return this.f12528i.f12542e;
    }

    /* renamed from: d */
    public String mo11950d() {
        return this.f12534o;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public long mo11952e() {
        return C5448c.m15478a().timeNow().getTime();
    }

    /* renamed from: b */
    public void mo11948b(VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo) {
        if (this.f12524e) {
            C12143a.m32033c("event: waitForCode", new Object[0]);
        }
        this.f12528i.mo11978b(verifyInfoProto$VerifyInfo);
    }

    /* renamed from: b */
    public void mo11947b() {
        if (this.f12524e) {
            C12143a.m32033c("event: codeExpired", new Object[0]);
        }
        this.f12528i.mo11977b();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m13787b(Runnable runnable) {
        this.f12526g.removeCallbacks(runnable);
    }

    /* renamed from: a */
    public void mo11940a() {
        if (this.f12524e) {
            C12143a.m32033c("event: autoVerifyOver", new Object[0]);
        }
        this.f12528i.mo11971a();
    }

    /* renamed from: a */
    public void mo11944a(String str) {
        if (this.f12524e) {
            C12143a.m32033c("event: codeReceived %s", str);
        }
        this.f12528i.mo11974a(str);
    }

    /* renamed from: a */
    public void mo11946a(boolean z) {
        if (this.f12524e) {
            C12143a.m32033c("event: codeValidated", new Object[0]);
        }
        this.f12528i.mo11976a(z);
    }

    /* renamed from: a */
    public void mo11945a(Throwable th) {
        if (this.f12524e) {
            C12143a.m32033c("event: codeNotValidated %s", th.getMessage());
        }
        this.f12528i.mo11975a(th);
    }

    private CodeStateMachine(Parcel parcel) {
        this();
        this.f12528i = (C4744e) this.f12527h.get(parcel.readInt());
        this.f12529j = parcel.readLong();
        this.f12530k = parcel.readLong();
        this.f12531l = parcel.readLong();
        this.f12532m = parcel.readLong();
        this.f12533n = parcel.readLong();
        this.f12534o = parcel.readString();
    }

    /* renamed from: a */
    public void mo11942a(C8275s4 s4Var) {
        if (this.f12524e) {
            C12143a.m32033c("event: invalidSession", new Object[0]);
        }
        this.f12528i.mo11972a(s4Var);
    }

    /* renamed from: a */
    public void mo11943a(VerifyInfoProto$VerifyInfo verifyInfoProto$VerifyInfo) {
        if (this.f12524e) {
            C12143a.m32033c("event: gotoManual", new Object[0]);
        }
        this.f12528i.mo11973a(verifyInfoProto$VerifyInfo);
    }

    /* renamed from: a */
    public void mo11941a(C4746g gVar) {
        this.f12525f = gVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13777a(C4744e eVar) {
        int i = this.f12528i.f12542e;
        int i2 = eVar.f12542e;
        if (i != i2) {
            if (this.f12524e) {
                C12143a.m32033c("changing state %s => %s", ((C4744e) this.f12527h.get(i)).getClass().getSimpleName(), ((C4744e) this.f12527h.get(i2)).getClass().getSimpleName());
            }
            this.f12528i.mo11982f();
            this.f12528i = eVar;
            C4746g gVar = this.f12525f;
            if (gVar != null) {
                gVar.mo11985a(i, i2);
            }
            this.f12528i.mo11981e();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13781a(Runnable runnable) {
        this.f12526g.removeCallbacks(runnable);
        this.f12526g.post(runnable);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13782a(Runnable runnable, long j) {
        this.f12526g.removeCallbacks(runnable);
        this.f12526g.postDelayed(runnable, j);
    }
}
