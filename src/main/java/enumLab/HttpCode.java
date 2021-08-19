package enumLab;

public enum HttpCode {
    REDIRECTION(3), CLIENTERROR(4), SERVERERROR(5);

    private final int dbCode;

    HttpCode(int dbCode){
        this.dbCode = dbCode;
    }

    public void handleCode() {
        System.out.println(this.toString() + " is handled");
    }

    public static HttpCode findByCode(int dbCode){
        HttpCode[] statuses = values();
        for (HttpCode status : statuses) {
            if (status.dbCode == dbCode) {
                return status;
            }
        }
        throw new IllegalStateException(dbCode+" is invalid");
    }
}
