package c1438tjavareact.Inventario.model.persistence.mapper;

import c1438tjavareact.Inventario.model.dto.ProductDto;
import c1438tjavareact.Inventario.model.persistence.entity.Product;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "input", target = "input"),
            @Mapping(source = "family", target = "family"),
            @Mapping(source = "supplier", target = "supplier"),
            @Mapping(source = "stock", target = "stock")
    })

    Product toProduct(ProductDto productDto);
    List<ProductDto> toProductsDTO(List<Product> products);
    @InheritInverseConfiguration
    ProductDto toProductDTO(Product product);
}
