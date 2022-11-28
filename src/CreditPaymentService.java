public class CreditPaymentService {
    public int calculate(long s, int p, float b) {
        float m = b / (100 * 12);
        int payment = (int) (s * m / (1 - Math.pow(1 + m, -p)));
        return payment;
    }
}
