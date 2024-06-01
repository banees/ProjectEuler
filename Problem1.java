public class Problem1 implements Problem {

    @Override
    public void solve() {
        int range = 1000;
        int sum = 0;
        for (int i = 1; i < range; i++) {
            if (isMultipleOf3or5(i)) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

    private boolean isMultipleOf3or5(int potentialMultiple) {
        return isMultipleOf(potentialMultiple, 3) || isMultipleOf(potentialMultiple, 5);
    }

    private boolean isMultipleOf(int potentialMultiple, int multiplier) {
        return potentialMultiple % multiplier == 0;
    }

    @Override
    public String getProblem() {
        return "https://projecteuler.net/problem=1";
    }
}
