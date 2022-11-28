public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long sum = 1_000_000;
        int period = 1;
        float bid = 9.99f;

        int payt = service.calculate(sum, period * 12, bid);
        System.out.println("При сроке кредита 1 год, ежемесячный платеж = " + payt + " р");

        payt = service.calculate(sum, period * 12 * 2, bid);
        System.out.println("При сроке кредита 2 года, ежемесячный платеж = " + payt + " р");

        payt = service.calculate(sum, period * 12 * 3, bid);
        System.out.println("При сроке кредита 3 года, ежемесячный платеж = " + payt + " р");
    }
}
