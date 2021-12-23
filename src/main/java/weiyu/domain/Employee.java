package weiyu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author：Weiyu
 * @Version:
 * @Since:
 * @date：2021-12-23_周四 07:25
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    //private Integer cid;
    private Integer eid;
    private Integer dept_id;
    private String ename;
    private Float salary;
}
