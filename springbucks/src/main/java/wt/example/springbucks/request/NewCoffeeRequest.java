package wt.example.springbucks.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.joda.money.Money;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Created by wangtie on 2021/2/23
 */
@Getter
@Setter
@ToString
public class NewCoffeeRequest {

    @NotEmpty
    private String name;

    @NotNull
    private Money price;
}
