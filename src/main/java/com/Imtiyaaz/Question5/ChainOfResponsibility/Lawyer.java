package com.Imtiyaaz.Question5.ChainOfResponsibility;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class Lawyer extends RequestHandler {
    public Lawyer(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.COLLECT_TAX)) {
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "The Lawyer";
    }
}
