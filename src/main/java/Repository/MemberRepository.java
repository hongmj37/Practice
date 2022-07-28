package Repository;

import Entity.Member;

public interface MemberRepository {
    void save(Member member);
    Member findById(Long memberId);
}
