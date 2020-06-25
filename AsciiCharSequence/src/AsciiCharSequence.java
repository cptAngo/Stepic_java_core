import java.util.ArrayList;
import java.util.List;

public class AsciiCharSequence implements CharSequence {
    private final byte[] ar;

    public AsciiCharSequence(byte[] ar) {
        this.ar = ar.clone();
    }

    public int length() {
        return this.ar.length;
    }

    public char charAt(int ind) {
        return (char) this.ar[ind];
    }

    public AsciiCharSequence subSequence(int start, int end) {
        byte[] sub_ar = new byte[end-start];
        int count = 0;
        for (int i = start; i < end; i++) {
            sub_ar[count] = this.ar[i];
            count++;
        }
        AsciiCharSequence acs = new AsciiCharSequence(sub_ar);
        return acs;
    }

    public String toString() {
        char[] c_ar = new char[this.ar.length];
        for (int i = 0; i < this.ar.length; i++) {
            c_ar[i] = (char) this.ar[i];
        }
        String str = new String(c_ar);
        return str;
    }
}
