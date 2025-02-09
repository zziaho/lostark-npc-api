package com.ziaho.lostark.npcapi.dto;

import com.ziaho.lostark.npcapi.entity.Continent;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Data
public class ContinentDto {

	private Long continentId;
	private String continentName;

	public ContinentDto(Continent continent) {
		this.continentId = continent.getContinentId();
		this.continentName = continent.getContinentName();
	}

}
