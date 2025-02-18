package me.kwakinsung.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //DB에서 데이터를 가져오는 역할..
public interface MemberRepository extends JpaRepository<Member,Long> {
    Optional<Member> findByName(String name);
}
