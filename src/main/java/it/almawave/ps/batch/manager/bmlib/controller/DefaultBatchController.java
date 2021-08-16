package it.almawave.ps.batch.manager.bmlib.controller;

import it.almawave.ps.batch.manager.bmlib.model.dto.RunBatchResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Andrea Rocco Lotronto
 * @date 06/04/21
 */


public interface DefaultBatchController {

	@PatchMapping(value = "/start/{id}")
    public ResponseEntity<RunBatchResponseDTO> start(@PathVariable Long id);


}
