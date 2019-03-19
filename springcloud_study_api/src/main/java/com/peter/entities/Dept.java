package com.peter.entities;

import java.io.Serializable;



/**
 * @author Administrator
 * @deptno   //主键
 * @dname //部门名称
 * @db_source;  //来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
 */
public class Dept implements Serializable {
    private Long  deptno;
    private String  dname;
    private String  db_source;

    public Dept() {
    }

    public Dept(Long deptno, String dname, String db_source) {
        this.deptno = deptno;
        this.dname = dname;
        this.db_source = db_source;
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Dept{");
        sb.append("deptno=").append(deptno);
        sb.append(", dname='").append(dname).append('\'');
        sb.append(", db_source='").append(db_source).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
