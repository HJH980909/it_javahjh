package org.example.redis;

public interface KeyPrefix {

    public int expireSeconds();

    public String getPrefix();
}
