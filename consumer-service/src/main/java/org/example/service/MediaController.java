package org.example.service;

import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.dubbo.config.annotation.DubboReference;
import org.example.vedioParse.MediaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 媒体接口
 * @author ZuoBro
 * date: 2021/5/20
 * time: 16:34
 */
@RestController
@RequestMapping("/media")
public class MediaController {
    @DubboReference(timeout = 6000)
    private MediaService mediaService;

    @RequestMapping("/parse")
    private String getSyHello(){
        return mediaService.syHello("");
    }
}
