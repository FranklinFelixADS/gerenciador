package com.pdp.gerenciador.http;

import java.util.Map;
import java.util.HashMap;


public class HttpRequest {
    private String url;
    private int timeout;
    private String token;
    private Map<String, String> headers;

    private HttpRequest(Builder builder) {
        this.url = builder.url;
        this.timeout = builder.timeout;
        this.token = builder.token;
        this.headers = builder.headers;
    }

    public static class Builder {
        private String url;
        private int timeout = 1000;
        private String token;
        private Map<String, String> headers = new HashMap<>();

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder auth(String token) {
            this.token = token;
            return this;
        }

        public Builder addHeader(String key, String value) {
            this.headers.put(key, value);
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }
}
