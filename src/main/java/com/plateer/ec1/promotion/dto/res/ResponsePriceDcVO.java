package com.plateer.ec1.promotion.dto.res;

import com.plateer.ec1.promotion.dto.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResponsePriceDcVO extends ResponseBaseVO{
    private List<Product> productList;
}
