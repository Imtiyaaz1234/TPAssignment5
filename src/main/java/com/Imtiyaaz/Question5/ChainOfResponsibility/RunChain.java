package com.Imtiyaaz.Question5.ChainOfResponsibility;

/**
 * Created by Ameer on 2017/04/01.
 */
public class RunChain {
    public static void main(String[] args)
    {
        Constitution con = new Constitution();
        con.makeRequest(new Request(RequestType.EXECUTES, "EXECUTES"));
        con.makeRequest(new Request(RequestType.TAKES_CRIMINAL,
                "Takes criminal to jail"));
        con.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));

    }
}
