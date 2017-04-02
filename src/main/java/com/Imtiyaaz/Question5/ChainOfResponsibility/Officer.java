package com.Imtiyaaz.Question5.ChainOfResponsibility;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class Officer extends RequestHandler {
    public Officer(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        if (req.getRequestType().equals(RequestType.TAKES_CRIMINAL)) {
            printHandling(req);
        } else {
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Police officer";
    }

}
