package assignment.domain;

import assignment.domain.*;
import assignment.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class StartCooking extends AbstractEvent {

    private Long id;
    private Long menuId;
    private Long shopId;
    private Integer price;
    private String status;
}


