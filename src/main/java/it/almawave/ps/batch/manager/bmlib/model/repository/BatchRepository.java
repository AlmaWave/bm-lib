package it.almawave.ps.batch.manager.bmlib.model.repository;

import it.almawave.ps.batch.manager.bmlib.model.entity.Batch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Andrea Rocco Lotronto
 * @date 26/04/21
 */
@Repository
public interface BatchRepository extends JpaRepository<Batch, Long> {
    Batch findBatchByName(String name);
    void deleteByName(String name);
}
