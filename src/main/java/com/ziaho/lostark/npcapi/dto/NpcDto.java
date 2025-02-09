package com.ziaho.lostark.npcapi.dto;

import com.ziaho.lostark.npcapi.entity.Npc;
import com.ziaho.lostark.npcapi.entity.Race;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Data
public class NpcDto {

	private long npcId;
	private String npcName;
	private RaceDto race;
	private ContinentDto continent;
	private String birthDay;

	public NpcDto(Npc npc) {
		this.npcId = npc.getNpcId();
		this.npcName = npc.getNpcName();
		this.race = new RaceDto(npc.getRace());
		this.continent = new ContinentDto(npc.getContinent());
		this.birthDay = npc.getBirthMmdd();
	}

}
