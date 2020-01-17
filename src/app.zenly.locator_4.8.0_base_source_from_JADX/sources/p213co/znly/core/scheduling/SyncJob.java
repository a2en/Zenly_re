package p213co.znly.core.scheduling;

import android.util.Log;
import android.util.SparseArray;
import com.evernote.android.job.C9435b;
import com.evernote.android.job.C9435b.C9437b;
import com.evernote.android.job.C9435b.C9438c;
import com.evernote.android.job.C9447g;
import com.evernote.android.job.C9450h;
import com.evernote.android.job.C9450h.C9452b;
import com.evernote.android.job.C9450h.C9453c;
import com.evernote.android.job.C9450h.C9454d;
import com.evernote.android.job.util.support.C9473b;
import java.util.Iterator;
import java.util.Map.Entry;
import p213co.znly.core.scheduling.SyncJobExtras.Job;
import p213co.znly.core.scheduling.SyncJobExtras.JobRequest;
import p213co.znly.core.scheduling.SyncJobExtras.Jobs;
import p213co.znly.core.scheduling.SyncJobExtras.Jobs.Builder;
import p213co.znly.core.scheduling.SyncJobExtras.Result;
import p213co.znly.core.vendor.com.google.protobuf.InvalidProtocolBufferException;

/* renamed from: co.znly.core.scheduling.SyncJob */
public class SyncJob extends C9435b {
    public static final String TAG = "SyncJob";
    private static final String _HANDLER_ID_KEY = "__syncjob:handlerid__";
    private static final String _UUID_KEY = "__syncjob:uuid__";

    /* renamed from: co.znly.core.scheduling.SyncJob$1 */
    static /* synthetic */ class C66291 {
        static final /* synthetic */ int[] $SwitchMap$com$evernote$android$job$Job$Result = new int[C9438c.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        static {
            /*
                com.evernote.android.job.b$c[] r0 = com.evernote.android.job.C9435b.C9438c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$evernote$android$job$Job$Result = r0
                int[] r0 = $SwitchMap$com$evernote$android$job$Job$Result     // Catch:{ NoSuchFieldError -> 0x0014 }
                com.evernote.android.job.b$c r1 = com.evernote.android.job.C9435b.C9438c.SUCCESS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = $SwitchMap$com$evernote$android$job$Job$Result     // Catch:{ NoSuchFieldError -> 0x001f }
                com.evernote.android.job.b$c r1 = com.evernote.android.job.C9435b.C9438c.FAILURE     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = $SwitchMap$com$evernote$android$job$Job$Result     // Catch:{ NoSuchFieldError -> 0x002a }
                com.evernote.android.job.b$c r1 = com.evernote.android.job.C9435b.C9438c.RESCHEDULE     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p213co.znly.core.scheduling.SyncJob.C66291.<clinit>():void");
        }
    }

    public static void cancelJob(int i) {
        C9447g.m22884g().mo25313a(i);
    }

    public static byte[] getAllJobs() {
        Builder newBuilder = Jobs.newBuilder();
        C9447g g = C9447g.m22884g();
        SparseArray a = g.mo25307a();
        for (C9450h hVar : g.mo25316b(TAG)) {
            Job.Builder newBuilder2 = Job.newBuilder();
            newBuilder2.setId((long) hVar.mo25348k());
            newBuilder2.setUuid(hVar.mo25342f().mo25446a(_UUID_KEY, ""));
            C9435b b = g.mo25314b(hVar.mo25348k());
            if (b != null) {
                newBuilder2.setFinished(b.isFinished());
                newBuilder2.setScheduled(true);
            }
            C9438c cVar = (C9438c) a.get(hVar.mo25348k());
            if (cVar != null) {
                int i = C66291.$SwitchMap$com$evernote$android$job$Job$Result[cVar.ordinal()];
                if (i == 1) {
                    newBuilder2.setResult(Result.RESULT_SUCCESS);
                } else if (i != 2) {
                    if (i != 3) {
                    }
                    newBuilder2.setResult(Result.RESULT_RESCHEDULE);
                }
                newBuilder2.setResult(Result.RESULT_FAILURE);
                newBuilder2.setResult(Result.RESULT_RESCHEDULE);
            }
            newBuilder.addJobs(newBuilder2);
        }
        return ((Jobs) newBuilder.build()).toByteArray();
    }

    public static int scheduleJob(byte[] bArr) {
        String str = TAG;
        try {
            JobRequest jobRequest = (JobRequest) ((JobRequest.Builder) JobRequest.newBuilder().mergeFrom(bArr)).build();
            C9473b bVar = new C9473b();
            for (Entry entry : jobRequest.getExtrasMap().entrySet()) {
                bVar.mo25449b((String) entry.getKey(), (String) entry.getValue());
            }
            bVar.mo25449b(_HANDLER_ID_KEY, jobRequest.getHandlerId());
            bVar.mo25449b(_UUID_KEY, jobRequest.getUuid());
            C9453c cVar = new C9453c(str);
            cVar.mo25366a(jobRequest.getExecWindowStartMs(), jobRequest.getExecWindowStopMs());
            if (jobRequest.getBackoffValueMs() != 0) {
                cVar.mo25367a(jobRequest.getBackoffValueMs(), C9452b.values()[jobRequest.getBackoffPolicyValue()]);
            }
            if (jobRequest.getStartNow()) {
                cVar.mo25372b();
            }
            cVar.mo25369a(bVar);
            cVar.mo25370a(jobRequest.getRequirementsEnforced());
            cVar.mo25374c(jobRequest.getRequiresCharging());
            cVar.mo25375d(jobRequest.getRequiresDeviceIdle());
            cVar.mo25373b(jobRequest.getRequiresBatteryNotLow());
            cVar.mo25368a(C9454d.values()[jobRequest.getNetworkTypeValue()]);
            cVar.mo25376e(jobRequest.getUpdateCurrent());
            return cVar.mo25371a().mo25329B();
        } catch (InvalidProtocolBufferException e) {
            Log.e(str, "Can't unmarshal SyncJobExtras to buffer", e);
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public native boolean _onRunJob(int i, byte[] bArr);

    /* access modifiers changed from: protected */
    public C9438c onRunJob(C9437b bVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Run job=");
        sb.append(bVar.mo25281b());
        Log.v(TAG, sb.toString());
        C9473b a = bVar.mo25280a();
        JobRequest.Builder newBuilder = JobRequest.newBuilder();
        Iterator it = a.mo25447a().iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            String str2 = (String) it.next();
            newBuilder.putExtras(str2, a.mo25446a(str2, str));
        }
        String str3 = _HANDLER_ID_KEY;
        newBuilder.setHandlerId(newBuilder.getExtrasOrDefault(str3, str));
        String str4 = _UUID_KEY;
        newBuilder.setUuid(newBuilder.getExtrasOrDefault(str4, str));
        newBuilder.removeExtras(str3);
        newBuilder.removeExtras(str4);
        return _onRunJob(bVar.mo25281b(), ((JobRequest) newBuilder.build()).toByteArray()) ? C9438c.SUCCESS : C9438c.FAILURE;
    }
}
