package it.almawave.ps.batch.manager.bmlib.model.repository;

import it.almawave.ps.batch.manager.bmlib.model.entity.BatchType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatchTypeRepository extends JpaRepository<BatchType, Long> {

    public BatchType findBatchTypeByType(String type);
}
