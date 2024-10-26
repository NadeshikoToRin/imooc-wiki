package dev.akemi.backend.model.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * 电子书
 * @TableName ebook
 */
@TableName(value ="ebook")
public class Ebook implements Serializable {
    /**
     * id
     */
    @TableId
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 分类1
     */
    private Long category1Id;

    /**
     * 分类2
     */
    private Long category2Id;

    /**
     * 描述
     */
    private String description;

    /**
     * 封面
     */
    private String cover;

    /**
     * 文档数
     */
    private Integer docCount;

    /**
     * 阅读数
     */
    private Integer viewCount;

    /**
     * 点赞数
     */
    private Integer voteCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    public Long getId() {
        return id;
    }

    /**
     * id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 分类1
     */
    public Long getCategory1Id() {
        return category1Id;
    }

    /**
     * 分类1
     */
    public void setCategory1Id(Long category1Id) {
        this.category1Id = category1Id;
    }

    /**
     * 分类2
     */
    public Long getCategory2Id() {
        return category2Id;
    }

    /**
     * 分类2
     */
    public void setCategory2Id(Long category2Id) {
        this.category2Id = category2Id;
    }

    /**
     * 描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 描述
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 封面
     */
    public String getCover() {
        return cover;
    }

    /**
     * 封面
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * 文档数
     */
    public Integer getDocCount() {
        return docCount;
    }

    /**
     * 文档数
     */
    public void setDocCount(Integer docCount) {
        this.docCount = docCount;
    }

    /**
     * 阅读数
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * 阅读数
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * 点赞数
     */
    public Integer getVoteCount() {
        return voteCount;
    }

    /**
     * 点赞数
     */
    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Ebook other = (Ebook) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getCategory1Id() == null ? other.getCategory1Id() == null : this.getCategory1Id().equals(other.getCategory1Id()))
            && (this.getCategory2Id() == null ? other.getCategory2Id() == null : this.getCategory2Id().equals(other.getCategory2Id()))
            && (this.getDescription() == null ? other.getDescription() == null : this.getDescription().equals(other.getDescription()))
            && (this.getCover() == null ? other.getCover() == null : this.getCover().equals(other.getCover()))
            && (this.getDocCount() == null ? other.getDocCount() == null : this.getDocCount().equals(other.getDocCount()))
            && (this.getViewCount() == null ? other.getViewCount() == null : this.getViewCount().equals(other.getViewCount()))
            && (this.getVoteCount() == null ? other.getVoteCount() == null : this.getVoteCount().equals(other.getVoteCount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getCategory1Id() == null) ? 0 : getCategory1Id().hashCode());
        result = prime * result + ((getCategory2Id() == null) ? 0 : getCategory2Id().hashCode());
        result = prime * result + ((getDescription() == null) ? 0 : getDescription().hashCode());
        result = prime * result + ((getCover() == null) ? 0 : getCover().hashCode());
        result = prime * result + ((getDocCount() == null) ? 0 : getDocCount().hashCode());
        result = prime * result + ((getViewCount() == null) ? 0 : getViewCount().hashCode());
        result = prime * result + ((getVoteCount() == null) ? 0 : getVoteCount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", category1Id=").append(category1Id);
        sb.append(", category2Id=").append(category2Id);
        sb.append(", description=").append(description);
        sb.append(", cover=").append(cover);
        sb.append(", docCount=").append(docCount);
        sb.append(", viewCount=").append(viewCount);
        sb.append(", voteCount=").append(voteCount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}