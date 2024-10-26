package dev.akemi.backend.model.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class EbookQueryRequest {
    private Long id;
    private String name;
    private Long category1Id;
    private Long category2Id;

}
