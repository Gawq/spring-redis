package com.tutorial.redis.springredis.domain.dto;

import com.tutorial.redis.springredis.domain.RefreshToken;
import org.springframework.data.repository.CrudRepository;

public interface RefreshTokenRedisRepository extends CrudRepository<RefreshToken, Long> {
}
