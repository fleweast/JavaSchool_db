package enumLab;

public class HttpService {
    public void handleHttpCode(int httpCode) {
        HttpCode.findByCode(httpCode/100).handleCode();
    }

    public static void main(String[] args) {
        HttpService httpService = new HttpService();
        httpService.handleHttpCode(300);
    }
}
