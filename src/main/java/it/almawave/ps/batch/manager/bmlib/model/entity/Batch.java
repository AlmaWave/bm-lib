package it.almawave.ps.batch.manager.bmlib.model.entity;

import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.Date;

/**
 * @author Andrea Rocco Lotronto
 * @date 12/04/21
 */
@Entity
@Table(name = "batch")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class Batch extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false, unique = true)
    private String name;

    @Column(name = "status")
    private Long batchStatus = 10L;

    @Column(name = "is_scheduled", nullable = false)
    private boolean scheduled;


    @Column(name = "configuration")
    String batchConfiguration;

    @ManyToOne
    @JoinColumn(name="batch_type_id",nullable = false)
    private BatchType batchType;

    @Column(name = "LAST_START")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastStart;

    @Column(name = "NEXT_START")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nextStart;

    @Column(name="CRON_EXPRESSION")
    private String cronExpression;


}
