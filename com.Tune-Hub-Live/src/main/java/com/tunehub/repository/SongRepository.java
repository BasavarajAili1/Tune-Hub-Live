package com.tunehub.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub.entity.Song;

public interface SongRepository extends JpaRepository<Song, Integer> {

	Song findByName(String name);
	
	// Method signature to find songs by name or artist containing the specified keywords - ignoring case
	List<Song> findByNameContainingIgnoreCaseOrArtistContainingIgnoreCase(String keyword, String keyword2);

}
