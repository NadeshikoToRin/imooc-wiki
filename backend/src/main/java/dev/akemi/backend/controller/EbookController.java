package dev.akemi.backend.controller;

import dev.akemi.backend.entity.Ebook;
import dev.akemi.backend.entity.RestBean;
import dev.akemi.backend.service.EbookService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    EbookService ebookService;

    @GetMapping
    public RestBean<List<Ebook>> getEbooks() {
        return RestBean.success(ebookService.list());
    }
}
