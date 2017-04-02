package com.Imtiyaaz.Question5.ChainOfResponsibility;

/**
 * Created by Imtiyaaz on 2017/04/01.
 */
public class Constitution {
    RequestHandler chain;

    public Constitution() {
        buildChain();
    }

    private void buildChain() {
        chain = new Judge(new Officer(new Lawyer(null)));
    }

    public void makeRequest(Request req) {
        chain.handleRequest(req);
    }
}
