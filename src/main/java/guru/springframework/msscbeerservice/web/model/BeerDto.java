package guru.springframework.msscbeerservice.web.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * Created by jt on 2019-05-12.
 */


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data

public class BeerDto {

 private UUID id;

 private Integer version;
 private OffsetDateTime createDate;
 private OffsetDateTime lastModifiedDate;
 private String beerName;
 private BeerStyleEnum beerStyleEnum;
 private Long upc;
 private BigDecimal price;
 private Integer quantityOnHand;

}
