package entity;

import lombok.Data;

import java.io.Serializable;

//这些都是之前封装好传过去的

/**
 * @author steven
 */
@Data
public class Bye implements Serializable {
    private Integer methodID;
    private String saying;
}
