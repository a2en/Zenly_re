package app.zenly.locator.map.view.opengl;

import android.content.Context;
import android.opengl.GLES20;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import p387h.p388a.C12143a;

/* renamed from: app.zenly.locator.map.view.opengl.c */
public class C4398c {

    /* renamed from: a */
    private C4401f f11875a;

    /* renamed from: b */
    private String f11876b;

    /* renamed from: c */
    private String f11877c;

    /* renamed from: d */
    private int f11878d;

    public C4398c(Context context, int i, int i2) {
        this.f11876b = m13086a(context, i);
        this.f11877c = m13086a(context, i2);
    }

    /* renamed from: a */
    public int mo11542a(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f11878d, str);
        this.f11875a.mo11556b();
        return glGetAttribLocation;
    }

    /* renamed from: b */
    public boolean mo11546b() {
        return this.f11878d == 0;
    }

    /* renamed from: b */
    public int mo11545b(String str) {
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f11878d, str);
        this.f11875a.mo11556b();
        return glGetUniformLocation;
    }

    /* renamed from: a */
    public void mo11544a(C4401f fVar) {
        this.f11875a = fVar;
        this.f11878d = m13085a(this.f11876b, this.f11877c);
        fVar.mo11556b();
        int i = this.f11878d;
        if (i != 0) {
            GLES20.glUseProgram(i);
            fVar.mo11556b();
        }
    }

    /* renamed from: a */
    public void mo11543a() {
        int i = this.f11878d;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.f11878d = 0;
        }
    }

    /* renamed from: a */
    private int m13085a(String str, String str2) {
        int a = m13084a(35633, str);
        if (a == 0) {
            return 0;
        }
        int a2 = m13084a(35632, str2);
        if (a2 == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            return 0;
        }
        GLES20.glAttachShader(glCreateProgram, a);
        this.f11875a.mo11556b();
        GLES20.glAttachShader(glCreateProgram, a2);
        this.f11875a.mo11556b();
        GLES20.glLinkProgram(glCreateProgram);
        this.f11875a.mo11556b();
        GLES20.glDetachShader(glCreateProgram, a);
        this.f11875a.mo11556b();
        GLES20.glDeleteShader(a);
        this.f11875a.mo11556b();
        GLES20.glDetachShader(glCreateProgram, a2);
        this.f11875a.mo11556b();
        GLES20.glDeleteShader(a2);
        this.f11875a.mo11556b();
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        this.f11875a.mo11556b();
        if (iArr[0] == 0) {
            C12143a.m32030b(GLES20.glGetProgramInfoLog(glCreateProgram), new Object[0]);
            GLES20.glDeleteProgram(glCreateProgram);
            this.f11875a.mo11556b();
        }
        return glCreateProgram;
    }

    /* renamed from: a */
    private int m13084a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        this.f11875a.mo11556b();
        GLES20.glCompileShader(glCreateShader);
        this.f11875a.mo11556b();
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        C12143a.m32030b(GLES20.glGetShaderInfoLog(glCreateShader), new Object[0]);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: a */
    private String m13086a(Context context, int i) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().openRawResource(i)));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return sb.toString();
                }
                sb.append(readLine);
            } catch (IOException unused) {
                return null;
            }
        }
    }
}
