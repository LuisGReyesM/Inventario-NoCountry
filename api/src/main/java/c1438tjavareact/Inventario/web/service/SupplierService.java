package c1438tjavareact.Inventario.web.service;


import c1438tjavareact.Inventario.model.persistence.entity.Supplier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface SupplierService{

    Supplier create (Supplier supplier);

    Supplier update (Supplier supplier);

    List<Supplier> SupplierList();

    Optional<Supplier> SupplierId(Long id);

    void delete(Long id);



}
