package it.almawave.ps.batch.manager.bmlib.model.dto;

import java.util.List;

import it.almawave.ps.batch.manager.bmlib.model.enumeration.ControlType;
import it.almawave.ps.batch.manager.bmlib.model.enumeration.InputType;
import lombok.Data;

@Data
public class MetaDatiConfigurationForm {
	
	private String value;
	private String key;
	private String label;
	private Boolean required;
	private ControlType controlType;
	private InputType type;
	private List<Option> options;
	
}
