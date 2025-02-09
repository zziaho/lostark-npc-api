package com.ziaho.lostark.npcapi.entity;

import com.ziaho.lostark.npcapi.dto.NpcDto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
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
public class Npc {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long npcId;

	@Column(nullable = false, length = 100)
	private String npcName;

	@ManyToOne
	@JoinColumn(name = "race_id", nullable = false)
	private Race race;

	@ManyToOne
	@JoinColumn(name = "continent_id", nullable = false)
	private Continent continent;

	@OneToMany(mappedBy = "npc", cascade = CascadeType.ALL, orphanRemoval = true)
	private Set<NpcDialogue> dialogues = new HashSet<>();

	@ManyToMany
	@JoinTable(
			name = "npc_affiliation",
			joinColumns = @JoinColumn(name = "npc_id"),
			inverseJoinColumns = @JoinColumn(name = "affiliation_id")
	)
	private Set<Affiliation> affiliations = new HashSet<>();

	@Column
	private String birthMmdd; // MM.dd

}
