package com.ziaho.lostark.npcapi.controller;

import com.ziaho.lostark.npcapi.dto.NpcDto;
import com.ziaho.lostark.npcapi.entity.Npc;
import com.ziaho.lostark.npcapi.service.NpcService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class NpcController {

	private final NpcService npcService;

	/**
	 * 모든 NPC를 조회하는 기본 메소드
	 */
	@ResponseBody
	@RequestMapping("/v1/npcs/all")
	public ResponseEntity<Map<String, List<NpcDto>>> getAllNpcList() {
		List<NpcDto> npcList = npcService.getAllNpcList();
		Map<String, List<NpcDto>> response = new HashMap<>();
		response.put("NpcList", npcList);

		return ResponseEntity.ok(response);
	}

}
