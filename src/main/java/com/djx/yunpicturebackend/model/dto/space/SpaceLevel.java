package com.djx.yunpicturebackend.model.dto.space;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 空间等级
 */
@Data
@AllArgsConstructor
public class SpaceLevel {

    /**
     * 值
     */
    private int value;

    /**
     * 中文文本
     */
    private String text;

    /**
     * 最大数量
     */
    private long maxCount;

    /**
     * 最大容量
     */
    private long maxSize;
}
