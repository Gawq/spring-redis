package com.tutorial.redis.springredis.domain.dto;

import com.tutorial.redis.springredis.domain.LogoutAccessToken;
import org.springframework.data.repository.CrudRepository;

public interface LogoutAccessTokenRedisRepository extends CrudRepository<LogoutAccessToken, String> {
}
