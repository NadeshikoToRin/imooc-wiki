package dev.akemi.backend.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import dev.akemi.backend.model.RestBean;
import dev.akemi.backend.model.dto.EbookQueryRequest;
import dev.akemi.backend.model.entity.Ebook;
import dev.akemi.backend.model.vo.EbookVO;
import dev.akemi.backend.service.EbookService;
import jakarta.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ebook")
public class EbookController {
    @Resource
    EbookService ebookService;

    @GetMapping
    public RestBean<List<EbookVO>> getEbooks() {
        List<Ebook> ebooks = ebookService.list();
        List<EbookVO> ebookVOs = ebooks.stream().map(ebook -> {
            EbookVO ebookVO = new EbookVO();
            BeanUtils.copyProperties(ebook, ebookVO);
            return ebookVO;
                }
        ).toList();
        return RestBean.success(ebookVOs);
    }

    @PostMapping("/query")
    public RestBean<List<EbookVO>> queryEbook(@RequestBody EbookQueryRequest ebookQueryRequest) {
        QueryWrapper<Ebook> ebookQueryWrapper = new QueryWrapper<>();
        ebookQueryWrapper.eq(ebookQueryRequest.getId() != null,"id", ebookQueryRequest.getId());
        ebookQueryWrapper.like(ebookQueryRequest.getName() != null,"name", ebookQueryRequest.getName());
        ebookQueryWrapper.eq(ebookQueryRequest.getCategory1Id() != null,"category1_id",
                ebookQueryRequest.getCategory1Id());
        List<Ebook> ebooks = ebookService.list(ebookQueryWrapper);
        List<EbookVO> ebookVOS = ebooks.stream().map(ebook -> {
            EbookVO ebookVO = new EbookVO();
            BeanUtils.copyProperties(ebook, ebookVO);
            return ebookVO;
        }).toList();
        return RestBean.success(ebookVOS);
    }
}
