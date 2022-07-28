package Service;

import Entity.Member;
import Repository.MemberRepository;


public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository = new MemberRepository() {
        @Override
        public void save(Member member) {
        }

        @Override
        public Member findById(Long memberId) {
            return null;
        }
    };

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
