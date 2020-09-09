package com.buzzardsview.oauth2practice.models.data;

import com.buzzardsview.oauth2practice.models.Kim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KimRepository extends JpaRepository<Kim, Integer> {
}
