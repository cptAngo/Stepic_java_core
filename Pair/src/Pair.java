import java.util.Objects;
import java.util.Optional;

public class Pair<F,S> {
    private final F first;
    private final S second;

    private Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return this.first;
    }

    public S getSecond() {
        return this.second;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {return true; }
        if (!(obj instanceof Pair)) { return false;}

        Pair<?,?> other = (Pair<?,?>) obj;
        return (Objects.equals(first, other.getFirst()) && (Objects.equals(second, other.getSecond())));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime*result + (this.first != null ? this.first.hashCode() : 0);
        result = prime*result + (this.second != null ? this.second.hashCode() : 0);
        return result;
    }

    public static <F, S> Pair<F, S> of(F first, S second) {
        return new Pair<F, S>(first, second);
    }

}
