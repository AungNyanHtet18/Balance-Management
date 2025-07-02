package com.anh.balances.model.repo;

import java.util.Optional;

import com.anh.balances.model.BaseRepository;
import com.anh.balances.model.entity.Member;

public interface MemberRepo extends BaseRepository<Member,Long>{

	Optional<Member> findOneByAccountUsername(String username);

}
