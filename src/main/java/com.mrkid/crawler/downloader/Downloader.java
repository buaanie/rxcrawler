package com.mrkid.crawler.downloader;

import com.mrkid.crawler.Page;
import com.mrkid.crawler.Request;
import io.reactivex.Flowable;

import java.io.Closeable;

/**
 * User: xudong
 * Date: 08/12/2016
 * Time: 4:39 PM
 */
public interface Downloader extends Closeable{
    Flowable<Page> download(Request request);
}
