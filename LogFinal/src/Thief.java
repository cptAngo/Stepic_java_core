public class Thief implements MailService{

    private final int price;
    private int stolenValue = 0;

    public Thief(int price) {
        this.price = price;
    }

    public int getStolenValue() {
        return stolenValue;
    }


    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if (((MailPackage) mail).getContent().getPrice() >= this.price) {
                stolenValue += ((MailPackage) mail).getContent().getPrice();
                Package newPackage = new Package("stones instead of " + ((MailPackage) mail).getContent().getContent(), 0);
                return new MailPackage(mail.getFrom(), mail.getTo(), newPackage);
            }
        }
        return mail;
    }
}
