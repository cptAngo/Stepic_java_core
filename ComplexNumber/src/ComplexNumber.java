public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof ComplexNumber) {
            ComplexNumber other = (ComplexNumber) obj;
            if ((this.re == other.re) && (this.im == other.im)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        final double prime = 31;
        double result = 1;
        result = prime * result + this.re;
        result = prime * result + this.im;
        return (int) result;
    }
}
