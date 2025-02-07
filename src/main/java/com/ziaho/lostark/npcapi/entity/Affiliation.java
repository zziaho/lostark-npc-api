package com.ziaho.lostark.npcapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Affiliation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long affiliationId;

	@Column(unique = true, nullable = false, length = 100)
	private String affiliationName;

	@ManyToMany(mappedBy = "affiliations")
	private Set<Npc> npcs = new HashSet<>();

}
