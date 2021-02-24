package wt.example.springbucks.support;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

/**
 * Created by wangtie on 2021/2/24
 */
@JsonComponent
public class MoneyDeserializer extends StdDeserializer<Money> {
    protected MoneyDeserializer() { super(Money.class); }

    @Override
    public Money deserialize(JsonParser p, DeserializationContext ctxt, Money intoValue) throws IOException {
        return Money.of(CurrencyUnit.of("CNY"),p.getDecimalValue());
    }
}
