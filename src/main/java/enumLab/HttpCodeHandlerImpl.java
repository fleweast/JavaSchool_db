package enumLab;

public class HttpCodeHandlerImpl implements HttpCodeHandler {
    @Override
    public void handle(int code) {
        System.out.println("Error with code "+code+" happened in client side, waiting two min before last retry");
    }
}
