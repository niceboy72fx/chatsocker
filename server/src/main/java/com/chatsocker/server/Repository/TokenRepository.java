package com.chatsocker.server.Repository;

import com.chatsocker.server.entity.Token;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TokenRepository extends JpaRepository<Token, Integer> {
    @Query(value = "select t from Token t INNER JOIN User u on t.user.id = u.id where  u.id = :id and  (t.expired = false or t.revoked = false)")
    List<Token> findAllValidTokenByUser(@Param("id") Long userId);

    Optional<Token> findByToken(String token);

}
