package dev.akemi.backend.mapper;

import dev.akemi.backend.entity.Ebook;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author Lulouch
* @description 针对表【ebook(电子书)】的数据库操作Mapper
* @createDate 2024-10-26 14:55:31
* @Entity dev.akemi.backend.entity.Ebook
*/
@Mapper
public interface EbookMapper extends BaseMapper<Ebook> {

}




