package com.Imtiyaaz.Question5.ChainOfResponsibility;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public abstract class RequestHandler {
    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    public void handleRequest(Request req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandling(Request req) {
        System.out.println(this + " handling request \"" + req + "\"");
    }

    @Override
    public abstract String toString();
}
