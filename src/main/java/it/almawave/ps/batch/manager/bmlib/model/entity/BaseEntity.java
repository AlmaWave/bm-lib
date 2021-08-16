package it.almawave.ps.batch.manager.bmlib.model.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @author Andrea Rocco Lotronto
 * @date 12/04/21
 */

@MappedSuperclass
@Getter @Setter
public class BaseEntity {

    @Column(name = "CREATED_BY", nullable = false)
    private String createdBy = "system";

    @Column(name = "CREATED_AT", nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date(System.currentTimeMillis());

    @Column(name = "MODIFIED_BY")
    private String modifiedBy = "system";

    @Column(name = "MODIFIED_AT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modifiedAt = new Date(System.currentTimeMillis());
}