package com.atguigu.gulimall.product.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * Ʒ?
 *
 * @author x43125
 * @email wx43125@gmail.com
 * @date 2022-08-26 23:18:02
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Ʒ??id
     */
    @TableId
    private Long brandId;
    /**
     * Ʒ????
     */
    private String name;
    /**
     * Ʒ??logo??ַ
     */
    private String logo;
    /**
     * ???
     */
    private String descript;
    /**
     * ??ʾ״̬[0-????ʾ??1-??ʾ]
     */
    private Integer showStatus;
    /**
     * ????????ĸ
     */
    private String firstLetter;
    /**
     * ???
     */
    private Integer sort;

}
