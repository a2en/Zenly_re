package app.zenly.locator.debug;

import android.system.Os;
import android.system.OsConstants;
import com.crashlytics.android.C9252a;
import java.io.BufferedReader;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.debug.c */
public final class C3442c {

    /* renamed from: app.zenly.locator.debug.c$a */
    static class C3443a extends Thread {

        /* renamed from: e */
        final /* synthetic */ FileDescriptor[] f9466e;

        C3443a(FileDescriptor[] fileDescriptorArr) {
            this.f9466e = fileDescriptorArr;
        }

        public void run() {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(this.f9466e[0])));
                boolean z = false;
                int i = 65536;
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        if (!z && readLine.startsWith("panic:")) {
                            C9252a.m22275a("gopanic", true);
                            z = true;
                        }
                        if (z && i > 0) {
                            String trim = readLine.trim();
                            C9252a.m22273a(trim);
                            i -= trim.length() + 46;
                        }
                    } else {
                        return;
                    }
                }
            } catch (Exception e) {
                C12143a.m32032b(e, "Exception in stderr reader thread", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public static void m10685a() {
        try {
            FileDescriptor[] pipe = Os.pipe();
            Os.dup2(pipe[1], OsConstants.STDERR_FILENO);
            C12143a.m32033c("initialized, start stderr logger thread", new Object[0]);
            new C3443a(pipe).start();
        } catch (Exception e) {
            C12143a.m32032b(e, "Exception while redirecting stderr", new Object[0]);
        }
    }
}
