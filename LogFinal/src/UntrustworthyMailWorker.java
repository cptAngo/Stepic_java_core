public class UntrustworthyMailWorker implements MailService {

    protected final MailService[] mailServices;
    protected final RealMailService realMailService;

    public UntrustworthyMailWorker(MailService[] mailServices) {
        this.mailServices = mailServices.clone();
        this.realMailService = new RealMailService();
    }

    public RealMailService getRealMailService() {
        return realMailService;
    }

    @Override
    public Sendable processMail(Sendable mail) {
        Sendable sendable =  mail;
        for (MailService mailService: mailServices) {
            sendable = mailService.processMail(sendable);
        }
        sendable = realMailService.processMail(sendable);
        return sendable;
    }
}
