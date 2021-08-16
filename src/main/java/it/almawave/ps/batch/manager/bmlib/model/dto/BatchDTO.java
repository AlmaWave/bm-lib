package it.almawave.ps.batch.manager.bmlib.model.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Andrea Rocco Lotronto
 * @date 06/04/21
 */
@Getter @Setter @NoArgsConstructor @EqualsAndHashCode
public class BatchDTO {
    private String name;
    private String type;
    private Object configuration;
}
