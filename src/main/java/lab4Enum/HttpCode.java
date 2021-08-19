package lab4Enum;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum HttpCode {
    INFORMATIONAL(100, 199, new HttpCodeHandlerImpl()),
    SUCCESS(200, 299, new HttpCodeHandlerImpl()),
    REDIRECTION(300, 399, new HttpCodeHandlerImpl()),
    CLIENT_ERROR(400, 499, new HttpCodeHandlerImpl()),
    SERVER_ERROR(500, 600, new HttpCodeHandlerImpl());

    private final int min;
    private final int max;

    private final HttpCodeHandler httpCodeHandler;

    public static void handle(int httpCode) {

        for (HttpCode httpCodeEnum : values()) {
            if (httpCode <= httpCodeEnum.max && httpCode >= httpCodeEnum.min) {
                httpCodeEnum.httpCodeHandler.handle(httpCode);
                return;
            }
        }
        throw new UnsupportedOperationException(httpCode + " unsupported");

    }
}
