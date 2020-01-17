package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.p001v4.app.INotificationSideChannel.C0006a;

public abstract class NotificationCompatSideChannelService extends Service {

    /* renamed from: androidx.core.app.NotificationCompatSideChannelService$a */
    private class C0513a extends C0006a {
        C0513a() {
        }

        public void cancel(String str, int i, String str2) throws RemoteException {
            NotificationCompatSideChannelService.this.mo3008a(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo3010a(str, i, str2);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void cancelAll(String str) {
            NotificationCompatSideChannelService.this.mo3008a(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo3009a(str);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void notify(String str, int i, String str2, Notification notification) throws RemoteException {
            NotificationCompatSideChannelService.this.mo3008a(Binder.getCallingUid(), str);
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.mo3011a(str, i, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo3008a(int i, String str) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(i);
        int length = packagesForUid.length;
        int i2 = 0;
        while (i2 < length) {
            if (!packagesForUid[i2].equals(str)) {
                i2++;
            } else {
                return;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("NotificationSideChannelService: Uid ");
        sb.append(i);
        sb.append(" is not authorized for package ");
        sb.append(str);
        throw new SecurityException(sb.toString());
    }

    /* renamed from: a */
    public abstract void mo3009a(String str);

    /* renamed from: a */
    public abstract void mo3010a(String str, int i, String str2);

    /* renamed from: a */
    public abstract void mo3011a(String str, int i, String str2, Notification notification);

    public IBinder onBind(Intent intent) {
        if (!intent.getAction().equals("android.support.BIND_NOTIFICATION_SIDE_CHANNEL") || VERSION.SDK_INT > 19) {
            return null;
        }
        return new C0513a();
    }
}
