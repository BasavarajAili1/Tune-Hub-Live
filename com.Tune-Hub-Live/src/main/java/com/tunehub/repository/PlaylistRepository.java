package com.tunehub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tunehub.entity.Playlist;
import com.tunehub.entity.User;

public interface PlaylistRepository extends JpaRepository<Playlist, Integer>{

	List<Playlist> findByUser(User user);		// Method signature to find playlists by associated user

}
