package menuManegment.demo.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericMenuRepository<T,K> extends JpaRepository<T,K> {
}
