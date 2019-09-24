package cn.lyz.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@SuppressWarnings("seria")
@NoArgsConstructor
@Data
@Accessors(chain = true)
//@Table( name = "dept")
public class Dept implements Serializable {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer 	deptno; // 主键

    //@Column(name = "dname")
    private String 	dname; // 部门名称

   // @Column( name = "db_source")
    private String 	db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname)
    {
        super();
        this.dname = dname;
    }


}
