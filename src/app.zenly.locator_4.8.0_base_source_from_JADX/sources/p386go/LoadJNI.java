package p386go;

import android.app.Application;
import android.content.Context;
import java.util.logging.Logger;

/* renamed from: go.LoadJNI */
public class LoadJNI {
    public static final Object ctx;
    private static Logger log = Logger.getLogger("GoLoadJNI");

    static {
        System.loadLibrary("gojni");
        Context context = null;
        try {
            context = ((Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", new Class[0]).invoke(context, new Object[0])).getApplicationContext();
        } catch (Exception e) {
            Logger logger = log;
            StringBuilder sb = new StringBuilder();
            sb.append("Global context not found: ");
            sb.append(e);
            logger.warning(sb.toString());
        } finally {
            ctx = context;
        }
    }
}
