package menuManegment.demo.menu.model;

import java.io.Serializable;
import java.sql.Timestamp;

public abstract class AbstractMenuModel<T extends Serializable>  {

    private Timestamp createdAt;

    private Timestamp updatedAt;
}
