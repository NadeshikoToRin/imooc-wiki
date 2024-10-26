package dev.akemi.backend.model.vo;

import lombok.Data;

@Data
public class EbookVO {
    private Long id;
    private String name;
    private Long category1Id;
    private Long category2Id;
    private String description;
    private String cover;
    private Integer docCount;
    private Integer viewCount;
    private Integer voteCount;

}
