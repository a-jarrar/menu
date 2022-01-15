package menuManegment.demo.menu.controller;

import menuManegment.demo.menu.mapper.CatalogMenuManagmentMapper;
import menuManegment.demo.menu.model.CatalogMenuManagementModel;
import menuManegment.demo.menu.repository.CatalogMenuManagementRepository;
import menuManegment.demo.menu.service.CatalogMenuManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping(CatalogMenuManagementController.PATH)
public class CatalogMenuManagementController extends AbstractCRUDMenuController<CatalogMenuManagementModel> {
    public static final String PATH = "/v1/menuManagement";

    @Autowired
    private CatalogMenuManagementService catalogMenuManagementService;

    @Autowired
    private CatalogMenuManagementRepository catalogMenuManagementRepository;

    @PostMapping("/MenuManagement")
    public EntityResponse<List<CatalogMenuManagementModel>> create(@RequestBody List<CatalogMenuManagementModel> catalogMenuManagementModel) {
        return CatalogMenuManagmentMapper.INSTANCE.entityToModel
                (catalogMenuManagementRepository.saveAll(CatalogMenuManagmentMapper.INSTANCE.modelToEntity(catalogMenuManagementModel)));
    }


    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
