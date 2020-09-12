package com.softd.neteasy.springcloudlab.userservice.myhystrixdefine;

public interface MyHystrixCommand<T> {

    T run();

    T fallBack();

}
