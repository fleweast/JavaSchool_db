package aop_advanced_example.aop;

import aop_advanced_example.DBException;

public interface DBExceptionHandler {
    void handle(DBException ex);
}
