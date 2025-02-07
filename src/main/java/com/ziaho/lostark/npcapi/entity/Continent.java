package com.ziaho.lostark.npcapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Continent {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long continentId;

	@Column(unique = true, nullable = false, length = 100)
	private String continentName;

	@OneToMany(mappedBy = "continent")
	private Set<Npc> npcs = new HashSet<>();

}
