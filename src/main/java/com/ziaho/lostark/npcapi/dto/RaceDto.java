package com.ziaho.lostark.npcapi.dto;

import com.ziaho.lostark.npcapi.entity.Race;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Data
public class RaceDto {

	private Long raceId;
	private String raceName;

	public RaceDto(Race race) {
		this.raceId = race.getRaceId();
		this.raceName = race.getRaceName();
	}

}
