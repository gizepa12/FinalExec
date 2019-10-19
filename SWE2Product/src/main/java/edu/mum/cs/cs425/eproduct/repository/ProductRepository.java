package edu.mum.cs.cs425.eproduct.repository;


import edu.mum.cs.cs425.eproduct.model.Product;
import edu.mum.cs.cs425.eproduct.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    // This interface definition relies on the public abstract methods
    // inherited from the super interface, CrudRepository<T, ID>
    // We may override any or add more methods here, if needed.

    /**
     * Search queries
     */
    //List<Supplier> findBooksByTitleContainsOrIsbnContainsOrOverdueFeeContainsOrPublisherContainsOrDatePublishedContainsOrderByTitle(String searchString);
//    List<Supplier> findAllByProductIdContainingOrProductNumberContainingOrManufactureNameContainingOrderByProductId(Integer productId,
//                                                                                                                    Long productNumber,
//                                                                                                                    String pub);
//    List<Supplier> findAllByunitPriceEquals(Double unitPrice);
//    List<Supplier> findAllBymanufacturedDateEquals(LocalDate manufacturedDate);
//}


}