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

/**
 * @author Andrea Rocco Lotronto
 * @date 06/04/21
 */
@Entity
@Table(name = "batch_type")
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
public class BatchType extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name="NAME", nullable = false)
    private String type;

    @Column(name="URL", nullable = false)
    private String url;

    @Column(name="CONTEXT_PATH", nullable = false)
    private String contextPath;

    @Column(name = "PORT", nullable = false)
    private Integer port;

    @Column(name = "JSON_CONFIG", nullable = false)
    private String configurationParameter;

}
