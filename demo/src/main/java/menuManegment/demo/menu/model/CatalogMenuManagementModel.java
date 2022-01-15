package menuManegment.demo.menu.model;

import lombok.*;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CatalogMenuManagementModel extends AbstractMenuModel<Long> {

    private Long id;

    private String name;

    private Integer gender;

    private String alias;

    private Integer status;

    private String platform;
}
