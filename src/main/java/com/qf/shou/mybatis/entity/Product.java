package com.qf.shou.mybatis.entity;


import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Product implements Serializable {

  private Integer productId;
  private String title;
  private String content;
  private String img;
  private BigDecimal price;
  private Integer cateId;
  private Date createDate;
  private Integer status;


  public long getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public String getImg() {
    return img;
  }

  public void setImg(String img) {
    this.img = img;
  }


  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }


  public long getCateId() {
    return cateId;
  }

  public void setCateId(Integer cateId) {
    this.cateId = cateId;
  }


  public Date getCreateDate() {
    return createDate;
  }

  public void setCreateDate(java.sql.Timestamp createDate) {
    this.createDate = createDate;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

}
