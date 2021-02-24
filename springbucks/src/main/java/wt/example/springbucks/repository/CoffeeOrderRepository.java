package wt.example.springbucks.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import wt.example.springbucks.model.CoffeeOrder;

/**
 * Created by wangtie on 2021/2/24
 */
public interface CoffeeOrderRepository extends JpaRepository<CoffeeOrder, Long> {
}
