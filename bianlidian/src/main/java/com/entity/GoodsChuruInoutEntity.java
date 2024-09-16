package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 采购
 *
 * @author 
 * @email
 */
@TableName("goods_churu_inout")
public class GoodsChuruInoutEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GoodsChuruInoutEntity() {

	}

	public GoodsChuruInoutEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 供应商
     */
    @TableField(value = "gongyingshang_id")

    private Integer gongyingshangId;


    /**
     * 采购流水号
     */
    @TableField(value = "goods_churu_inout_uuid_number")

    private String goodsChuruInoutUuidNumber;


    /**
     * 采购名称
     */
    @TableField(value = "goods_churu_inout_name")

    private String goodsChuruInoutName;


    /**
     * 出采购类型
     */
    @TableField(value = "goods_churu_inout_types")

    private Integer goodsChuruInoutTypes;


    /**
     * 备注
     */
    @TableField(value = "goods_churu_inout_content")

    private String goodsChuruInoutContent;


    /**
     * 添加时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：供应商
	 */
    public Integer getGongyingshangId() {
        return gongyingshangId;
    }


    /**
	 * 获取：供应商
	 */

    public void setGongyingshangId(Integer gongyingshangId) {
        this.gongyingshangId = gongyingshangId;
    }
    /**
	 * 设置：采购流水号
	 */
    public String getGoodsChuruInoutUuidNumber() {
        return goodsChuruInoutUuidNumber;
    }


    /**
	 * 获取：采购流水号
	 */

    public void setGoodsChuruInoutUuidNumber(String goodsChuruInoutUuidNumber) {
        this.goodsChuruInoutUuidNumber = goodsChuruInoutUuidNumber;
    }
    /**
	 * 设置：采购名称
	 */
    public String getGoodsChuruInoutName() {
        return goodsChuruInoutName;
    }


    /**
	 * 获取：采购名称
	 */

    public void setGoodsChuruInoutName(String goodsChuruInoutName) {
        this.goodsChuruInoutName = goodsChuruInoutName;
    }
    /**
	 * 设置：出采购类型
	 */
    public Integer getGoodsChuruInoutTypes() {
        return goodsChuruInoutTypes;
    }


    /**
	 * 获取：出采购类型
	 */

    public void setGoodsChuruInoutTypes(Integer goodsChuruInoutTypes) {
        this.goodsChuruInoutTypes = goodsChuruInoutTypes;
    }
    /**
	 * 设置：备注
	 */
    public String getGoodsChuruInoutContent() {
        return goodsChuruInoutContent;
    }


    /**
	 * 获取：备注
	 */

    public void setGoodsChuruInoutContent(String goodsChuruInoutContent) {
        this.goodsChuruInoutContent = goodsChuruInoutContent;
    }
    /**
	 * 设置：添加时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：添加时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "GoodsChuruInout{" +
            "id=" + id +
            ", gongyingshangId=" + gongyingshangId +
            ", goodsChuruInoutUuidNumber=" + goodsChuruInoutUuidNumber +
            ", goodsChuruInoutName=" + goodsChuruInoutName +
            ", goodsChuruInoutTypes=" + goodsChuruInoutTypes +
            ", goodsChuruInoutContent=" + goodsChuruInoutContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
