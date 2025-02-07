package com.ziaho.lostark.npcapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class NpcFavorability {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long favorabilityId;

	@ManyToOne
	@JoinColumn(name = "npc_id", nullable = false)
	private Npc npc;

	@Column(nullable = false, length = 50)
	private String favorabilityLevel;

	@Column(length = 255)
	private String favorabilityReward;

	@Column(nullable = false)
	private int favorabilityRequiredPoints;

}
