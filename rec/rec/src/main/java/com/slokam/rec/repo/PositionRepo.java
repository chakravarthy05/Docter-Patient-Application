package com.slokam.rec.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.rec.entity.Position;
				@Repository
				public interface PositionRepo extends JpaRepository<Position, Integer> {

				}
