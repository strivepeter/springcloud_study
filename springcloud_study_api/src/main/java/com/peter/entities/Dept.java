package com.peter.entities;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;



/**
 * @author Administrator
 * @deptno   //主键
 * @dname //部门名称
 * @db_source;  //来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
 */

@Data
@ToString
public class Dept implements Serializable {
    private Long  deptno; //主键
    private String  dname; //名字
    private String  db_source; //数据库资源

}
