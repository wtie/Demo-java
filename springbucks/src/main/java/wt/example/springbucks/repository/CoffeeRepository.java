package wt.example.springbucks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wt.example.springbucks.model.Coffee;

/**
 * Created by wangtie on 2021/2/24
 */
public interface CoffeeRepository extends JpaRepository<Coffee, Long> {
    List<Coffee> findByNameInOrderById(List<String> list);
    Coffee findByName(String name);
}
