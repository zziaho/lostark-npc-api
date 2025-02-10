package com.ziaho.lostark.npcapi.service;

import com.ziaho.lostark.npcapi.dto.NpcDto;
import com.ziaho.lostark.npcapi.entity.Npc;
import com.ziaho.lostark.npcapi.repository.NpcRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class NpcService {

	private final NpcRepository npcRepository;

	/**
	 * 모든 NPC를 조회하는 기본 메소드
	 */
	public List<NpcDto> getAllNpcList() {
		List<Npc> npcList = npcRepository.findAll();
		List<NpcDto> npcDtoList = npcList.stream()
									.map(obj -> new NpcDto(obj))
									.collect(Collectors.toList());

		return npcDtoList;
	}

	/**
	 * NPC명으로 특정 NPC 상세 조회하는 메소드
	 */
	public NpcDto getNpcByNpcName(String npcName) {
		Npc npc = npcRepository.findByNpcName(npcName);

		return new NpcDto(npc);
	}

}
