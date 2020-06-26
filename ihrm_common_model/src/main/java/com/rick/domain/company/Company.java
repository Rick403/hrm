package com.rick.domain.company;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 实体类代码：
 *  属性
 *  构造方法
 *  getter，setter方法
 *
 * lombok 插件 : 使用注解的形式替换getter setter，构造方法
 *      如何使用插件
 *          1.安装插件（在工程中引入响应的插件坐标即可）
 *                  <dependency>
 <groupId>org.projectlombok</groupId>
 <artifactId>lombok</artifactId>
 <version>1.16.16</version>
 </dependency>
 *          2.使用注解配置
 *                 配置到实体类上
 *                 @setter      : setter方法
 *                 @getter      ：getter方法
 *                 @NoArgsConstructor   无参构造
 *                 @AllArgsConstructor  满参构造
 *                 @Data        : setter,getter,构造方法
 *
 * 使用jpa操作数据
 *      配置实体类和数据库表的映射关系：jpa注解
 *      1.实体类和表的映射关系
 *      2.字段和属性的映射关系
 *          i。主键属性的映射
 *          ii。普通属性的映射
 */
@Entity
@Table(name = "co_company")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company implements Serializable {
    private static final long serialVersionUID = 594829320797158219L;
    //ID
    @Id
    private String id;
    /**
     * 公司名称
     */
    @Column(name = "name")
    private String name;
    /**
     * 企业登录账号ID
     */
    @Column(name = "manager_id")
    private String managerId;
    /**
     * 当前版本
     */
    @Column(name = "version")
    private String version;
    /**
     * 续期时间
     */
    @Column(name = "renewal_date")
    private Date renewalDate;
    /**
     * 到期时间
     */
    @Column(name = "expiration_date")
    private Date expirationDate;
    /**
     * 公司地区
     */
    @Column(name = "company_area")
    private String companyArea;
    /**
     * 公司地址
     */
    @Column(name = "company_address")
    private String companyAddress;
    /**
     * 营业执照-图片ID
     */
    @Column(name = "business_license_id")
    private String businessLicenseId;
    /**
     * 法人代表
     */
    @Column(name = "legal_representative")
    private String legalRepresentative;
    /**
     * 公司电话
     */
    @Column(name = "company_phone")
    private String companyPhone;
    /**
     * 邮箱
     */
    @Column(name = "mailbox")
    private String mailbox;
    /**
     * 公司规模
     */
    @Column(name = "company_size")
    private String companySize;
    /**
     * 所属行业
     */
    @Column(name = "industry")
    private String industry;
    /**
     * 备注
     */
    @Column(name = "remarks")
    private String remarks;
    /**
     * 审核状态
     */
    @Column(name = "audit_state")
    private String auditState;
    /**
     * 状态
     */
    @Column(name = "state")
    private Integer state;
    /**
     * 当前余额
     */
    @Column(name = "balance")
    private Double balance;
    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;
}
