package com.ziaho.lostark.npcapi.repository;

import com.ziaho.lostark.npcapi.dto.NpcDto;
import com.ziaho.lostark.npcapi.entity.Npc;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NpcRepository extends JpaRepository<Npc, Long> {

	/**
	 * 모든 NPC를 조회하는 기본 메소드
	 * @return List<Npc>
	 */
	List<Npc> findAll();

}
