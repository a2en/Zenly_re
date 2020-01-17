package bolts;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;

public class AggregateException extends Exception {
    private static final long serialVersionUID = 1;

    /* renamed from: e */
    private List<Throwable> f15867e;

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        int i = -1;
        for (Throwable th : this.f15867e) {
            String str = "\n";
            printStream.append(str);
            printStream.append("  Inner throwable #");
            i++;
            printStream.append(Integer.toString(i));
            printStream.append(": ");
            th.printStackTrace(printStream);
            printStream.append(str);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        int i = -1;
        for (Throwable th : this.f15867e) {
            String str = "\n";
            printWriter.append(str);
            printWriter.append("  Inner throwable #");
            i++;
            printWriter.append(Integer.toString(i));
            printWriter.append(": ");
            th.printStackTrace(printWriter);
            printWriter.append(str);
        }
    }
}
