public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        m1();    }

    static void m1() {
        System.out.println(getCallerClassAndMethodName());
        m2();    }

    static void m2() {
        System.out.println(getCallerClassAndMethodName());
        m3();    }

    static void m3() {
        System.out.println(getCallerClassAndMethodName());    }

    public static double sqrt(double x) {
        if (x < 0) { throw new IllegalArgumentException("Expected non-negative number, got " + x); }
        else {
            return java.lang.Math.sqrt(x);
        }
    }
    public static String getCallerClassAndMethodName() {
        StackTraceElement[] element = new Exception().getStackTrace();
        if (element.length < 3) { return null; }
        else {
            String className = element[1].getClassName();
            String methodName = element[2].getMethodName();
            return className + "#" + methodName;
        }
    }
}

