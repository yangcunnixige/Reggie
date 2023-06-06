package com.yangnan.reggie.controller;

import com.yangnan.reggie.common.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/common")
@Slf4j
public class CommonController {

    /**
     * 文件上传
     * @param file
     * @return
     */
    @RequestMapping("upload")
    public R<String> upload(MultipartFile file) {
        log.info(file.toString());
        return null;
    }
}
