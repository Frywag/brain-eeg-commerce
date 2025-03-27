package com.braincommerce.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 分页结果包装类
 *
 * @param <T> 分页数据类型
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PageResult<T> {
    /**
     * 当前页码
     */
    private int page;

    /**
     * 每页大小
     */
    private int size;

    /**
     * 总记录数
     */
    private long total;

    /**
     * 总页数
     */
    private int totalPages;

    /**
     * 当前页数据
     */
    private List<T> content;

    /**
     * 是否是第一页
     */
    private boolean first;

    /**
     * 是否是最后一页
     */
    private boolean last;
}
