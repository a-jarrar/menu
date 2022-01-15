package menuManegment.demo.menu.controller;

import menuManegment.demo.menu.mapper.CatalogMenuManagmentMapper;
import menuManegment.demo.menu.model.CatalogMenuManagementModel;
import menuManegment.demo.menu.repository.CatalogMenuManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public abstract class AbstractCRUDMenuController<M> {

    @Autowired
    private CatalogMenuManagementRepository catalogMenuManagementRepository;

    @PostMapping("/MenuManagement")
    public M createMenuManagement(@RequestBody M catalogMenuManagementModel) {
        return CatalogMenuManagmentMapper.INSTANCE.entityToModel
                (catalogMenuManagementRepository.save(CatalogMenuManagmentMapper.INSTANCE.modelToEntity(catalogMenuManagementModel)));
    }
}
