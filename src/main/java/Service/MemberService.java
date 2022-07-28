package Service;

import Entity.Member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
