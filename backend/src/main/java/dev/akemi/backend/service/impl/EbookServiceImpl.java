package dev.akemi.backend.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import dev.akemi.backend.entity.Ebook;
import dev.akemi.backend.service.EbookService;
import dev.akemi.backend.mapper.EbookMapper;
import org.springframework.stereotype.Service;

/**
* @author Lulouch
* @description 针对表【ebook(电子书)】的数据库操作Service实现
* @createDate 2024-10-26 14:55:31
*/
@Service
public class EbookServiceImpl extends ServiceImpl<EbookMapper, Ebook>
    implements EbookService{

}




