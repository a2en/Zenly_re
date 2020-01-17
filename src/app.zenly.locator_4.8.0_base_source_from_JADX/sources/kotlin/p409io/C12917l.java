package kotlin.p409io;

import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import kotlin.jvm.internal.C12932j;

/* renamed from: kotlin.io.l */
public final class C12917l {
    /* renamed from: a */
    public static final String m33782a(Reader reader) {
        C12932j.m33818b(reader, "$this$readText");
        StringWriter stringWriter = new StringWriter();
        m33781a(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        C12932j.m33815a((Object) stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    /* renamed from: a */
    public static /* synthetic */ long m33781a(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m33780a(reader, writer, i);
    }

    /* renamed from: a */
    public static final long m33780a(Reader reader, Writer writer, int i) {
        C12932j.m33818b(reader, "$this$copyTo");
        C12932j.m33818b(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }
}
