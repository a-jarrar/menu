package menuManegment.demo.menu.mapper;

import javax.annotation.Generated;
import menuManegment.demo.menu.entity.CatalogMenuManagement;
import menuManegment.demo.menu.model.CatalogMenuManagementModel;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-13T17:06:36+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.13 (Amazon.com Inc.)"
)
public class CatalogMenuManagmentMapperImpl implements CatalogMenuManagmentMapper {

    @Override
    public CatalogMenuManagementModel entityToModel(CatalogMenuManagement entity) {
        if ( entity == null ) {
            return null;
        }

        CatalogMenuManagementModel catalogMenuManagementModel = new CatalogMenuManagementModel();

        return catalogMenuManagementModel;
    }

    @Override
    public CatalogMenuManagement modelToEntity(CatalogMenuManagementModel model) {
        if ( model == null ) {
            return null;
        }

        CatalogMenuManagement catalogMenuManagement = new CatalogMenuManagement();

        return catalogMenuManagement;
    }
}
