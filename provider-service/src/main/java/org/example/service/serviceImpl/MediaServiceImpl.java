package org.example.service.serviceImpl;

import org.apache.dubbo.config.annotation.DubboService;
import org.example.vedioParse.MediaService;

@DubboService
public class MediaServiceImpl implements MediaService {
    @Override
    public String syHello(String org) {
        return "12";
    }
}
