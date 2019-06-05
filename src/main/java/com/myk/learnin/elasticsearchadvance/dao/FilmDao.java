package com.myk.learnin.elasticsearchadvance.dao;

import com.myk.learnin.elasticsearchadvance.model.FilmEntity;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * The interface Film dao.
 *
 * @author myk
 */
public interface FilmDao extends ElasticsearchRepository<FilmEntity, Long> {

}