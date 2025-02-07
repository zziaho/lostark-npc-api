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
public class NpcDialogue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dialogueId;

	@ManyToOne
	@JoinColumn(name = "npc_id", nullable = false)
	private Npc npc;

	@Column(columnDefinition = "TEXT", nullable = false)
	private String dialogue;

}
