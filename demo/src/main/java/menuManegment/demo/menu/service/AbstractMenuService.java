package menuManegment.demo.menu.service;

import menuManegment.demo.menu.mapper.GenericMapper;

public abstract class AbstractMenuService<E,M,R> implements MenuCRUD<E, M> {

    protected R repository;
    protected GenericMapper<E, M> mapper;

}
