package com.slokam.rec.repo;
				import org.springframework.data.jpa.repository.JpaRepository;
				import org.springframework.stereotype.Repository;
				import com.slokam.rec.entity.Qualification;
				@Repository
				public interface QualificationRepo extends JpaRepository<Qualification, Integer> {

				}
