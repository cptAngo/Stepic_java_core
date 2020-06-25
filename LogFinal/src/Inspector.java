public class Inspector implements MailService{

    @Override
    public Sendable processMail(Sendable mail) {
        if (mail instanceof MailPackage) {
            if ((((MailPackage) mail).getContent().getContent().contains(WEAPONS)) |
                    (((MailPackage) mail).getContent().getContent().contains(BANNED_SUBSTANCE))) {
                throw new IllegalPackageException();
            }
            else if (((MailPackage) mail).getContent().getContent().contains("stones")) {
                throw new StolenPackageException();
            }
        }
        return mail;
    }
}
