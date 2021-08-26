package neverUsedSwitch;

public class MailSender {

    public void send(MailInfo mailInfo) {
        int mailType = mailInfo.getMailType();
        String mailContext = mailInfo.getContext();
       // MailType.determineType(mailType).getMailHandler().send(mailContext);
    }
}