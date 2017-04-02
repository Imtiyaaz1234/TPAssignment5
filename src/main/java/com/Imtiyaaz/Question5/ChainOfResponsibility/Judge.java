package com.Imtiyaaz.Question5.ChainOfResponsibility;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class Judge extends RequestHandler {
    public Judge(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.EXECUTES)) {
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Judge";
    }
}
