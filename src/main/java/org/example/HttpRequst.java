package org.example;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * **
 *  * HttpRequest
 *  *    - RequestLine
 *  *      - Method
 *  *      - urlPath
 *  *      - queryString
 *  *    - Header
 *  *    - protocol/version
 *
 */
public class HttpRequst {
    private final RequestLine requestLine;

    public HttpRequst(BufferedReader br) throws IOException {
        this.requestLine = new RequestLine(br.readLine());
    }

    public boolean isGetRequest() {
        return requestLine. isGetRequest();
    }

    public boolean matchPath(String path) {
        return requestLine.matchPath(path);
    }

    public QueryStrings getQueryStrings() {
        return requestLine.getQueryStrings();
    }
}