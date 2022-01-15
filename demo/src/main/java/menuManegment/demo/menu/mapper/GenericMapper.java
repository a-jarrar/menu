package menuManegment.demo.menu.mapper;

public interface GenericMapper<E,M> {

    M entityToModel(E entity);

    E modelToEntity(M model);
}
