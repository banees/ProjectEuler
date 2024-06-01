public interface Problem {

    void solve();

    default String getProblem() {
        return "https://projecteuler.net/archives";
    }
}
